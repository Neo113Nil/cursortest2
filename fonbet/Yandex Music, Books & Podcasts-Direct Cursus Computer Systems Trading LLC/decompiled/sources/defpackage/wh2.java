package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.AwaitQueuePositionCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class wh2 implements d3l {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.d3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AwaitQueuePositionCommand awaitQueuePositionCommand, vx6 vx6Var, cg6 cg6Var) {
        vh2 vh2Var;
        int i;
        wis e;
        g4q g4qVar;
        boolean z;
        if (cg6Var instanceof vh2) {
            vh2Var = (vh2) cg6Var;
            int i2 = vh2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vh2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = vh2Var.k;
                nm6 nm6Var = nm6.a;
                i = vh2Var.m;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    int position = awaitQueuePositionCommand.getPosition();
                    v3w.k("await queue position ", position, 3, "AwaitQueuePositionCommandExecutor", null);
                    g4q g4qVar2 = (g4q) ((g4l) vx6Var.c).c.getValue();
                    if (g4qVar2 == null) {
                        return Boolean.FALSE;
                    }
                    try {
                        msa msaVar = nsa.b;
                        long M = yd5.M(1, ssa.SECONDS);
                        oh2 oh2Var = new oh2(g4qVar2, continuation, position, i3);
                        vh2Var.j = g4qVar2;
                        vh2Var.m = 1;
                        obj = tyf.K(M, oh2Var, vh2Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } catch (wis e2) {
                        e = e2;
                        g4qVar = g4qVar2;
                        ssg.a(7, "AwaitQueuePositionCommandExecutor", "Queue didn't set queue position in 1 second. Queue: " + g4qVar, e);
                        z = false;
                        return Boolean.valueOf(z);
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g4qVar = vh2Var.j;
                    try {
                        qgg.h0(obj);
                    } catch (wis e3) {
                        e = e3;
                        ssg.a(7, "AwaitQueuePositionCommandExecutor", "Queue didn't set queue position in 1 second. Queue: " + g4qVar, e);
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        vh2Var = new vh2(this, cg6Var);
        Object obj2 = vh2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = vh2Var.m;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        z = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z);
    }
}
