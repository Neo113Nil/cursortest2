package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class nt4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jap b;

    public /* synthetic */ nt4(jap japVar, int i) {
        this.a = i;
        this.b = japVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (Float) this.b.c.getValue();
            case 1:
                return (Float) this.b.b.getValue();
            case 2:
                jap japVar = this.b;
                Float f = (Float) japVar.c.getValue();
                if (f == null) {
                    return (Float) japVar.e.getValue();
                }
                float floatValue = f.floatValue();
                int h = japVar.d.h();
                if (h < 1) {
                    h = 1;
                }
                return Float.valueOf(yhn.c((floatValue / h) + 0.5f, 0.0f, 1.0f));
            case 3:
                return (Float) this.b.c.getValue();
            default:
                return (Float) this.b.b.getValue();
        }
    }
}
