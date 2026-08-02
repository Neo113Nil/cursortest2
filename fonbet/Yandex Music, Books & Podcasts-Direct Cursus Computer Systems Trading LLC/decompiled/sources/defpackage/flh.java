package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class flh implements qlh {
    public final /* synthetic */ int a;
    public final /* synthetic */ ulh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ flh(ulh ulhVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = ulhVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.qlh
    public final void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 0:
                c9eVar.I0(this.b.c, i, this.c, this.d);
                break;
            case 1:
                c9eVar.v(this.b.c, i, this.c, this.d);
                break;
            default:
                c9eVar.m(this.b.c, i, this.c, this.d);
                break;
        }
    }
}
