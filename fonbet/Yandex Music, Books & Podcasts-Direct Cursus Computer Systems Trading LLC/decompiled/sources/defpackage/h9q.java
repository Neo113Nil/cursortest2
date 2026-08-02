package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class h9q implements f4q {
    public final f7l a;
    public final k1l b;
    public final arf c;

    public h9q(f7l f7lVar, k1l k1lVar, arf arfVar) {
        arfVar.getClass();
        this.a = f7lVar;
        this.b = k1lVar;
        this.c = arfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h9q h9qVar, long j, cg6 cg6Var) {
        g9q g9qVar;
        int i;
        d6l x;
        if (cg6Var instanceof g9q) {
            g9qVar = (g9q) cg6Var;
            int i2 = g9qVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g9qVar.m = i2 - Integer.MIN_VALUE;
                Object obj = g9qVar.k;
                nm6 nm6Var = nm6.a;
                i = g9qVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SharedWavePlaybackErrorDetectorAdapter", "Schedule skip to offline, reason: track is not ready withing " + j + " ms", null);
                    g9qVar.j = j;
                    g9qVar.m = 1;
                    if (y2x.o(j, g9qVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = g9qVar.j;
                    qgg.h0(obj);
                }
                x = p6g.x((e6l) h9qVar.a.c.getValue());
                if (x != null) {
                    return Unit.a;
                }
                v0l v0lVar = x.c;
                if (v0lVar != v0l.d && v0lVar != v0l.a && x.b == w0l.b) {
                    jrq jrqVar = ((Boolean) wdg.A(x.a, new o6m(3))).booleanValue() ? jrq.b : jrq.c;
                    StringBuilder sb = new StringBuilder("Force skip due to ");
                    sb.append(jrqVar);
                    sb.append(", reason: track is not ready withing ");
                    sb.append(j);
                    v3w.m(sb, " ms", 3, "SharedWavePlaybackErrorDetectorAdapter", null);
                    h9qVar.b.a(new SkipCommand(jrqVar), a3t.a);
                }
                return Unit.a;
            }
        }
        g9qVar = new g9q(h9qVar, cg6Var);
        Object obj2 = g9qVar.k;
        nm6 nm6Var2 = nm6.a;
        i = g9qVar.m;
        if (i != 0) {
        }
        x = p6g.x((e6l) h9qVar.a.c.getValue());
        if (x != null) {
        }
    }

    @Override // defpackage.f4q
    public final void a(mm6 mm6Var) {
        mm6Var.getClass();
        int i = 18;
        x97.y(mm6Var, null, null, new v5p(q6k.m(new u21(i, y1g.L(this.a), this, new xqn()), san.e, q6k.g), (Continuation) null, this), 3);
    }

    public final vuu c() {
        return (vuu) this.c.getValue();
    }
}
