package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.caverock.androidsvg.SVG;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class ByteBufferBitmapDecoder implements ResourceDecoder {
    public final /* synthetic */ int $r8$classId;
    public final Downsampler downsampler;

    public /* synthetic */ ByteBufferBitmapDecoder(Downsampler downsampler, int i) {
        this.$r8$classId = i;
        this.downsampler = downsampler;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i, int i2, Options options) {
        switch (this.$r8$classId) {
            case 0:
                Downsampler downsampler = this.downsampler;
                return downsampler.decode(new SVG((ByteBuffer) obj, downsampler.parsers, downsampler.byteArrayPool, false, 12), i, i2, options, Downsampler.EMPTY_CALLBACKS);
            default:
                Downsampler downsampler2 = this.downsampler;
                return downsampler2.decode(new SVG((ParcelFileDescriptor) obj, downsampler2.parsers, downsampler2.byteArrayPool), i, i2, options, Downsampler.EMPTY_CALLBACKS);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, Options options) {
        switch (this.$r8$classId) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
