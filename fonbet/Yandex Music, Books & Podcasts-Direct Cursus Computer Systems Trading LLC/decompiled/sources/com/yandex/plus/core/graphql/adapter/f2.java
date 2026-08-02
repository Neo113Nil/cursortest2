package com.yandex.plus.core.graphql.adapter;

import com.connectsdk.device.ConnectableDevice;
import com.yandex.plus.core.graphql.fragment.m7;
import com.yandex.plus.core.graphql.fragment.n7;
import com.yandex.plus.core.graphql.fragment.o7;
import com.yandex.plus.core.graphql.fragment.p7;
import com.yandex.plus.core.graphql.z2;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class f2 implements pj {
    public static final f2 a = new f2();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        z2 z2Var = (z2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        z2Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, z2Var.a);
        List list = p7.a;
        n7 n7Var = z2Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        n7Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        uj.a.a(r7fVar, fx6Var, n7Var.a);
        r7fVar.Z("avatar");
        o7 o7Var = o7.a;
        m7 m7Var = n7Var.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            o7Var.a(r7fVar, fx6Var, m7Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        o7Var.a(fahVar, fx6Var, m7Var);
        fahVar.p();
        Object b2 = fahVar.b();
        b2.getClass();
        irf.V(r7fVar, b2);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        n7 c = p7.c(a7fVar, fx6Var);
        str.getClass();
        return new z2(str, c);
    }
}
