package ru.yandex.taxi.badge;

import android.view.ViewGroup;
import defpackage.au50;
import defpackage.bk4;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.kn4;
import defpackage.ln4;
import defpackage.mn4;
import defpackage.nn4;
import defpackage.tje;
import defpackage.vmw0;

/* loaded from: classes9.dex */
public final class b implements bk4 {
    public final vmw0 a;
    public final a b;
    public final au50 c;
    public kn4 e;
    public final hbp0 d = new hbp0(new czo0(14), "", null);
    public boolean f = true;

    public b(ln4 ln4Var, vmw0 vmw0Var, a aVar, au50 au50Var) {
        this.a = vmw0Var;
        this.b = aVar;
        this.c = au50Var;
    }

    public final void a(Object obj) {
        this.a.a(obj);
    }

    public final void b(ViewGroup viewGroup, String str, nn4 nn4Var) {
        hbp0 hbp0Var = this.d;
        hbp0Var.a();
        mn4 mn4Var = new mn4(viewGroup);
        tje.N(hbp0Var.c(), null, null, new BadgeCoordinatorImpl$attach$1(this, viewGroup, str, nn4Var, null), 3);
        hbp0.e(hbp0Var, null, null, new BadgeCoordinatorImpl$attach$2(this, mn4Var, null), 3);
    }

    public final void c(Object obj) {
        this.a.b(obj);
    }
}
