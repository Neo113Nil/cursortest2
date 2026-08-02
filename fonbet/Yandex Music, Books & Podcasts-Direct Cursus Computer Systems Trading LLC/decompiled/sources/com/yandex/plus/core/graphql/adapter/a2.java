package com.yandex.plus.core.graphql.adapter;

import com.connectsdk.device.ConnectableDevice;
import com.yandex.plus.core.graphql.r2;
import com.yandex.plus.core.graphql.t2;
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
public final class a2 implements pj {
    public static final a2 a = new a2();
    public static final List b = u75.h(ConnectableDevice.KEY_ID, "avatar");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        t2 t2Var = (t2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        t2Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        uj.a.a(r7fVar, fx6Var, t2Var.a);
        r7fVar.Z("avatar");
        y1 y1Var = y1.a;
        r2 r2Var = t2Var.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            y1Var.a(r7fVar, fx6Var, r2Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        y1Var.a(fahVar, fx6Var, r2Var);
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
        r2 r2Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    r2Var.getClass();
                    return new t2(str, r2Var);
                }
                y1 y1Var = y1.a;
                tj tjVar = uj.a;
                r2Var = (r2) new qhj(y1Var, true).b(a7fVar, fx6Var);
            }
        }
    }
}
