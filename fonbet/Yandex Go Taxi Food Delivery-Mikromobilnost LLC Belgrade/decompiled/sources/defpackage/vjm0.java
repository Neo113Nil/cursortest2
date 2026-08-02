package defpackage;

/* loaded from: classes2.dex */
public final class vjm0 implements ujm0 {
    public final cf21 a;
    public final exy0 b;

    public vjm0(cf21 cf21Var, exy0 exy0Var) {
        this.a = cf21Var;
        this.b = exy0Var;
    }

    @Override // defpackage.ujm0
    public final pjm0 get(l1o l1oVar, mjm0 mjm0Var, rzl rzlVar) {
        boolean z = mjm0Var instanceof wul;
        exy0 exy0Var = this.b;
        if (!z) {
            if (mjm0Var instanceof ojh) {
                return new qjh(exy0Var);
            }
            return null;
        }
        w0j w0jVar = l1oVar.d;
        n530 n530Var = l1oVar.a;
        return new zul(w0jVar, this.a, exy0Var, l1oVar.c, n530Var, l1oVar.e, null, 192);
    }

    @Override // defpackage.ujm0
    public final pjm0 get(l1o l1oVar, mjm0 mjm0Var) {
        return null;
    }
}
