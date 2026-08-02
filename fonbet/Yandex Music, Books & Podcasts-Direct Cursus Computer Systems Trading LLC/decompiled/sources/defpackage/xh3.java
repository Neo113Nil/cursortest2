package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$BroadcastQueueFallbackToBeginning;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xh3 implements d3l {
    public final z4c a;

    public xh3(z4c z4cVar) {
        z4cVar.getClass();
        this.a = z4cVar;
    }

    @Override // defpackage.d3l
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        y4c y4cVar = new y4c(((WaveQueueCommandsFactory$BroadcastQueueFallbackToBeginning) basic).getForSecondaryQueue());
        this.a.getClass();
        z4c.b.l(y4cVar);
        return Boolean.TRUE;
    }
}
