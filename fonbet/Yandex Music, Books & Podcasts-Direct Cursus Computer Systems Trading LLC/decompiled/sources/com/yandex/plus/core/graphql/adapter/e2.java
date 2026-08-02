package com.yandex.plus.core.graphql.adapter;

import com.connectsdk.device.ConnectableDevice;
import com.yandex.plus.core.graphql.fragment.i7;
import com.yandex.plus.core.graphql.fragment.j7;
import com.yandex.plus.core.graphql.fragment.k7;
import com.yandex.plus.core.graphql.fragment.l7;
import com.yandex.plus.core.graphql.y2;
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
public final class e2 implements pj {
    public static final e2 a = new e2();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        y2 y2Var = (y2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        y2Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, y2Var.a);
        List list = l7.a;
        j7 j7Var = y2Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        j7Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        uj.a.a(r7fVar, fx6Var, j7Var.a);
        r7fVar.Z("avatar");
        k7 k7Var = k7.a;
        i7 i7Var = j7Var.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            k7Var.a(r7fVar, fx6Var, i7Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        k7Var.a(fahVar, fx6Var, i7Var);
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
        j7 c = l7.c(a7fVar, fx6Var);
        str.getClass();
        return new y2(str, c);
    }
}
