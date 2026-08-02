package ru.yandex.taxi.masstransit.trains.schedule;

import android.content.Context;
import defpackage.cg40;
import defpackage.dt20;
import defpackage.e4f;
import defpackage.e840;
import defpackage.h3y;
import defpackage.hg40;
import defpackage.hh40;
import defpackage.lg40;
import defpackage.mu5;
import defpackage.og40;
import defpackage.on2;
import defpackage.pg40;
import defpackage.pgd;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.x240;
import defpackage.xf40;
import defpackage.xvf0;
import defpackage.yqg;
import defpackage.yvf0;

/* loaded from: classes6.dex */
public final class e extends pgd {
    public final Context F;
    public final w030 G;
    public final pg40 H;
    public final og40 I;
    public final yvf0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final xf40 O;
    public final cg40 P;
    public final h3y Q;
    public final ru.yandex.taxi.masstransit.domain.h R;
    public final f S;
    public final mu5 T;

    public e(Context context, w030 w030Var, pg40 pg40Var, og40 og40Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, xf40 xf40Var, cg40 cg40Var, hg40 hg40Var, h3y h3yVar, ru.yandex.taxi.masstransit.domain.h hVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = pg40Var;
        this.I = og40Var;
        this.J = yvf0Var;
        this.K = yvf0Var2;
        this.L = yvf0Var3;
        this.M = yvf0Var4;
        this.N = yvf0Var5;
        this.O = xf40Var;
        this.P = cg40Var;
        this.Q = h3yVar;
        this.R = hVar;
        dt20 dt20Var = hg40Var.a;
        this.S = new f((on2) ((xvf0) dt20Var.b).get(), pg40Var, xf40Var, (g) ((e840) dt20Var.c).get(), (lg40) ((xvf0) dt20Var.w).get(), (yqg) ((e4f) dt20Var.x).get());
        this.T = new mu5(new x240(9, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        hh40 hh40Var = (hh40) obj;
        this.P.a = hh40Var.d;
        tje.N(o(), null, null, new MtTrainScheduleModalRouter$onLaunch$1(this, hh40Var, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.T;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
