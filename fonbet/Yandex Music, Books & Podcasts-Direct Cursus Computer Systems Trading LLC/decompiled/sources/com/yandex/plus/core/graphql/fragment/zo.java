package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.DeviceService;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import defpackage.vgj;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zo implements defpackage.pj {
    public static final List a = u75.h("name", "title", "tariff", DeviceService.KEY_DESC, "text", "additionText", "commonPrice", "commonPeriod", "plans", "offerVendorType", "payload");

    public static no c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        String str;
        com.yandex.plus.core.graphql.type.a0 a0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        String str2 = null;
        String str3 = null;
        mo moVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        ko koVar = null;
        Object obj = null;
        ArrayList arrayList = null;
        com.yandex.plus.core.graphql.type.a0 a0Var2 = null;
        Map map = null;
        while (true) {
            int i = 0;
            switch (a7fVar.z0(a)) {
                case 0:
                    str2 = (String) fx6Var.e(com.yandex.plus.core.graphql.type.z.d).b(a7fVar, fx6Var);
                    continue;
                case 1:
                    str3 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    continue;
                case 2:
                    yo yoVar = yo.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    moVar = (mo) new qhj(yoVar, false).b(a7fVar, fx6Var);
                    continue;
                case 3:
                    str4 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    continue;
                case 4:
                    str5 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    continue;
                case 5:
                    str6 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    continue;
                case 6:
                    str = str2;
                    wo woVar = wo.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    koVar = (ko) new qhj(woVar, true).b(a7fVar, fx6Var);
                    break;
                case 7:
                    obj = defpackage.uj.g.b(a7fVar, fx6Var);
                    continue;
                case 8:
                    str = str2;
                    xo xoVar = xo.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar = new qhj(xoVar, true);
                    a7fVar.m();
                    arrayList = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList.add(qhjVar.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    break;
                case 9:
                    String f0 = a7fVar.f0();
                    f0.getClass();
                    com.yandex.plus.core.graphql.type.a0.b.getClass();
                    com.yandex.plus.core.graphql.type.a0[] values = com.yandex.plus.core.graphql.type.a0.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            com.yandex.plus.core.graphql.type.a0[] a0VarArr = values;
                            a0Var = a0VarArr[i];
                            str = str2;
                            if (!a0Var.a.equals(f0)) {
                                i++;
                                values = a0VarArr;
                                str2 = str;
                            }
                        } else {
                            str = str2;
                            a0Var = null;
                        }
                    }
                    if (a0Var != null) {
                        a0Var2 = a0Var;
                        break;
                    } else {
                        a0Var2 = com.yandex.plus.core.graphql.type.a0.UNKNOWN__;
                        break;
                    }
                case 10:
                    defpackage.pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.c);
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    if (e instanceof vgj) {
                        xq0.q("The adapter is already nullable");
                        return null;
                    }
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        b = null;
                    } else {
                        b = e.b(a7fVar, fx6Var);
                    }
                    map = (Map) b;
                    continue;
                default:
                    str2.getClass();
                    str3.getClass();
                    moVar.getClass();
                    koVar.getClass();
                    obj.getClass();
                    arrayList.getClass();
                    a0Var2.getClass();
                    return new no(str2, str3, moVar, str4, str5, str6, koVar, obj, arrayList, a0Var2, map);
            }
            str2 = str;
        }
    }
}
