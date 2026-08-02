package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.camera.video.Recorder;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.core.provider.FontsContractCompat;
import androidx.credentials.Credential;
import androidx.media3.common.Format;
import androidx.media3.common.audio.AudioProcessingPipeline;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy;
import com.bumptech.glide.util.Util;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class LruArrayPool {
    public final Object adapters;
    public int currentSize;
    public final Object groupedMap;
    public final Object keyPool;
    public final int maxSize;
    public final Object sortedSizes;

    public final class Key implements Poolable {
        public Class arrayClass;
        public final KeyPool pool;
        public int size;

        public Key(KeyPool keyPool) {
            this.pool = keyPool;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (this.size == key.size && this.arrayClass == key.arrayClass) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.size * 31;
            Class cls = this.arrayClass;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void offer() {
            this.pool.offer(this);
        }

        public final String toString() {
            return "Key{size=" + this.size + "array=" + this.arrayClass + '}';
        }
    }

    public final class KeyPool extends Credential {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ KeyPool(int i) {
            super(6);
            this.$r8$classId = i;
        }

        public final Poolable create() {
            switch (this.$r8$classId) {
                case 0:
                    return new Key(this);
                default:
                    return new SizeConfigStrategy.Key(this);
            }
        }
    }

    public LruArrayPool(int i) {
        this.groupedMap = new AndroidSvg(19);
        this.keyPool = new KeyPool(0);
        this.sortedSizes = new HashMap();
        this.adapters = new HashMap();
        this.maxSize = i;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation, reason: not valid java name */
    public long m1910childConstraintsJhjzzOo$foundation(int i, int i2) {
        int i3;
        Recorder.AnonymousClass4 anonymousClass4 = (Recorder.AnonymousClass4) this.groupedMap;
        int[] iArr = (int[]) anonymousClass4.val$audioErrorConsumer;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) anonymousClass4.this$0;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
        }
        return ConstraintsKt.createConstraints(i3, i3, 0, Integer.MAX_VALUE);
    }

    public void decrementArrayOfSize(Class cls, int i) {
        NavigableMap sizesForAdapter = getSizesForAdapter(cls);
        Integer num = (Integer) sizesForAdapter.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                sizesForAdapter.remove(Integer.valueOf(i));
                return;
            } else {
                sizesForAdapter.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void evictToSize(int i) {
        while (this.currentSize > i) {
            Object removeLast = ((AndroidSvg) this.groupedMap).removeLast();
            Util.checkNotNull(removeLast);
            ByteArrayAdapter adapterFromType = getAdapterFromType(removeLast.getClass());
            this.currentSize -= adapterFromType.getElementSizeInBytes() * adapterFromType.getArrayLength(removeLast);
            decrementArrayOfSize(removeLast.getClass(), adapterFromType.getArrayLength(removeLast));
            if (Log.isLoggable(adapterFromType.getTag(), 2)) {
                Log.v(adapterFromType.getTag(), "evicted: " + adapterFromType.getArrayLength(removeLast));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002d, B:18:0x003d, B:19:0x0041, B:20:0x0060, B:25:0x004a, B:27:0x0056, B:28:0x005a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002d, B:18:0x003d, B:19:0x0041, B:20:0x0060, B:25:0x004a, B:27:0x0056, B:28:0x005a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Object get(Class cls, int i) {
        boolean z;
        Key key;
        int i2;
        try {
            Integer num = (Integer) getSizesForAdapter(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.currentSize) != 0 && this.maxSize / i2 < 2 && num.intValue() > i * 8)) {
                z = false;
                KeyPool keyPool = (KeyPool) this.keyPool;
                if (z) {
                    Poolable poolable = (Poolable) ((ArrayDeque) keyPool.data).poll();
                    if (poolable == null) {
                        poolable = keyPool.create();
                    }
                    key = (Key) poolable;
                    key.size = i;
                    key.arrayClass = cls;
                } else {
                    int intValue = num.intValue();
                    Poolable poolable2 = (Poolable) ((ArrayDeque) keyPool.data).poll();
                    if (poolable2 == null) {
                        poolable2 = keyPool.create();
                    }
                    key = (Key) poolable2;
                    key.size = intValue;
                    key.arrayClass = cls;
                }
            }
            z = true;
            KeyPool keyPool2 = (KeyPool) this.keyPool;
            if (z) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return getForKey(key, cls);
    }

    public ByteArrayAdapter getAdapterFromType(Class cls) {
        ByteArrayAdapter byteArrayAdapter;
        HashMap hashMap = (HashMap) this.adapters;
        ByteArrayAdapter byteArrayAdapter2 = (ByteArrayAdapter) hashMap.get(cls);
        if (byteArrayAdapter2 != null) {
            return byteArrayAdapter2;
        }
        if (cls.equals(int[].class)) {
            byteArrayAdapter = new ByteArrayAdapter(1);
        } else {
            if (!cls.equals(byte[].class)) {
                a$$ExternalSyntheticBUOutline0.m$3("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            byteArrayAdapter = new ByteArrayAdapter(0);
        }
        hashMap.put(cls, byteArrayAdapter);
        return byteArrayAdapter;
    }

    public LazyGridMeasuredLine getAndMeasure(int i) {
        FontsContractCompat.FontFamilyResult lineConfiguration = ((LazyGridSpanLayoutProvider) this.sortedSizes).getLineConfiguration(i);
        int i2 = lineConfiguration.mStatusCode;
        int size = lineConfiguration.mFonts.size();
        int i3 = 0;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i4 = 0;
        int i5 = (size == 0 || i2 + size == this.maxSize) ? 0 : this.currentSize;
        while (true) {
            List list = lineConfiguration.mFonts;
            if (i3 >= size) {
                return new LazyGridMeasuredLine(i, lazyGridMeasuredItemArr, (Recorder.AnonymousClass4) this.adapters, list, i5);
            }
            int i6 = (int) ((GridItemSpan) list.get(i3)).packedValue;
            int i7 = i5;
            LazyGridMeasuredItem m316getAndMeasurem8Kt_7k = ((LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1) this.keyPool).m316getAndMeasurem8Kt_7k(i2 + i3, i4, i6, i7, m1910childConstraintsJhjzzOo$foundation(i4, i6));
            i5 = i7;
            i4 += i6;
            lazyGridMeasuredItemArr[i3] = m316getAndMeasurem8Kt_7k;
            i3++;
        }
    }

    public Object getForKey(Key key, Class cls) {
        ByteArrayAdapter adapterFromType = getAdapterFromType(cls);
        Object obj = ((AndroidSvg) this.groupedMap).get(key);
        if (obj != null) {
            this.currentSize -= adapterFromType.getElementSizeInBytes() * adapterFromType.getArrayLength(obj);
            decrementArrayOfSize(cls, adapterFromType.getArrayLength(obj));
        }
        if (obj != null) {
            return obj;
        }
        if (Log.isLoggable(adapterFromType.getTag(), 2)) {
            Log.v(adapterFromType.getTag(), "Allocated " + key.size + " bytes");
        }
        int i = key.size;
        switch (adapterFromType.$r8$classId) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap getSizesForAdapter(Class cls) {
        HashMap hashMap = (HashMap) this.sortedSizes;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        ByteArrayAdapter adapterFromType = getAdapterFromType(cls);
        int arrayLength = adapterFromType.getArrayLength(obj);
        int elementSizeInBytes = adapterFromType.getElementSizeInBytes() * arrayLength;
        if (elementSizeInBytes <= this.maxSize / 2) {
            KeyPool keyPool = (KeyPool) this.keyPool;
            Poolable poolable = (Poolable) ((ArrayDeque) keyPool.data).poll();
            if (poolable == null) {
                poolable = keyPool.create();
            }
            Key key = (Key) poolable;
            key.size = arrayLength;
            key.arrayClass = cls;
            ((AndroidSvg) this.groupedMap).put(key, obj);
            NavigableMap sizesForAdapter = getSizesForAdapter(cls);
            Integer num = (Integer) sizesForAdapter.get(Integer.valueOf(key.size));
            Integer valueOf = Integer.valueOf(key.size);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            sizesForAdapter.put(valueOf, Integer.valueOf(i));
            this.currentSize += elementSizeInBytes;
            evictToSize(this.maxSize);
        }
    }

    public LruArrayPool(Recorder.AnonymousClass4 anonymousClass4, int i, int i2, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.adapters = anonymousClass4;
        this.groupedMap = anonymousClass4;
        this.maxSize = i;
        this.currentSize = i2;
        this.keyPool = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
        this.sortedSizes = lazyGridSpanLayoutProvider;
    }

    public LruArrayPool(Format format2, Format format3, int i, int i2, AudioOutputProvider.OutputConfig outputConfig, AudioProcessingPipeline audioProcessingPipeline) {
        this.groupedMap = format2;
        this.keyPool = format3;
        this.maxSize = i;
        this.currentSize = i2;
        this.sortedSizes = outputConfig;
        this.adapters = audioProcessingPipeline;
    }
}
