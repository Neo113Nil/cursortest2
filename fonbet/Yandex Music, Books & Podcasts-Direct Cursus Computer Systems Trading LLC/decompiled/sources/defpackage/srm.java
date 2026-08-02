package defpackage;

import com.yandex.music.shared.playback.api.commands.ReplayCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;

/* loaded from: classes4.dex */
public final class srm implements k3l {
    @Override // defpackage.k3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueBound.Substituting substituting, vx6 vx6Var, yrn yrnVar) {
        return b(vx6Var, yrnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vx6 vx6Var, cg6 cg6Var) {
        rrm rrmVar;
        Object obj;
        int i;
        PlaybackCommand$QueueBound playbackCommand$QueueBound;
        if (cg6Var instanceof rrm) {
            rrmVar = (rrm) cg6Var;
            int i2 = rrmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rrmVar.m = i2 - Integer.MIN_VALUE;
                obj = rrmVar.k;
                nm6 nm6Var = nm6.a;
                i = rrmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "PreviousOrReplayCommandExecutor", "previousOrReplay", null);
                    uol uolVar = (uol) vx6Var.d;
                    rrmVar.j = vx6Var;
                    rrmVar.m = 1;
                    obj = uolVar.f(rrmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vx6Var = rrmVar.j;
                    qgg.h0(obj);
                }
                if (((Number) obj).longValue() < 3500) {
                    return new f3l(new ReplayCommand(yyn.a));
                }
                g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
                return (g4qVar == null || (playbackCommand$QueueBound = (PlaybackCommand$QueueBound) zdg.p(g4qVar, new wqm())) == null) ? i3l.a : new f3l(playbackCommand$QueueBound);
            }
        }
        rrmVar = new rrm(this, cg6Var);
        obj = rrmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = rrmVar.m;
        if (i != 0) {
        }
        if (((Number) obj).longValue() < 3500) {
        }
    }
}
