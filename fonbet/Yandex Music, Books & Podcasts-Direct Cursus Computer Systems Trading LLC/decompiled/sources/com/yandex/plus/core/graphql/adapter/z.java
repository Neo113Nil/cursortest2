package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.tlm;
import defpackage.u75;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class z implements pj {
    public static final z a = new z();
    public static final List b = u75.h("titleText", "subtitleText", "benefits", "acceptButtonText", "buttonText", "buttonAdditionalText", "rejectButtonText", "mainImageMobile", "mainImageTV");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.b0 b0Var = (com.yandex.plus.core.graphql.b0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        b0Var.getClass();
        r7fVar.Z("titleText");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, b0Var.a);
        r7fVar.Z("subtitleText");
        tjVar.a(r7fVar, fx6Var, b0Var.b);
        r7fVar.Z("benefits");
        qhj qhjVar = new qhj(a0.a, false);
        ArrayList arrayList = b0Var.c;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.l();
        r7fVar.Z("acceptButtonText");
        tjVar.a(r7fVar, fx6Var, b0Var.d);
        r7fVar.Z("buttonText");
        tjVar.a(r7fVar, fx6Var, b0Var.e);
        r7fVar.Z("buttonAdditionalText");
        tjVar.a(r7fVar, fx6Var, b0Var.f);
        r7fVar.Z("rejectButtonText");
        tjVar.a(r7fVar, fx6Var, b0Var.g);
        r7fVar.Z("mainImageMobile");
        tjVar.a(r7fVar, fx6Var, b0Var.h);
        r7fVar.Z("mainImageTV");
        tjVar.a(r7fVar, fx6Var, b0Var.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        r2.getClass();
        r3.getClass();
        r10.getClass();
        r4.getClass();
        r5.getClass();
        defpackage.eta.r(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        return new com.yandex.plus.core.graphql.b0(r2, r3, r4, r5, r6, r7, r8, r9, r10);
     */
    @Override // defpackage.pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        ArrayList arrayList = null;
        while (true) {
            switch (a7fVar.z0(b)) {
                case 0:
                    str = (String) uj.a.b(a7fVar, fx6Var);
                    break;
                case 1:
                    str2 = (String) uj.a.b(a7fVar, fx6Var);
                    break;
                case 2:
                    a0 a0Var = a0.a;
                    tj tjVar = uj.a;
                    qhj qhjVar = new qhj(a0Var, false);
                    ArrayList n = tlm.n(a7fVar);
                    while (a7fVar.hasNext()) {
                        if (a7fVar.peek() == 10) {
                            a7fVar.w();
                            b2 = null;
                        } else {
                            b2 = qhjVar.b(a7fVar, fx6Var);
                        }
                        n.add(b2);
                    }
                    a7fVar.l();
                    arrayList = n;
                    break;
                case 3:
                    str3 = (String) uj.a.b(a7fVar, fx6Var);
                    break;
                case 4:
                    str4 = (String) uj.a.b(a7fVar, fx6Var);
                    break;
                case 5:
                    str5 = (String) uj.a.b(a7fVar, fx6Var);
                    break;
                case 6:
                    str6 = (String) uj.a.b(a7fVar, fx6Var);
                    break;
                case 7:
                    str7 = (String) uj.a.b(a7fVar, fx6Var);
                    break;
                case 8:
                    str8 = (String) uj.a.b(a7fVar, fx6Var);
                    break;
            }
        }
    }
}
