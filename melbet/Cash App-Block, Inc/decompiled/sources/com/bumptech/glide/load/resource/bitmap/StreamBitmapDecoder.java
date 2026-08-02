package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawableResource;
import com.bumptech.glide.util.ExceptionPassthroughInputStream;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import com.caverock.androidsvg.SVG;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public final class StreamBitmapDecoder implements ResourceDecoder {
    public final /* synthetic */ int $r8$classId;
    public final Object byteArrayPool;
    public final Object downsampler;

    public StreamBitmapDecoder(Resources resources, ResourceDecoder resourceDecoder) {
        this.$r8$classId = 1;
        this.byteArrayPool = resources;
        this.downsampler = resourceDecoder;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i, int i2, Options options) {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        ExceptionPassthroughInputStream exceptionPassthroughInputStream;
        switch (this.$r8$classId) {
            case 0:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof RecyclableBufferedInputStream) {
                    recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
                    z = false;
                } else {
                    z = true;
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, (LruArrayPool) this.byteArrayPool);
                }
                ArrayDeque arrayDeque = ExceptionPassthroughInputStream.POOL;
                synchronized (arrayDeque) {
                    exceptionPassthroughInputStream = (ExceptionPassthroughInputStream) arrayDeque.poll();
                }
                if (exceptionPassthroughInputStream == null) {
                    exceptionPassthroughInputStream = new ExceptionPassthroughInputStream();
                }
                ExceptionPassthroughInputStream exceptionPassthroughInputStream2 = exceptionPassthroughInputStream;
                exceptionPassthroughInputStream2.wrapped = recyclableBufferedInputStream;
                MarkEnforcingInputStream markEnforcingInputStream = new MarkEnforcingInputStream(exceptionPassthroughInputStream2);
                AndroidSvg androidSvg = new AndroidSvg(21, recyclableBufferedInputStream, exceptionPassthroughInputStream2);
                try {
                    Downsampler downsampler = (Downsampler) this.downsampler;
                    BitmapResource decode = downsampler.decode(new SVG(markEnforcingInputStream, downsampler.parsers, downsampler.byteArrayPool), i, i2, options, androidSvg);
                    exceptionPassthroughInputStream2.exception = null;
                    exceptionPassthroughInputStream2.wrapped = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(exceptionPassthroughInputStream2);
                    }
                    if (z) {
                        recyclableBufferedInputStream.release();
                    }
                    return decode;
                } catch (Throwable th) {
                    exceptionPassthroughInputStream2.exception = null;
                    exceptionPassthroughInputStream2.wrapped = null;
                    ArrayDeque arrayDeque2 = ExceptionPassthroughInputStream.POOL;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(exceptionPassthroughInputStream2);
                        if (!z) {
                            throw th;
                        }
                        recyclableBufferedInputStream.release();
                        throw th;
                    }
                }
            case 1:
                Resource decode2 = ((ResourceDecoder) this.downsampler).decode(obj, i, i2, options);
                Resources resources = (Resources) this.byteArrayPool;
                if (decode2 == null) {
                    return null;
                }
                return new BitmapResource(resources, decode2);
            default:
                Resource decode3 = ((ResourceDrawableDecoder) this.downsampler).decode((Uri) obj, options);
                if (decode3 == null) {
                    return null;
                }
                return DrawableToBitmapConverter.convert((BitmapPool) this.byteArrayPool, (Drawable) ((GifDrawableResource) decode3).get(), i, i2);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, Options options) {
        switch (this.$r8$classId) {
            case 0:
                return true;
            case 1:
                return ((ResourceDecoder) this.downsampler).handles(obj, options);
            default:
                return "android.resource".equals(((Uri) obj).getScheme());
        }
    }

    public /* synthetic */ StreamBitmapDecoder(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.downsampler = obj;
        this.byteArrayPool = obj2;
    }
}
