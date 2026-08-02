package defpackage;

/* loaded from: classes4.dex */
public final class hco extends nco {
    public final lm4 a;
    public int b;

    public hco(lm4 lm4Var, zzp zzpVar) {
        this.a = lm4Var;
        zzpVar.a();
    }

    @Override // defpackage.nco
    public final Object a(boolean z, Exception exc, cg6 cg6Var) {
        if (z) {
            return Boolean.FALSE;
        }
        if (this.a.i(exc)) {
            return Boolean.TRUE;
        }
        int i = this.b + 1;
        this.b = i;
        return 5 < i ? Boolean.FALSE : Boolean.TRUE;
    }
}
