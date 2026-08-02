package defpackage;

import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class th2 implements d3l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v3, types: [t7q] */
    @Override // defpackage.d3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AwaitPlayerConvergedCommand awaitPlayerConvergedCommand, vx6 vx6Var, cg6 cg6Var) {
        rh2 rh2Var;
        int i;
        xdr xdrVar;
        xdr xdrVar2;
        xdr xdrVar3;
        xdr xdrVar4;
        Boolean bool;
        vdr state;
        if (cg6Var instanceof rh2) {
            rh2Var = (rh2) cg6Var;
            int i2 = rh2Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rh2Var.n = i2 - Integer.MIN_VALUE;
                Object obj = rh2Var.l;
                nm6 nm6Var = nm6.a;
                i = rh2Var.n;
                boolean z = false;
                Continuation continuation = null;
                continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "AwaitPlayerConvergedCommandsExecutor", "await player converged", null);
                    if (awaitPlayerConvergedCommand.getForSecondaryQueue()) {
                        xdrVar = ((f7l) vx6Var.b).d;
                        xdrVar2 = ((g4l) vx6Var.c).d;
                    } else {
                        xdrVar = ((f7l) vx6Var.b).c;
                        xdrVar2 = ((g4l) vx6Var.c).c;
                    }
                    xdr xdrVar5 = xdrVar2;
                    xdrVar3 = xdrVar;
                    xdrVar4 = xdrVar5;
                    eno enoVar = new eno(new akc(new pjc[]{xdrVar3, xdrVar4}, (Continuation) null, new sh2(4, null)));
                    msa msaVar = nsa.b;
                    long M = yd5.M(10, ssa.SECONDS);
                    hl hlVar = new hl(enoVar, continuation, 22);
                    rh2Var.j = xdrVar3;
                    rh2Var.k = xdrVar4;
                    rh2Var.n = 1;
                    obj = tyf.M(M, hlVar, rh2Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar4 = rh2Var.k;
                    xdrVar3 = rh2Var.j;
                    qgg.h0(obj);
                }
                bool = (Boolean) obj;
                if (bool == null) {
                    z = bool.booleanValue();
                } else {
                    Object value = xdrVar3.getValue();
                    g4q g4qVar = (g4q) xdrVar4.getValue();
                    if (g4qVar != null && (state = g4qVar.getState()) != null) {
                        continuation = (t7q) ((xdr) state).getValue();
                    }
                    dfi.r("This should never happen. Player did not converge in 10 seconds. State: " + value + ", QueueState: " + continuation, "AwaitPlayerConvergedCommandsExecutor");
                }
                return Boolean.valueOf(z);
            }
        }
        rh2Var = new rh2(this, cg6Var);
        Object obj2 = rh2Var.l;
        nm6 nm6Var2 = nm6.a;
        i = rh2Var.n;
        boolean z2 = false;
        Continuation continuation2 = null;
        continuation2 = null;
        if (i != 0) {
        }
        bool = (Boolean) obj2;
        if (bool == null) {
        }
        return Boolean.valueOf(z2);
    }
}
