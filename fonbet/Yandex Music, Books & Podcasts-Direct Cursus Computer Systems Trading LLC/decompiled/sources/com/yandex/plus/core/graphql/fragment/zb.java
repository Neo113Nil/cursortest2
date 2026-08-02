package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zb implements defpackage.pj {
    public static final List a = u75.h(ConnectableDevice.KEY_ID, "title", "lightTheme", "darkTheme", "asset");

    public static vb c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        ub ubVar = null;
        tb tbVar = null;
        sb sbVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                yb ybVar = yb.a;
                defpackage.tj tjVar = defpackage.uj.a;
                ubVar = (ub) new qhj(ybVar, false).b(a7fVar, fx6Var);
            } else if (z0 == 3) {
                xb xbVar = xb.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                tbVar = (tb) new qhj(xbVar, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 4) {
                    str.getClass();
                    str2.getClass();
                    ubVar.getClass();
                    tbVar.getClass();
                    return new vb(str, str2, ubVar, tbVar, sbVar);
                }
                wb wbVar = wb.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                qhj qhjVar = new qhj(wbVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj = null;
                } else {
                    obj = qhjVar.b(a7fVar, fx6Var);
                }
                sbVar = (sb) obj;
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, vb vbVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        vbVar.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, vbVar.a);
        r7fVar.Z("title");
        tjVar.a(r7fVar, fx6Var, vbVar.b);
        r7fVar.Z("lightTheme");
        yb ybVar = yb.a;
        ub ubVar = vbVar.c;
        r7fVar.j();
        ybVar.a(r7fVar, fx6Var, ubVar);
        r7fVar.p();
        r7fVar.Z("darkTheme");
        xb xbVar = xb.a;
        tb tbVar = vbVar.d;
        r7fVar.j();
        xbVar.a(r7fVar, fx6Var, tbVar);
        r7fVar.p();
        r7fVar.Z("asset");
        qhj qhjVar = new qhj(wb.a, true);
        sb sbVar = vbVar.e;
        if (sbVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, sbVar);
        }
    }
}
