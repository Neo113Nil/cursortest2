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
public abstract class k3 implements defpackage.pj {
    public static final List a = u75.h("text", "shape", "textColor", "textColors", C0479n3.g, "attributedText");

    public static h3 c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        Object obj3;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        g3 g3Var = null;
        d3 d3Var = null;
        c3 c3Var = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 3) {
                n3 n3Var = n3.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(n3Var, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj3 = null;
                } else {
                    obj3 = qhjVar.b(a7fVar, fx6Var);
                }
                g3Var = (g3) obj3;
            } else if (z0 == 4) {
                j3 j3Var = j3.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(j3Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj2 = null;
                } else {
                    obj2 = qhjVar2.b(a7fVar, fx6Var);
                }
                d3Var = (d3) obj2;
            } else {
                if (z0 != 5) {
                    return new h3(str, str2, str3, g3Var, d3Var, c3Var);
                }
                i3 i3Var = i3.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                qhj qhjVar3 = new qhj(i3Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj = null;
                } else {
                    obj = qhjVar3.b(a7fVar, fx6Var);
                }
                c3Var = (c3) obj;
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, h3 h3Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        h3Var.getClass();
        r7fVar.Z("text");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, h3Var.a);
        r7fVar.Z("shape");
        vgjVar.a(r7fVar, fx6Var, h3Var.b);
        r7fVar.Z("textColor");
        vgjVar.a(r7fVar, fx6Var, h3Var.c);
        r7fVar.Z("textColors");
        qhj qhjVar = new qhj(n3.a, true);
        g3 g3Var = h3Var.d;
        if (g3Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, g3Var);
        }
        r7fVar.Z(C0479n3.g);
        qhj qhjVar2 = new qhj(j3.a, false);
        d3 d3Var = h3Var.e;
        if (d3Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, d3Var);
        }
        r7fVar.Z("attributedText");
        qhj qhjVar3 = new qhj(i3.a, false);
        c3 c3Var = h3Var.f;
        if (c3Var == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, c3Var);
        }
    }
}
