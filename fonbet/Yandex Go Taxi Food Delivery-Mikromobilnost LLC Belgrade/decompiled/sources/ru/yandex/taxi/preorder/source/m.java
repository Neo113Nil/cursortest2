package ru.yandex.taxi.preorder.source;

import defpackage.axt;
import defpackage.cjt0;
import defpackage.cl11;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.jqr;
import defpackage.tje;
import kotlinx.coroutines.flow.o;

/* loaded from: classes6.dex */
public final class m implements cl11 {
    public final hbp0 a = new hbp0(new czo0(14), "", null);
    public final /* synthetic */ cjt0 b;

    public m(cjt0 cjt0Var) {
        this.b = cjt0Var;
    }

    @Override // defpackage.cl11
    public final void onPause() {
        this.b.e.a();
        this.a.b();
        axt axtVar = this.b.d;
        synchronized (axtVar) {
            axtVar.e.clear();
            axtVar.f = null;
        }
    }

    @Override // defpackage.cl11
    public final void onResume() {
        hbp0 hbp0Var = this.a;
        hbp0Var.a();
        cjt0 cjt0Var = this.b;
        cjt0Var.e.b(hbp0Var);
        tje.N(hbp0Var, null, null, new SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$$inlined$safeCollectIn$1(new o(new l(new jqr(((ru.yandex.taxi.preorder.source.userposition.e) cjt0Var.a).n(), new SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1(cjt0Var, null), 3), cjt0Var), new SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$3(cjt0Var, null)), null, cjt0Var), 3);
    }
}
