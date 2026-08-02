package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.extractor.text.CueEncoder;
import coil3.request.OneShotDisposable;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.LogTime;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ByteBufferGifDecoder implements ResourceDecoder {
    public static final CueEncoder GIF_DECODER_FACTORY = new CueEncoder(20);
    public static final OneShotDisposable PARSER_POOL = new OneShotDisposable(9);
    public final Context context;
    public final CueEncoder gifDecoderFactory = GIF_DECODER_FACTORY;
    public final OneShotDisposable parserPool = PARSER_POOL;
    public final ArrayList parsers;
    public final AndroidSvg provider;

    public ByteBufferGifDecoder(Context context, ArrayList arrayList, BitmapPool bitmapPool, LruArrayPool lruArrayPool) {
        this.context = context.getApplicationContext();
        this.parsers = arrayList;
        this.provider = new AndroidSvg(22, bitmapPool, lruArrayPool);
    }

    public static int getSampleSize(GifHeader gifHeader, int i, int i2) {
        int min = Math.min(gifHeader.height / i2, gifHeader.width / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(max, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            m107m.append(i2);
            m107m.append("], actual dimens: [");
            m107m.append(gifHeader.width);
            m107m.append("x");
            m107m.append(gifHeader.height);
            m107m.append("]");
            Log.v("BufferGifDecoder", m107m.toString());
        }
        return max;
    }

    public final GifDrawableResource decode(ByteBuffer byteBuffer, int i, int i2, GifHeaderParser gifHeaderParser, Options options) {
        StringBuilder sb;
        StandardGifDecoder standardGifDecoder;
        Bitmap.Config config;
        int i3 = LogTime.$r8$clinit;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            GifHeader parseHeader = gifHeaderParser.parseHeader();
            if (parseHeader.frameCount > 0 && parseHeader.status == 0) {
                Bitmap.Config config2 = options.get(GifOptions.DECODE_FORMAT) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int sampleSize = getSampleSize(parseHeader, i, i2);
                CueEncoder cueEncoder = this.gifDecoderFactory;
                AndroidSvg androidSvg = this.provider;
                cueEncoder.getClass();
                StandardGifDecoder standardGifDecoder2 = new StandardGifDecoder(androidSvg, parseHeader, byteBuffer, sampleSize);
                Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
                if (config2 == config3 || config2 == (config = Bitmap.Config.RGB_565)) {
                    standardGifDecoder = standardGifDecoder2;
                    standardGifDecoder.bitmapConfig = config2;
                } else {
                    standardGifDecoder = standardGifDecoder2;
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unsupported format: ", config2, ", must be one of ", config3, " or ", config);
                }
                standardGifDecoder.framePointer = (standardGifDecoder.framePointer + 1) % standardGifDecoder.header.frameCount;
                Bitmap nextFrame = standardGifDecoder.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(LogTime.getElapsedMillis(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                GifDrawableResource gifDrawableResource = new GifDrawableResource(new GifDrawable(new GifDrawable.GifState(new GifFrameLoader(Glide.get(this.context), standardGifDecoder, i, i2, nextFrame), 0)), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.getElapsedMillis(elapsedRealtimeNanos));
                }
                return gifDrawableResource;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(LogTime.getElapsedMillis(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.getElapsedMillis(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, Options options) {
        return !((Boolean) options.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(this.parsers, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i, int i2, Options options) {
        GifHeaderParser gifHeaderParser;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        OneShotDisposable oneShotDisposable = this.parserPool;
        synchronized (oneShotDisposable) {
            try {
                GifHeaderParser gifHeaderParser2 = (GifHeaderParser) ((ArrayDeque) oneShotDisposable.job).poll();
                if (gifHeaderParser2 == null) {
                    gifHeaderParser2 = new GifHeaderParser();
                }
                gifHeaderParser = gifHeaderParser2;
                gifHeaderParser.rawData = null;
                Arrays.fill(gifHeaderParser.block, (byte) 0);
                gifHeaderParser.header = new GifHeader();
                gifHeaderParser.blockSize = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                gifHeaderParser.rawData = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                gifHeaderParser.rawData.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return decode(byteBuffer, i, i2, gifHeaderParser, options);
        } finally {
            this.parserPool.release(gifHeaderParser);
        }
    }
}
