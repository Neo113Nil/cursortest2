package com.bumptech.glide.load.resource.bitmap;

import androidx.exifinterface.media.ExifInterface;
import coil3.decode.ExifInterfaceInputStream;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class ExifInterfaceImageHeaderParser implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int getOrientation(InputStream inputStream, LruArrayPool lruArrayPool) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(1, "Orientation");
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType getType(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType getType(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int getOrientation(ByteBuffer byteBuffer, LruArrayPool lruArrayPool) {
        AtomicReference atomicReference = ByteBufferUtil.BUFFER_REF;
        return getOrientation(new ExifInterfaceInputStream(byteBuffer), lruArrayPool);
    }
}
