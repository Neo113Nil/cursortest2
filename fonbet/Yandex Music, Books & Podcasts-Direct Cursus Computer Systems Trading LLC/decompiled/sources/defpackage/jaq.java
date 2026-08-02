package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class jaq implements d3l {
    public final Function1 a;
    public final aur b;

    /* JADX WARN: Multi-variable type inference failed */
    public jaq(pyc pycVar, Function1 function1) {
        this.a = function1;
        this.b = (aur) pycVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v6, types: [aur, pyc] */
    @Override // defpackage.d3l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        iaq iaqVar;
        int i;
        if (continuation instanceof iaq) {
            iaqVar = (iaq) continuation;
            int i2 = iaqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iaqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iaqVar.j;
                nm6 nm6Var = nm6.a;
                i = iaqVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "YnisonQueueCommandsExecutor", (String) this.a.invoke(basic), null);
                    g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
                    if (g4qVar == null) {
                        return Boolean.FALSE;
                    }
                    wpw wpwVar = g4qVar instanceof wpw ? (wpw) g4qVar : null;
                    if (wpwVar == null) {
                        return Boolean.FALSE;
                    }
                    iaqVar.l = 1;
                    if (this.b.invoke(wpwVar, basic, iaqVar) == nm6Var) {
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
        iaqVar = new iaq(this, (cg6) continuation);
        Object obj2 = iaqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = iaqVar.l;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
