package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class xyg implements bzg {
    public final /* synthetic */ int a;
    public final /* synthetic */ czg b;
    public final /* synthetic */ float c;

    public /* synthetic */ xyg(czg czgVar, float f, int i) {
        this.a = i;
        this.b = czgVar;
        this.c = f;
    }

    @Override // defpackage.bzg
    public final void run() {
        switch (this.a) {
            case 0:
                czg czgVar = this.b;
                ayg aygVar = czgVar.a;
                float f = this.c;
                if (aygVar != null) {
                    rzg rzgVar = czgVar.b;
                    rzgVar.k(rzgVar.j, y5i.f(aygVar.l, aygVar.m, f));
                    break;
                } else {
                    czgVar.f.add(new xyg(czgVar, f, 0));
                    break;
                }
            case 1:
                czg czgVar2 = this.b;
                ayg aygVar2 = czgVar2.a;
                float f2 = this.c;
                if (aygVar2 != null) {
                    czgVar2.z((int) y5i.f(aygVar2.l, aygVar2.m, f2));
                    break;
                } else {
                    czgVar2.f.add(new xyg(czgVar2, f2, 1));
                    break;
                }
            default:
                this.b.B(this.c);
                break;
        }
    }
}
