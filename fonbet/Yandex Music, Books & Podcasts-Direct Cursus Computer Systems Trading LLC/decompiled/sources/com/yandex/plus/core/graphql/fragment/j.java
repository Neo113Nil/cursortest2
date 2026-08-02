package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.tlm;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class j implements defpackage.pj {
    public static final List a = u75.h("additionalText", "benefits", "disclaimer", "iconImages", "isAvailable", "isSelected", "offerName", "offersBatchId", "offersToReplace", "positionId", "text", "title", "upsaleStep", "upsaleType", "offerSwitchToggle");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        r10 = r4;
        r5.getClass();
        r6.getClass();
        r8.getClass();
        r10.getClass();
        r21 = r9;
        r9 = r10.booleanValue();
        r21.getClass();
        r10 = r21.booleanValue();
        r11.getClass();
        r12.getClass();
        r13.getClass();
        r14.getClass();
        r15.getClass();
        r16.getClass();
        r17.getClass();
        r18.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0060, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.i(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Boolean bool;
        String str;
        Boolean bool2;
        Object b;
        com.yandex.plus.core.graphql.type.w0 w0Var;
        com.yandex.plus.core.graphql.type.x0 x0Var;
        defpackage.op opVar = com.yandex.plus.core.graphql.type.z.d;
        a7fVar.getClass();
        fx6Var.getClass();
        Boolean bool3 = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        Map map = null;
        Boolean bool4 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList2 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        com.yandex.plus.core.graphql.type.w0 w0Var2 = null;
        com.yandex.plus.core.graphql.type.x0 x0Var2 = null;
        h hVar = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    continue;
                case 1:
                    bool = bool3;
                    str = str2;
                    bool2 = bool4;
                    k kVar = k.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(kVar, false);
                    arrayList = tlm.n(a7fVar);
                    while (a7fVar.hasNext()) {
                        if (a7fVar.peek() == 10) {
                            a7fVar.w();
                            b = null;
                        } else {
                            b = qhjVar.b(a7fVar, fx6Var);
                        }
                        arrayList.add(b);
                    }
                    a7fVar.l();
                    break;
                case 2:
                    str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    continue;
                case 3:
                    map = (Map) fx6Var.e(com.yandex.plus.core.graphql.type.z.c).b(a7fVar, fx6Var);
                    continue;
                case 4:
                    bool3 = (Boolean) defpackage.uj.f.b(a7fVar, fx6Var);
                    continue;
                case 5:
                    bool4 = (Boolean) defpackage.uj.f.b(a7fVar, fx6Var);
                    continue;
                case 6:
                    str4 = (String) fx6Var.e(opVar).b(a7fVar, fx6Var);
                    continue;
                case 7:
                    str5 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    continue;
                case 8:
                    bool = bool3;
                    str = str2;
                    bool2 = bool4;
                    defpackage.pj e = fx6Var.e(opVar);
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    arrayList2 = tlm.n(a7fVar);
                    while (a7fVar.hasNext()) {
                        arrayList2.add(e.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    break;
                case 9:
                    str6 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    continue;
                case 10:
                    str7 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    continue;
                case 11:
                    str8 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    continue;
                case 12:
                    bool = bool3;
                    str = str2;
                    bool2 = bool4;
                    String f0 = a7fVar.f0();
                    f0.getClass();
                    com.yandex.plus.core.graphql.type.w0.b.getClass();
                    com.yandex.plus.core.graphql.type.w0[] values = com.yandex.plus.core.graphql.type.w0.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            com.yandex.plus.core.graphql.type.w0[] w0VarArr = values;
                            w0Var = w0VarArr[i];
                            int i2 = length;
                            if (!w0Var.a.equals(f0)) {
                                i++;
                                values = w0VarArr;
                                length = i2;
                            }
                        } else {
                            w0Var = null;
                        }
                    }
                    if (w0Var != null) {
                        w0Var2 = w0Var;
                        break;
                    } else {
                        w0Var2 = com.yandex.plus.core.graphql.type.w0.UNKNOWN__;
                        break;
                    }
                case 13:
                    bool = bool3;
                    bool2 = bool4;
                    String f02 = a7fVar.f0();
                    f02.getClass();
                    com.yandex.plus.core.graphql.type.x0.b.getClass();
                    com.yandex.plus.core.graphql.type.x0[] values2 = com.yandex.plus.core.graphql.type.x0.values();
                    int length2 = values2.length;
                    str = str2;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            int i4 = length2;
                            x0Var = values2[i3];
                            int i5 = i3;
                            if (!x0Var.a.equals(f02)) {
                                i3 = i5 + 1;
                                length2 = i4;
                            }
                        } else {
                            x0Var = null;
                        }
                    }
                    if (x0Var == null) {
                        x0Var = com.yandex.plus.core.graphql.type.x0.UNKNOWN__;
                    }
                    x0Var2 = x0Var;
                    break;
                case 14:
                    Boolean bool5 = bool3;
                    Boolean bool6 = bool4;
                    l lVar = l.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(lVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar2.b(a7fVar, fx6Var);
                    }
                    hVar = (h) obj;
                    bool3 = bool5;
                    bool4 = bool6;
                    continue;
            }
            bool3 = bool;
            bool4 = bool2;
            str2 = str;
        }
    }
}
