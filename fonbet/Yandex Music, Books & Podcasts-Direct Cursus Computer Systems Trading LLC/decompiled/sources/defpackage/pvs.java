package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class pvs extends b6 {
    public final f7l d;
    public final hjp e;
    public final q7l f;
    public final q3t g;
    public final k1l h;
    public final sml i;
    public final mm6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvs(o oVar, k1l k1lVar, f7l f7lVar, hjp hjpVar, q7l q7lVar, q3t q3tVar, k1l k1lVar2, sml smlVar, tf6 tf6Var) {
        super(k1lVar, oVar);
        k1lVar.getClass();
        f7lVar.getClass();
        q7lVar.getClass();
        q3tVar.getClass();
        k1lVar2.getClass();
        tf6Var.getClass();
        this.d = f7lVar;
        this.e = hjpVar;
        this.f = q7lVar;
        this.g = q3tVar;
        this.h = k1lVar2;
        this.i = smlVar;
        this.j = tf6Var;
    }

    public final void O() {
        ssg.a(6, "TrackErrorHandler", "Action: Skipping to next track and publishing error", null);
        ((k1l) this.b).a(new SkipCommand(0), a3t.a);
        ((o) this.c).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P() {
        boolean z;
        n7q n7qVar;
        vw5 vw5Var = ((u5q) this.i.a).b.r;
        vw5Var.getClass();
        jyr jyrVar = dvu.e;
        vuu c = kwl.c();
        Continuation continuation = null;
        if (c.a) {
            d6l x = p6g.x((e6l) ((f7l) vw5Var.a.getValue()).c.getValue());
            if (((x == null || (n7qVar = x.a) == null) ? null : (mwk) wdg.A(n7qVar, new ozw(c))) != null) {
                z = true;
                if (!z) {
                    ssg.a(6, "TrackErrorHandler", "Action: Skipping to next offline wave track and publishing error", null);
                    ((k1l) this.b).a(new SkipCommand(jrq.c), a3t.a);
                    ((o) this.c).b();
                    return;
                } else if (z) {
                    b6e.s();
                    return;
                } else {
                    ssg.a(6, "TrackErrorHandler", "Action: Trying to play next cached track", null);
                    x97.y(this.j, null, null, new rs(this, continuation, 9), 3);
                    return;
                }
            }
        }
        z = false;
        if (!z) {
        }
    }
}
