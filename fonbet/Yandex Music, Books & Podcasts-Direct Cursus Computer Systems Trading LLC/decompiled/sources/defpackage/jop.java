package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.SetShuffleCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class jop implements k3l {
    public final jtc a;

    public jop(jtc jtcVar) {
        this.a = jtcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.k3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SetShuffleCommand setShuffleCommand, vx6 vx6Var, cg6 cg6Var) {
        iop iopVar;
        int i;
        PlaybackCommand$QueueBound.Basic basic;
        PlaybackCommand$QueueBound.Basic basic2;
        if (cg6Var instanceof iop) {
            iopVar = (iop) cg6Var;
            int i2 = iopVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iopVar.m = i2 - Integer.MIN_VALUE;
                Object obj = iopVar.k;
                Object obj2 = nm6.a;
                i = iopVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Continuation continuation = null;
                    ssg.a(3, "SetShuffleCommandsExecutor", "setShuffle(" + setShuffleCommand + ")", null);
                    g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
                    if (g4qVar == null || (basic = (PlaybackCommand$QueueBound.Basic) zdg.p(g4qVar, new kop(setShuffleCommand))) == null) {
                        return i3l.a;
                    }
                    boolean shuffle = setShuffleCommand.getShuffle();
                    iopVar.j = basic;
                    iopVar.m = 1;
                    ubn ubnVar = (ubn) ((jyr) this.a.a).getValue();
                    ubnVar.getClass();
                    Object V = x97.V(dm6.b, new ze1(ubnVar, shuffle, continuation, 11), iopVar);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                        return obj2;
                    }
                    basic2 = basic;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    basic2 = iopVar.j;
                    qgg.h0(obj);
                }
                return new f3l(basic2);
            }
        }
        iopVar = new iop(this, cg6Var);
        Object obj3 = iopVar.k;
        Object obj22 = nm6.a;
        i = iopVar.m;
        if (i != 0) {
        }
        return new f3l(basic2);
    }
}
