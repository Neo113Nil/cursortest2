package defpackage;

/* loaded from: classes4.dex */
public final class rmw {
    public final zzp a;
    public final dxv b;
    public final rjq c;
    public final um6 d;
    public final xdr e;
    public final xdr f;
    public final eno g;

    public rmw(zzp zzpVar, dxv dxvVar) {
        zzpVar.getClass();
        this.a = zzpVar;
        this.b = dxvVar;
        rjq rjqVar = new rjq(false);
        this.c = rjqVar;
        this.d = hld.s(rjqVar, dm6.b());
        xdr a = ydr.a(qmw.f);
        this.e = a;
        this.f = a;
        this.g = new eno(new f84(this, null));
    }

    public final void a(qmw qmwVar) {
        qmwVar.getClass();
        xdr xdrVar = this.e;
        qmw qmwVar2 = (qmw) xdrVar.getValue();
        qmwVar2.getClass();
        qmw a = qmwVar2.a(Long.valueOf(qmwVar.a), Long.valueOf(qmwVar.b), qmwVar.c);
        xdrVar.getClass();
        xdrVar.m(null, a);
    }
}
