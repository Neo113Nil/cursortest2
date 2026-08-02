package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.CoroutinesRoom;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class LruBitmapPool implements BitmapPool {
    public static final Bitmap.Config DEFAULT_CONFIG = Bitmap.Config.ARGB_8888;
    public final Set allowedConfigs;
    public long currentSize;
    public int evictions;
    public int hits;
    public final long maxSize;
    public int misses;
    public int puts;
    public final SizeConfigStrategy strategy;
    public final CoroutinesRoom.Companion tracker;

    public LruBitmapPool(long j) {
        SizeConfigStrategy sizeConfigStrategy = new SizeConfigStrategy();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.maxSize = j;
        this.strategy = sizeConfigStrategy;
        this.allowedConfigs = unmodifiableSet;
        this.tracker = new CoroutinesRoom.Companion(18);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void clearMemory() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        trimToSize(0L);
    }

    public final void dumpUnchecked() {
        Log.v("LruBitmapPool", "Hits=" + this.hits + ", misses=" + this.misses + ", puts=" + this.puts + ", evictions=" + this.evictions + ", currentSize=" + this.currentSize + ", maxSize=" + this.maxSize + "\nStrategy=" + this.strategy);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap get(int i, int i2, Bitmap.Config config) {
        Bitmap dirtyOrNull = getDirtyOrNull(i, i2, config);
        if (dirtyOrNull != null) {
            dirtyOrNull.eraseColor(0);
            return dirtyOrNull;
        }
        if (config == null) {
            config = DEFAULT_CONFIG;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap getDirty(int i, int i2, Bitmap.Config config) {
        Bitmap dirtyOrNull = getDirtyOrNull(i, i2, config);
        if (dirtyOrNull != null) {
            return dirtyOrNull;
        }
        if (config == null) {
            config = DEFAULT_CONFIG;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized Bitmap getDirtyOrNull(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmap = this.strategy.get(i, i2, config != null ? config : DEFAULT_CONFIG);
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.strategy.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(SizeConfigStrategy.getBitmapString(Util.getBytesPerPixel(config) * i * i2, config)));
                }
                this.misses++;
            } else {
                this.hits++;
                long j = this.currentSize;
                this.strategy.getClass();
                this.currentSize = j - Util.getBitmapByteSize(bitmap);
                this.tracker.getClass();
                bitmap.setHasAlpha(true);
                bitmap.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.strategy.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(SizeConfigStrategy.getBitmapString(Util.getBytesPerPixel(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                dumpUnchecked();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final synchronized void put(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.strategy.getClass();
                if (Util.getBitmapByteSize(bitmap) <= this.maxSize && this.allowedConfigs.contains(bitmap.getConfig())) {
                    this.strategy.getClass();
                    int bitmapByteSize = Util.getBitmapByteSize(bitmap);
                    this.strategy.put(bitmap);
                    this.tracker.getClass();
                    this.puts++;
                    this.currentSize += bitmapByteSize;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.strategy.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(SizeConfigStrategy.getBitmapString(Util.getBitmapByteSize(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        dumpUnchecked();
                    }
                    trimToSize(this.maxSize);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.strategy.getClass();
                sb.append(SizeConfigStrategy.getBitmapString(Util.getBitmapByteSize(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.allowedConfigs.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void trimMemory(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            CameraState$Type$EnumUnboxingLocalUtility.m(i, "trimMemory, level=", "LruBitmapPool");
        }
        if (i >= 40 || i >= 20) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            trimToSize(this.maxSize / 2);
        }
    }

    public final synchronized void trimToSize(long j) {
        while (this.currentSize > j) {
            try {
                SizeConfigStrategy sizeConfigStrategy = this.strategy;
                Bitmap bitmap = (Bitmap) sizeConfigStrategy.groupedMap.removeLast();
                if (bitmap != null) {
                    sizeConfigStrategy.decrementBitmapOfSize(Integer.valueOf(Util.getBitmapByteSize(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        dumpUnchecked();
                    }
                    this.currentSize = 0L;
                    return;
                }
                this.tracker.getClass();
                long j2 = this.currentSize;
                this.strategy.getClass();
                this.currentSize = j2 - Util.getBitmapByteSize(bitmap);
                this.evictions++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.strategy.getClass();
                    sb.append(SizeConfigStrategy.getBitmapString(Util.getBitmapByteSize(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    dumpUnchecked();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
