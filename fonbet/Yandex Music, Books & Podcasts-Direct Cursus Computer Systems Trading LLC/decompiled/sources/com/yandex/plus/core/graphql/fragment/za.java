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
public abstract class za implements defpackage.pj {
    public static final List a = u75.h("title", "text", DeviceService.KEY_DESC, "additionText", "payload", "image", "offerName", "option", "backgroundTv");

    public static wa c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object b;
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
        va vaVar = null;
        ua uaVar = null;
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
                    ya yaVar = ya.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    vaVar = (va) new qhj(yaVar, false).b(a7fVar, fx6Var);
                    break;
                case 8:
                    xa xaVar = xa.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar = new qhj(xaVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar.b(a7fVar, fx6Var);
                    }
                    uaVar = (ua) obj;
                    break;
                default:
                    str.getClass();
                    map2.getClass();
                    str5.getClass();
                    vaVar.getClass();
                    return new wa(str, str2, str3, str4, map, map2, str5, vaVar, uaVar);
            }
        }
    }
}
