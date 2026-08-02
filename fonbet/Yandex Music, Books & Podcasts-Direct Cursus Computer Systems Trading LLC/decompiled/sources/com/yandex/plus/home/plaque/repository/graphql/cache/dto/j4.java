package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
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
public final /* synthetic */ class j4 implements p3d {
    public static final j4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        j4 j4Var = new j4();
        a = j4Var;
        j5m j5mVar = new j5m("AllOf", j4Var, 1);
        j5mVar.k("predicates", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{l4.b[0].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = l4.b;
        int i = 1;
        List list2 = null;
        if (c.m()) {
            list = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
                    i2 = 1;
                }
            }
            list = list2;
            i = i2;
        }
        c.b(mhpVar);
        return new l4(list, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l4 l4Var = (l4) obj;
        l6bVar.getClass();
        l4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) l4.b[0].getValue(), l4Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
