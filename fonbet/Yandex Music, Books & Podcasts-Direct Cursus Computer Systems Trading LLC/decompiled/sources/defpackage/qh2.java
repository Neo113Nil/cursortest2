package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.AwaitOriginalPositionCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class qh2 implements d3l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.d3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AwaitOriginalPositionCommand awaitOriginalPositionCommand, vx6 vx6Var, cg6 cg6Var) {
        ph2 ph2Var;
        int i;
        wis e;
        g4q g4qVar;
        if (cg6Var instanceof ph2) {
            ph2Var = (ph2) cg6Var;
            int i2 = ph2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ph2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ph2Var.k;
                nm6 nm6Var = nm6.a;
                i = ph2Var.m;
                boolean z = false;
                Object[] objArr = 0;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    int position = awaitOriginalPositionCommand.getPosition();
                    v3w.k("await original position ", position, 3, "AwaitOriginalPositionCommandExecutor", null);
                    g4q g4qVar2 = (g4q) ((g4l) vx6Var.c).c.getValue();
                    if (g4qVar2 == null) {
                        return Boolean.FALSE;
                    }
                    try {
                        msa msaVar = nsa.b;
                        long M = yd5.M(1, ssa.SECONDS);
                        oh2 oh2Var = new oh2(g4qVar2, continuation, position, objArr == true ? 1 : 0);
                        ph2Var.j = g4qVar2;
                        ph2Var.m = 1;
                        obj = tyf.K(M, oh2Var, ph2Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        g4qVar = g4qVar2;
                    } catch (wis e2) {
                        e = e2;
                        g4qVar = g4qVar2;
                        ssg.a(7, "AwaitOriginalPositionCommandExecutor", "Queue didn't set original position in 1 second. Queue: " + g4qVar, e);
                        return Boolean.valueOf(z);
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g4qVar = ph2Var.j;
                    try {
                        qgg.h0(obj);
                    } catch (wis e3) {
                        e = e3;
                        ssg.a(7, "AwaitOriginalPositionCommandExecutor", "Queue didn't set original position in 1 second. Queue: " + g4qVar, e);
                        return Boolean.valueOf(z);
                    }
                }
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        ph2Var = new ph2(this, cg6Var);
        Object obj2 = ph2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = ph2Var.m;
        boolean z2 = false;
        Object[] objArr2 = 0;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        z2 = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z2);
    }
}
