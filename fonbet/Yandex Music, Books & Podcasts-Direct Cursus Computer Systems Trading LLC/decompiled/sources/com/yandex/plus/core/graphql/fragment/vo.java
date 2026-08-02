package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.DeviceService;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import defpackage.vgj;
import defpackage.xq0;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class vo implements defpackage.pj {
    public static final List a = u75.h("title", "text", DeviceService.KEY_DESC, "additionText", "payload", "image", "offerName", "tariff", "backgroundTv", "storePurchaseInfo");

    public static ro c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object b;
        Object obj2;
        defpackage.op opVar = com.yandex.plus.core.graphql.type.z.c;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        Map map2 = null;
        String str5 = null;
        qo qoVar = null;
        oo ooVar = null;
        po poVar = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    break;
                case 1:
                    str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 2:
                    str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 3:
                    str4 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 4:
                    defpackage.pj e = fx6Var.e(opVar);
                    defpackage.tj tjVar = defpackage.uj.a;
                    if (!(e instanceof vgj)) {
                        if (a7fVar.peek() == 10) {
                            a7fVar.w();
                            b = null;
                        } else {
                            b = e.b(a7fVar, fx6Var);
                        }
                        map = (Map) b;
                        break;
                    } else {
                        xq0.q("The adapter is already nullable");
                        return null;
                    }
                case 5:
                    map2 = (Map) fx6Var.e(opVar).b(a7fVar, fx6Var);
                    break;
                case 6:
                    str5 = (String) fx6Var.e(com.yandex.plus.core.graphql.type.z.d).b(a7fVar, fx6Var);
                    break;
                case 7:
                    uo uoVar = uo.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qoVar = (qo) new qhj(uoVar, false).b(a7fVar, fx6Var);
                    break;
                case 8:
                    so soVar = so.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar = new qhj(soVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar.b(a7fVar, fx6Var);
                    }
                    ooVar = (oo) obj2;
                    break;
                case 9:
                    to toVar = to.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(toVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar2.b(a7fVar, fx6Var);
                    }
                    poVar = (po) obj;
                    break;
                default:
                    str.getClass();
                    map2.getClass();
                    str5.getClass();
                    qoVar.getClass();
                    return new ro(str, str2, str3, str4, map, map2, str5, qoVar, ooVar, poVar);
            }
        }
    }
}
