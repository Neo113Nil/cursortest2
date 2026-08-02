package defpackage;

import java.util.HashMap;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.EmptyFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.GlobalProcessingState;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;
import ru.rt.ebs.cryptosdk.presentation.base.j;
import ru.rt.ebs.cryptosdk.presentation.base.k;
import ru.rt.ebs.cryptosdk.presentation.base.l;
import ru.rt.ebs.cryptosdk.presentation.base.m;

/* loaded from: classes4.dex */
public abstract class vc5 extends yr31 {
    public final a A;
    public final di9 B;
    public final HashMap C;
    public final z93 D;
    public final IFlowController b;
    public final i3y c;
    public final i3y w;
    public final i3y x;
    public final n0 y;
    public final eci0 z;

    public vc5(IFlowController iFlowController) {
        this.b = iFlowController;
        final int i = 0;
        this.c = kotlin.a.a(new sls(this) { // from class: rc5
            public final /* synthetic */ vc5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                vc5 vc5Var = this.b;
                switch (i2) {
                    case 0:
                        return vc5Var.Y();
                    case 1:
                        return bvf0.c((tt11) vc5Var.c.getValue());
                    default:
                        return e.d(vc5Var.c0());
                }
            }
        });
        final int i2 = 1;
        this.w = kotlin.a.a(new sls(this) { // from class: rc5
            public final /* synthetic */ vc5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                vc5 vc5Var = this.b;
                switch (i22) {
                    case 0:
                        return vc5Var.Y();
                    case 1:
                        return bvf0.c((tt11) vc5Var.c.getValue());
                    default:
                        return e.d(vc5Var.c0());
                }
            }
        });
        final int i3 = 2;
        this.x = kotlin.a.a(new sls(this) { // from class: rc5
            public final /* synthetic */ vc5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                vc5 vc5Var = this.b;
                switch (i22) {
                    case 0:
                        return vc5Var.Y();
                    case 1:
                        return bvf0.c((tt11) vc5Var.c.getValue());
                    default:
                        return e.d(vc5Var.c0());
                }
            }
        });
        n0 c = ffx.c(0, 0, null, 7);
        this.y = c;
        this.z = e.c(c);
        a a = sb2.a(0, null, null, 7);
        this.A = a;
        this.B = new di9(a);
        this.C = new HashMap();
        this.D = new z93(this);
        tje.N(ds31.a(this), null, null, new j(this, null), 3);
    }

    public final void W(pzt0 pzt0Var, String str) {
        X(str);
        this.C.put(str, pzt0Var);
    }

    public final void X(String... strArr) {
        for (String str : strArr) {
            HashMap hashMap = this.C;
            l8x l8xVar = (l8x) hashMap.get(str);
            if (l8xVar != null) {
                l8xVar.a(null);
                hashMap.remove(str);
            }
        }
    }

    public abstract tt11 Y();

    public final IFlow Z() {
        IFlow currentFlow = this.b.getCurrentFlow();
        if (currentFlow instanceof EmptyFlow) {
            EbsLogger.INSTANCE.warning("Flow is empty. ViwModel[" + getClass().getName() + "]");
        }
        return currentFlow;
    }

    public final tt11 a0() {
        return (tt11) ((n4u0) this.x.getValue()).getValue();
    }

    public final int b0() {
        GlobalProcessingState globalProcessingState;
        n4u0 processingState = this.b.getCurrentFlow().getProcessingState();
        return (processingState == null || (globalProcessingState = (GlobalProcessingState) processingState.getValue()) == null) ? pxa1.b(GlobalProcessingState.INITIAL) : pxa1.b(globalProcessingState);
    }

    public final pz40 c0() {
        return (pz40) this.w.getValue();
    }

    public void d0(ys11 ys11Var) {
        if (ys11Var instanceof hao) {
            Z().emit(new Event.Error(((hao) ys11Var).a));
            return;
        }
        if (ys11Var instanceof t5s0) {
            e0(new s5s0(((t5s0) ys11Var).a));
        } else if (ys11Var instanceof q08) {
            Object obj = ((q08) ys11Var).a;
            Z().emit(obj != null ? new Event.Cancel(obj) : new Event.Cancel(null, 1, null));
        }
    }

    public final void e0(xs11 xs11Var) {
        tje.N(ds31.a(this), null, null, new k(this, xs11Var, null), 3);
    }

    public final void f0(ys11 ys11Var) {
        tje.N(ds31.a(this), null, null, new l(this, ys11Var, null), 3);
    }

    public final pzt0 g0(long j, sls slsVar) {
        return tje.N(ds31.a(this), this.D, null, new m(j, slsVar, null), 2);
    }
}
