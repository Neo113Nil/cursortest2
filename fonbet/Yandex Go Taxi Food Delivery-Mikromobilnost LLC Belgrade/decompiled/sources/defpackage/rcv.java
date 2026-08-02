package defpackage;

import android.content.Context;
import android.net.Uri;
import com.ybsdk.core.utils.ScreenDensity;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class rcv {
    public static final List a = scc.g("avatars.mds.yandex.net", "avatars.mdst.yandex.net");

    public static String a(String str, tev tevVar, Context context) {
        if (evu0.J(str)) {
            x4c.g("Try to load empty url", new IllegalStateException("Try to load empty url"), str, null, 8);
            return null;
        }
        String n0 = evu0.n0(evu0.k0(str).toString(), '/');
        String host = Uri.parse(n0).getHost();
        if (host == null) {
            x4c.g("Can't resolve image host", null, str, null, 10);
            return null;
        }
        String str2 = "";
        if (!cvu0.s(n0, ".svg", false) && !cvu0.s(n0, "/orig", false) && !cvu0.s(n0, "/optimize", false) && !evu0.y(n0, "/wrapper_", false) && a.contains(host)) {
            float f = context.getResources().getDisplayMetrics().density;
            ScreenDensity screenDensity = ScreenDensity.XXHDPI;
            if (f >= screenDensity.getMultiplier()) {
                screenDensity = ScreenDensity.XXXHDPI;
            } else {
                ScreenDensity screenDensity2 = ScreenDensity.XHDPI;
                if (f < screenDensity2.getMultiplier()) {
                    screenDensity = ScreenDensity.HDPI;
                    if (f >= screenDensity.getMultiplier()) {
                        screenDensity = screenDensity2;
                    }
                }
            }
            String c = tevVar.c(screenDensity);
            if (!evu0.J(c)) {
                str2 = "/".concat(c);
            }
        }
        return n0.concat(str2);
    }
}
