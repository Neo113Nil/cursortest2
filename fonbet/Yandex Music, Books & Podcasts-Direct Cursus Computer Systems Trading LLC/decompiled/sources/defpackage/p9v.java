package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class p9v implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ fk0 c;

    public /* synthetic */ p9v(float f, fk0 fk0Var, int i) {
        this.a = i;
        this.b = f;
        this.c = fk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                float f = this.b;
                return new cma(hrg.f((Number) this.c.e(), f, -f));
            case 1:
                float f2 = this.b;
                return new cma(hrg.f((Number) this.c.e(), -f2, f2));
            case 2:
                Number number = (Number) this.c.e();
                float f3 = this.b;
                return new cma(hrg.f(number, f3, f3));
            case 3:
                float f4 = -this.b;
                return new cma(hrg.f((Number) this.c.e(), f4, f4));
            case 4:
                return new cma(hrg.f((Number) this.c.e(), this.b, 0));
            case 5:
                return new cma(hrg.f((Number) this.c.e(), -this.b, 0));
            case 6:
                float f5 = this.b;
                return Float.valueOf(f5 - (((Number) this.c.e()).floatValue() * (f5 * f5)));
            case 7:
                return new cma(hrg.f((Number) this.c.e(), this.b, 0));
            case 8:
                return new cma(hrg.f((Number) this.c.e(), -this.b, 0));
            case 9:
                return Float.valueOf(1.0f - (((Number) this.c.e()).floatValue() * (1.0f - this.b)));
            case 10:
                float f6 = this.b;
                return new cma(hrg.f((Number) this.c.e(), f6, -f6));
            case 11:
                float f7 = this.b;
                return new cma(hrg.f((Number) this.c.e(), -f7, f7));
            case 12:
                float f8 = this.b;
                return Float.valueOf((((Number) this.c.e()).floatValue() * (1.0f - f8)) + f8);
            default:
                float f9 = this.b;
                return Float.valueOf(f9 - (((Number) this.c.e()).floatValue() * (f9 * f9)));
        }
    }
}
