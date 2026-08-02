package ru.yandex.taxi.zalogin;

import defpackage.aky;
import defpackage.bky;
import defpackage.dky;
import defpackage.kj;
import defpackage.rjy;
import defpackage.tje;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes6.dex */
public final class m implements rjy {
    public final /* synthetic */ dky a;

    public m(dky dkyVar) {
        this.a = dkyVar;
    }

    @Override // defpackage.rjy
    public final void a() {
        ((aky) this.a.Dg()).closeView();
    }

    @Override // defpackage.rjy
    public final void b() {
        dky dkyVar = this.a;
        ((aky) dkyVar.Dg()).showLinkageFailed();
        bky bkyVar = dkyVar.E;
        if (bkyVar != null) {
            ((aky) dkyVar.Dg()).setData(bkyVar);
        }
    }

    @Override // defpackage.rjy
    public final void c() {
        ((aky) this.a.Dg()).showLinkageErrorDialog(true);
    }

    @Override // defpackage.rjy
    public final void d(kj kjVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, Runnable runnable) {
        dky dkyVar = this.a;
        tje.N(dkyVar.Jg(), null, null, new LinkAccountsPresenter$loginAccount$1(dkyVar, events$Zalogin$LinkageContext, kjVar, null), 3);
    }

    @Override // defpackage.rjy
    public final void e() {
        dky dkyVar = this.a;
        ((aky) dkyVar.Dg()).showLinkageDone();
        ((com.yandex.go.payments.paymentlist.data.c) dkyVar.C.a).p();
    }
}
