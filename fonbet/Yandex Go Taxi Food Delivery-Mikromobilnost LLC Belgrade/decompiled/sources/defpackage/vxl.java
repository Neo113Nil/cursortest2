package defpackage;

import flex.engine.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class vxl implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ vxl(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                xzl b = ((e3m) aVar.Z.a).b();
                if (b != null) {
                    return b.a;
                }
                return null;
            case 1:
                return new xv10(new uk10(aVar.c), new ht10(aVar.Z, aVar.P, false, 18));
            case 2:
                return aVar.Q;
            default:
                u6o u6oVar = aVar.b;
                if (u6oVar instanceof oao) {
                    return ((oao) u6oVar).a(aVar.Q);
                }
                if (!(u6oVar instanceof kkr)) {
                    w511.b();
                    return null;
                }
                kkr kkrVar = (kkr) u6oVar;
                return ((qaw0) kkrVar.a).b((d0m) kkrVar.b.get());
        }
    }
}
