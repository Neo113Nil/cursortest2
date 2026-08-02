package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class rw3 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ vw3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw3(vw3 vw3Var, int i) {
        super(1);
        this.r = i;
        this.s = vw3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ww3 ww3Var;
        switch (this.r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                vw3 vw3Var = this.s;
                if (booleanValue) {
                    ww3 ww3Var2 = vw3Var.i;
                    if (ww3Var2 != null) {
                        ww3Var2.invoke(new hne(fbs.CARD_NUMBER));
                    }
                    vw3Var.e(jw3.b);
                    Function1 function1 = vw3Var.g;
                    if (function1 != null) {
                        function1.invoke(bcx.A(vw3Var.c.getCardNumber()));
                    }
                } else {
                    vw3Var.e(jw3.a);
                    Function1 function12 = vw3Var.g;
                    if (function12 != null) {
                        function12.invoke(null);
                    }
                }
                break;
            case 1:
                vx3 vx3Var = (vx3) obj;
                vx3Var.getClass();
                vw3 vw3Var2 = this.s;
                vw3Var2.e.setCardType(vx3Var);
                Function1 function13 = vw3Var2.h;
                if (function13 != null) {
                    function13.invoke(zsd.K0(vx3Var.a));
                }
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                vw3 vw3Var3 = this.s;
                boolean a = vw3Var3.d.a();
                if (a && booleanValue2) {
                    vw3Var3.e.a();
                }
                if (a && (ww3Var = vw3Var3.i) != null) {
                    ww3Var.invoke(new hne(fbs.EXPIRATION_DATE));
                }
                vw3.a(vw3Var3);
                break;
        }
        return Unit.a;
    }
}
