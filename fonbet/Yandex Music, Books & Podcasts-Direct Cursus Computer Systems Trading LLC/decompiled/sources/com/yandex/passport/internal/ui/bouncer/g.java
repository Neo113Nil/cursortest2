package com.yandex.passport.internal.ui.bouncer;

import android.app.Activity;
import android.view.View;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.ui.bouncer.model.d1;
import com.yandex.passport.internal.ui.bouncer.model.e1;
import com.yandex.passport.internal.ui.bouncer.model.f1;
import com.yandex.passport.internal.ui.bouncer.model.g1;
import com.yandex.passport.internal.ui.bouncer.model.h1;
import com.yandex.passport.internal.ui.bouncer.model.i1;
import com.yandex.passport.internal.ui.bouncer.model.j1;
import com.yandex.passport.internal.ui.bouncer.model.k1;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.m1;
import com.yandex.passport.internal.ui.bouncer.model.n1;
import com.yandex.passport.internal.ui.bouncer.model.o1;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.q1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.u1;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.roundabout.a0;
import com.yandex.passport.internal.ui.challenge.c0;
import com.yandex.passport.sloth.ui.b0;
import com.yandex.passport.sloth.ui.s0;
import com.yandex.passport.sloth.ui.t0;
import defpackage.b6e;
import defpackage.btf;
import defpackage.jyr;
import defpackage.lyf;
import defpackage.orq;
import defpackage.r13;
import defpackage.srq;
import defpackage.x97;
import defpackage.xg;
import defpackage.zqf;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements m {
    public final Activity a;
    public final com.yandex.passport.internal.ui.bouncer.sloth.g b;
    public final j c;
    public final s d;
    public final a0 e;
    public final com.yandex.passport.internal.ui.bouncer.loading.c f;
    public final com.yandex.passport.internal.ui.bouncer.loading.f g;
    public final com.yandex.passport.internal.ui.bouncer.error.b h;
    public final com.yandex.passport.internal.ui.bouncer.fallback.b i;
    public final zqf j;
    public final com.yandex.passport.internal.ui.bouncer.error.t k;
    public final com.yandex.passport.internal.ui.bouncer.loading.i l;
    public final com.yandex.passport.internal.report.reporters.m m;
    public final gf n;
    public final com.yandex.passport.internal.flags.i o;
    public final com.yandex.passport.internal.properties.v p;
    public final com.yandex.passport.internal.ui.bouncer.chooser.h q;
    public final com.yandex.passport.internal.ui.bouncer.sloth.f r;
    public final jyr s;
    public boolean t;

    public g(Activity activity, com.yandex.passport.internal.ui.bouncer.sloth.g gVar, j jVar, s sVar, a0 a0Var, com.yandex.passport.internal.ui.bouncer.loading.c cVar, com.yandex.passport.internal.ui.bouncer.loading.f fVar, com.yandex.passport.internal.ui.bouncer.error.b bVar, com.yandex.passport.internal.ui.bouncer.fallback.b bVar2, zqf zqfVar, com.yandex.passport.internal.ui.bouncer.error.t tVar, com.yandex.passport.internal.ui.bouncer.loading.i iVar, com.yandex.passport.internal.report.reporters.m mVar, gf gfVar, com.yandex.passport.internal.flags.i iVar2, com.yandex.passport.internal.properties.v vVar, com.yandex.passport.internal.ui.bouncer.chooser.h hVar, com.yandex.passport.internal.ui.bouncer.sloth.f fVar2) {
        activity.getClass();
        gVar.getClass();
        jVar.getClass();
        sVar.getClass();
        a0Var.getClass();
        cVar.getClass();
        fVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        zqfVar.getClass();
        tVar.getClass();
        iVar.getClass();
        mVar.getClass();
        gfVar.getClass();
        iVar2.getClass();
        vVar.getClass();
        hVar.getClass();
        fVar2.getClass();
        this.a = activity;
        this.b = gVar;
        this.c = jVar;
        this.d = sVar;
        this.e = a0Var;
        this.f = cVar;
        this.g = fVar;
        this.h = bVar;
        this.i = bVar2;
        this.j = zqfVar;
        this.k = tVar;
        this.l = iVar;
        this.m = mVar;
        this.n = gfVar;
        this.o = iVar2;
        this.p = vVar;
        this.q = hVar;
        this.r = fVar2;
        this.s = btf.b(new com.yandex.passport.internal.common.e(11, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.yandex.passport.internal.ui.bouncer.sloth.f] */
    /* JADX WARN: Type inference failed for: r13v11, types: [com.yandex.passport.internal.ui.bouncer.loading.i, t13] */
    /* JADX WARN: Type inference failed for: r13v12, types: [com.yandex.passport.internal.ui.bouncer.error.t, t13] */
    /* JADX WARN: Type inference failed for: r13v16, types: [orq] */
    /* JADX WARN: Type inference failed for: r13v17, types: [com.yandex.passport.internal.ui.bouncer.fallback.b, t13] */
    /* JADX WARN: Type inference failed for: r13v25, types: [com.yandex.passport.sloth.ui.b0, t13] */
    /* JADX WARN: Type inference failed for: r13v28, types: [com.yandex.passport.internal.ui.bouncer.roundabout.a0, t13] */
    /* JADX WARN: Type inference failed for: r13v32, types: [com.yandex.passport.internal.ui.bouncer.loading.c, t13] */
    /* JADX WARN: Type inference failed for: r13v33, types: [com.yandex.passport.internal.ui.bouncer.loading.f, t13] */
    /* JADX WARN: Type inference failed for: r13v35, types: [com.yandex.passport.internal.ui.bouncer.error.b, t13] */
    @Override // com.yandex.passport.common.mvi.f
    public final void a(Object obj) {
        com.yandex.passport.internal.ui.bouncer.chooser.h hVar;
        l1 l1Var = (l1) obj;
        l1Var.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "render state ".concat(com.yandex.passport.internal.ui.bouncer.model.b.b(l1Var)), 8);
        }
        com.yandex.passport.internal.report.reporters.m mVar = this.m;
        mVar.w(l1Var);
        v1 v1Var = l1Var.a;
        k1 k1Var = l1Var.b;
        boolean z = v1Var instanceof m1;
        if (z || (v1Var instanceof s1) || (v1Var instanceof o1) || (v1Var instanceof r1) || (v1Var instanceof t1) || (v1Var instanceof u1) || (v1Var instanceof p1)) {
            this.n.e(com.yandex.passport.internal.ui.bouncer.model.b.e(v1Var));
        }
        i1 i1Var = i1.a;
        if (!Intrinsics.d(k1Var, i1Var)) {
            mVar.v(k1Var);
            boolean equals = k1Var.equals(d1.a);
            Activity activity = this.a;
            if (equals || (k1Var instanceof e1)) {
                c(activity, com.yandex.passport.api.p.a);
                return;
            }
            if (k1Var instanceof f1) {
                c(activity, new com.yandex.passport.api.r(((f1) k1Var).a));
                return;
            }
            if (k1Var.equals(g1.a)) {
                c(activity, com.yandex.passport.api.s.a);
                return;
            }
            if (!(k1Var instanceof j1)) {
                if (k1Var instanceof h1) {
                    h1 h1Var = (h1) k1Var;
                    c(activity, new com.yandex.passport.api.u(h1Var.a, h1Var.b));
                    return;
                } else {
                    if (k1Var.equals(i1Var)) {
                        return;
                    }
                    b6e.s();
                    return;
                }
            }
            j1 j1Var = (j1) k1Var;
            com.yandex.passport.internal.l lVar = j1Var.a;
            z1 J = com.yandex.plus.pay.ui.core.b.J(lVar.b);
            com.yandex.passport.internal.account.f B = com.yandex.plus.core.locale.b.B(lVar);
            w0 w0Var = j1Var.c;
            String str = j1Var.d;
            String str2 = j1Var.e;
            if (str2 == null) {
                str2 = l1Var.f;
            }
            c(activity, new com.yandex.passport.api.t(J, B, w0Var, str, str2));
            return;
        }
        if (v1Var instanceof o1) {
            ?? r13 = this.h;
            r13.e(v1Var);
            hVar = r13;
        } else if (v1Var instanceof q1) {
            if (((q1) v1Var).b) {
                ?? r132 = this.g;
                r132.e(v1Var);
                hVar = r132;
            } else {
                ?? r133 = this.f;
                r133.e(v1Var);
                hVar = r133;
            }
        } else if (v1Var instanceof r1) {
            ?? r134 = this.e;
            r134.e(v1Var);
            hVar = r134;
        } else if (v1Var instanceof s1) {
            if (((Boolean) this.o.b(com.yandex.passport.internal.flags.o.Y)).booleanValue()) {
                t0 t0Var = new t0(((s1) v1Var).b);
                ?? r0 = this.r;
                r0.e(t0Var);
                hVar = r0;
            } else {
                ?? r135 = (b0) this.b.f.getValue();
                r135.e(new t0(((s1) v1Var).b));
                hVar = r135;
            }
        } else if (v1Var instanceof p1) {
            ?? r136 = this.i;
            r136.e(v1Var);
            hVar = r136;
        } else if (z) {
            this.t = true;
            jyr jyrVar = this.s;
            srq srqVar = (orq) jyrVar.getValue();
            srqVar.getClass();
            m1 m1Var = (m1) v1Var;
            c0 c0Var = m1Var.a;
            com.yandex.passport.common.core.f fVar = m1Var.b;
            y1 y1Var = m1Var.c;
            s sVar = this.d;
            sVar.getClass();
            fVar.getClass();
            y1Var.getClass();
            x97.y(sVar.b, null, null, new xg(sVar, fVar, c0Var, y1Var, (Continuation) null, 28), 3);
            ((r13) srqVar).e(c0Var);
            hVar = (orq) jyrVar.getValue();
        } else if (v1Var instanceof u1) {
            ?? r137 = this.k;
            r137.e(v1Var);
            hVar = r137;
        } else if (v1Var instanceof t1) {
            ?? r138 = this.l;
            r138.e(v1Var);
            hVar = r138;
        } else if (!(v1Var instanceof n1)) {
            b6e.s();
            return;
        } else {
            com.yandex.passport.internal.ui.bouncer.chooser.h hVar2 = this.q;
            hVar2.e(v1Var);
            hVar = hVar2;
        }
        this.c.d.a(hVar);
    }

    @Override // com.yandex.passport.internal.ui.bouncer.m
    public final boolean b() {
        com.yandex.passport.internal.ui.bouncer.sloth.g gVar = this.b;
        if (((b0) gVar.f.getValue()).r().d.compareTo(lyf.c) >= 0) {
            s0 s0Var = ((b0) gVar.f.getValue()).s().a;
            if (s0Var.a.f.canGoBack()) {
                s0Var.a.f.goBack();
                return true;
            }
        }
        return false;
    }

    public final void c(Activity activity, com.yandex.passport.api.v vVar) {
        activity.getClass();
        com.yandex.passport.internal.ui.a.r(activity, com.yandex.plus.core.network.api.utils.a.F(vVar));
        gf gfVar = this.n;
        gfVar.e("native.finish");
        gfVar.c.put(CameraService.RESULT, com.yandex.passport.internal.ui.bouncer.model.b.d(vVar));
    }

    @Override // com.yandex.passport.internal.ui.bouncer.m
    public final View getTheRootView() {
        return this.c.e();
    }

    @Override // com.yandex.passport.internal.ui.bouncer.m
    public final void onDestroy() {
        com.yandex.passport.internal.ui.bouncer.sloth.g gVar = this.b;
        if (((b0) gVar.f.getValue()).r().d.compareTo(lyf.c) >= 0) {
            ((b0) gVar.f.getValue()).k();
        }
        if (this.t) {
            orq orqVar = (orq) this.s.getValue();
            com.yandex.passport.internal.ui.common.web.g gVar2 = orqVar instanceof com.yandex.passport.internal.ui.common.web.g ? (com.yandex.passport.internal.ui.common.web.g) orqVar : null;
            if (gVar2 != null) {
                gVar2.k();
            }
        }
    }
}
