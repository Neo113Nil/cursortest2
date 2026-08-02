package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class oj2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;

    public /* synthetic */ oj2(sdr sdrVar, int i) {
        this.a = i;
        this.b = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new d85(xv.K((jil) this.b.getValue()));
            case 1:
                return new d85(((d85) this.b.getValue()).a);
            case 2:
                return new d85(((d85) this.b.getValue()).a);
            case 3:
                return new d85(((d85) this.b.getValue()).a);
            case 4:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 5:
                return new d85(((d85) this.b.getValue()).a);
            case 6:
                return new d85(((d85) this.b.getValue()).a);
            case 7:
                return new d85(((d85) this.b.getValue()).a);
            default:
                return new d85(((ylu) this.b.getValue()).e);
        }
    }
}
