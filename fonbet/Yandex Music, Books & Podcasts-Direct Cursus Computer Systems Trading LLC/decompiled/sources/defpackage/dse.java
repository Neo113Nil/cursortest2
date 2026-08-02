package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class dse implements e9r {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dse(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.e9r
    public final vsr a(anx anxVar) {
        switch (this.a) {
            case 0:
                j42 j42Var = (j42) this.b;
                tsr tsrVar = (tsr) this.c;
                return j42Var.b.create(new tsr(tsrVar.a, tsrVar.b, (ssr) anxVar.c, tsrVar.d, tsrVar.e));
            default:
                l9w l9wVar = (l9w) this.b;
                oc7 oc7Var = (oc7) this.c;
                bdt I = hag.I(pej.class);
                qdc qdcVar = oc7Var.a;
                qdcVar.getClass();
                return anxVar.B(new b3b(l9wVar, (pej) qdcVar.C(I), (ssr) anxVar.c));
        }
    }
}
