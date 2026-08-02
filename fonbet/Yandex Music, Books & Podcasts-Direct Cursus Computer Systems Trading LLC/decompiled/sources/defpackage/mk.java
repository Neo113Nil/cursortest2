package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsLastCommand;

/* loaded from: classes4.dex */
public final class mk implements k3l {
    @Override // defpackage.k3l
    public final Object a(PlaybackCommand$QueueBound.Substituting substituting, vx6 vx6Var, yrn yrnVar) {
        PlaybackCommand$QueueBound.Basic basic;
        AddPlayablesAsLastCommand addPlayablesAsLastCommand = (AddPlayablesAsLastCommand) substituting;
        ssg.a(3, "AddPlayablesAsLastCommandsExecutor", dfi.c(addPlayablesAsLastCommand.getPlayables().size(), "generic add playables as last (size = ", ")"), null);
        g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
        return (g4qVar == null || (basic = (PlaybackCommand$QueueBound.Basic) zdg.p(g4qVar, new nk(addPlayablesAsLastCommand.getPlayables()))) == null) ? i3l.a : new f3l(basic);
    }
}
