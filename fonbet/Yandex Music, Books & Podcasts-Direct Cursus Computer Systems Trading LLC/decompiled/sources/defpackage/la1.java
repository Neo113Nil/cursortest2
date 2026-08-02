package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class la1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;

    public /* synthetic */ la1(sdr sdrVar, int i) {
        this.a = i;
        this.b = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                sdr sdrVar = this.b;
                break;
            case 5:
                Boolean bool = (Boolean) this.b.getValue();
                bool.getClass();
                break;
            case 16:
                float f = fn0.b;
                break;
        }
        return Float.valueOf(((Number) this.b.getValue()).floatValue());
    }
}
