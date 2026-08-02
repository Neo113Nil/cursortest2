package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class e6t extends bfu {
    public static final /* synthetic */ s9f[] x;
    public final t4t k;
    public final boolean l;
    public final kxi m;
    public final l5t n;
    public final String o;
    public final x5t p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final rhp t;
    public final xdr u;
    public final fkn v;
    public ybb w;

    static {
        opi opiVar = new opi(e6t.class, "getTrailerPlayingFlowJob", "getGetTrailerPlayingFlowJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        x = new s9f[]{opiVar};
    }

    public e6t(t4t t4tVar, boolean z, kxi kxiVar, l5t l5tVar, String str, x5t x5tVar) {
        t4tVar.getClass();
        this.k = t4tVar;
        this.l = z;
        this.m = kxiVar;
        this.n = l5tVar;
        this.o = str;
        this.p = x5tVar;
        bdt I = hag.I(k6t.class);
        l18 l18Var = l18.b;
        this.q = l18Var.b(I, true);
        this.r = l18Var.b(hag.I(b5t.class), true);
        jyr b = l18Var.b(hag.I(z66.class), true);
        this.s = b;
        this.t = new rhp();
        xdr a = ydr.a(new z5t(l5tVar, (l5tVar == l5t.f || z) ? false : true));
        this.u = a;
        this.v = new fkn(a);
        ox6.B(((z66) b.getValue()).c(), ot0.F(this), new d6t(this, 0));
    }

    public final b5t G() {
        return (b5t) this.r.getValue();
    }

    public final void H(Function0 function0) {
        if (this.u.getValue() instanceof a6t) {
            return;
        }
        x97.y(ot0.F(this), null, null, new h0t(this, function0, (Continuation) null, 1), 3);
    }

    public final void a(Function1 function1) {
        wjb wjbVar;
        ybb ybbVar = this.w;
        r4t r4tVar = null;
        if (ybbVar != null) {
            int size = ybbVar.a().size();
            if (ybbVar instanceof l20) {
                wjbVar = wjb.AlbumScreen;
            } else if (ybbVar instanceof fm1) {
                wjbVar = wjb.ArtistScreen;
            } else if (ybbVar instanceof o3m) {
                wjbVar = wjb.PlaylistScreen;
            } else {
                if (!(ybbVar instanceof u1t)) {
                    b6e.s();
                    return;
                }
                wjbVar = wjb.AlbumScreen;
            }
            List a = ybbVar.a();
            ArrayList arrayList = new ArrayList(v75.o(a, 10));
            int i = 0;
            for (Object obj : a) {
                int i2 = i + 1;
                if (i < 0) {
                    u75.n();
                    throw null;
                }
                arrayList.add(new i0r(i, ((h0r) obj).a.a));
                i = i2;
            }
            r4tVar = new r4t(size, wjbVar, arrayList);
        }
        if (r4tVar != null) {
            function1.invoke(r4tVar);
        }
    }
}
