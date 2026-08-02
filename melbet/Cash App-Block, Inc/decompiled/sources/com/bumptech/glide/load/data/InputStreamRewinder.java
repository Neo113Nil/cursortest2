package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class InputStreamRewinder implements DataRewinder {
    public static final DataRewinderRegistry$1 DEFAULT_FACTORY = new DataRewinderRegistry$1(0);
    public final /* synthetic */ int $r8$classId;
    public final Object bufferedStream;

    public final class Factory implements DataRewinder.Factory {
        public final LruArrayPool byteArrayPool;

        public Factory(LruArrayPool lruArrayPool) {
            this.byteArrayPool = lruArrayPool;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final DataRewinder build(Object obj) {
            return new InputStreamRewinder((InputStream) obj, this.byteArrayPool);
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final Class getDataClass() {
            return InputStream.class;
        }
    }

    public InputStreamRewinder(InputStream inputStream, LruArrayPool lruArrayPool) {
        this.$r8$classId = 0;
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, lruArrayPool);
        this.bufferedStream = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    private final void cleanup$com$bumptech$glide$load$data$DataRewinderRegistry$DefaultRewinder() {
    }

    private final void cleanup$com$bumptech$glide$load$data$ParcelFileDescriptorRewinder() {
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
        switch (this.$r8$classId) {
            case 0:
                ((RecyclableBufferedInputStream) this.bufferedStream).release();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public Object rewindAndGet() {
        int i = this.$r8$classId;
        Object obj = this.bufferedStream;
        switch (i) {
            case 0:
                RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) obj;
                recyclableBufferedInputStream.reset();
                return recyclableBufferedInputStream;
            case 1:
            default:
                return obj;
            case 2:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) obj).rewind();
        }
    }

    public InputStreamRewinder() {
        this.$r8$classId = 1;
        this.bufferedStream = new HashMap();
    }

    public InputStreamRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.$r8$classId = 2;
        this.bufferedStream = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public ParcelFileDescriptor rewindAndGet() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.bufferedStream).rewind();
    }

    public InputStreamRewinder(Object obj) {
        this.$r8$classId = 3;
        this.bufferedStream = obj;
    }
}
