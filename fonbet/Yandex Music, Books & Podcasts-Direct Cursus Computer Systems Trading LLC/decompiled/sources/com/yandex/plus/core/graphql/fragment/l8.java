package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class l8 implements defpackage.pj {
    public static final List a = u75.h("indentRules", "backgroundColorSettings", "backgroundShapeSettings", CameraProperty.WIDTH);

    public static i8 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        g8 g8Var = null;
        ArrayList arrayList = null;
        f8 f8Var = null;
        h8 h8Var = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                m8 m8Var = m8.a;
                defpackage.tj tjVar = defpackage.uj.a;
                g8Var = (g8) new qhj(m8Var, true).b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                j8 j8Var = j8.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar = new qhj(j8Var, true);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            } else if (z0 == 2) {
                k8 k8Var = k8.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                f8Var = (f8) new qhj(k8Var, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 3) {
                    g8Var.getClass();
                    arrayList.getClass();
                    f8Var.getClass();
                    h8Var.getClass();
                    return new i8(g8Var, arrayList, f8Var, h8Var);
                }
                n8 n8Var = n8.a;
                defpackage.tj tjVar4 = defpackage.uj.a;
                h8Var = (h8) new qhj(n8Var, true).b(a7fVar, fx6Var);
            }
        }
    }
}
