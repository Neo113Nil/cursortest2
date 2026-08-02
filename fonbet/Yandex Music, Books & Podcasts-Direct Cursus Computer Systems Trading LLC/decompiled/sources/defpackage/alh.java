package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class alh implements ycg, qlh {
    public final /* synthetic */ int a;
    public final /* synthetic */ ulh b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ alh(ulh ulhVar, boolean z, int i) {
        this.a = i;
        this.b = ulhVar;
        this.c = z;
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 1:
                c9eVar.O(this.b.c, i, this.c);
                break;
            case 2:
            default:
                c9eVar.K0(this.b.c, i, this.c);
                break;
            case 3:
                c9eVar.F(this.b.c, i, this.c);
                break;
        }
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        f8l f8lVar = (f8l) obj;
        switch (this.a) {
            case 0:
                f8lVar.s(this.b.o.r, this.c);
                break;
            default:
                f8lVar.s(this.b.o.r, this.c);
                break;
        }
    }
}
