package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.util.ByteBufferUtil;
import com.squareup.cash.clientroutes.ClientRoute;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class ImageHeaderParserUtils {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLoan.deepLinkSpecs;
    }

    public static int getOrientation(List list, InputStream inputStream, LruArrayPool lruArrayPool) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, lruArrayPool);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int orientation = ((ImageHeaderParser) list.get(i)).getOrientation(inputStream, lruArrayPool);
                if (orientation != -1) {
                    return orientation;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType getType(List list, InputStream inputStream, LruArrayPool lruArrayPool) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, lruArrayPool);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType type2 = ((ImageHeaderParser) list.get(i)).getType(inputStream);
                inputStream.reset();
                if (type2 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return type2;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType getType(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType type2 = ((ImageHeaderParser) list.get(i)).getType(byteBuffer);
                AtomicReference atomicReference = ByteBufferUtil.BUFFER_REF;
                if (type2 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return type2;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = ByteBufferUtil.BUFFER_REF;
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
