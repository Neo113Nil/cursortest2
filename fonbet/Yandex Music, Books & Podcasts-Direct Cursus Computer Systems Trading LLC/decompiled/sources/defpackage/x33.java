package defpackage;

/* loaded from: classes4.dex */
public final class x33 implements f8l {
    public final /* synthetic */ mmo a;

    public x33(mmo mmoVar) {
        this.a = mmoVar;
    }

    @Override // defpackage.f8l
    public final void M(e3t e3tVar) {
        e3tVar.getClass();
        mmo mmoVar = this.a;
        v2q v2qVar = (v2q) mmoVar.e;
        if (v2qVar == null || !(v2qVar instanceof s2q)) {
            return;
        }
        tv1 tv1Var = (tv1) ((vdr) ((vv1) mmoVar.c).a.getValue()).getValue();
        if (tv1Var instanceof rv1) {
            return;
        }
        xee.t((kv6) mmoVar.b, tv1Var);
    }
}
