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
public final class cn implements defpackage.pj {
    public static final cn a = new cn();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        zm zmVar = (zm) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        zmVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, zmVar.a);
        List list = nn.a;
        in inVar = zmVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        inVar.getClass();
        r7fVar.Z("__typename");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, inVar.a);
        r7fVar.Z(ConnectableDevice.KEY_ID);
        tjVar.a(r7fVar, fx6Var, inVar.b);
        r7fVar.Z("name");
        tjVar.a(r7fVar, fx6Var, inVar.c);
        r7fVar.Z("actions");
        qhj qhjVar = new qhj(jn.a, true);
        ArrayList arrayList = inVar.d;
        r7fVar.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qhjVar.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        r7fVar.Z("iconUrl");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, inVar.e);
        r7fVar.Z("title");
        vgjVar.a(r7fVar, fx6Var, inVar.f);
        r7fVar.Z("subtitle");
        vgjVar.a(r7fVar, fx6Var, inVar.g);
        r7fVar.Z("textStyle");
        qhj qhjVar2 = new qhj(on.a, false);
        hn hnVar = inVar.h;
        if (hnVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, hnVar);
        }
        r7fVar.Z(C0479n3.g);
        qhj qhjVar3 = new qhj(kn.a, false);
        en enVar = inVar.i;
        if (enVar == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, enVar);
        }
        r7fVar.Z("commonOverlays");
        j8g j8gVar = new j8g(new qhj(mn.a, true), 0);
        List list2 = inVar.j;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list2);
        }
        r7fVar.Z("additionalData");
        vgjVar.a(r7fVar, fx6Var, inVar.k);
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
        in c = nn.c(a7fVar, fx6Var);
        str.getClass();
        return new zm(str, c);
    }
}
