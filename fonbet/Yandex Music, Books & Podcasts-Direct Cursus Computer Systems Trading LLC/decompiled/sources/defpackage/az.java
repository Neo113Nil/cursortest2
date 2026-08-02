package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class az implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ fz b;

    public /* synthetic */ az(fz fzVar, int i) {
        this.a = i;
        this.b = fzVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                oq oqVar = (oq) obj;
                fz fzVar = this.b;
                dy dyVar = fzVar.c;
                boolean z = fzVar.e.e;
                m5 m5Var = new m5(1, fzVar.g.b(), tnb.class, "reportDomainObjectDeeplinkStarted", "reportDomainObjectDeeplinkStarted(Ljava/lang/String;)V", 0, 7);
                dyVar.getClass();
                oqVar.getClass();
                z6n z6nVar = dyVar.a.Z;
                if (z6nVar == null) {
                    Intrinsics.j("urlPlayIntegration");
                    throw null;
                }
                dyd dydVar = (dyd) z6nVar.b;
                if (dydVar != null && !dydVar.c) {
                    xpt xptVar = (xpt) dydVar.b;
                    if (xptVar.a) {
                        dyVar.e.P(oqVar, z, xptVar, m5Var);
                    }
                    dydVar.c = true;
                }
                return Unit.a;
            case 1:
                oq oqVar2 = (oq) obj;
                fz fzVar2 = this.b;
                dy dyVar2 = fzVar2.c;
                final yy yyVar = new yy(fzVar2, 1);
                z3 z3Var = new z3(12, fzVar2);
                dyVar2.getClass();
                oqVar2.getClass();
                j58 J = ild.J(oqVar2);
                if (J != null) {
                    final int i = 0;
                    Function0 function0 = new Function0() { // from class: cy
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    yyVar.invoke(Boolean.FALSE);
                                    break;
                                default:
                                    yyVar.invoke(Boolean.TRUE);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    final int i2 = 1;
                    Function0 function02 = new Function0() { // from class: cy
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    yyVar.invoke(Boolean.FALSE);
                                    break;
                                default:
                                    yyVar.invoke(Boolean.TRUE);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    i58 i58Var = new i58();
                    i58Var.l = J;
                    i58Var.m = function0;
                    i58Var.n = function02;
                    i58Var.o = z3Var;
                    i58Var.E(dyVar2.c);
                }
                return Unit.a;
            default:
                ((t) this.b.c.d.b).finish();
                return Unit.a;
        }
    }
}
