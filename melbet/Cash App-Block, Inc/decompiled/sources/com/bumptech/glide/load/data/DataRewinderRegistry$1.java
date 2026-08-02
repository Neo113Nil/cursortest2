package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class DataRewinderRegistry$1 implements DataRewinder.Factory {
    public final /* synthetic */ int $r8$classId;

    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final DataRewinder build(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return new InputStreamRewinder(obj);
            case 1:
                return new InputStreamRewinder((ParcelFileDescriptor) obj);
            default:
                return new ByteBufferRewinder((ByteBuffer) obj, false);
        }
    }

    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final Class getDataClass() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }
}
