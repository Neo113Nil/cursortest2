package defpackage;

/* loaded from: classes3.dex */
public final class zqm implements tt4 {
    public final xdr a;
    public final xdr b;

    public zqm(boolean z) {
        this.a = ydr.a(z ? qnl.a : orm.c);
        this.b = ydr.a(orm.b);
    }

    @Override // defpackage.tt4
    public final vdr c() {
        return this.b;
    }

    @Override // defpackage.tt4
    public final void f() {
        xdr xdrVar = this.b;
        v7l v7lVar = (v7l) xdrVar.getValue();
        v7l v7lVar2 = new v7l(!((v7l) xdrVar.getValue()).a, v7lVar.b, v7lVar.c, v7lVar.d, v7lVar.e, v7lVar.f);
        xdrVar.getClass();
        xdrVar.m(null, v7lVar2);
    }

    @Override // defpackage.tt4
    public final void g(yur yurVar) {
        yurVar.getClass();
    }

    @Override // defpackage.tt4
    public final vdr getState() {
        return this.a;
    }

    @Override // defpackage.tt4
    public final void d() {
    }

    @Override // defpackage.tt4
    public final void e() {
    }
}
