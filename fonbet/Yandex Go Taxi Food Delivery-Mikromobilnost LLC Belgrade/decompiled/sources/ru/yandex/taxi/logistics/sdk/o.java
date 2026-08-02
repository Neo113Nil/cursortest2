package ru.yandex.taxi.logistics.sdk;

import android.app.Application;
import defpackage.bni;
import defpackage.bvf0;
import defpackage.fva0;
import defpackage.h3y;
import defpackage.ip11;
import defpackage.jtq0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vp21;
import defpackage.ww60;

/* loaded from: classes9.dex */
public final class o implements ww60 {
    public final Application a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final tt2 g;
    public final jtq0 h;
    public final ip11 i;
    public final h3y j;
    public final h3y k;
    public final h3y l;
    public final h3y m;
    public final h3y n;
    public final bni o;
    public final fva0 p;
    public final h3y q;
    public final h3y r;
    public final vp21 s;
    public final h3y t;
    public final h3y u;
    public final h3y v;

    public o(Application application, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, tt2 tt2Var, jtq0 jtq0Var, ip11 ip11Var, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8, h3y h3yVar9, h3y h3yVar10, bni bniVar, fva0 fva0Var, h3y h3yVar11, h3y h3yVar12, vp21 vp21Var, h3y h3yVar13, h3y h3yVar14, h3y h3yVar15) {
        this.a = application;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
        this.f = h3yVar5;
        this.g = tt2Var;
        this.h = jtq0Var;
        this.i = ip11Var;
        this.j = h3yVar6;
        this.k = h3yVar7;
        this.l = h3yVar8;
        this.m = h3yVar9;
        this.n = h3yVar10;
        this.o = bniVar;
        this.p = fva0Var;
        this.q = h3yVar11;
        this.r = h3yVar12;
        this.s = vp21Var;
        this.t = h3yVar13;
        this.u = h3yVar14;
        this.v = h3yVar15;
    }

    @Override // defpackage.ww60
    public final void f() {
        this.g.getClass();
        tje.N(bvf0.a(uyj.a), null, null, new LogisticsSdkInitializer$init$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LogisticsSdkInitializer";
    }
}
