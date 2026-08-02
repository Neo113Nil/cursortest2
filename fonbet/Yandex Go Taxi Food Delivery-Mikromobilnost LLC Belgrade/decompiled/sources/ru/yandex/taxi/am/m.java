package ru.yandex.taxi.am;

import defpackage.bvf0;
import defpackage.fl3;
import defpackage.gl3;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.hl3;
import defpackage.kj;
import defpackage.mth;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes9.dex */
public final class m {
    public final k a;
    public final tt2 b;
    public final hit c;
    public final h3y d;
    public final kotlinx.coroutines.flow.r0 e;
    public final mth f;

    public m(k kVar, tt2 tt2Var, hit hitVar, h3y h3yVar) {
        this.a = kVar;
        this.b = tt2Var;
        this.c = hitVar;
        this.d = h3yVar;
        kotlinx.coroutines.flow.r0 c = bvf0.c(null);
        this.e = c;
        this.f = new mth(c, 6);
    }

    public final hl3 a() {
        hl3 hl3Var = (hl3) this.e.getValue();
        if (hl3Var != null) {
            return hl3Var;
        }
        kj Ig = this.a.Ig();
        return Ig != null ? new fl3(Ig.a) : new gl3(false);
    }

    public final void b(boolean z) {
        gl3 gl3Var = new gl3(z);
        kotlinx.coroutines.flow.r0 r0Var = this.e;
        r0Var.getClass();
        r0Var.m(null, gl3Var);
        hbp0 hbp0Var = this.c.a;
        this.b.getClass();
        tje.N(hbp0Var, uyj.a, null, new AuthorizationStatusRepositoryImpl$onUnauthorized$1(this, null), 2);
    }
}
