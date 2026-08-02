package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class of implements defpackage.pj {
    public static final List a = u75.h("indentRules", "backgroundColorSettings", "backgroundShapeSettings");

    public static kf c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        jf jfVar = null;
        ArrayList arrayList = null;
        hf hfVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                nf nfVar = nf.a;
                defpackage.tj tjVar = defpackage.uj.a;
                jfVar = (jf) new qhj(nfVar, true).b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                lf lfVar = lf.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar = new qhj(lfVar, true);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            } else {
                if (z0 != 2) {
                    jfVar.getClass();
                    arrayList.getClass();
                    hfVar.getClass();
                    return new kf(jfVar, arrayList, hfVar);
                }
                mf mfVar = mf.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                hfVar = (hf) new qhj(mfVar, true).b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, kf kfVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        kfVar.getClass();
        r7fVar.Z("indentRules");
        nf nfVar = nf.a;
        defpackage.tj tjVar = defpackage.uj.a;
        jf jfVar = kfVar.a;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            nfVar.a(r7fVar, fx6Var, jfVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            nfVar.a(fahVar, fx6Var, jfVar);
            fahVar.p();
            Object b = fahVar.b();
            b.getClass();
            irf.V(r7fVar, b);
        }
        r7fVar.Z("backgroundColorSettings");
        lf lfVar = lf.a;
        ArrayList arrayList = kfVar.b;
        r7fVar.m();
        for (Object obj : arrayList) {
            if (z) {
                r7fVar.j();
                lfVar.a(r7fVar, fx6Var, obj);
                r7fVar.p();
            } else {
                fah fahVar2 = new fah();
                fahVar2.j();
                lfVar.a(fahVar2, fx6Var, obj);
                fahVar2.p();
                Object b2 = fahVar2.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
        r7fVar.Z("backgroundShapeSettings");
        mf mfVar = mf.a;
        hf hfVar = kfVar.c;
        if (z) {
            r7fVar.j();
            mfVar.a(r7fVar, fx6Var, hfVar);
            r7fVar.p();
            return;
        }
        fah fahVar3 = new fah();
        fahVar3.j();
        mfVar.a(fahVar3, fx6Var, hfVar);
        fahVar3.p();
        Object b3 = fahVar3.b();
        b3.getClass();
        irf.V(r7fVar, b3);
    }
}
