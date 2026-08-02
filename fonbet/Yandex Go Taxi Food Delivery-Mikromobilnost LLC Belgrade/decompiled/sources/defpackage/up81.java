package defpackage;

import java.util.Iterator;
import java.util.List;
import yads.zp1;

/* loaded from: classes7.dex */
public final class up81 {
    public final List a = scc.g("AppOpenAd", "Banner", "Interstitial", "Rewarded", "Native");

    public final String a(zp1 zp1Var) {
        Object obj;
        String str = zp1Var.b;
        String S = evu0.S("Adapter", evu0.e0('.', str, str));
        if (S.length() <= 0) {
            S = null;
        }
        if (S != null) {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (cvu0.s(S, (String) obj, false)) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                String S2 = evu0.S(str2, S);
                if (S2.length() > 0) {
                    return S2;
                }
            }
        }
        return null;
    }
}
