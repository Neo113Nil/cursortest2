package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes4.dex */
public abstract class iw1 implements gw1 {
    public final ncl a;
    public final f6q b;
    public final k2b c;
    public final rjq d;
    public final um6 e;
    public final xdr f;
    public nej g;
    public Integer h;
    public float i;

    public iw1(ncl nclVar, f6q f6qVar, k2b k2bVar) {
        k2bVar.getClass();
        this.a = nclVar;
        this.b = f6qVar;
        this.c = k2bVar;
        rjq b = hyf.b();
        b.b(new ri1(10, this));
        this.d = b;
        this.e = hld.s(b, mal.b());
        this.f = ydr.a(Boolean.TRUE);
    }

    @Override // defpackage.gw1
    public final void a() {
        mal.a();
        ssg.a(3, j(), "Releasing", null);
        l();
    }

    @Override // defpackage.gw1
    public final xdr b() {
        return this.f;
    }

    @Override // defpackage.gw1
    public final void c(float f) {
        mal.a();
        this.i = f;
        ssg.a(3, j(), "New gain " + f, null);
        g();
    }

    @Override // defpackage.gw1
    public final void d(int i) {
        mal.a();
        Integer num = this.h;
        if (num != null && num.intValue() == i) {
            return;
        }
        v3w.k("Applying audio session id ", i, 3, j(), null);
        a();
        this.h = Integer.valueOf(i);
        boolean k = k(i, new qo1(this, i, 1));
        Boolean valueOf = Boolean.valueOf(k);
        k2b k2bVar = this.c;
        f6q f6qVar = this.b;
        k2bVar.b(i, f6qVar);
        if (!k) {
            k2bVar.a(i, f6qVar);
        }
        ssg.a(3, j(), hrg.q("Inited with ", k ? "control" : "no control", StringUtil.SPACE), null);
        xdr xdrVar = this.f;
        xdrVar.getClass();
        xdrVar.m(null, valueOf);
        g();
    }

    @Override // defpackage.gw1
    public final void e() {
        mal.a();
        this.d.V();
        ssg.a(3, j(), "Disconnecting controls", null);
    }

    @Override // defpackage.gw1
    public final void f(nej nejVar) {
        nejVar.getClass();
        mal.a();
        this.d.g();
        ssg.a(3, j(), "Connecting control", null);
        this.g = nejVar;
        hw1 hw1Var = new hw1(this, 0);
        hw1 hw1Var2 = new hw1(this, 1);
        xdr xdrVar = nejVar.a;
        um6 um6Var = this.e;
        ox6.B(xdrVar, um6Var, hw1Var);
        ox6.B(nejVar.b, um6Var, hw1Var);
        ox6.B(nejVar.c, um6Var, hw1Var);
        ox6.B(nejVar.d, um6Var, hw1Var);
        ox6.B(nejVar.e, um6Var, hw1Var2);
        ox6.B(nejVar.f, um6Var, hw1Var2);
        ox6.B(nejVar.g, um6Var, hw1Var2);
        ox6.B(nejVar.h, um6Var, hw1Var2);
        ox6.B(nejVar.i, um6Var, hw1Var2);
        ox6.B(nejVar.j, um6Var, hw1Var2);
        g();
    }

    public final void g() {
        mal.a();
        if (((Boolean) this.f.getValue()).booleanValue() && this.g != null) {
            ssg.a(3, j(), "Binding effects", null);
            h();
        }
    }

    @Override // defpackage.gw1
    public final f6q getImplementation() {
        return this.b;
    }

    public abstract void h();

    public abstract void i();

    public abstract String j();

    public abstract boolean k(int i, qo1 qo1Var);

    public abstract void l();

    public final void m() {
        mal.a();
        mal.a();
        ncl nclVar = this.a;
        xdr xdrVar = nclVar.c;
        g6q g6qVar = g6q.a;
        xdrVar.getClass();
        xdrVar.m(null, g6qVar);
        xdr xdrVar2 = nclVar.d;
        h6q h6qVar = h6q.None;
        xdrVar2.getClass();
        xdrVar2.m(null, h6qVar);
        n();
        o();
    }

    public final void n() {
        mal.a();
        f1d.s(Float.NaN, this.a.f, null);
    }

    public final void o() {
        mal.a();
        ncl nclVar = this.a;
        xdr xdrVar = nclVar.g;
        Float valueOf = Float.valueOf(Float.NaN);
        xdrVar.getClass();
        xdrVar.m(null, valueOf);
        xdr xdrVar2 = nclVar.h;
        xdrVar2.getClass();
        xdrVar2.m(null, valueOf);
        xdr xdrVar3 = nclVar.i;
        xdrVar3.getClass();
        xdrVar3.m(null, valueOf);
        xdr xdrVar4 = nclVar.j;
        xdrVar4.getClass();
        xdrVar4.m(null, valueOf);
        xdr xdrVar5 = nclVar.k;
        xdrVar5.getClass();
        xdrVar5.m(null, valueOf);
    }
}
