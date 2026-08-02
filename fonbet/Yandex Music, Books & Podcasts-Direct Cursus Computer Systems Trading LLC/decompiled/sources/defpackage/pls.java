package defpackage;

import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class pls implements d3l {
    public final aem a;

    public pls(aem aemVar) {
        aemVar.getClass();
        this.a = aemVar;
    }

    @Override // defpackage.d3l
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        return x97.V(dm6.b(), new fpq(vx6Var, this, (ToggleCommand) basic, null, 23), continuation);
    }
}
