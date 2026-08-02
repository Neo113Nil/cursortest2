package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class slh implements qlh {
    public final /* synthetic */ int a;
    public final /* synthetic */ tlh b;

    public /* synthetic */ slh(tlh tlhVar, int i) {
        this.a = i;
        this.b = tlhVar;
    }

    @Override // defpackage.qlh
    public final void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 0:
                ulh ulhVar = this.b.a;
                c9eVar.y0(ulhVar.c, i, ulhVar.y);
                break;
            case 1:
                c9eVar.y0(this.b.a.c, i, null);
                break;
            case 2:
                ulh ulhVar2 = this.b.a;
                c9eVar.y0(ulhVar2.c, i, ulhVar2.y);
                break;
            default:
                c9eVar.y0(this.b.a.c, i, null);
                break;
        }
    }
}
