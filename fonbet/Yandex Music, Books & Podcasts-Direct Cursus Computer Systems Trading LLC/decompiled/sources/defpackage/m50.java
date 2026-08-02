package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class m50 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr3 b;

    public /* synthetic */ m50(sr3 sr3Var, int i) {
        this.a = i;
        this.b = sr3Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Number) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    xcs.b(this.b.a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var, 0, 0, 131070);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    xcs.b(this.b.a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var2, 0, 0, 131070);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
