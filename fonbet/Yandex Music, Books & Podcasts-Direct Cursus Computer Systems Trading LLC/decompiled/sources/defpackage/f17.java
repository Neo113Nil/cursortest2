package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class f17 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j17 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f17(j17 j17Var, int i) {
        super(1);
        this.r = i;
        this.s = j17Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ww3 ww3Var;
        switch (this.r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                j17 j17Var = this.s;
                if (booleanValue) {
                    ww3 ww3Var2 = j17Var.n;
                    if (ww3Var2 != null) {
                        ww3Var2.invoke(new hne(fbs.CARD_NUMBER));
                    }
                    j17Var.f(jw3.b);
                    Function1 function1 = j17Var.l;
                    if (function1 != null) {
                        function1.invoke(bcx.A(j17Var.d.getCardNumber()));
                    }
                } else {
                    j17Var.f(jw3.a);
                    Function1 function12 = j17Var.l;
                    if (function12 != null) {
                        function12.invoke(null);
                    }
                }
                break;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                j17 j17Var2 = this.s;
                j17Var2.h.setVisibility(!booleanValue2 ? 0 : 8);
                j17Var2.g.setVisibility(8);
                break;
            case 2:
                vx3 vx3Var = (vx3) obj;
                vx3Var.getClass();
                j17 j17Var3 = this.s;
                j17Var3.f.setCardType(vx3Var);
                Function1 function13 = j17Var3.m;
                if (function13 != null) {
                    function13.invoke(zsd.K0(vx3Var.a));
                }
                break;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                j17 j17Var4 = this.s;
                boolean a = j17Var4.e.a();
                if (a && booleanValue3) {
                    j17Var4.f.a();
                }
                if (a && (ww3Var = j17Var4.n) != null) {
                    ww3Var.invoke(new hne(fbs.EXPIRATION_DATE));
                }
                j17.a(j17Var4);
                break;
        }
        return Unit.a;
    }
}
