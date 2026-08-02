package defpackage;

import androidx.fragment.app.y;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class wi1 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi1 b;

    public /* synthetic */ wi1(yi1 yi1Var, int i) {
        this.a = i;
        this.b = yi1Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        List list;
        hs5 p;
        switch (this.a) {
            case 0:
                ((Function1) obj).invoke(this.b.a.b);
                break;
            default:
                yi1 yi1Var = this.b;
                zh1 zh1Var = yi1Var.e;
                u51 u51Var = yi1Var.c.D;
                final m5 m5Var = new m5(1, yi1Var.c, mj1.class, "onModalDisclaimerProceed", "onModalDisclaimerProceed(Z)V", 0, 17);
                oi1 oi1Var = new oi1(0, yi1Var.e, zh1.class, "closeScreen", "closeScreen()V", 0, 3);
                zh1Var.getClass();
                u51Var.getClass();
                gd6 gd6Var = u51Var.e;
                m58 m58Var = (gd6Var == null || (list = gd6Var.a) == null || (p = lxe.p(list, gs5.f)) == null) ? null : new m58(p, u51Var.a, gd6Var.c);
                if (m58Var != null) {
                    final int i = 0;
                    Function0 function0 = new Function0() { // from class: yh1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    m5Var.invoke(Boolean.FALSE);
                                    break;
                                default:
                                    m5Var.invoke(Boolean.TRUE);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    final int i2 = 1;
                    Function0 function02 = new Function0() { // from class: yh1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    m5Var.invoke(Boolean.FALSE);
                                    break;
                                default:
                                    m5Var.invoke(Boolean.TRUE);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    i58 i58Var = new i58();
                    i58Var.l = m58Var;
                    i58Var.m = function0;
                    i58Var.n = function02;
                    i58Var.o = oi1Var;
                    i58Var.E((y) zh1Var.a.c);
                }
                break;
        }
        return Unit.a;
    }
}
