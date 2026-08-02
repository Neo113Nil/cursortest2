package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class gn6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ gn6(fk0 fk0Var, int i) {
        this.a = i;
        this.b = fk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Float.valueOf(((Number) this.b.e()).floatValue());
            case 1:
                return Float.valueOf(1.5f - ((Number) this.b.e()).floatValue());
            case 2:
                return Float.valueOf(((Number) this.b.e()).floatValue());
            case 3:
                return Float.valueOf(((Number) this.b.e()).floatValue());
            case 4:
                return Float.valueOf(1.0f - (((Number) this.b.e()).floatValue() * 0.5f));
            case 5:
                return Float.valueOf((((Number) this.b.e()).floatValue() * 0.5f) + 0.5f);
            case 6:
                return Float.valueOf(((Number) this.b.e()).floatValue());
            case 7:
                return Float.valueOf(0.5f - (((Number) this.b.e()).floatValue() * 0.3f));
            case 8:
                return Float.valueOf(1.0f - ((Number) this.b.e()).floatValue());
            default:
                return Float.valueOf(((Number) this.b.e()).floatValue());
        }
    }
}
