package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class j4 implements defpackage.pj {
    public static final List a = u75.h("name", ConnectableDevice.KEY_ID, "textStyle", C0479n3.g, "commonOverlays", "actions");

    public static c4 c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        b4 b4Var = null;
        w3 w3Var = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                l4 l4Var = l4.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(l4Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj2 = null;
                } else {
                    obj2 = qhjVar.b(a7fVar, fx6Var);
                }
                b4Var = (b4) obj2;
            } else if (z0 == 3) {
                f4 f4Var = f4.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(f4Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj = null;
                } else {
                    obj = qhjVar2.b(a7fVar, fx6Var);
                }
                w3Var = (w3) obj;
            } else if (z0 == 4) {
                i4 i4Var = i4.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                j8g j8gVar = new j8g(new qhj(i4Var, true), 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            } else {
                if (z0 != 5) {
                    str.getClass();
                    str2.getClass();
                    arrayList2.getClass();
                    return new c4(str, str2, b4Var, w3Var, arrayList, arrayList2);
                }
                e4 e4Var = e4.a;
                defpackage.tj tjVar4 = defpackage.uj.a;
                qhj qhjVar3 = new qhj(e4Var, true);
                a7fVar.m();
                ArrayList arrayList3 = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList3.add(qhjVar3.b(a7fVar, fx6Var));
                }
                a7fVar.l();
                arrayList2 = arrayList3;
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, c4 c4Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        c4Var.getClass();
        r7fVar.Z("name");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, c4Var.a);
        r7fVar.Z(ConnectableDevice.KEY_ID);
        tjVar.a(r7fVar, fx6Var, c4Var.b);
        r7fVar.Z("textStyle");
        qhj qhjVar = new qhj(l4.a, false);
        b4 b4Var = c4Var.c;
        if (b4Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, b4Var);
        }
        r7fVar.Z(C0479n3.g);
        qhj qhjVar2 = new qhj(f4.a, false);
        w3 w3Var = c4Var.d;
        if (w3Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, w3Var);
        }
        r7fVar.Z("commonOverlays");
        j8g j8gVar = new j8g(new qhj(i4.a, true), 0);
        List list = c4Var.e;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("actions");
        e4 e4Var = e4.a;
        ArrayList arrayList = c4Var.f;
        r7fVar.m();
        for (Object obj : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                e4Var.a(r7fVar, fx6Var, obj);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                e4Var.a(fahVar, fx6Var, obj);
                fahVar.p();
                Object b = fahVar.b();
                b.getClass();
                irf.V(r7fVar, b);
            }
        }
        r7fVar.l();
    }
}
