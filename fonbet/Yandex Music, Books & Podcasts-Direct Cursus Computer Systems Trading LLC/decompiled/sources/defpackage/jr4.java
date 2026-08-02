package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes6.dex */
public abstract class jr4 {
    public static final jyr a = btf.b(e1.z0);
    public static final jyr b = btf.b(e1.y0);

    public static ArrayList a() {
        Object t7oVar;
        MediaCodecInfo[] codecInfos;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = new MediaCodecList(1);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        ArrayList arrayList = null;
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        MediaCodecList mediaCodecList = (MediaCodecList) t7oVar;
        if (mediaCodecList != null && (codecInfos = mediaCodecList.getCodecInfos()) != null) {
            arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (!mediaCodecInfo.isEncoder()) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return arrayList;
    }

    public static boolean b(MediaCodecInfo mediaCodecInfo) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        if (i >= 29) {
            z = mediaCodecInfo.isSoftwareOnly();
        } else {
            String name = mediaCodecInfo.getName();
            name.getClass();
            Locale locale = Locale.US;
            String s = ouj.s(locale, name, locale);
            z = !c.v(s, "arc.", false) && (c.v(s, "omx.google.", false) || c.v(s, "omx.ffmpeg.", false) || ((c.v(s, "omx.sec.", false) && StringsKt.M(s, ".sw.", false)) || s.equals("omx.qcom.video.decoder.hevcswvdec") || c.v(s, "c2.android.", false) || c.v(s, "c2.google.", false) || !(c.v(s, "omx.", false) || c.v(s, "c2.", false))));
        }
        return !z;
    }
}
