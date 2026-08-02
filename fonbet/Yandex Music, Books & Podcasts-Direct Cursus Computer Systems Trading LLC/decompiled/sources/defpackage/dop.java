package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.SetRepeatModeCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class dop implements k3l {
    public final jtc a;

    public dop(jtc jtcVar) {
        this.a = jtcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.k3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SetRepeatModeCommand setRepeatModeCommand, vx6 vx6Var, cg6 cg6Var) {
        cop copVar;
        int i;
        PlaybackCommand$QueueBound.Basic basic;
        Object obj;
        PlaybackCommand$QueueBound.Basic basic2;
        n7q n7qVar;
        if (cg6Var instanceof cop) {
            copVar = (cop) cg6Var;
            int i2 = copVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                copVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = copVar.k;
                Object obj3 = nm6.a;
                i = copVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    Continuation continuation = null;
                    ssg.a(3, "SetRepeatModeCommandsExecutor", "setRepeatMode(" + setRepeatModeCommand + ")", null);
                    g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
                    if (g4qVar == null || (basic = (PlaybackCommand$QueueBound.Basic) zdg.p(g4qVar, new eop(setRepeatModeCommand))) == null) {
                        return i3l.a;
                    }
                    nyn repeatModeType = setRepeatModeCommand.getRepeatModeType();
                    copVar.j = basic;
                    copVar.m = 1;
                    jtc jtcVar = this.a;
                    d6l x = p6g.x((e6l) ((f7l) ((kme) jtcVar.b).a).c.getValue());
                    u3q g = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.g();
                    if (g == null || !((Boolean) ocg.k(g, imp.j)).booleanValue()) {
                        obj = Unit.a;
                    } else {
                        ubn ubnVar = (ubn) ((jyr) jtcVar.a).getValue();
                        ubnVar.getClass();
                        obj = x97.V(dm6.b, new seg(ubnVar, repeatModeType, continuation, 22), copVar);
                        if (obj != obj3) {
                            obj = Unit.a;
                        }
                        if (obj != obj3) {
                            obj = Unit.a;
                        }
                    }
                    if (obj == obj3) {
                        return obj3;
                    }
                    basic2 = basic;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    basic2 = copVar.j;
                    qgg.h0(obj2);
                }
                return new f3l(basic2);
            }
        }
        copVar = new cop(this, cg6Var);
        Object obj22 = copVar.k;
        Object obj32 = nm6.a;
        i = copVar.m;
        if (i != 0) {
        }
        return new f3l(basic2);
    }
}
