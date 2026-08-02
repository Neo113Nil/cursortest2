package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class p1q implements d3l {
    public final Function1 a;
    public final cle b;

    public p1q(Function1 function1, cle cleVar) {
        this.a = function1;
        this.b = cleVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.d3l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        o1q o1qVar;
        int i;
        if (continuation instanceof o1q) {
            o1qVar = (o1q) continuation;
            int i2 = o1qVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1qVar.l = i2 - Integer.MIN_VALUE;
                Object obj = o1qVar.j;
                nm6 nm6Var = nm6.a;
                i = o1qVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SharedGlagolQueueCommandsExecutor", (String) this.a.invoke(basic), null);
                    g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
                    if (g4qVar == null) {
                        return Boolean.FALSE;
                    }
                    z1q z1qVar = g4qVar instanceof z1q ? (z1q) g4qVar : null;
                    if (z1qVar == null) {
                        return Boolean.FALSE;
                    }
                    o1qVar.l = 1;
                    if (this.b.invoke(z1qVar, basic, o1qVar) == nm6Var) {
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
        o1qVar = new o1q(this, (cg6) continuation);
        Object obj2 = o1qVar.j;
        nm6 nm6Var2 = nm6.a;
        i = o1qVar.l;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
