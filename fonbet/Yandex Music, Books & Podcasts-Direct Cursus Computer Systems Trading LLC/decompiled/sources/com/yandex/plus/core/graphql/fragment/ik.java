package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class ik implements defpackage.pj {
    public static final ik a = new ik();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        dk dkVar = (dk) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        dkVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, dkVar.a);
        List list = l8.a;
        i8 i8Var = dkVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        i8Var.getClass();
        r7fVar.Z("indentRules");
        m8 m8Var = m8.a;
        defpackage.tj tjVar = defpackage.uj.a;
        g8 g8Var = i8Var.a;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            m8Var.a(r7fVar, fx6Var, g8Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            m8Var.a(fahVar, fx6Var, g8Var);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("backgroundColorSettings");
        j8 j8Var = j8.a;
        ArrayList arrayList = i8Var.b;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (z) {
                r7fVar.j();
                j8Var.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar2 = new fah();
                fahVar2.j();
                j8Var.a(fahVar2, fx6Var, obj2);
                fahVar2.p();
                Object b3 = fahVar2.b();
                b3.getClass();
                irf.V(r7fVar, b3);
            }
        }
        r7fVar.l();
        r7fVar.Z("backgroundShapeSettings");
        k8 k8Var = k8.a;
        f8 f8Var = i8Var.c;
        if (z) {
            r7fVar.j();
            k8Var.a(r7fVar, fx6Var, f8Var);
            r7fVar.p();
        } else {
            fah fahVar3 = new fah();
            fahVar3.j();
            k8Var.a(fahVar3, fx6Var, f8Var);
            fahVar3.p();
            Object b4 = fahVar3.b();
            b4.getClass();
            irf.V(r7fVar, b4);
        }
        r7fVar.Z(CameraProperty.WIDTH);
        n8 n8Var = n8.a;
        h8 h8Var = i8Var.d;
        if (z) {
            r7fVar.j();
            n8Var.a(r7fVar, fx6Var, h8Var);
            r7fVar.p();
            return;
        }
        fah fahVar4 = new fah();
        fahVar4.j();
        n8Var.a(fahVar4, fx6Var, h8Var);
        fahVar4.p();
        Object b5 = fahVar4.b();
        b5.getClass();
        irf.V(r7fVar, b5);
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
        i8 c = l8.c(a7fVar, fx6Var);
        str.getClass();
        return new dk(str, c);
    }
}
