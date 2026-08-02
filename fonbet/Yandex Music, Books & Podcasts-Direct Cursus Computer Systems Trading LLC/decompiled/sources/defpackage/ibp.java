package defpackage;

/* loaded from: classes.dex */
public final class ibp extends ljo {
    public final hbp h;
    public final jp3 i;
    public final gbp j;
    public final byte[] k;
    public final pq3 l;

    public ibp(hbp hbpVar, jp3 jp3Var, gbp gbpVar, byte[] bArr) {
        this.h = hbpVar;
        this.i = jp3Var;
        this.j = gbpVar;
        this.k = bArr;
        this.l = new pq3(jp3Var, hbpVar.b, bArr, gbpVar);
    }

    @Override // defpackage.ljo
    public final void d() {
        this.l.h = true;
    }

    @Override // defpackage.ljo
    public final Object e() {
        this.l.a();
        gbp gbpVar = this.j;
        if (gbpVar == null) {
            return null;
        }
        gbpVar.e++;
        gbpVar.a.c(gbpVar.a(), gbpVar.d);
        return null;
    }
}
