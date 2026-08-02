package defpackage;

/* loaded from: classes3.dex */
public final class q7a implements p7a {
    public final m7a a;
    public final n7a b;
    public final fkn c;

    public q7a(m7a m7aVar, n7a n7aVar) {
        m7aVar.getClass();
        this.a = m7aVar;
        this.b = n7aVar;
        this.c = new fkn(ydr.a(xee.K(m7aVar)));
    }

    @Override // defpackage.p7a
    public final void a() {
        this.b.v(this.a);
    }

    @Override // defpackage.p7a
    public final void b() {
        this.b.m(this.a.c);
    }

    @Override // defpackage.p7a
    public final vdr getState() {
        return this.c;
    }
}
