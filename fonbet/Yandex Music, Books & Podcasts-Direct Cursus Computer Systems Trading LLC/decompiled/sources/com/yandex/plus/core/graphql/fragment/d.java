package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class d implements defpackage.pj {
    public static final List a = u75.h("text", "textColor", "textColors", "backgroundColor", "backgroundColors", "url", "deeplink", "actionType");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.c(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.b bVar;
        Object obj;
        Object obj2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        b bVar2 = null;
        String str3 = null;
        a aVar = null;
        String str4 = null;
        String str5 = null;
        com.yandex.plus.core.graphql.type.b bVar3 = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 1:
                    str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 2:
                    f fVar = f.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(fVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar.b(a7fVar, fx6Var);
                    }
                    bVar2 = (b) obj;
                    break;
                case 3:
                    str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 4:
                    e eVar = e.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(eVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    aVar = (a) obj2;
                    break;
                case 5:
                    str4 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 6:
                    str5 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 7:
                    String f0 = a7fVar.f0();
                    f0.getClass();
                    com.yandex.plus.core.graphql.type.b.b.getClass();
                    com.yandex.plus.core.graphql.type.b[] values = com.yandex.plus.core.graphql.type.b.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            bVar = values[i];
                            if (!bVar.a.equals(f0)) {
                                i++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar != null) {
                        bVar3 = bVar;
                        break;
                    } else {
                        bVar3 = com.yandex.plus.core.graphql.type.b.UNKNOWN__;
                        break;
                    }
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, c cVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        cVar.getClass();
        r7fVar.Z("text");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, cVar.a);
        r7fVar.Z("textColor");
        vgjVar.a(r7fVar, fx6Var, cVar.b);
        r7fVar.Z("textColors");
        qhj qhjVar = new qhj(f.a, true);
        b bVar = cVar.c;
        if (bVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, bVar);
        }
        r7fVar.Z("backgroundColor");
        vgjVar.a(r7fVar, fx6Var, cVar.d);
        r7fVar.Z("backgroundColors");
        qhj qhjVar2 = new qhj(e.a, true);
        a aVar = cVar.e;
        if (aVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, aVar);
        }
        r7fVar.Z("url");
        vgjVar.a(r7fVar, fx6Var, cVar.f);
        r7fVar.Z("deeplink");
        vgjVar.a(r7fVar, fx6Var, cVar.g);
        r7fVar.Z("actionType");
        r7fVar.m0(cVar.h.a);
    }
}
