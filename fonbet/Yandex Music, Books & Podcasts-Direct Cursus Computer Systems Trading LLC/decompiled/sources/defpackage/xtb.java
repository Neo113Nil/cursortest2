package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class xtb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;

    public /* synthetic */ xtb(sdr sdrVar, int i) {
        this.a = i;
        this.b = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 18:
                Boolean bool = (Boolean) this.b.getValue();
                bool.getClass();
                break;
            case 20:
                Boolean bool2 = (Boolean) this.b.getValue();
                bool2.booleanValue();
                break;
            case 21:
                break;
            case 24:
                Boolean bool3 = (Boolean) this.b.getValue();
                bool3.getClass();
                break;
        }
        return Float.valueOf(((Number) this.b.getValue()).floatValue());
    }
}
