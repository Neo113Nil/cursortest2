package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class jmh {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final HashMap e = new HashMap();
    public int f = -1;
    public String g;
    public String h;
    public String i;

    public jmh(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
    }

    public static String b(String str, int i, int i2, int i3) {
        int i4 = dvt.a;
        Locale locale = Locale.US;
        return i + StringUtil.SPACE + str + "/" + i2 + "/" + i3;
    }

    public final lmh a() {
        String b;
        kmh a;
        HashMap hashMap = this.e;
        try {
            if (hashMap.containsKey("rtpmap")) {
                String str = (String) hashMap.get("rtpmap");
                int i = dvt.a;
                a = kmh.a(str);
            } else {
                int i2 = this.d;
                vq1.v(i2 < 96);
                if (i2 == 0) {
                    b = b("PCMU", 0, 8000, 1);
                } else if (i2 == 8) {
                    b = b("PCMA", 8, 8000, 1);
                } else if (i2 == 10) {
                    b = b("L16", 10, RemoteCameraConfig.Mic.SAMPLING_RATE, 2);
                } else if (i2 == 11) {
                    b = b("L16", 11, RemoteCameraConfig.Mic.SAMPLING_RATE, 1);
                } else {
                    xq0.q(k5r.i(i2, "Unsupported static paylod type "));
                    b = null;
                }
                a = kmh.a(b);
            }
            return new lmh(this, cee.a(hashMap), a);
        } catch (r7k e) {
            wvs.m(e);
            return null;
        }
    }
}
