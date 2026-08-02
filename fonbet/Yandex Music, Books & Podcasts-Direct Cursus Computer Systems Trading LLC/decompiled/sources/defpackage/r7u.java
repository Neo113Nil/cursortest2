package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class r7u implements d3l {
    public final Function1 a;
    public final aur b;

    /* JADX WARN: Multi-variable type inference failed */
    public r7u(pyc pycVar, Function1 function1) {
        this.a = function1;
        this.b = (aur) pycVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r9v7, types: [aur, pyc] */
    @Override // defpackage.d3l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        q7u q7uVar;
        int i;
        s8q s8qVar;
        s8q s8qVar2;
        if (continuation instanceof q7u) {
            q7uVar = (q7u) continuation;
            int i2 = q7uVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q7uVar.m = i2 - Integer.MIN_VALUE;
                Object obj = q7uVar.k;
                nm6 nm6Var = nm6.a;
                i = q7uVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "VideoClipRadioQueueBasicCommandsExecutor", (String) this.a.invoke(basic), null);
                    g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
                    if (g4qVar == null) {
                        return Boolean.FALSE;
                    }
                    s8qVar = g4qVar instanceof s8q ? (s8q) g4qVar : null;
                    if (s8qVar != null) {
                        q7uVar.j = s8qVar;
                        q7uVar.m = 1;
                        if (this.b.invoke(s8qVar, basic, q7uVar) == nm6Var) {
                            return nm6Var;
                        }
                        s8qVar2 = s8qVar;
                    }
                    return Boolean.valueOf(s8qVar != null);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s8qVar2 = q7uVar.j;
                qgg.h0(obj);
                s8qVar = s8qVar2;
                return Boolean.valueOf(s8qVar != null);
            }
        }
        q7uVar = new q7u(this, (cg6) continuation);
        Object obj2 = q7uVar.k;
        nm6 nm6Var2 = nm6.a;
        i = q7uVar.m;
        if (i != 0) {
        }
        s8qVar = s8qVar2;
        return Boolean.valueOf(s8qVar != null);
    }
}
