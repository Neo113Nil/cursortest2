package defpackage;

import com.yandex.music.shared.generative.domain.commands.a;
import com.yandex.music.shared.generative.domain.commands.b;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class s4d implements d3l {
    public final a a;
    public final b b;

    public s4d(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.d3l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        r4d r4dVar;
        int i;
        nq7 nq7Var;
        nq7 nq7Var2;
        if (continuation instanceof r4d) {
            r4dVar = (r4d) continuation;
            int i2 = r4dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r4dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = r4dVar.k;
                nm6 nm6Var = nm6.a;
                i = r4dVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    this.a.invoke(basic);
                    ssg.a(3, "GenerativeQueueBasicCommandsExecutor", "restart", null);
                    g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
                    if (g4qVar == null) {
                        return Boolean.FALSE;
                    }
                    nq7Var = g4qVar instanceof nq7 ? (nq7) g4qVar : null;
                    if (nq7Var != null) {
                        r4dVar.j = nq7Var;
                        r4dVar.m = 1;
                        if (this.b.invoke(nq7Var, basic, r4dVar) == nm6Var) {
                            return nm6Var;
                        }
                        nq7Var2 = nq7Var;
                    }
                    return Boolean.valueOf(nq7Var != null);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nq7Var2 = r4dVar.j;
                qgg.h0(obj);
                nq7Var = nq7Var2;
                return Boolean.valueOf(nq7Var != null);
            }
        }
        r4dVar = new r4d(this, (cg6) continuation);
        Object obj2 = r4dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = r4dVar.m;
        if (i != 0) {
        }
        nq7Var = nq7Var2;
        return Boolean.valueOf(nq7Var != null);
    }
}
