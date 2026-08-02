package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.PrevCommand;
import com.yandex.music.shared.playback.utils.api.commands.PreviousOrReplayCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class wjl {
    public final tf6 a;
    public final k1l b;
    public final fil c;
    public final fkn d;
    public final fkn e;
    public final t1f f;

    public wjl(thl thlVar, k7l k7lVar, tf6 tf6Var, k1l k1lVar, fil filVar) {
        k1lVar.getClass();
        this.a = tf6Var;
        this.b = k1lVar;
        this.c = filVar;
        pjc a = thlVar.d.a.a();
        pjl pjlVar = thlVar.c;
        this.d = c(zsd.M0(zsd.Q(a, pjlVar.a, pjlVar.b, shl.a), new cle((Continuation) null, thlVar, 15)), ke5.a);
        this.e = c(k7lVar.b, u7l.i);
        this.f = new t1f(k1lVar, tf6Var);
    }

    public final void a(boolean z) {
        k1l k1lVar = this.b;
        if (z) {
            k1lVar.a(PrevCommand.INSTANCE, new b3t("queue_prev"));
        } else {
            k1lVar.a(PreviousOrReplayCommand.INSTANCE, new b3t("queue_prev"));
        }
    }

    public final void b(o4l o4lVar) {
        mqs a;
        n7q D = asq.D(this);
        Continuation continuation = null;
        mwk b = D != null ? D.b() : null;
        if (b == null || (a = b.a()) == null || a4g.D(gys.UseSeekButtons, a)) {
            return;
        }
        t1l t1lVar = new t1l(o4lVar);
        t1f t1fVar = this.f;
        x97.y((tf6) t1fVar.c, null, null, new h1j(t1fVar, t1lVar, continuation, 28), 3);
    }

    public final fkn c(pjc pjcVar, Object obj) {
        return zsd.F0(pjcVar, this.a, new hdr(1000L, Long.MAX_VALUE), obj);
    }
}
