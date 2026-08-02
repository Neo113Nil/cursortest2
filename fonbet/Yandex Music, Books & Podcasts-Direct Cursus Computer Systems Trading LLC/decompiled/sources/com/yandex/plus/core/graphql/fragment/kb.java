package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class kb implements defpackage.pj {
    public static final List a = u75.h("text", "textColor", "textColors", "shape", "imageUrl", C0479n3.g, "attributedText");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.hb(r2, r3, r4, r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hb c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        Object obj3;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        gb gbVar = null;
        String str3 = null;
        String str4 = null;
        fb fbVar = null;
        eb ebVar = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 1:
                    str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 2:
                    lb lbVar = lb.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(lbVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar.b(a7fVar, fx6Var);
                    }
                    gbVar = (gb) obj2;
                    break;
                case 3:
                    str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 4:
                    str4 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 5:
                    jb jbVar = jb.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(jbVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj3 = null;
                    } else {
                        obj3 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    fbVar = (fb) obj3;
                    break;
                case 6:
                    ib ibVar = ib.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(ibVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar3.b(a7fVar, fx6Var);
                    }
                    ebVar = (eb) obj;
                    break;
            }
        }
    }
}
