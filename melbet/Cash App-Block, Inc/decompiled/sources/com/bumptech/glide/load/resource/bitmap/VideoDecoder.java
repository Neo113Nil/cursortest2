package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.LinearByteBufferAllocator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.GlideBuilder$1;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.google.android.play.core.splitinstall.internal.zzb;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class VideoDecoder implements ResourceDecoder {
    public static final GlideBuilder$1 DEFAULT_FACTORY;
    public static final Option FRAME_OPTION;
    public static final List PIXEL_T_BUILD_ID_PREFIXES_REQUIRING_HDR_180_ROTATION_FIX;
    public static final Option TARGET_FRAME = new Option("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new AnonymousClass1());
    public final BitmapPool bitmapPool;
    public final GlideBuilder$1 factory = DEFAULT_FACTORY;
    public final MediaInitializer initializer;

    public interface MediaInitializer {
        void initializeExtractor(MediaExtractor mediaExtractor, Object obj);

        void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    final class VideoDecoderException extends RuntimeException {
    }

    static {
        LinearByteBufferAllocator linearByteBufferAllocator = new LinearByteBufferAllocator();
        linearByteBufferAllocator.memoryPool = ByteBuffer.allocate(4);
        FRAME_OPTION = new Option("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, linearByteBufferAllocator);
        DEFAULT_FACTORY = new GlideBuilder$1();
        PIXEL_T_BUILD_ID_PREFIXES_REQUIRING_HDR_180_ROTATION_FIX = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    }

    public VideoDecoder(BitmapPool bitmapPool, MediaInitializer mediaInitializer) {
        this.bitmapPool = bitmapPool;
        this.initializer = mediaInitializer;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i, int i2, Options options) {
        long longValue = ((Long) options.get(TARGET_FRAME)).longValue();
        if (longValue < 0 && longValue != -1) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m(longValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        Integer num = (Integer) options.get(FRAME_OPTION);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy$None downsampleStrategy$None = (DownsampleStrategy$None) options.get(DownsampleStrategy$None.OPTION);
        if (downsampleStrategy$None == null) {
            downsampleStrategy$None = DownsampleStrategy$None.DEFAULT;
        }
        DownsampleStrategy$None downsampleStrategy$None2 = downsampleStrategy$None;
        this.factory.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.initializer.initializeRetriever(mediaMetadataRetriever, obj);
            Bitmap decodeFrame = decodeFrame(obj, mediaMetadataRetriever, longValue, num.intValue(), i, i2, downsampleStrategy$None2);
            mediaMetadataRetriever.close();
            return BitmapResource.obtain(decodeFrame, this.bitmapPool);
        } catch (Throwable th) {
            mediaMetadataRetriever.close();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(4:5|6|7|(1:9)(6:10|11|12|(2:14|(1:16)(3:17|18|19))|22|23))|38|(5:43|44|45|(1:51)|49)|(1:57)|58|(3:91|(0)|(1:74)(2:75|76))(4:62|(3:65|(1:67)(1:89)|63)|90|(0)(0))|68|69|70|(3:78|79|(3:81|(1:83)|84))|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (android.util.Log.isLoggable("VideoDecoder", 3) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
    
        android.util.Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0106, code lost:
    
        if (r0 < 33) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap decodeFrame(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy$None downsampleStrategy$None) {
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable th) {
                th = th;
                mediaExtractor = null;
            }
            if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                mediaExtractor = new MediaExtractor();
                try {
                    this.initializer.initializeExtractor(mediaExtractor, obj);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i4 = 0; i4 < trackCount; i4++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i4).getString("mime"))) {
                            mediaExtractor.release();
                            a$$ExternalSyntheticBUOutline0.m$1("Cannot decode VP8 video on CrOS.");
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                        }
                    } catch (Throwable th3) {
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        throw th3;
                    }
                }
                mediaExtractor.release();
            }
        }
        if (i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && downsampleStrategy$None != DownsampleStrategy$None.NONE) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float scaleFactor = downsampleStrategy$None.getScaleFactor(parseInt, parseInt2, i2, i3);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * scaleFactor), Math.round(scaleFactor * parseInt2));
            } catch (Throwable th4) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th4);
                }
            }
        }
        if (bitmap == null) {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (!Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
            }
            if (bitmap != null) {
                return bitmap;
            }
            throw new VideoDecoderException("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
        Iterator it = PIXEL_T_BUILD_ID_PREFIXES_REQUIRING_HDR_180_ROTATION_FIX.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
            }
        }
        if (bitmap != null) {
        }
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt4 = Integer.parseInt(extractMetadata);
        int parseInt5 = Integer.parseInt(extractMetadata2);
        if ((parseInt4 == 7 || parseInt4 == 6) && parseInt5 == 6) {
            if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        }
        if (bitmap != null) {
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, Options options) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$1, reason: invalid class name */
    public final class AnonymousClass1 implements Option.CacheKeyUpdater, zzb {
        public final ByteBuffer buffer;

        public AnonymousClass1() {
            this.buffer = ByteBuffer.allocate(8);
        }

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.buffer) {
                this.buffer.position(0);
                messageDigest.update(this.buffer.putLong(l.longValue()).array());
            }
        }

        @Override // com.google.android.play.core.splitinstall.internal.zzb
        public long zza() {
            return this.buffer.capacity();
        }

        @Override // com.google.android.play.core.splitinstall.internal.zzb
        public void zzb(MessageDigest[] messageDigestArr, long j, int i) {
            ByteBuffer slice;
            synchronized (this.buffer) {
                int i2 = (int) j;
                this.buffer.position(i2);
                this.buffer.limit(i2 + i);
                slice = this.buffer.slice();
            }
            for (MessageDigest messageDigest : messageDigestArr) {
                slice.position(0);
                messageDigest.update(slice);
            }
        }

        public AnonymousClass1(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer.slice();
        }
    }
}
