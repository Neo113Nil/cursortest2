package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class cp implements defpackage.pj {
    public static final List a = u75.h(ConnectableDevice.KEY_ID, "url", "fallbackText");

    public static ap c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    return new ap(str, str2, str3);
                }
                str3 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, ap apVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        apVar.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, apVar.a);
        r7fVar.Z("url");
        tjVar.a(r7fVar, fx6Var, apVar.b);
        r7fVar.Z("fallbackText");
        tjVar.a(r7fVar, fx6Var, apVar.c);
    }
}
