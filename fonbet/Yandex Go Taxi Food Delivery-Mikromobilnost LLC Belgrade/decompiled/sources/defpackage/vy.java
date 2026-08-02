package defpackage;

import com.adjust.sdk.Constants;
import kotlin.Pair;

/* loaded from: classes13.dex */
public final class vy {
    public static nwj a(zsp0 zsp0Var) {
        Pair pair;
        if (zsp0Var instanceof vsp0) {
            ti80 ti80Var = ((vsp0) zsp0Var).a;
            if (ti80Var instanceof qi80) {
                pair = new Pair(null, ((qi80) ti80Var).a);
            } else if (ti80Var instanceof ri80) {
                pair = new Pair(((ri80) ti80Var).a, null);
            } else {
                if (!(ti80Var instanceof si80)) {
                    w511.b();
                    return null;
                }
                si80 si80Var = (si80) ti80Var;
                pair = new Pair(si80Var.a, si80Var.b);
            }
            return new nwj("organization_card", null, (String) pair.getSecond(), (String) pair.getFirst(), 18, null);
        }
        if (zsp0Var instanceof wsp0) {
            return new nwj("open_organizations_list", null, null, null, 14, ((wsp0) zsp0Var).a);
        }
        if (zsp0Var instanceof usp0) {
            return new nwj(Constants.DEEPLINK, ((usp0) zsp0Var).a.toString(), null, null, 28, null);
        }
        if (zsp0Var instanceof xsp0) {
            return new nwj("search", null, null, null, 30, null);
        }
        if (zsp0Var instanceof ysp0) {
            return new nwj("substitute", null, null, null, 30, null);
        }
        if (zsp0Var == null) {
            return null;
        }
        w511.b();
        return null;
    }
}
