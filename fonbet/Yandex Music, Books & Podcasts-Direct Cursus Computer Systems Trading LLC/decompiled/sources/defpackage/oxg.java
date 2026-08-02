package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class oxg extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ qxg s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oxg(qxg qxgVar, int i) {
        super(0);
        this.r = i;
        this.s = qxgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                qxg qxgVar = this.s;
                float f = 0.0f;
                if (((ayg) qxgVar.i.getValue()) != null) {
                    float floatValue = ((Number) qxgVar.f.getValue()).floatValue();
                    x6k x6kVar = qxgVar.e;
                    if (floatValue < 0.0f) {
                        if (x6kVar.getValue() != null) {
                            l1j.f();
                            return null;
                        }
                    } else {
                        if (x6kVar.getValue() != null) {
                            l1j.f();
                            return null;
                        }
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            case 1:
                qxg qxgVar2 = this.s;
                x6k x6kVar2 = qxgVar2.f;
                return Float.valueOf((((Boolean) qxgVar2.d.getValue()).booleanValue() && qxgVar2.g() % 2 == 0) ? -((Number) x6kVar2.getValue()).floatValue() : ((Number) x6kVar2.getValue()).floatValue());
            default:
                qxg qxgVar3 = this.s;
                return Boolean.valueOf(qxgVar3.g() == ((Number) qxgVar3.c.getValue()).intValue() && ((Number) qxgVar3.k.getValue()).floatValue() == qxgVar3.c());
        }
    }
}
