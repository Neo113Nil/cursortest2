package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lj0 extends defpackage.qy0 {
    public final java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    public /* synthetic */ lj0(int i, java.lang.Object obj) {
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = obj;
    }

    @Override // defpackage.qy0
    public final defpackage.sc0 WDYagTQQm9ns() {
        int i = this.oh71FJcDz6S2;
        java.lang.Object obj = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                return ((defpackage.kj0) obj).getLayoutDirection();
            default:
                return ((defpackage.u) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.qy0
    public float fWTAfUmVKrZq(defpackage.o50 o50Var) {
        float intBitsToFloat;
        int eSwlWMUpitz8;
        switch (this.oh71FJcDz6S2) {
            case 0:
                defpackage.c20 c20Var = o50Var.ZpBGe2uQfcn8;
                if (c20Var != null) {
                    return ((java.lang.Number) c20Var.QiMR8OkAhezm(this, java.lang.Float.valueOf(Float.NaN))).floatValue();
                }
                defpackage.kj0 kj0Var = (defpackage.kj0) this.QiMR8OkAhezm;
                if (kj0Var.T1fB7bDYiVJQ) {
                    return Float.NaN;
                }
                defpackage.kj0 kj0Var2 = kj0Var;
                while (true) {
                    defpackage.qp0 qp0Var = kj0Var2.WmetiUbpKU9I;
                    if (!java.lang.Float.isNaN((qp0Var == null || (eSwlWMUpitz8 = defpackage.y7.eSwlWMUpitz8((defpackage.o50[]) qp0Var.giKS3J6vZuNy, o50Var)) < 0) ? Float.NaN : ((float[]) qp0Var.fWTAfUmVKrZq)[eSwlWMUpitz8])) {
                        kj0Var2.eSwlWMUpitz8(kj0Var.ZEXjjCYihNTt(), o50Var);
                        defpackage.rc0 S0c5Wv6LbIVo = kj0Var2.S0c5Wv6LbIVo();
                        defpackage.rc0 S0c5Wv6LbIVo2 = kj0Var.S0c5Wv6LbIVo();
                        switch (o50Var.giKS3J6vZuNy) {
                            case 0:
                                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (S0c5Wv6LbIVo2.BHfvd2J71qpO(S0c5Wv6LbIVo, (java.lang.Float.floatToRawIntBits(r2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(((int) (S0c5Wv6LbIVo.GcLuU6pT9wO9() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (S0c5Wv6LbIVo2.BHfvd2J71qpO(S0c5Wv6LbIVo, (java.lang.Float.floatToRawIntBits(r2) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(((int) (S0c5Wv6LbIVo.GcLuU6pT9wO9() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    defpackage.kj0 Wx2ec0FCRg9J = kj0Var2.Wx2ec0FCRg9J();
                    if (Wx2ec0FCRg9J == null) {
                        kj0Var2.eSwlWMUpitz8(kj0Var.ZEXjjCYihNTt(), o50Var);
                        return Float.NaN;
                    }
                    kj0Var2 = Wx2ec0FCRg9J;
                }
                break;
            default:
                return super.fWTAfUmVKrZq(o50Var);
        }
    }

    @Override // defpackage.hp
    public final float giKS3J6vZuNy() {
        int i = this.oh71FJcDz6S2;
        java.lang.Object obj = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                return ((defpackage.kj0) obj).giKS3J6vZuNy();
            default:
                return ((defpackage.u) obj).getDensity().giKS3J6vZuNy();
        }
    }

    @Override // defpackage.hp
    public final float h3m55N1URyyK() {
        int i = this.oh71FJcDz6S2;
        java.lang.Object obj = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                return ((defpackage.kj0) obj).h3m55N1URyyK();
            default:
                return ((defpackage.u) obj).getDensity().h3m55N1URyyK();
        }
    }

    @Override // defpackage.qy0
    public final int oh71FJcDz6S2() {
        int i = this.oh71FJcDz6S2;
        java.lang.Object obj = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                return ((defpackage.kj0) obj).m6iZQUu7XjoL();
            default:
                return ((defpackage.u) obj).getRoot().BXaznwstz2U0.XntWc4eZSQ8j.WDYagTQQm9ns;
        }
    }
}
