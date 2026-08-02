package defpackage;

/* loaded from: classes2.dex */
public final class wi8 extends of8 {
    public final int a;
    public final int b;
    public final up8 c;

    public wi8(int i, int i2, up8 up8Var) {
        this.a = i;
        this.b = i2;
        this.c = up8Var;
    }

    @Override // defpackage.of8
    public final up8 b(nf8 nf8Var) {
        ze8 ze8Var = (ze8) nf8Var;
        Integer l = bvu0.l(10, ze8Var.b);
        int intValue = l != null ? l.intValue() : 0;
        int i = this.a;
        if (intValue >= i) {
            if (intValue != i) {
                return null;
            }
            Integer l2 = bvu0.l(10, ze8Var.a);
            if ((l2 != null ? l2.intValue() : 0) >= this.b) {
                return null;
            }
        }
        return this.c;
    }
}
