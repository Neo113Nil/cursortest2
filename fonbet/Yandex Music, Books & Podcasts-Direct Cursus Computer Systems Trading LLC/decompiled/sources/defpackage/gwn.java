package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.RemovePlayableByQueuePositionCommand;

/* loaded from: classes4.dex */
public final class gwn implements k3l {
    @Override // defpackage.k3l
    public final Object a(PlaybackCommand$QueueBound.Substituting substituting, vx6 vx6Var, yrn yrnVar) {
        PlaybackCommand$QueueBound playbackCommand$QueueBound;
        RemovePlayableByQueuePositionCommand removePlayableByQueuePositionCommand = (RemovePlayableByQueuePositionCommand) substituting;
        ssg.a(3, "RemovePlayableByQueuePositionCommandExecutor", "remove playable at position ".concat(ran.a(removePlayableByQueuePositionCommand.getPosition())), null);
        g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
        return (g4qVar == null || (playbackCommand$QueueBound = (PlaybackCommand$QueueBound) zdg.p(g4qVar, new hwn(removePlayableByQueuePositionCommand.getPosition()))) == null) ? i3l.a : new f3l(playbackCommand$QueueBound);
    }
}
