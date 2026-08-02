package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class nzv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;

    public /* synthetic */ nzv(sdr sdrVar, int i) {
        this.a = i;
        this.b = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 1:
                Boolean bool = (Boolean) this.b.getValue();
                bool.getClass();
                return bool;
            default:
                Boolean bool2 = (Boolean) this.b.getValue();
                bool2.getClass();
                return bool2;
        }
    }
}
