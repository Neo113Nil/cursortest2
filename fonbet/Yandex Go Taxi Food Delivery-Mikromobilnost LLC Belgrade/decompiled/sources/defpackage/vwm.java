package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes5.dex */
public final class vwm {
    public final wiq0 a;

    public /* synthetic */ vwm(wiq0 wiq0Var) {
        this.a = wiq0Var;
    }

    public String a(cwd cwdVar) {
        String str;
        String e;
        pex0 m = ((k) this.a).m();
        if (m == null || (str = m.b) == null) {
            str = "";
        }
        if (cwdVar != null) {
            for (pex0 pex0Var : cwdVar.c) {
                if (jl40.l(pex0Var.b, str) && (e = pex0Var.e()) != null && e.length() != 0) {
                    return e;
                }
            }
        }
        return "";
    }
}
