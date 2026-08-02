package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class nbk implements d3l {
    @Override // defpackage.d3l
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        ssg.a(3, "PauseCommandsExecutor", "pause", null);
        return x97.V(dm6.b(), new mbk(vx6Var, null, 0), continuation);
    }
}
