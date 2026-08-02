package defpackage;

import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class yw3 extends gw3 {
    public final int a;
    public final int b;
    public final yx3 c;

    public yw3(int i, int i2, yx3 yx3Var) {
        this.a = i;
        this.b = i2;
        this.c = yx3Var;
    }

    @Override // defpackage.gw3
    public final yx3 b(c3x c3xVar) {
        ew3 ew3Var = (ew3) c3xVar;
        Integer q0 = StringsKt.q0(ew3Var.k);
        int intValue = q0 != null ? q0.intValue() : 0;
        int i = this.a;
        if (intValue >= i) {
            if (intValue != i) {
                return null;
            }
            Integer q02 = StringsKt.q0(ew3Var.j);
            if ((q02 != null ? q02.intValue() : 0) >= this.b) {
                return null;
            }
        }
        return this.c;
    }
}
