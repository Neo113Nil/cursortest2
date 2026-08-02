package defpackage;

import ru.yandex.taxi.delivery.impl.paid_insurance.d;

/* loaded from: classes5.dex */
public final class rgi {
    public final d a;
    public final yvf0 b;
    public final ngi c;
    public final oep0 d;

    public rgi(d dVar, yvf0 yvf0Var, ngi ngiVar, oep0 oep0Var) {
        this.a = dVar;
        this.b = yvf0Var;
        this.c = ngiVar;
        this.d = oep0Var;
    }

    public final qgi a(boolean z, zgi zgiVar) {
        khi khiVar = zgiVar.c;
        String str = khiVar.a;
        String str2 = khiVar.d;
        return new qgi(b64.j(str, str2 != null ? " ".concat(str2) : ""), khiVar.e, z, new bhh(18, this), new amh(13, this));
    }
}
