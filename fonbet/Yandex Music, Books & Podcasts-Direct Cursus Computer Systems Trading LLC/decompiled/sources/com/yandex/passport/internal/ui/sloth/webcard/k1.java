package com.yandex.passport.internal.ui.sloth.webcard;

import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.report.reporters.r1;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.internal.usecase.c2;
import com.yandex.passport.internal.usecase.e2;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.cg6;
import defpackage.dkn;
import defpackage.equ;
import defpackage.j9w;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.uah;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class k1 extends bfu {
    public final dkn A;
    public final l0 k;
    public final a l;
    public final com.yandex.passport.internal.push.m m;
    public final com.yandex.passport.internal.sloth.performers.webcard.g n;
    public final r1 o;
    public final e2 p;
    public final gf q;
    public com.yandex.passport.sloth.d1 r;
    public com.yandex.passport.sloth.data.m s;
    public final x0q t;
    public final dkn u;
    public final x0q v;
    public final dkn w;
    public final x0q x;
    public final dkn y;
    public final x0q z;

    public k1(l0 l0Var, a aVar, com.yandex.passport.internal.push.m mVar, com.yandex.passport.internal.sloth.performers.webcard.g gVar, r1 r1Var, e2 e2Var) {
        l0Var.getClass();
        aVar.getClass();
        mVar.getClass();
        gVar.getClass();
        r1Var.getClass();
        e2Var.getClass();
        this.k = l0Var;
        this.l = aVar;
        this.m = mVar;
        this.n = gVar;
        this.o = r1Var;
        this.p = e2Var;
        gf gfVar = new gf();
        this.q = gfVar;
        x0q b = y0q.b(1, 0, null, 6);
        this.t = b;
        this.u = new dkn(b);
        x0q b2 = y0q.b(1, 0, null, 6);
        this.v = b2;
        this.w = new dkn(b2);
        x0q b3 = y0q.b(1, 0, null, 6);
        this.x = b3;
        this.y = new dkn(b3);
        x0q b4 = y0q.b(1, 0, null, 6);
        this.z = b4;
        this.A = new dkn(b4);
        gfVar.d();
        gfVar.a = SystemClock.elapsedRealtime();
        x97.y(ot0.F(this), new equ(this), null, new com.yandex.passport.internal.ui.sloth.q(this, null, 11), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k1 k1Var, cg6 cg6Var) {
        i1 i1Var;
        int i;
        Object G;
        com.yandex.passport.sloth.data.c cVar;
        com.yandex.passport.sloth.data.g0 g0Var;
        Throwable a;
        com.yandex.passport.sloth.data.g0 g0Var2;
        com.yandex.passport.internal.push.m mVar = k1Var.m;
        l0 l0Var = k1Var.k;
        if (cg6Var instanceof i1) {
            i1Var = (i1) cg6Var;
            int i2 = i1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i1Var.n = i2 - Integer.MIN_VALUE;
                Object obj = i1Var.l;
                Object obj2 = nm6.a;
                i = i1Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    Continuation continuation = null;
                    if (!(l0Var instanceof j0)) {
                        if (!(l0Var instanceof k0)) {
                            b6e.s();
                            return null;
                        }
                        com.yandex.passport.sloth.data.m mVar2 = ((k0) l0Var).a;
                        com.yandex.passport.sloth.data.o0 o0Var = mVar2.a;
                        if (o0Var instanceof com.yandex.passport.sloth.data.g0) {
                            com.yandex.passport.sloth.data.g0 g0Var3 = (com.yandex.passport.sloth.data.g0) o0Var;
                            mVar.d(g0Var3.g);
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "variant: " + g0Var3, 8);
                            }
                            com.yandex.passport.sloth.data.g gVar = g0Var3.c;
                            com.yandex.passport.sloth.data.c cVar2 = gVar instanceof com.yandex.passport.sloth.data.c ? (com.yandex.passport.sloth.data.c) gVar : null;
                            if (cVar2 != null) {
                                int i3 = cVar2.a;
                                i1Var.j = g0Var3;
                                i1Var.k = cVar2;
                                i1Var.n = 2;
                                G = k1Var.G(g0Var3, i3, i1Var);
                                if (G != obj2) {
                                    cVar = cVar2;
                                    g0Var = g0Var3;
                                }
                            }
                        }
                        return mVar2;
                    }
                    Bundle bundle = ((j0) l0Var).a;
                    i1Var.n = 1;
                    Object V = x97.V(((com.yandex.passport.common.coroutine.b) mVar.j).c, new j9w(mVar, bundle, continuation, 24), i1Var);
                    if (V != obj2) {
                        return V;
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = i1Var.k;
                g0Var = i1Var.j;
                qgg.h0(obj);
                G = ((z7o) obj).a;
                a = z7o.a(G);
                if (a != null) {
                    g0Var2 = com.yandex.passport.sloth.data.g0.a(g0Var, new com.yandex.passport.sloth.data.f(cVar.a));
                } else {
                    if (a instanceof com.yandex.passport.api.exception.f) {
                        g0Var = com.yandex.passport.sloth.data.g0.a(g0Var, com.yandex.passport.sloth.data.b.a);
                    }
                    g0Var2 = g0Var;
                }
                return com.yandex.passport.sloth.data.m.a(((k0) l0Var).a, g0Var2);
            }
        }
        i1Var = new i1(k1Var, cg6Var);
        Object obj3 = i1Var.l;
        Object obj22 = nm6.a;
        i = i1Var.n;
        if (i != 0) {
        }
        a = z7o.a(G);
        if (a != null) {
        }
        return com.yandex.passport.sloth.data.m.a(((k0) l0Var).a, g0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(com.yandex.passport.sloth.data.g0 g0Var, int i, cg6 cg6Var) {
        j1 j1Var;
        int i2;
        if (cg6Var instanceof j1) {
            j1Var = (j1) cg6Var;
            int i3 = j1Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j1Var.l = i3 - Integer.MIN_VALUE;
                Object obj = j1Var.j;
                nm6 nm6Var = nm6.a;
                i2 = j1Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "selected picture: " + i, 8);
                    }
                    c2 c2Var = new c2(i, g0Var.e, g0Var.b);
                    j1Var.l = 1;
                    obj = this.p.g(c2Var, j1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        j1Var = new j1(this, cg6Var);
        Object obj2 = j1Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = j1Var.l;
        if (i2 != 0) {
        }
        return ((z7o) obj2).a;
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        gf gfVar = this.q;
        if (!gfVar.b.isEmpty()) {
            LinkedHashMap b = gfVar.b();
            ArrayList a = gfVar.a();
            Map c = gfVar.c();
            r1 r1Var = this.o;
            r1Var.getClass();
            r1Var.l(zd.d, uah.i(uah.e(new Pair("last_events", b), new Pair("all_events", a)), c));
        }
        gfVar.d();
        com.yandex.passport.sloth.d1 d1Var = this.r;
        if (d1Var != null) {
            d1Var.close();
        }
        super.onCleared();
    }
}
