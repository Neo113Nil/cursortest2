package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class w4 implements defpackage.pj {
    public static final List a = u75.h("shape", "textColor", "textColors", C0479n3.g);

    public static u4 c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        t4 t4Var = null;
        s4 s4Var = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                x4 x4Var = x4.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(x4Var, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                t4Var = (t4) b2;
            } else {
                if (z0 != 3) {
                    return new u4(str, str2, t4Var, s4Var);
                }
                v4 v4Var = v4.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(v4Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b = null;
                } else {
                    b = qhjVar2.b(a7fVar, fx6Var);
                }
                s4Var = (s4) b;
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, u4 u4Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        u4Var.getClass();
        r7fVar.Z("shape");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, u4Var.a);
        r7fVar.Z("textColor");
        vgjVar.a(r7fVar, fx6Var, u4Var.b);
        r7fVar.Z("textColors");
        qhj qhjVar = new qhj(x4.a, true);
        t4 t4Var = u4Var.c;
        if (t4Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, t4Var);
        }
        r7fVar.Z(C0479n3.g);
        qhj qhjVar2 = new qhj(v4.a, false);
        s4 s4Var = u4Var.d;
        if (s4Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, s4Var);
        }
    }
}
