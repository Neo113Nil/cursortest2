package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kfi extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kfi(Function2 function2, int i) {
        super(3);
        this.r = i;
        this.s = function2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                ((Number) obj3).intValue();
                this.s.invoke((hq5) obj2, 0);
                break;
            default:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Number) obj3).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    f1s.e(this.s, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }
}
