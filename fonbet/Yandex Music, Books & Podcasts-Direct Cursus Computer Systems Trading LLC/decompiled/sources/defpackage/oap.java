package defpackage;

import com.yandex.music.shared.playback.api.commands.SeekToFractionCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class oap implements d3l {
    @Override // defpackage.d3l
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        uol uolVar = (uol) vx6Var.d;
        float fraction = ((SeekToFractionCommand) basic).getFraction();
        ssg.a(3, "SeekToFractionCommandsExecutor", "seek to fraction=" + fraction, null);
        if (0.0f > fraction || fraction > 1.0f) {
            return Boolean.FALSE;
        }
        return x97.V(dm6.b(), new nap(uolVar, vx6Var, fraction, null), continuation);
    }
}
