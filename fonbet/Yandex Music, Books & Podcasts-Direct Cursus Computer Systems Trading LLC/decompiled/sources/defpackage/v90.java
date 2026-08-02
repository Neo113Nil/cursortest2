package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class v90 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ka0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v90(ka0 ka0Var, int i) {
        super(0);
        this.r = i;
        this.s = ka0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.e();
            case 1:
                ka0 ka0Var = this.s;
                return new Pair(ka0Var.e(), ka0Var.h.getValue());
            case 2:
                ka0 ka0Var2 = this.s;
                Object value = ka0Var2.l.getValue();
                if (value != null) {
                    return value;
                }
                float e = ka0Var2.j.e();
                boolean isNaN = Float.isNaN(e);
                x6k x6kVar = ka0Var2.g;
                if (isNaN) {
                    return x6kVar.getValue();
                }
                Object value2 = x6kVar.getValue();
                j9h e2 = ka0Var2.e();
                float c = e2.c(value2);
                if (c != e && !Float.isNaN(c)) {
                    if (c < e) {
                        Object b = e2.b(true, e);
                        if (b != null) {
                            return b;
                        }
                    } else {
                        Object b2 = e2.b(false, e);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                return value2;
            case 3:
                ka0 ka0Var3 = this.s;
                float c2 = ka0Var3.e().c(ka0Var3.g.getValue());
                float c3 = ka0Var3.e().c(ka0Var3.i.getValue()) - c2;
                float abs = Math.abs(c3);
                float f = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float g = (ka0Var3.g() - c2) / c3;
                    if (g < 1.0E-6f) {
                        f = 0.0f;
                    } else if (g <= 0.999999f) {
                        f = g;
                    }
                }
                return Float.valueOf(f);
            case 4:
                ka0 ka0Var4 = this.s;
                Object value3 = ka0Var4.l.getValue();
                if (value3 != null) {
                    return value3;
                }
                float e3 = ka0Var4.j.e();
                boolean isNaN2 = Float.isNaN(e3);
                x6k x6kVar2 = ka0Var4.g;
                return !isNaN2 ? ka0Var4.c(e3, 0.0f, x6kVar2.getValue()) : x6kVar2.getValue();
            case 5:
                return (Boolean) this.s.g.getValue();
            default:
                return Float.valueOf(this.s.g());
        }
    }
}
