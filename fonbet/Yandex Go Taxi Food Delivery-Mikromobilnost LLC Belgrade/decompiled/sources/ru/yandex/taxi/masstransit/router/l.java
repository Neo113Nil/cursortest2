package ru.yandex.taxi.masstransit.router;

import android.graphics.Rect;
import defpackage.bx20;
import defpackage.h55;
import defpackage.lk40;
import defpackage.m190;
import defpackage.m640;
import defpackage.mk40;
import defpackage.mz30;
import defpackage.ok40;
import defpackage.pk40;
import defpackage.qk40;
import defpackage.sk40;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tk40;
import defpackage.uj30;
import defpackage.wk40;
import defpackage.xj30;
import defpackage.yma;
import defpackage.yv30;
import defpackage.yvf0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.router.l;

/* loaded from: classes6.dex */
public final class l extends h55 {
    public final yv30 D;
    public final mk40 E;
    public final uj30 F;
    public final yvf0 G;
    public final yvf0 H;
    public final wk40 I;
    public final xj30 J;
    public tk40 K;
    public m640 L;
    public final pk40 M;
    public final mz30 N;

    /* JADX WARN: Type inference failed for: r2v1, types: [pk40] */
    public l(yv30 yv30Var, mk40 mk40Var, uj30 uj30Var, yvf0 yvf0Var, yvf0 yvf0Var2, wk40 wk40Var, xj30 xj30Var) {
        super(null);
        this.D = yv30Var;
        this.E = mk40Var;
        this.F = uj30Var;
        this.G = yvf0Var;
        this.H = yvf0Var2;
        this.I = wk40Var;
        this.J = xj30Var;
        this.M = new bx20() { // from class: pk40
            @Override // defpackage.bx20
            public final void update(int i) {
                Object value;
                Rect rect;
                r0 r0Var = l.this.J.a;
                do {
                    value = r0Var.getValue();
                    rect = (Rect) value;
                } while (!r0Var.k(value, new Rect(rect.left, rect.top, rect.right, i)));
            }
        };
        this.N = new mz30();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        qk40 qk40Var = (qk40) obj;
        sk40 sk40Var = new sk40(qk40Var.b, qk40Var.a);
        this.I.a.getClass();
        tk40 tk40Var = new tk40(sk40Var);
        this.K = tk40Var;
        yma ymaVar = this.E.a;
        m640 m640Var = new m640(this.F, tk40Var, this.N, (ok40) ymaVar.b.get(), (lk40) ymaVar.a.a);
        A(m640Var, new m190(qk40Var.b), sy60.Q2);
        this.L = m640Var;
        tje.N(o(), null, null, new MtViewOnMapRouter$onLaunch$2(tk40Var, this, null), 3);
    }
}
