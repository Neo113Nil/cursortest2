package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class pj7 implements ycg, qlh {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pj7(Object obj, boolean z, int i) {
        this.c = obj;
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        ulh ulhVar = (ulh) this.c;
        c9eVar.M(ulhVar.c, i, this.a, this.b);
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        ((d80) obj).i0((c80) this.c, this.a, this.b);
    }
}
