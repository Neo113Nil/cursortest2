package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class ebw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbw b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ebw(fbw fbwVar, Function1 function1, int i) {
        this.a = i;
        this.b = fbwVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        frb frbVar = (frb) obj;
        switch (this.a) {
            case 0:
                frbVar.getClass();
                frbVar.b = new atn(this.b.b, this.c);
                drb drbVar = new drb();
                drbVar.a = new dw1(false);
                dw1 dw1Var = drbVar.a;
                if (dw1Var == null) {
                    dw1Var = new dw1(true);
                }
                dw1 dw1Var2 = dw1Var;
                lqa lqaVar = new lqa();
                xqr xqrVar = drbVar.b;
                if (xqrVar == null) {
                    xqrVar = new xqr(false, false, false);
                }
                frbVar.f = new erb(dw1Var2, lqaVar, xqrVar, drbVar.c, drbVar.d, drbVar.e);
                break;
            default:
                frbVar.getClass();
                frbVar.b = new atn(this.b.b, this.c);
                drb drbVar2 = new drb();
                drbVar2.a = new dw1(false);
                dw1 dw1Var3 = drbVar2.a;
                if (dw1Var3 == null) {
                    dw1Var3 = new dw1(true);
                }
                dw1 dw1Var4 = dw1Var3;
                lqa lqaVar2 = new lqa();
                xqr xqrVar2 = drbVar2.b;
                if (xqrVar2 == null) {
                    xqrVar2 = new xqr(false, false, false);
                }
                frbVar.f = new erb(dw1Var4, lqaVar2, xqrVar2, drbVar2.c, drbVar2.d, drbVar2.e);
                break;
        }
        return Unit.a;
    }
}
