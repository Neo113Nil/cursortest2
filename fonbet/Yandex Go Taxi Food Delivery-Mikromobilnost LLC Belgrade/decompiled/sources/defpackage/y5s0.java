package defpackage;

import ru.yandex.taxi.banners.c;

/* loaded from: classes6.dex */
public final class y5s0 {
    public final pjc a;
    public final c b;
    public final pta0 c;

    public y5s0(pjc pjcVar, c cVar, pta0 pta0Var) {
        this.a = pjcVar;
        this.b = cVar;
        this.c = pta0Var;
    }

    public final void a(pex0 pex0Var) {
        boolean z = pex0Var.O instanceof ojc;
        String str = pex0Var.h0;
        if (z && str.length() != 0) {
            pjc pjcVar = this.a;
            if (((Boolean) pjcVar.a.getValue(pjcVar, pjc.b[0])).booleanValue()) {
                return;
            }
            c.l(this.b, str, "combo_banner", null, null, new x5s0(0, this), 12);
        }
    }
}
