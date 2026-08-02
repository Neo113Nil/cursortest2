package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class d9 implements defpackage.pj {
    public static final List a = u75.h(ConnectableDevice.KEY_ID, "respCode", "respDesc", "status");

    public static c9 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        Object obj = null;
        String str2 = null;
        Object obj2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                obj = defpackage.uj.m.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else {
                if (z0 != 3) {
                    str.getClass();
                    obj2.getClass();
                    return new c9(str, obj, str2, obj2);
                }
                obj2 = defpackage.uj.g.b(a7fVar, fx6Var);
            }
        }
    }
}
