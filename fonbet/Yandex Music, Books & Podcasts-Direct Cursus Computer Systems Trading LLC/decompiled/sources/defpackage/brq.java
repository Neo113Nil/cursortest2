package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;

/* loaded from: classes4.dex */
public final class brq implements k3l {
    @Override // defpackage.k3l
    public final Object a(PlaybackCommand$QueueBound.Substituting substituting, vx6 vx6Var, yrn yrnVar) {
        PlaybackCommand$QueueBound playbackCommand$QueueBound;
        SkipCommand skipCommand = (SkipCommand) substituting;
        ssg.a(3, "SkipCommandsExecutor", "skip", null);
        g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
        return (g4qVar == null || (playbackCommand$QueueBound = (PlaybackCommand$QueueBound) zdg.p(g4qVar, new krq(skipCommand.getReason()))) == null) ? i3l.a : new f3l(playbackCommand$QueueBound);
    }
}
