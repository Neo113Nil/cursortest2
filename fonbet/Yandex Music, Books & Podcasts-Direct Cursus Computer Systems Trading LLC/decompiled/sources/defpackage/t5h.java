package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class t5h extends bfu {
    public final jyr k;
    public final jyr l;
    public final xdr m;
    public final j6e n;
    public final fkn o;
    public final j0q p;
    public final jyr q;
    public final xdr r;

    public t5h() {
        bdt I = hag.I(qy4.class);
        l18 l18Var = l18.b;
        this.k = l18Var.b(I, true);
        this.l = l18Var.b(hag.I(vxr.class), true);
        this.m = ydr.a(v5h.a);
        j6e j6eVar = new j6e(25);
        this.n = j6eVar;
        this.o = (fkn) j6eVar.b;
        this.p = new j0q();
        jyr b = btf.b(new dmg(6, this));
        this.q = b;
        this.r = ydr.a(c5b.a);
        e15 e15Var = (e15) ((vy4) b.getValue()).a.getValue();
        ox6.B(zsd.b0(new w05(e15Var.h("track_mview"), e15Var, 0)), ot0.F(this), new s5h(this, 0));
        e15 e15Var2 = (e15) ((vy4) b.getValue()).a.getValue();
        pjc b0 = zsd.b0(new w05(e15Var2.h("track_mview"), e15Var2, 0));
        int i = 9;
        e15 e15Var3 = (e15) ((vy4) b.getValue()).a.getValue();
        pjc b02 = zsd.b0(new h05(e15Var3.h("playlist_mview"), e15Var3, i, 2));
        e15 e15Var4 = (e15) ((vy4) b.getValue()).a.getValue();
        ox6.B(zsd.Q(b0, b02, zsd.b0(new h05(e15Var4.h("album_mview"), e15Var4, i, 1)), new tfa(4, 1, null)), ot0.F(this), new s5h(this, 1));
    }

    public final Object a(Continuation continuation) {
        Object value = this.r.getValue();
        if (((List) value).isEmpty()) {
            value = null;
        }
        List list = (List) value;
        if (list != null) {
            return list;
        }
        e15 e15Var = (e15) ((vy4) this.q.getValue()).a.getValue();
        e15Var.getClass();
        return e15.f(e15Var, null, Boolean.TRUE, null, continuation, 41);
    }
}
