package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class u90 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ia0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u90(ia0 ia0Var, int i) {
        super(0);
        this.r = i;
        this.s = ia0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.g();
            case 1:
                ia0 ia0Var = this.s;
                return new Pair(ia0Var.g(), ((zx7) ia0Var.j).getValue());
            case 2:
                ia0 ia0Var2 = this.s;
                Object value = ((x6k) ia0Var2.h).getValue();
                if (value != null) {
                    return value;
                }
                float e = ((t6k) ia0Var2.l).e();
                boolean isNaN = Float.isNaN(e);
                x6k x6kVar = (x6k) ia0Var2.g;
                if (isNaN) {
                    return x6kVar.getValue();
                }
                Object value2 = x6kVar.getValue();
                i9h g = ia0Var2.g();
                float c = g.c(value2);
                if (c != e && !Float.isNaN(c)) {
                    if (c < e) {
                        Object b = g.b(true, e);
                        if (b != null) {
                            return b;
                        }
                    } else {
                        Object b2 = g.b(false, e);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                return value2;
            case 3:
                ia0 ia0Var3 = this.s;
                float c2 = ia0Var3.g().c(((x6k) ia0Var3.g).getValue());
                float c3 = ia0Var3.g().c(((zx7) ia0Var3.k).getValue()) - c2;
                float abs = Math.abs(c3);
                float f = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float k = (ia0Var3.k() - c2) / c3;
                    if (k < 1.0E-6f) {
                        f = 0.0f;
                    } else if (k <= 0.999999f) {
                        f = k;
                    }
                }
                return Float.valueOf(f);
            default:
                ia0 ia0Var4 = this.s;
                Object value3 = ((x6k) ia0Var4.h).getValue();
                if (value3 != null) {
                    return value3;
                }
                float e2 = ((t6k) ia0Var4.l).e();
                boolean isNaN2 = Float.isNaN(e2);
                x6k x6kVar2 = (x6k) ia0Var4.g;
                return !isNaN2 ? ia0Var4.e(e2, 0.0f, x6kVar2.getValue()) : x6kVar2.getValue();
        }
    }
}
