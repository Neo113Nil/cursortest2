package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.settings.api.explicit.commands.RebuildQueueOnExplicitChangeCommand;

/* loaded from: classes4.dex */
public final class oln implements k3l {
    @Override // defpackage.k3l
    public final Object a(PlaybackCommand$QueueBound.Substituting substituting, vx6 vx6Var, yrn yrnVar) {
        PlaybackCommand$QueueBound playbackCommand$QueueBound;
        ssg.a(3, "RebuildQueueOnExplicitChangeCommandsExecutor", "generic rebuild queue on explicit change " + ((RebuildQueueOnExplicitChangeCommand) substituting), null);
        g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
        return (g4qVar == null || (playbackCommand$QueueBound = (PlaybackCommand$QueueBound) zdg.p(g4qVar, nln.a)) == null) ? i3l.a : new f3l(playbackCommand$QueueBound);
    }
}
