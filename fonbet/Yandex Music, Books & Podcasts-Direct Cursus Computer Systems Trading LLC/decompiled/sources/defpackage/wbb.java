package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class wbb {
    public final jyr a;
    public final jyr b;

    public wbb() {
        bdt I = hag.I(Context.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(z66.class), true);
    }

    public static klu a(String str, lnu lnuVar, elu eluVar) {
        String str2;
        String str3;
        if (lnuVar != null) {
            amu amuVar = lnuVar.d;
            String str4 = lnuVar.b;
            if (str4 != null) {
                int ordinal = eluVar.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    if (amuVar != null) {
                        str2 = amuVar.b;
                        str3 = str2;
                    }
                    str3 = null;
                } else {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            b6e.s();
                            return null;
                        }
                        xq0.q("Custom wave agent is not supported in bottom sheets");
                        return null;
                    }
                    if (amuVar != null) {
                        str2 = amuVar.c;
                        str3 = str2;
                    }
                    str3 = null;
                }
                if (str3 != null) {
                    return new klu(str4, null, str, str3, c3x.U(lnuVar.c), eluVar);
                }
            }
        }
        return null;
    }
}
