package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class z8 implements defpackage.pj {
    public static final z8 a = new z8();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        s8 s8Var = (s8) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        s8Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, s8Var.a);
        List list = d9.a;
        c9 c9Var = s8Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        c9Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        defpackage.uj.a.a(r7fVar, fx6Var, c9Var.a);
        r7fVar.Z("respCode");
        defpackage.uj.m.a(r7fVar, fx6Var, c9Var.b);
        r7fVar.Z("respDesc");
        defpackage.uj.i.a(r7fVar, fx6Var, c9Var.c);
        r7fVar.Z("status");
        defpackage.uj.g.a(r7fVar, fx6Var, c9Var.d);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        c9 c = d9.c(a7fVar, fx6Var);
        str.getClass();
        return new s8(str, c);
    }
}
