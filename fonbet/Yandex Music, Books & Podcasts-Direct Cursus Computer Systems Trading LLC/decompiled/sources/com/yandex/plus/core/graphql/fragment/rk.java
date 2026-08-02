package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class rk implements defpackage.pj {
    public static final List a = u75.h("widgetId", "contentDescription", "templates", "strictAction", "displayWidgetRules", "type", "textWidget", "balanceWidget", "buttonWidget", "switchWidget", "iconWidget");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r4.getClass();
        r8.getClass();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.bk(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bk c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        com.yandex.plus.core.graphql.type.e1 e1Var;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        a7fVar.getClass();
        fx6Var.getClass();
        String str2 = null;
        vj vjVar = null;
        ArrayList arrayList = null;
        yj yjVar = null;
        wj wjVar = null;
        com.yandex.plus.core.graphql.type.e1 e1Var2 = null;
        ak akVar = null;
        tj tjVar = null;
        uj ujVar = null;
        zj zjVar = null;
        xj xjVar = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    continue;
                case 1:
                    str = str2;
                    ok okVar = ok.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qhj qhjVar = new qhj(okVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar.b(a7fVar, fx6Var);
                    }
                    vjVar = (vj) obj2;
                    break;
                case 2:
                    str = str2;
                    j8g j8gVar = new j8g(defpackage.uj.a, 0);
                    if (a7fVar.peek() != 10) {
                        arrayList = j8gVar.c(a7fVar, fx6Var);
                        break;
                    } else {
                        a7fVar.w();
                        arrayList = null;
                        break;
                    }
                case 3:
                    str = str2;
                    sk skVar = sk.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(skVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj3 = null;
                    } else {
                        obj3 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    yjVar = (yj) obj3;
                    break;
                case 4:
                    pk pkVar = pk.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    wjVar = (wj) new qhj(pkVar, true).b(a7fVar, fx6Var);
                    continue;
                case 5:
                    String f0 = a7fVar.f0();
                    f0.getClass();
                    com.yandex.plus.core.graphql.type.e1.b.getClass();
                    com.yandex.plus.core.graphql.type.e1[] values = com.yandex.plus.core.graphql.type.e1.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            com.yandex.plus.core.graphql.type.e1[] e1VarArr = values;
                            e1Var = e1VarArr[i];
                            str = str2;
                            if (!e1Var.a.equals(f0)) {
                                i++;
                                values = e1VarArr;
                                str2 = str;
                            }
                        } else {
                            str = str2;
                            e1Var = null;
                        }
                    }
                    if (e1Var != null) {
                        e1Var2 = e1Var;
                        break;
                    } else {
                        e1Var2 = com.yandex.plus.core.graphql.type.e1.UNKNOWN__;
                        break;
                    }
                case 6:
                    uk ukVar = uk.a;
                    defpackage.tj tjVar5 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(ukVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj4 = null;
                    } else {
                        obj4 = qhjVar3.b(a7fVar, fx6Var);
                    }
                    akVar = (ak) obj4;
                    continue;
                case 7:
                    mk mkVar = mk.a;
                    defpackage.tj tjVar6 = defpackage.uj.a;
                    qhj qhjVar4 = new qhj(mkVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj5 = null;
                    } else {
                        obj5 = qhjVar4.b(a7fVar, fx6Var);
                    }
                    tjVar = (tj) obj5;
                    continue;
                case 8:
                    nk nkVar = nk.a;
                    defpackage.tj tjVar7 = defpackage.uj.a;
                    qhj qhjVar5 = new qhj(nkVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj6 = null;
                    } else {
                        obj6 = qhjVar5.b(a7fVar, fx6Var);
                    }
                    ujVar = (uj) obj6;
                    continue;
                case 9:
                    tk tkVar = tk.a;
                    defpackage.tj tjVar8 = defpackage.uj.a;
                    qhj qhjVar6 = new qhj(tkVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj7 = null;
                    } else {
                        obj7 = qhjVar6.b(a7fVar, fx6Var);
                    }
                    zjVar = (zj) obj7;
                    continue;
                case 10:
                    qk qkVar = qk.a;
                    defpackage.tj tjVar9 = defpackage.uj.a;
                    qhj qhjVar7 = new qhj(qkVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar7.b(a7fVar, fx6Var);
                    }
                    xjVar = (xj) obj;
                    continue;
            }
            str2 = str;
        }
    }
}
