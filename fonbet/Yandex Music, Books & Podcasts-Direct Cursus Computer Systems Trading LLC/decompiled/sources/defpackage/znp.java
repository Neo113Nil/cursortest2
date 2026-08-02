package defpackage;

import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.AwaitQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetQueuePositionAndPlayCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetQueuePositionCommand;

/* loaded from: classes4.dex */
public final class znp implements k3l {
    @Override // defpackage.k3l
    public final Object a(PlaybackCommand$QueueBound.Substituting substituting, vx6 vx6Var, yrn yrnVar) {
        n7q n7qVar;
        SetQueuePositionAndPlayCommand setQueuePositionAndPlayCommand = (SetQueuePositionAndPlayCommand) substituting;
        ssg.a(3, "SetQueuePositionAndPlayCommandExecutor", hrg.q("set queue position ", ran.a(setQueuePositionAndPlayCommand.getQueuePosition()), " and play"), null);
        d6l x = p6g.x((e6l) ((f7l) vx6Var.b).c.getValue());
        return (x == null || (n7qVar = x.a) == null) ? i3l.a : f8g.F(n7qVar) == setQueuePositionAndPlayCommand.getQueuePosition() ? new f3l(new PlayCommand(false)) : new g3l(new eyk(u75.h(new SetQueuePositionCommand(setQueuePositionAndPlayCommand.getQueuePosition()), new AwaitQueuePositionCommand(setQueuePositionAndPlayCommand.getQueuePosition()), new AwaitPlayerConvergedCommand(false), new PlayCommand(false))));
    }
}
