package defpackage;

/* loaded from: classes5.dex */
public final class y extends b1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, Class cls) {
        super(0, cls);
        this.c = i;
    }

    @Override // defpackage.b1
    public s0 d(v0 v0Var) {
        switch (this.c) {
            case 0:
                return v0Var.H();
            case 6:
                return v0Var.K();
            case 7:
                return v0Var;
            case 8:
                return v0Var.L();
            default:
                return super.d(v0Var);
        }
    }

    @Override // defpackage.b1
    public s0 e(a07 a07Var) {
        switch (this.c) {
            case 0:
                return z.B(a07Var.a);
            case 1:
                return b0.B(a07Var.a);
            case 2:
                return new wz6(a07Var.a);
            case 3:
                return new xz6(a07Var.a);
            case 4:
                return new j0(a07Var.a);
            case 5:
                return n0.B(a07Var.a, false);
            case 6:
                return a07Var;
            default:
                return super.e(a07Var);
        }
    }
}
