package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.player.integration.api.trackrestarter.RestartTrackCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class f6o implements d3l {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public f6o(jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
    }

    @Override // defpackage.d3l
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        ssg.a(3, "RestartTrackCommandsExecutor", "restart track", null);
        return b((cg6) continuation, vx6Var, ((RestartTrackCommand) basic).getForceRestartTracks());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d5, code lost:
    
        if (r10.k(r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r10.k(r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        if (r10 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var, vx6 vx6Var, boolean z) {
        e6o e6oVar;
        int i;
        n7q n7qVar;
        css cssVar;
        if (cg6Var instanceof e6o) {
            e6oVar = (e6o) cg6Var;
            int i2 = e6oVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e6oVar.n = i2 - Integer.MIN_VALUE;
                Object obj = e6oVar.l;
                nm6 nm6Var = nm6.a;
                i = e6oVar.n;
                Continuation continuation = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            z = e6oVar.j;
                            vx6Var = e6oVar.k;
                            qgg.h0(obj);
                            iss issVar = (iss) obj;
                            if (issVar == null || (cssVar = issVar.f) == null || !cssVar.b()) {
                                uol uolVar = (uol) vx6Var.d;
                                e6oVar.k = null;
                                e6oVar.j = z;
                                e6oVar.n = 3;
                            }
                            ((qzs) ((mzs) this.a.getValue())).h.a(Unit.a);
                            return Boolean.TRUE;
                        }
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    qgg.h0(obj);
                    ((qzs) ((mzs) this.a.getValue())).h.a(Unit.a);
                    return Boolean.TRUE;
                }
                qgg.h0(obj);
                d6l x = p6g.x((e6l) ((f7l) vx6Var.b).c.getValue());
                if (x == null || (n7qVar = x.a) == null) {
                    return Boolean.FALSE;
                }
                if (z) {
                    uol uolVar2 = (uol) vx6Var.d;
                    e6oVar.k = null;
                    e6oVar.j = z;
                    e6oVar.n = 1;
                } else {
                    mwk b = n7qVar.b();
                    qqs qqsVar = (qqs) this.c.getValue();
                    u3q g = n7qVar.g();
                    b.getClass();
                    qqsVar.getClass();
                    g.getClass();
                    mqs mqsVar = (mqs) dag.p(b, new qdc(qqsVar, g));
                    if (mqsVar == null) {
                        return Boolean.FALSE;
                    }
                    if (mqsVar.I() != lqs.c) {
                        return Boolean.FALSE;
                    }
                    seg segVar = new seg(this, mqsVar, continuation, 26);
                    mn7 mn7Var = dm6.b;
                    e6oVar.k = vx6Var;
                    e6oVar.j = z;
                    e6oVar.n = 2;
                    obj = x97.V(mn7Var, segVar, e6oVar);
                }
                return nm6Var;
            }
        }
        e6oVar = new e6o(this, cg6Var);
        Object obj2 = e6oVar.l;
        nm6 nm6Var2 = nm6.a;
        i = e6oVar.n;
        Continuation continuation2 = null;
        if (i == 0) {
        }
        return nm6Var2;
    }
}
