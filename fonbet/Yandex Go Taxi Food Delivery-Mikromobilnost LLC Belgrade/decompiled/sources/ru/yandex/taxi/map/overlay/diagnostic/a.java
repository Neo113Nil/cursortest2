package ru.yandex.taxi.map.overlay.diagnostic;

import defpackage.i8z;
import defpackage.k8z;
import defpackage.ney;
import defpackage.qc5;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;

/* loaded from: classes6.dex */
public final class a extends qc5 {
    public final ru.yandex.taxi.preorder.source.userposition.a A;
    public final k8z B;
    public final tt2 C;

    public a(ney neyVar, ru.yandex.taxi.preorder.source.userposition.a aVar, k8z k8zVar, tt2 tt2Var) {
        super(i8z.class, neyVar);
        this.A = aVar;
        this.B = k8zVar;
        this.C = tt2Var;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        rol0 rol0Var = new rol0(new LocationDiagnosticOverlayPresenter$onResume$1(this, null));
        this.C.getClass();
        tje.N(Kg(), null, null, new LocationDiagnosticOverlayPresenter$onResume$$inlined$safeCollectIn$1(e.F(rol0Var, uyj.a), null, this), 3);
    }
}
