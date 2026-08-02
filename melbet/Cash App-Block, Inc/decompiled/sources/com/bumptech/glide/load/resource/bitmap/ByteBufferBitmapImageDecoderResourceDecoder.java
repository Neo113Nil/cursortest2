package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class ByteBufferBitmapImageDecoderResourceDecoder implements ResourceDecoder {
    public final /* synthetic */ int $r8$classId;
    public final GifFrameResourceDecoder wrapped;

    public ByteBufferBitmapImageDecoderResourceDecoder(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.wrapped = new GifFrameResourceDecoder();
                break;
            default:
                this.wrapped = new GifFrameResourceDecoder();
                break;
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i, int i2, Options options) {
        int i3 = this.$r8$classId;
        GifFrameResourceDecoder gifFrameResourceDecoder = this.wrapped;
        switch (i3) {
            case 0:
                return gifFrameResourceDecoder.decode(ImageDecoder.createSource((ByteBuffer) obj), i, i2, options);
            default:
                return gifFrameResourceDecoder.decode(ImageDecoder.createSource(ByteBufferUtil.fromStream((InputStream) obj)), i, i2, options);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ boolean handles(Object obj, Options options) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
