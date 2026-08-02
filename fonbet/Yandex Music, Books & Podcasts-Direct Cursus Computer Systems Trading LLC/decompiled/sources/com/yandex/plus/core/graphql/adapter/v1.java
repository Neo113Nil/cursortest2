package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.n2;
import com.yandex.plus.core.graphql.p2;
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
public final class v1 implements pj {
    public static final v1 a = new v1();
    public static final List b = t75.c("invoice");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        n2 n2Var = (n2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        n2Var.getClass();
        r7fVar.Z("invoice");
        x1 x1Var = x1.a;
        tj tjVar = uj.a;
        p2 p2Var = n2Var.a;
        r7fVar.j();
        x1Var.a(r7fVar, fx6Var, p2Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        p2 p2Var = null;
        while (a7fVar.z0(b) == 0) {
            x1 x1Var = x1.a;
            tj tjVar = uj.a;
            p2Var = (p2) new qhj(x1Var, false).b(a7fVar, fx6Var);
        }
        p2Var.getClass();
        return new n2(p2Var);
    }
}
