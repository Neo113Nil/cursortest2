package defpackage;

import com.yandex.music.shared.playback.api.commands.ChangeMediaOutputTargetCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xb4 implements d3l {
    public final uoh a;

    public xb4(uoh uohVar) {
        this.a = uohVar;
    }

    @Override // defpackage.d3l
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        noh mediaOutputTarget = ((ChangeMediaOutputTargetCommand) basic).getMediaOutputTarget();
        mediaOutputTarget.getClass();
        ssg.a(3, uoh.b, "new output target " + mediaOutputTarget, null);
        xdr xdrVar = this.a.a;
        xdrVar.getClass();
        xdrVar.m(null, mediaOutputTarget);
        return Boolean.TRUE;
    }
}
