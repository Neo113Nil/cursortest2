package com.yandex.plus.core.graphql.adapter;

import com.connectsdk.device.ConnectableDevice;
import com.yandex.plus.core.graphql.a3;
import com.yandex.plus.core.graphql.v2;
import com.yandex.plus.core.graphql.x2;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class g2 implements pj {
    public static final g2 a = new g2();
    public static final List b = u75.h(ConnectableDevice.KEY_ID, "avatar", "family");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        a3 a3Var = (a3) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        a3Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        uj.a.a(r7fVar, fx6Var, a3Var.a);
        r7fVar.Z("avatar");
        b2 b2Var = b2.a;
        v2 v2Var = a3Var.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            b2Var.a(r7fVar, fx6Var, v2Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            b2Var.a(fahVar, fx6Var, v2Var);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("family");
        d2 d2Var = d2.a;
        x2 x2Var = a3Var.c;
        r7fVar.j();
        d2Var.a(r7fVar, fx6Var, x2Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        v2 v2Var = null;
        x2 x2Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                b2 b2Var = b2.a;
                tj tjVar = uj.a;
                v2Var = (v2) new qhj(b2Var, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    v2Var.getClass();
                    x2Var.getClass();
                    return new a3(str, v2Var, x2Var);
                }
                d2 d2Var = d2.a;
                tj tjVar2 = uj.a;
                x2Var = (x2) new qhj(d2Var, false).b(a7fVar, fx6Var);
            }
        }
    }
}
