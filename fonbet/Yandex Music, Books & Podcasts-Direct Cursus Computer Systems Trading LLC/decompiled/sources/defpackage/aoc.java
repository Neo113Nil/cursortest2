package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import java.util.List;

/* loaded from: classes3.dex */
public final class aoc implements u3l {
    public final arf a;

    public aoc(arf arfVar, y3l y3lVar, List list, kan kanVar) {
        arfVar.getClass();
        y3lVar.getClass();
        list.getClass();
        this.a = arfVar;
    }

    @Override // defpackage.u3l
    public final /* synthetic */ Object a(PlaybackCommand$QueueLaunch.Substituting substituting, es6 es6Var, zrn zrnVar) {
        if (substituting == null) {
            return b(zrnVar);
        }
        l1j.f();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        znc zncVar;
        int i;
        if (cg6Var instanceof znc) {
            zncVar = (znc) cg6Var;
            int i2 = zncVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zncVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zncVar.j;
                nm6 nm6Var = nm6.a;
                i = zncVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    throw null;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    rj6 rj6Var = (rj6) obj;
                    if (rj6Var instanceof qj6) {
                        throw null;
                    }
                    if (rj6Var instanceof pj6) {
                        throw null;
                    }
                    b6e.s();
                    return null;
                }
                if (i == 2) {
                    qgg.h0(obj);
                    if (((xcr) obj) instanceof vcr) {
                        throw null;
                    }
                    throw null;
                }
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                PlaybackCommand$QueueLaunch.Basic basic = (PlaybackCommand$QueueLaunch.Basic) obj;
                return new q3l(basic != null ? basic : null);
            }
        }
        zncVar = new znc(this, cg6Var);
        Object obj2 = zncVar.j;
        nm6 nm6Var2 = nm6.a;
        i = zncVar.l;
        if (i != 0) {
        }
    }
}
