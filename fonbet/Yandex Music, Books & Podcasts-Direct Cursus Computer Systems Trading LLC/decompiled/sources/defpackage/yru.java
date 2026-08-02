package defpackage;

/* loaded from: classes4.dex */
public final class yru implements zru {
    public final xdr a;
    public final xdr b;
    public final dkn c;

    public yru() {
        xdr a = ydr.a(new bsu(false));
        this.a = a;
        this.b = a;
        this.c = new dkn(y0q.b(0, 0, null, 7));
    }

    @Override // defpackage.zru
    public final void a(co5 co5Var) {
        xdr xdrVar;
        do {
            xdrVar = this.a;
        } while (!xdrVar.k(xdrVar.getValue(), new bsu(!((bsu) r0).a)));
    }

    @Override // defpackage.zru
    public final dkn b() {
        return this.c;
    }

    @Override // defpackage.zru
    public final xdr getState() {
        return this.b;
    }
}
