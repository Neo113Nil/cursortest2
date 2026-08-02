package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class wl implements defpackage.pj {
    public static final List a = u75.h("name", ConnectableDevice.KEY_ID, "popups");

    public static pl c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
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
                    arrayList.getClass();
                    return new pl(str, str2, arrayList);
                }
                vl vlVar = vl.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(vlVar, false);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            }
        }
    }
}
