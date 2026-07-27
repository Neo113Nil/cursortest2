package B1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v1.InterfaceC5117a;

/* loaded from: classes.dex */
public final class H implements s1.j {

    /* renamed from: d, reason: collision with root package name */
    public static final s1.g f75d = new s1.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new h4.c(1));

    /* renamed from: e, reason: collision with root package name */
    public static final s1.g f76e = new s1.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new I0.j(2));

    /* renamed from: f, reason: collision with root package name */
    public static final C3.e f77f = new C3.e();

    /* renamed from: g, reason: collision with root package name */
    public static final List f78g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final G f79a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5117a f80b;

    /* renamed from: c, reason: collision with root package name */
    public final C3.e f81c = f77f;

    public H(InterfaceC5117a interfaceC5117a, G g9) {
        this.f80b = interfaceC5117a;
        this.f79a = g9;
    }

    @Override // s1.j
    public final u1.x a(Object obj, int i, int i4, s1.h hVar) {
        long longValue = ((Long) hVar.c(f75d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) hVar.c(f76e);
        if (num == null) {
            num = 2;
        }
        m mVar = (m) hVar.c(m.f107g);
        if (mVar == null) {
            mVar = m.f106f;
        }
        m mVar2 = mVar;
        this.f81c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f79a.r(mediaMetadataRetriever, obj);
            try {
                Bitmap c4 = c(obj, mediaMetadataRetriever, longValue, num.intValue(), i, i4, mVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
                return C0262d.b(c4, this.f80b);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                    throw th2;
                }
                mediaMetadataRetriever.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // s1.j
    public final boolean b(Object obj, s1.h hVar) {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(4:5|6|7|(1:9)(6:10|11|12|(2:14|(1:16)(3:17|18|19))|22|23))|38|(5:45|46|47|(1:53)|51)|(1:59)|60|(3:93|(0)|(1:76)(2:77|78))(4:64|(3:67|(1:69)(1:91)|65)|92|(0)(0))|70|71|72|(3:80|81|(3:83|(1:85)|86))|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017d, code lost:
    
        if (android.util.Log.isLoggable("VideoDecoder", 3) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017f, code lost:
    
        android.util.Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010c, code lost:
    
        if (r0 < 33) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j9, int i, int i4, int i9, m mVar) {
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable th) {
                th = th;
                mediaExtractor = null;
            }
            if (com.anythink.basead.exoplayer.k.o.f8606f.equals(mediaMetadataRetriever.extractMetadata(12))) {
                mediaExtractor = new MediaExtractor();
                try {
                    this.f79a.j(mediaExtractor, obj);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i10 = 0; i10 < trackCount; i10++) {
                        if (com.anythink.basead.exoplayer.k.o.f8609j.equals(mediaExtractor.getTrackFormat(i10).getString("mime"))) {
                            mediaExtractor.release();
                            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
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
        if (Build.VERSION.SDK_INT >= 27 && i4 != Integer.MIN_VALUE && i9 != Integer.MIN_VALUE && mVar != m.f105e) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float b9 = mVar.b(parseInt, parseInt2, i4, i9);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j9, i, Math.round(parseInt * b9), Math.round(b9 * parseInt2));
            } catch (Throwable th4) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th4);
                }
            }
        }
        if (bitmap == null) {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j9, i);
        }
        if (!Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
            }
            if (bitmap != null) {
                return bitmap;
            }
            throw new B0.c("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
        Iterator it = f78g.iterator();
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
}
