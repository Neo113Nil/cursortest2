package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class kej implements d3l {
    @Override // defpackage.d3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        return b((NoopCallbackCommand) basic, (cg6) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(NoopCallbackCommand noopCallbackCommand, cg6 cg6Var) {
        jej jejVar;
        int i;
        if (cg6Var instanceof jej) {
            jejVar = (jej) cg6Var;
            int i2 = jejVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jejVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jejVar.j;
                nm6 nm6Var = nm6.a;
                i = jejVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "NoopCallbackCommandsExecutor", "noop callback", null);
                    jejVar.l = 1;
                    if (noopCallbackCommand.a(jejVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.TRUE;
            }
        }
        jejVar = new jej(this, cg6Var);
        Object obj2 = jejVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jejVar.l;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
