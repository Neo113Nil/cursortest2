package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.vgj;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class v6 implements defpackage.pj {
    public static final v6 a = new v6();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        s6 s6Var = (s6) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        s6Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, s6Var.a);
        List list = g7.a;
        b7 b7Var = s6Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        b7Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, b7Var.a);
        r7fVar.Z("name");
        tjVar.a(r7fVar, fx6Var, b7Var.b);
        r7fVar.Z("iconUrl");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, b7Var.c);
        r7fVar.Z("actions");
        qhj qhjVar = new qhj(c7.a, true);
        ArrayList arrayList = b7Var.d;
        r7fVar.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qhjVar.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        r7fVar.Z("textStyle");
        qhj qhjVar2 = new qhj(h7.a, false);
        a7 a7Var = b7Var.e;
        if (a7Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, a7Var);
        }
        r7fVar.Z(C0479n3.g);
        qhj qhjVar3 = new qhj(d7.a, false);
        x6 x6Var = b7Var.f;
        if (x6Var == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, x6Var);
        }
        r7fVar.Z("commonOverlays");
        j8g j8gVar = new j8g(new qhj(f7.a, true), 0);
        List list2 = b7Var.g;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list2);
        }
        r7fVar.Z("additionalData");
        vgjVar.a(r7fVar, fx6Var, b7Var.h);
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
        b7 c = g7.c(a7fVar, fx6Var);
        str.getClass();
        return new s6(str, c);
    }
}
