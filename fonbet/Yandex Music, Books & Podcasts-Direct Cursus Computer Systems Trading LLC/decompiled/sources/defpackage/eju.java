package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class eju implements d3l {
    @Override // defpackage.d3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        return b(vx6Var, (cg6) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vx6 vx6Var, cg6 cg6Var) {
        dju djuVar;
        int i;
        if (cg6Var instanceof dju) {
            djuVar = (dju) cg6Var;
            int i2 = djuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                djuVar.l = i2 - Integer.MIN_VALUE;
                Object obj = djuVar.j;
                Object obj2 = nm6.a;
                i = djuVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "VolumeMuteCommandsExecutor", "mute volume", null);
                    uol uolVar = (uol) vx6Var.d;
                    djuVar.l = 1;
                    Object V = x97.V(dm6.b(), new r0r((cr) uolVar.a.a, null, 2), djuVar);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                        return obj2;
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
        djuVar = new dju(this, cg6Var);
        Object obj3 = djuVar.j;
        Object obj22 = nm6.a;
        i = djuVar.l;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
