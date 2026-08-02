package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.BufferedOutputStream;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class BitmapEncoder implements ResourceEncoder {
    public final LruArrayPool arrayPool;
    public static final Option COMPRESSION_QUALITY = Option.memory(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final Option COMPRESSION_FORMAT = new Option("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, Option.EMPTY_UPDATER);

    public BitmapEncoder(LruArrayPool lruArrayPool) {
        this.arrayPool = lruArrayPool;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    @Override // com.bumptech.glide.load.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean encode(Object obj, File file, Options options) {
        boolean z;
        Bitmap bitmap = (Bitmap) ((Resource) obj).get();
        Option option = COMPRESSION_FORMAT;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) options.get(option);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = LogTime.$r8$clinit;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) options.get(COMPRESSION_QUALITY)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                LruArrayPool lruArrayPool = this.arrayPool;
                if (lruArrayPool != null) {
                    try {
                        outputStream = new BufferedOutputStream(fileOutputStream, lruArrayPool);
                    } catch (IOException e) {
                        e = e;
                        outputStream = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = fileOutputStream;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    outputStream = fileOutputStream;
                }
                bitmap.compress(compressFormat, intValue, outputStream);
                outputStream.close();
                try {
                    outputStream.close();
                } catch (IOException unused3) {
                }
                z = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + Util.getBitmapByteSize(bitmap) + " in " + LogTime.getElapsedMillis(elapsedRealtimeNanos) + ", options format: " + options.get(option) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public final int getEncodeStrategy(Options options) {
        return 2;
    }
}
