package defpackage;

import io.appmetrica.analytics.AppMetrica;
import java.util.HashMap;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class jfb extends lg3 {
    public static void w0(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        try {
            oxa oxaVar = lg3.x.a.a;
            try {
                oxaVar.getClass();
                AppMetrica.reportError("URL_schemeParsingError", illegalStateException);
            } catch (Exception e) {
                ssg.a(7, null, "failed to send URL_schemeParsingError to ".concat(oxaVar.getClass().getName()), e);
            }
        } catch (Exception e2) {
            Timber.w(e2, "failed sending %s", "URL_schemeParsingError");
        }
    }

    public static void x0(long j, boolean z) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        long j2 = j / 1000;
        sb.append(j2 <= 5 ? "0-5" : j2 <= 10 ? "6-10" : j2 <= 15 ? "11-15" : j2 <= 20 ? "16-20" : j2 <= 25 ? "21-25" : j2 <= 30 ? "26-30" : j2 <= 45 ? "31-45" : j2 <= 60 ? "46-60" : j2 <= 90 ? "61-90" : j2 <= 120 ? "91-120" : j2 <= 180 ? "121-180" : j2 <= 300 ? "181-300" : ">300");
        sb.append("s");
        hashMap.put("time", sb.toString());
        hashMap.put("isSuccess", Boolean.valueOf(z));
        lg3.e0("InitialSync", hashMap);
    }
}
