package ru.yandex.taxi.logistics.sdk.ui.component.icon;

import androidx.compose.runtime.f;
import defpackage.bvf0;
import defpackage.dci;
import defpackage.dui0;
import defpackage.fse;
import defpackage.ike;
import defpackage.l8x;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.pzt0;
import defpackage.qam;
import defpackage.qhw0;
import defpackage.ra3;
import defpackage.seu;
import defpackage.sls;
import defpackage.ta3;
import defpackage.tje;
import defpackage.tse;
import defpackage.wec;

/* loaded from: classes5.dex */
public final class b extends pa90 implements dui0 {
    public ike A;
    public pzt0 B;
    public final oz40 C = f.j(Float.valueOf(1.0f));
    public final oz40 D = f.j(null);
    public final oz40 E = f.j(ra3.a);
    public final oz40 F = f.j(null);
    public final oz40 G;
    public final oz40 H;
    public final oz40 I;
    public boolean J;
    public final tse y;
    public final sls z;

    public b(tse tseVar, String str, dci dciVar, pa90 pa90Var, sls slsVar) {
        this.y = tseVar;
        this.z = slsVar;
        this.G = f.j(str);
        this.H = f.j(dciVar);
        this.I = f.j(pa90Var);
    }

    @Override // defpackage.pa90
    public final boolean a(float f) {
        this.C.setValue(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.dui0
    public final void b() {
        if (this.J) {
            return;
        }
        ike ikeVar = this.A;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        fse coroutineContext = this.y.getCoroutineContext();
        ike a = bvf0.a(coroutineContext.plus(new qhw0((l8x) coroutineContext.get(seu.C))));
        this.A = a;
        tje.N(a, null, null, new AsyncPainter$onRemembered$1(this, null), 3);
    }

    @Override // defpackage.pa90
    public final boolean c(wec wecVar) {
        this.D.setValue(wecVar);
        return true;
    }

    @Override // defpackage.dui0
    public final void d() {
        e();
    }

    @Override // defpackage.dui0
    public final void e() {
        ike ikeVar = this.A;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.A = null;
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.B = null;
    }

    @Override // defpackage.pa90
    public final long i() {
        pa90 pa90Var = (pa90) this.F.getValue();
        if (pa90Var != null) {
            return pa90Var.i();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        pa90 pa90Var = (pa90) this.F.getValue();
        if (pa90Var != null) {
            pa90Var.g(qamVar, qamVar.c(), ((Number) this.C.getValue()).floatValue(), (wec) this.D.getValue());
        }
    }

    public final ta3 k() {
        return (ta3) this.E.getValue();
    }
}
