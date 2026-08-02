package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class yf implements defpackage.pj {
    public static final List a = u75.h("color", "metaColor", "verticalAlignment", "imageTag", CameraProperty.WIDTH, CameraProperty.HEIGHT);

    public static xf c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 3) {
                str4 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 4) {
                num = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            } else {
                if (z0 != 5) {
                    str4.getClass();
                    return new xf(str, str2, str3, str4, num, num2);
                }
                num2 = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, xf xfVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        xfVar.getClass();
        r7fVar.Z("color");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, xfVar.a);
        r7fVar.Z("metaColor");
        vgjVar.a(r7fVar, fx6Var, xfVar.b);
        r7fVar.Z("verticalAlignment");
        vgjVar.a(r7fVar, fx6Var, xfVar.c);
        r7fVar.Z("imageTag");
        defpackage.uj.a.a(r7fVar, fx6Var, xfVar.d);
        r7fVar.Z(CameraProperty.WIDTH);
        vgj vgjVar2 = defpackage.uj.k;
        vgjVar2.a(r7fVar, fx6Var, xfVar.e);
        r7fVar.Z(CameraProperty.HEIGHT);
        vgjVar2.a(r7fVar, fx6Var, xfVar.f);
    }
}
