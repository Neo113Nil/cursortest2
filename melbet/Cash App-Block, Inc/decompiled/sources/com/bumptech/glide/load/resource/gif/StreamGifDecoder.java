package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class StreamGifDecoder implements ResourceDecoder {
    public final LruArrayPool byteArrayPool;
    public final ByteBufferGifDecoder byteBufferDecoder;
    public final ArrayList parsers;

    public StreamGifDecoder(ArrayList arrayList, ByteBufferGifDecoder byteBufferGifDecoder, LruArrayPool lruArrayPool) {
        this.parsers = arrayList;
        this.byteBufferDecoder = byteBufferGifDecoder;
        this.byteArrayPool = lruArrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i, int i2, Options options) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.byteBufferDecoder.decode(ByteBuffer.wrap(bArr), i, i2, options);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, Options options) {
        return !((Boolean) options.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(this.parsers, (InputStream) obj, this.byteArrayPool) == ImageHeaderParser.ImageType.GIF;
    }
}
