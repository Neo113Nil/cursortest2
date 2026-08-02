package defpackage;

/* loaded from: classes13.dex */
public final class yb90 implements pft0 {
    public final zb90 a;
    public final kgt0 b;

    public yb90(zb90 zb90Var, kgt0 kgt0Var) {
        this.a = zb90Var;
        this.b = kgt0Var;
    }

    @Override // defpackage.pft0
    public final void c() {
        this.a.a = new u290(5, this);
    }

    @Override // defpackage.pft0
    public final void onDestroyView() {
        this.a.a = null;
    }
}
