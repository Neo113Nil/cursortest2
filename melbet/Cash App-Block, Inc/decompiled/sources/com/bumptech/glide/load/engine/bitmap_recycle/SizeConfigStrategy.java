package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.Util;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class SizeConfigStrategy {
    public static final Bitmap.Config[] ALPHA_8_IN_CONFIGS;
    public static final Bitmap.Config[] ARGB_4444_IN_CONFIGS;
    public static final Bitmap.Config[] ARGB_8888_IN_CONFIGS;
    public static final Bitmap.Config[] RGBA_F16_IN_CONFIGS;
    public static final Bitmap.Config[] RGB_565_IN_CONFIGS;
    public final LruArrayPool.KeyPool keyPool = new LruArrayPool.KeyPool(1);
    public final AndroidSvg groupedMap = new AndroidSvg(19);
    public final HashMap sortedSizes = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final class Key implements Poolable {
        public Bitmap.Config config;
        public final LruArrayPool.KeyPool pool;
        public int size;

        public Key(LruArrayPool.KeyPool keyPool) {
            this.pool = keyPool;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (this.size == key.size && Util.bothNullOrEqual(this.config, key.config)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.size * 31;
            Bitmap.Config config = this.config;
            return i + (config != null ? config.hashCode() : 0);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void offer() {
            this.pool.offer(this);
        }

        public final String toString() {
            return SizeConfigStrategy.getBitmapString(this.size, this.config);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        ARGB_8888_IN_CONFIGS = configArr;
        RGBA_F16_IN_CONFIGS = configArr;
        RGB_565_IN_CONFIGS = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        ARGB_4444_IN_CONFIGS = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        ALPHA_8_IN_CONFIGS = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String getBitmapString(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void decrementBitmapOfSize(Integer num, Bitmap bitmap) {
        NavigableMap sizesForConfig = getSizesForConfig(bitmap.getConfig());
        Integer num2 = (Integer) sizesForConfig.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                sizesForConfig.remove(num);
                return;
            } else {
                sizesForConfig.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String bitmapString = getBitmapString(Util.getBitmapByteSize(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(bitmapString);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    public final Bitmap get(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int bytesPerPixel = Util.getBytesPerPixel(config) * i * i2;
        LruArrayPool.KeyPool keyPool = this.keyPool;
        Poolable poolable = (Poolable) ((ArrayDeque) keyPool.data).poll();
        if (poolable == null) {
            poolable = keyPool.create();
        }
        Key key = (Key) poolable;
        key.size = bytesPerPixel;
        key.config = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = RGBA_F16_IN_CONFIGS;
        } else {
            int i3 = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : ALPHA_8_IN_CONFIGS : ARGB_4444_IN_CONFIGS : RGB_565_IN_CONFIGS : ARGB_8888_IN_CONFIGS;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) getSizesForConfig(config2).ceilingKey(Integer.valueOf(bytesPerPixel));
            if (num == null || num.intValue() > bytesPerPixel * 8) {
                i4++;
            } else if (num.intValue() != bytesPerPixel || (config2 != null ? !config2.equals(config) : config != null)) {
                keyPool.offer(key);
                int intValue = num.intValue();
                Poolable poolable2 = (Poolable) ((ArrayDeque) keyPool.data).poll();
                if (poolable2 == null) {
                    poolable2 = keyPool.create();
                }
                key = (Key) poolable2;
                key.size = intValue;
                key.config = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.groupedMap.get(key);
        if (bitmap != null) {
            decrementBitmapOfSize(Integer.valueOf(key.size), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap getSizesForConfig(Bitmap.Config config) {
        HashMap hashMap = this.sortedSizes;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void put(Bitmap bitmap) {
        int bitmapByteSize = Util.getBitmapByteSize(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        LruArrayPool.KeyPool keyPool = this.keyPool;
        Poolable poolable = (Poolable) ((ArrayDeque) keyPool.data).poll();
        if (poolable == null) {
            poolable = keyPool.create();
        }
        Key key = (Key) poolable;
        key.size = bitmapByteSize;
        key.config = config;
        this.groupedMap.put(key, bitmap);
        NavigableMap sizesForConfig = getSizesForConfig(bitmap.getConfig());
        Integer num = (Integer) sizesForConfig.get(Integer.valueOf(key.size));
        sizesForConfig.put(Integer.valueOf(key.size), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("SizeConfigStrategy{groupedMap=");
        m.append(this.groupedMap);
        m.append(", sortedSizes=(");
        HashMap hashMap = this.sortedSizes;
        for (Map.Entry entry : hashMap.entrySet()) {
            m.append(entry.getKey());
            m.append('[');
            m.append(entry.getValue());
            m.append("], ");
        }
        if (!hashMap.isEmpty()) {
            m.replace(m.length() - 2, m.length(), "");
        }
        m.append(")}");
        return m.toString();
    }
}
