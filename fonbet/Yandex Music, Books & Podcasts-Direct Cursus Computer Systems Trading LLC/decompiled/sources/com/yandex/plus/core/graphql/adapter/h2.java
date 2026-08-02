package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.c3;
import com.yandex.plus.core.graphql.d3;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class h2 implements pj {
    public static final h2 a = new h2();
    public static final List b = t75.c("userSyncStatus");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        c3 c3Var = (c3) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        c3Var.getClass();
        r7fVar.Z("userSyncStatus");
        i2 i2Var = i2.a;
        tj tjVar = uj.a;
        d3 d3Var = c3Var.a;
        r7fVar.j();
        i2Var.a(r7fVar, fx6Var, d3Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        d3 d3Var = null;
        while (a7fVar.z0(b) == 0) {
            i2 i2Var = i2.a;
            tj tjVar = uj.a;
            d3Var = (d3) new qhj(i2Var, false).b(a7fVar, fx6Var);
        }
        d3Var.getClass();
        return new c3(d3Var);
    }
}
