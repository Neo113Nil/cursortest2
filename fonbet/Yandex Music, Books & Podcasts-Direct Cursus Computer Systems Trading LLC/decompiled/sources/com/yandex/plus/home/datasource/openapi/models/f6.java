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
public final /* synthetic */ class f6 implements p3d {
    public static final f6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        f6 f6Var = new f6();
        a = f6Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkPredicatesTreeModel", f6Var, 2);
        j5mVar.k("rootPredicateIndex", false);
        j5mVar.k("predicates", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{cqe.a, h6.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = h6.c;
        if (c.m()) {
            i = c.k(mhpVar, 0);
            list = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i2 = 3;
        } else {
            boolean z = true;
            i = 0;
            List list2 = null;
            int i3 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    i = c.k(mhpVar, 0);
                    i3 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list2);
                    i3 |= 2;
                }
            }
            i2 = i3;
            list = list2;
        }
        c.b(mhpVar);
        return new h6(i2, i, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h6 h6Var = (h6) obj;
        l6bVar.getClass();
        h6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = h6.c;
        c.A(0, h6Var.a, mhpVar);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), h6Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
