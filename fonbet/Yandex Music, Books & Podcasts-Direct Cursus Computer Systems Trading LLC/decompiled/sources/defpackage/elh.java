package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class elh implements qlh {
    public final /* synthetic */ int a;
    public final /* synthetic */ ulh b;
    public final /* synthetic */ float c;

    public /* synthetic */ elh(ulh ulhVar, float f, int i) {
        this.a = i;
        this.b = ulhVar;
        this.c = f;
    }

    @Override // defpackage.qlh
    public final void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 0:
                c9eVar.o(this.b.c, i, this.c);
                break;
            default:
                c9eVar.c0(this.b.c, i, this.c);
                break;
        }
    }
}
