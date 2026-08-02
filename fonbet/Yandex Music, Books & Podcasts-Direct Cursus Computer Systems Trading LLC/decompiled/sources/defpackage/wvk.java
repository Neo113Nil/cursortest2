package defpackage;

import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class wvk implements d3l {
    public final aem a;

    public wvk(aem aemVar) {
        aemVar.getClass();
        this.a = aemVar;
    }

    @Override // defpackage.d3l
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        ssg.a(3, "PlayCommandsExecutor", "play", null);
        return x97.V(dm6.b(), new rlg(vx6Var, this, (PlayCommand) basic, null, 25), continuation);
    }
}
