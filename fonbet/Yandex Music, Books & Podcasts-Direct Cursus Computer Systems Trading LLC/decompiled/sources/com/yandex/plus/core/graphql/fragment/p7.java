package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class p7 implements defpackage.pj {
    public static final List a = u75.h(ConnectableDevice.KEY_ID, "avatar");

    public static n7 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        m7 m7Var = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    m7Var.getClass();
                    return new n7(str, m7Var);
                }
                o7 o7Var = o7.a;
                defpackage.tj tjVar = defpackage.uj.a;
                m7Var = (m7) new qhj(o7Var, true).b(a7fVar, fx6Var);
            }
        }
    }
}
