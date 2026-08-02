package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.vgj;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;

/* loaded from: classes4.dex */
public final class f7 implements defpackage.pj {
    public static final f7 a = new f7();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        z6 z6Var = (z6) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        z6Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, z6Var.a);
        List list = e6.a;
        b6 b6Var = z6Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        b6Var.getClass();
        r7fVar.Z("text");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, b6Var.a);
        r7fVar.Z("textColor");
        vgjVar.a(r7fVar, fx6Var, b6Var.b);
        r7fVar.Z("textColors");
        qhj qhjVar = new qhj(f6.a, true);
        a6 a6Var = b6Var.c;
        if (a6Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, a6Var);
        }
        r7fVar.Z("shape");
        vgjVar.a(r7fVar, fx6Var, b6Var.d);
        r7fVar.Z("imageUrl");
        vgjVar.a(r7fVar, fx6Var, b6Var.e);
        r7fVar.Z(C0479n3.g);
        qhj qhjVar2 = new qhj(d6.a, false);
        z5 z5Var = b6Var.f;
        if (z5Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, z5Var);
        }
        r7fVar.Z("attributedText");
        qhj qhjVar3 = new qhj(c6.a, true);
        y5 y5Var = b6Var.g;
        if (y5Var == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, y5Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        b6 c = e6.c(a7fVar, fx6Var);
        str.getClass();
        return new z6(str, c);
    }
}
