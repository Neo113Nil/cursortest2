package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class cj implements defpackage.pj {
    public static final List a = u75.h("text", "textDecoration", "color", "metaColor", "metaStyle", "fontSize", "fontStyle", "fontWeight");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.bj(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bj c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    break;
                case 1:
                    j8g a2 = defpackage.uj.a(defpackage.uj.i);
                    if (a7fVar.peek() != 10) {
                        arrayList = a2.c(a7fVar, fx6Var);
                        break;
                    } else {
                        a7fVar.w();
                        arrayList = null;
                        break;
                    }
                case 2:
                    str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 3:
                    str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 4:
                    str4 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 5:
                    num = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
                    break;
                case 6:
                    str5 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 7:
                    str6 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, bj bjVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        bjVar.getClass();
        r7fVar.Z("text");
        defpackage.uj.a.a(r7fVar, fx6Var, bjVar.a);
        r7fVar.Z("textDecoration");
        vgj vgjVar = defpackage.uj.i;
        j8g a2 = defpackage.uj.a(vgjVar);
        List list = bjVar.b;
        if (list == null) {
            r7fVar.B0();
        } else {
            a2.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("color");
        vgjVar.a(r7fVar, fx6Var, bjVar.c);
        r7fVar.Z("metaColor");
        vgjVar.a(r7fVar, fx6Var, bjVar.d);
        r7fVar.Z("metaStyle");
        vgjVar.a(r7fVar, fx6Var, bjVar.e);
        r7fVar.Z("fontSize");
        defpackage.uj.k.a(r7fVar, fx6Var, bjVar.f);
        r7fVar.Z("fontStyle");
        vgjVar.a(r7fVar, fx6Var, bjVar.g);
        r7fVar.Z("fontWeight");
        vgjVar.a(r7fVar, fx6Var, bjVar.h);
    }
}
