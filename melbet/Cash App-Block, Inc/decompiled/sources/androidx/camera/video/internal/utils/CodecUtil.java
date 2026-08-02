package androidx.camera.video.internal.utils;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class CodecUtil {
    public static final LruCache codecInfoCache = new LruCache(10);

    public static final MediaCodecInfo findCodecAndGetCodecInfo(String str) {
        Object obj;
        MediaCodec mediaCodec;
        str.getClass();
        LruCache lruCache = codecInfoCache;
        synchronized (lruCache) {
            obj = lruCache.get(str);
        }
        try {
            if (obj != null) {
                return (MediaCodecInfo) obj;
            }
            try {
                mediaCodec = MediaCodec.createEncoderByType(str);
                mediaCodec.getClass();
                try {
                    MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                    synchronized (lruCache) {
                    }
                    mediaCodec.release();
                    return codecInfo;
                } catch (Throwable th) {
                    th = th;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new InvalidConfigException(e);
            } catch (IllegalArgumentException e2) {
                throw new InvalidConfigException(e2);
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodec = null;
        }
    }
}
