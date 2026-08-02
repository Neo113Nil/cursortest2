package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ndo implements c9a {
    public final /* synthetic */ int a;
    public final /* synthetic */ rdo b;

    public /* synthetic */ ndo(rdo rdoVar, int i) {
        this.a = i;
        this.b = rdoVar;
    }

    @Override // defpackage.c9a
    public final double c(double d) {
        switch (this.a) {
            case 0:
                return yhn.b(this.b.k.c(d), r10.e, r10.f);
            default:
                return this.b.n.c(yhn.b(d, r0.e, r0.f));
        }
    }
}
