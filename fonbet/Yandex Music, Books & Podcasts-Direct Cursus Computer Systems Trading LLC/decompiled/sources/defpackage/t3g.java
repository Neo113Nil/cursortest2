package defpackage;

import android.content.SharedPreferences;
import android.os.Parcelable;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class t3g implements u3g {
    public final mm6 a = gld.e(dm6.b);
    public final jyr b;
    public final x0q c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    public t3g() {
        bdt I = hag.I(g2q.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = y0q.b(0, 0, null, 7);
        this.d = l18Var.b(hag.I(vzf.class), true);
        this.e = btf.b(new bff(20));
        this.f = btf.b(new bff(21));
    }

    public final void A(mqs mqsVar) {
        mqsVar.getClass();
        x97.y(this.a, null, null, new d3g(this, mqsVar, null, 2), 3);
    }

    public final void B(x1u x1uVar) {
        x1uVar.getClass();
        x97.y(this.a, null, null, new e3g(this, x1uVar, null, 2), 3);
    }

    public final void a(mwk mwkVar) {
        mwkVar.getClass();
        if (mwkVar.equals(h1b.e)) {
            return;
        }
        wyf.r(mwkVar, new qec(9, this));
    }

    public final void b(mqs mqsVar) {
        mqsVar.getClass();
        x97.y(this.a, null, null, new d3g(this, mqsVar, null, 0), 3);
    }

    public final g2q c() {
        return (g2q) this.b.getValue();
    }

    public final void d(c3g c3gVar) {
        Continuation continuation = null;
        x97.y(cmd.a, ca8.b, null, new ptd(this, c3gVar, continuation, 24), 2);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((pf3) ((byb) qdcVar.C(I)).b(pf3.class)).h()) {
            g4g g4gVar = (g4g) this.e.getValue();
            synchronized (g4gVar) {
                if (g4gVar.f < 2) {
                    g4gVar.f++;
                    if (g4gVar.f <= 1) {
                        x97.y(g4gVar.c, null, null, new f4g(g4gVar, continuation, 0), 3);
                    }
                }
            }
            return;
        }
        vzf vzfVar = (vzf) this.d.getValue();
        synchronized (vzfVar) {
            int i = vzfVar.c;
            if (i < 2) {
                int i2 = i + 1;
                vzfVar.c = i2;
                if (i2 <= 1) {
                    SharedPreferences.Editor edit = vzfVar.a.edit();
                    edit.putInt("user_has_some_like", vzfVar.c);
                    edit.apply();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        f3g f3gVar;
        int i;
        if (cg6Var instanceof f3g) {
            f3gVar = (f3g) cg6Var;
            int i2 = f3gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f3gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = f3gVar.j;
                Object obj2 = nm6.a;
                i = f3gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mu muVar = c().b;
                    f3gVar.l = 1;
                    obj = muVar.c(str, f3gVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj == j1g.a);
            }
        }
        f3gVar = new f3g(this, cg6Var);
        Object obj3 = f3gVar.j;
        Object obj22 = nm6.a;
        i = f3gVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 == j1g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, cg6 cg6Var) {
        g3g g3gVar;
        int i;
        if (cg6Var instanceof g3g) {
            g3gVar = (g3g) cg6Var;
            int i2 = g3gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g3gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = g3gVar.j;
                Object obj2 = nm6.a;
                i = g3gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mc1 mc1Var = c().c;
                    g3gVar.l = 1;
                    obj = mc1Var.c(str, g3gVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj == j1g.c);
            }
        }
        g3gVar = new g3g(this, cg6Var);
        Object obj3 = g3gVar.j;
        Object obj22 = nm6.a;
        i = g3gVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 == j1g.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, cg6 cg6Var) {
        h3g h3gVar;
        int i;
        if (cg6Var instanceof h3g) {
            h3gVar = (h3g) cg6Var;
            int i2 = h3gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h3gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = h3gVar.j;
                Object obj2 = nm6.a;
                i = h3gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mc1 mc1Var = c().c;
                    h3gVar.l = 1;
                    obj = mc1Var.c(str, h3gVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj == j1g.a);
            }
        }
        h3gVar = new h3g(this, cg6Var);
        Object obj3 = h3gVar.j;
        Object obj22 = nm6.a;
        i = h3gVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 == j1g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bc, code lost:
    
        if (r10 == defpackage.j1g.a) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r10 == defpackage.j1g.a) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r10 == defpackage.j1g.a) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r10 == defpackage.j1g.a) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r10 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        if (r10 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r10 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (r10 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(nu1 nu1Var, cg6 cg6Var) {
        i3g i3gVar;
        int i;
        if (cg6Var instanceof i3g) {
            i3gVar = (i3g) cg6Var;
            int i2 = i3gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i3gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = i3gVar.j;
                Object obj2 = nm6.a;
                i = i3gVar.l;
                boolean z = false;
                if (i != 0) {
                    qgg.h0(obj);
                    if (nu1Var instanceof oq) {
                        mu muVar = c().b;
                        String str = ((oq) nu1Var).a;
                        i3gVar.l = 1;
                        obj = muVar.c(str, i3gVar);
                    } else if (nu1Var instanceof c01) {
                        mc1 mc1Var = c().c;
                        String str2 = ((c01) nu1Var).a;
                        i3gVar.l = 2;
                        obj = mc1Var.c(str2, i3gVar);
                    } else if (nu1Var instanceof rrl) {
                        bwl bwlVar = c().d;
                        nvl g = ((rrl) nu1Var).a.g();
                        i3gVar.l = 3;
                        obj = bwlVar.c(g, i3gVar);
                    } else if (nu1Var instanceof cvl) {
                        bwl bwlVar2 = c().d;
                        nvl g2 = ((cvl) nu1Var).g();
                        i3gVar.l = 4;
                        obj = bwlVar2.c(g2, i3gVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                } else if (i == 2) {
                    qgg.h0(obj);
                } else if (i == 3) {
                    qgg.h0(obj);
                } else {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(z);
            }
        }
        i3gVar = new i3g(this, cg6Var);
        Object obj3 = i3gVar.j;
        Object obj22 = nm6.a;
        i = i3gVar.l;
        boolean z2 = false;
        if (i != 0) {
        }
        return Boolean.valueOf(z2);
    }

    public final pjc i(nu1 nu1Var) {
        nu1Var.getClass();
        return nu1Var instanceof oq ? new ifd(c().b.d(((oq) nu1Var).a), 15) : nu1Var instanceof c01 ? new ifd(c().c.d(((c01) nu1Var).a), 16) : nu1Var instanceof rrl ? new ifd(c().d.d(((rrl) nu1Var).a.g()), 17) : nu1Var instanceof cvl ? new ifd(c().d.d(((cvl) nu1Var).g()), 18) : z4b.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, cg6 cg6Var) {
        n3g n3gVar;
        int i;
        if (cg6Var instanceof n3g) {
            n3gVar = (n3g) cg6Var;
            int i2 = n3gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n3gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = n3gVar.j;
                Object obj2 = nm6.a;
                i = n3gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Parcelable.Creator<nvl> creator = nvl.CREATOR;
                    nvl x = wxf.x(str);
                    if (x == null) {
                        return Boolean.FALSE;
                    }
                    bwl bwlVar = c().d;
                    n3gVar.l = 1;
                    obj = bwlVar.c(x, n3gVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj == j1g.a);
            }
        }
        n3gVar = new n3g(this, cg6Var);
        Object obj3 = n3gVar.j;
        Object obj22 = nm6.a;
        i = n3gVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 == j1g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, cg6 cg6Var) {
        o3g o3gVar;
        int i;
        if (cg6Var instanceof o3g) {
            o3gVar = (o3g) cg6Var;
            int i2 = o3gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o3gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = o3gVar.j;
                Object obj2 = nm6.a;
                i = o3gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mu muVar = c().b;
                    o3gVar.l = 1;
                    obj = muVar.c(str, o3gVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj == j1g.a);
            }
        }
        o3gVar = new o3g(this, cg6Var);
        Object obj3 = o3gVar.j;
        Object obj22 = nm6.a;
        i = o3gVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 == j1g.a);
    }

    public final boolean l(String str) {
        str.getClass();
        mu muVar = c().b;
        muVar.getClass();
        Map map = (Map) muVar.g.getValue();
        return (map != null ? (j1g) map.get(str) : null) == j1g.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, cg6 cg6Var) {
        p3g p3gVar;
        int i;
        if (cg6Var instanceof p3g) {
            p3gVar = (p3g) cg6Var;
            int i2 = p3gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p3gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = p3gVar.j;
                Object obj2 = nm6.a;
                i = p3gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mc1 mc1Var = c().c;
                    p3gVar.l = 1;
                    obj = mc1Var.c(str, p3gVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj == j1g.a);
            }
        }
        p3gVar = new p3g(this, cg6Var);
        Object obj3 = p3gVar.j;
        Object obj22 = nm6.a;
        i = p3gVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 == j1g.a);
    }

    public final boolean n(String str) {
        str.getClass();
        mc1 mc1Var = c().c;
        mc1Var.getClass();
        Map map = (Map) mc1Var.g.getValue();
        return (map != null ? (j1g) map.get(str) : null) == j1g.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(nvl nvlVar, cg6 cg6Var) {
        q3g q3gVar;
        int i;
        if (cg6Var instanceof q3g) {
            q3gVar = (q3g) cg6Var;
            int i2 = q3gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q3gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = q3gVar.j;
                Object obj2 = nm6.a;
                i = q3gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bwl bwlVar = c().d;
                    q3gVar.l = 1;
                    obj = bwlVar.c(nvlVar, q3gVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj == j1g.a);
            }
        }
        q3gVar = new q3g(this, cg6Var);
        Object obj3 = q3gVar.j;
        Object obj22 = nm6.a;
        i = q3gVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 == j1g.a);
    }

    public final boolean p(nvl nvlVar) {
        bwl bwlVar = c().d;
        bwlVar.getClass();
        Map map = (Map) bwlVar.g.getValue();
        return (map != null ? (j1g) map.get(nvlVar) : null) == j1g.a;
    }

    public final void q(oq oqVar) {
        oqVar.getClass();
        d(new c3g(u2x.J(oqVar) ? b3g.f : u2x.H(oqVar) ? b3g.g : b3g.e, oqVar.r));
        x97.y(this.a, null, null, new s3g(this, oqVar, null, 0), 3);
    }

    public final void r(nu1 nu1Var) {
        b3g b3gVar;
        nu1Var.getClass();
        boolean z = nu1Var instanceof oq;
        if (z) {
            oq oqVar = (oq) nu1Var;
            b3gVar = u2x.J(oqVar) ? b3g.f : u2x.H(oqVar) ? b3g.g : b3g.e;
        } else {
            b3gVar = nu1Var instanceof c01 ? b3g.h : nu1Var instanceof rrl ? b3g.i : nu1Var instanceof cvl ? b3g.i : b3g.a;
        }
        d(new c3g(b3gVar, z ? ((oq) nu1Var).r : nu1Var instanceof c01 ? ((c01) nu1Var).m : nu1Var instanceof rrl ? ((rrl) nu1Var).a.v : nu1Var instanceof cvl ? ((cvl) nu1Var).v : false));
        x97.y(this.a, null, null, new r3g(nu1Var, this, null, 0), 3);
    }

    public final void s(mwk mwkVar) {
        mwkVar.getClass();
        if (mwkVar.equals(h1b.e)) {
            return;
        }
        wyf.r(mwkVar, new cib(11, this));
    }

    public final void t(mqs mqsVar) {
        mqsVar.getClass();
        d(new c3g(a4g.D(gys.PodcastHolder, mqsVar) ? b3g.b : a4g.D(gys.AudioBookHolder, mqsVar) ? b3g.c : b3g.a, mqsVar.A));
        x97.y(this.a, null, null, new d3g(this, mqsVar, null, 1), 3);
    }

    public final void u(x1u x1uVar) {
        x1uVar.getClass();
        x97.y(this.a, null, null, new e3g(this, x1uVar, null, 1), 3);
    }

    public final pjc v(mwk mwkVar) {
        mwkVar.getClass();
        if (!mwkVar.equals(h1b.e)) {
            return (pjc) wyf.q(mwkVar, new pv9(16, this));
        }
        return new fs(15, j1g.b);
    }

    public final pjc w(mqs mqsVar) {
        mqsVar.getClass();
        kxs kxsVar = c().a;
        rr5 d = mqsVar.d();
        return zsd.b0(new mpq(13, new bca(kxsVar.i, 18), d));
    }

    public final pjc x(x1u x1uVar) {
        x1uVar.getClass();
        c5u c5uVar = c().e;
        String str = x1uVar.a;
        c5uVar.getClass();
        str.getClass();
        return zsd.b0(new gu(new bca(c5uVar.g, 18), str, 2));
    }

    public final void y(nu1 nu1Var) {
        nu1Var.getClass();
        x97.y(this.a, null, null, new r3g(nu1Var, this, null, 1), 3);
    }

    public final void z(mwk mwkVar) {
        mwkVar.getClass();
        if (mwkVar.equals(h1b.e)) {
            return;
        }
        wyf.r(mwkVar, new g8c(this));
    }
}
