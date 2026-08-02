package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class m5r implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qxg b;

    public /* synthetic */ m5r(qxg qxgVar, int i) {
        this.a = i;
        this.b = qxgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float floatValue;
        switch (this.a) {
            case 0:
                floatValue = ((Number) this.b.getValue()).floatValue();
                break;
            default:
                floatValue = ((Number) this.b.getValue()).floatValue();
                break;
        }
        return Float.valueOf(floatValue);
    }
}
