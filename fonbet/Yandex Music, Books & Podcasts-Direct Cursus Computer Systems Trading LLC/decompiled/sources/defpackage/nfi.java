package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.MovePlayableCommand;

/* loaded from: classes4.dex */
public final class nfi implements k3l {
    @Override // defpackage.k3l
    public final Object a(PlaybackCommand$QueueBound.Substituting substituting, vx6 vx6Var, yrn yrnVar) {
        PlaybackCommand$QueueBound playbackCommand$QueueBound;
        MovePlayableCommand movePlayableCommand = (MovePlayableCommand) substituting;
        ssg.a(3, "ChangePositionCommandExecutor", hrg.r("change queue position from ", ran.a(movePlayableCommand.getOldPosition()), " to ", ran.a(movePlayableCommand.getNewPosition())), null);
        if (movePlayableCommand.getNewPosition() == movePlayableCommand.getOldPosition()) {
            return h3l.a;
        }
        g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
        return (g4qVar == null || (playbackCommand$QueueBound = (PlaybackCommand$QueueBound) zdg.p(g4qVar, new ofi(movePlayableCommand.getOldPosition(), movePlayableCommand.getNewPosition()))) == null) ? i3l.a : new f3l(playbackCommand$QueueBound);
    }
}
