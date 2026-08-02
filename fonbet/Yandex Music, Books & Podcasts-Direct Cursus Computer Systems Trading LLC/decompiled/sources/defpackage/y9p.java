package defpackage;

import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class y9p implements k3l {
    @Override // defpackage.k3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueBound.Substituting substituting, vx6 vx6Var, yrn yrnVar) {
        return b(vx6Var, yrnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vx6 vx6Var, cg6 cg6Var) {
        w9p w9pVar;
        int i;
        if (cg6Var instanceof w9p) {
            w9pVar = (w9p) cg6Var;
            int i2 = w9pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w9pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = w9pVar.j;
                nm6 nm6Var = nm6.a;
                i = w9pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    x9p x9pVar = new x9p((uol) vx6Var.d, (Continuation) null, 0);
                    bsd b = dm6.b();
                    w9pVar.l = 1;
                    obj = x97.V(b, x9pVar, w9pVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new f3l(new SeekToPositionCommand(((Number) obj).longValue()));
            }
        }
        w9pVar = new w9p(this, cg6Var);
        Object obj2 = w9pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = w9pVar.l;
        if (i != 0) {
        }
        return new f3l(new SeekToPositionCommand(((Number) obj2).longValue()));
    }
}
