package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class e6 implements defpackage.pj {
    public static final List a = u75.h("text", "textColor", "textColors", "shape", "imageUrl", C0479n3.g, "attributedText");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.b6(r2, r3, r4, r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b6 c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        Object obj3;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        a6 a6Var = null;
        String str3 = null;
        String str4 = null;
        z5 z5Var = null;
        y5 y5Var = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 1:
                    str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 2:
                    f6 f6Var = f6.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(f6Var, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar.b(a7fVar, fx6Var);
                    }
                    a6Var = (a6) obj2;
                    break;
                case 3:
                    str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 4:
                    str4 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 5:
                    d6 d6Var = d6.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(d6Var, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj3 = null;
                    } else {
                        obj3 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    z5Var = (z5) obj3;
                    break;
                case 6:
                    c6 c6Var = c6.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(c6Var, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar3.b(a7fVar, fx6Var);
                    }
                    y5Var = (y5) obj;
                    break;
            }
        }
    }
}
