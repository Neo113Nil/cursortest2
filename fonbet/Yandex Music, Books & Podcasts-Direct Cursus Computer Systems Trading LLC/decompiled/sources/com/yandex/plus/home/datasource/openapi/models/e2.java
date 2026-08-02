package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class e2 implements p3d {
    public static final e2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e2 e2Var = new e2();
        a = e2Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkExperimentModel", e2Var, 3);
        j5mVar.k("testId", false);
        j5mVar.k("bucketId", false);
        j5mVar.k("flags", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = g2.d;
        cqe cqeVar = cqe.a;
        return new t9f[]{cqeVar, cqeVar, arfVarArr[2].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        int i3;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g2.d;
        if (c.m()) {
            i = c.k(mhpVar, 0);
            i3 = c.k(mhpVar, 1);
            list = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i2 = 7;
        } else {
            boolean z = true;
            i = 0;
            int i4 = 0;
            List list2 = null;
            int i5 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    i = c.k(mhpVar, 0);
                    i5 |= 1;
                } else if (w == 1) {
                    i4 = c.k(mhpVar, 1);
                    i5 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list2);
                    i5 |= 4;
                }
            }
            i2 = i5;
            i3 = i4;
            list = list2;
        }
        c.b(mhpVar);
        return new g2(i2, i, i3, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g2 g2Var = (g2) obj;
        l6bVar.getClass();
        g2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = g2.d;
        c.A(0, g2Var.a, mhpVar);
        c.A(1, g2Var.b, mhpVar);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), g2Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
