package defpackage;

import android.media.MediaCodecInfo;
import ru.yandex.video.m3.data.CodecInfo;

/* loaded from: classes6.dex */
public final class rq4 {
    public static CodecInfo a(mih mihVar) {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        mihVar.getClass();
        String str = mihVar.a;
        str.getClass();
        String str2 = mihVar.b;
        str2.getClass();
        return new CodecInfo(str, str2, mihVar.c, mihVar.e, mihVar.f, mihVar.g, mihVar.h, mihVar.i, mihVar.j, l5i.o(str2), (dvt.a < 23 || (codecCapabilities = mihVar.d) == null) ? -1 : codecCapabilities.getMaxSupportedInstances());
    }
}
