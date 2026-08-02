package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes6.dex */
public final class n9g implements p9g {
    public final nsh a;
    public final tf6 b;
    public final gag c;
    public final Context d;
    public final xdr e;
    public final xdr f;
    public final xdr g;
    public final xdr h;
    public rar i;
    public final rar j;

    public n9g(tf6 tf6Var, gag gagVar, nsh nshVar, Context context) {
        context.getClass();
        this.a = nshVar;
        this.b = tf6Var;
        this.c = gagVar;
        this.d = context;
        Continuation continuation = null;
        xdr a = ydr.a(null);
        this.e = a;
        xdr a2 = ydr.a(null);
        this.f = a2;
        xdr a3 = ydr.a(null);
        this.g = a3;
        xdr a4 = ydr.a(null);
        this.h = a4;
        fkn fknVar = (fkn) nshVar.c;
        int i = 4;
        tc4 u0 = zsd.u0(new ub7(12, fknVar, new ze1(this, continuation, 6)), zsd.Q(new bca(a2, 18), new bca(a, 18), new ifd(fknVar, 20), new j9g(i, 0, continuation)), zsd.Q(new bca(a3, 18), new bca(a, 18), new ifd(fknVar, 21), new j9g(i, 1, continuation)), zsd.Q(new bca(a4, 18), new bca(a, 18), new ifd(fknVar, 22), new j9g(i, 2, continuation)));
        dq7 dq7Var = ca8.a;
        this.j = zsd.r0(tf6Var, zsd.k0(u0, j5h.a));
    }

    @Override // defpackage.p9g
    public final void a(acg acgVar, ListYandexPlayerView listYandexPlayerView) {
        listYandexPlayerView.getClass();
        rar rarVar = this.i;
        if (rarVar != null) {
            rarVar.g(null);
        }
        u21 u21Var = new u21(10, this.e, (fkn) this.a.c, new re7(listYandexPlayerView, null));
        dq7 dq7Var = ca8.a;
        this.i = zsd.r0(this.b, zsd.k0(u21Var, j5h.a));
    }

    @Override // defpackage.p9g
    public final void c(acg acgVar, imh imhVar, imh imhVar2, kyk kykVar) {
        xdr xdrVar = this.g;
        xdrVar.getClass();
        xdrVar.m(null, imhVar2);
    }

    @Override // defpackage.p9g
    public final void d() {
        ue7 ue7Var = (ue7) this.e.getValue();
        if (ue7Var != null) {
            ue7Var.a();
        }
        this.f.l(null);
    }

    @Override // defpackage.p9g
    public final void e(paw pawVar) {
        xdr xdrVar = this.f;
        xdrVar.getClass();
        xdrVar.m(null, pawVar);
    }

    @Override // defpackage.p9g
    public final void h(acg acgVar, int i, int i2) {
        acgVar.getClass();
        mmq mmqVar = new mmq(i, i2);
        xdr xdrVar = this.h;
        xdrVar.getClass();
        xdrVar.m(null, mmqVar);
    }

    @Override // defpackage.p9g
    public final void i(acg acgVar, ListYandexPlayerView listYandexPlayerView) {
        acgVar.getClass();
        listYandexPlayerView.getClass();
        rar rarVar = this.i;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.h.l(null);
        listYandexPlayerView.c();
    }

    @Override // defpackage.p9g
    public final void j(rue rueVar) {
        rueVar.getClass();
        this.g.l(null);
        this.f.l(null);
        this.h.l(null);
        ue7 ue7Var = (ue7) this.e.getValue();
        if (ue7Var != null) {
            ue7Var.b();
        }
        this.j.g(null);
    }
}
