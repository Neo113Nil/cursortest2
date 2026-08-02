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
public final /* synthetic */ class t implements p3d {
    public static final t a;

    @NotNull
    private static final mhp descriptor;

    static {
        t tVar = new t();
        a = tVar;
        j5m j5mVar = new j5m("RadialGradient", tVar, 2);
        j5mVar.k("colors", false);
        j5mVar.k("centralPoint", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{v.c[0].getValue(), q.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        s sVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = v.c;
        List list2 = null;
        if (c.m()) {
            list = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            sVar = (s) c.z(mhpVar, 1, q.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            s sVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    sVar2 = (s) c.z(mhpVar, 1, q.a, sVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            list = list2;
            sVar = sVar2;
        }
        c.b(mhpVar);
        return new v(i, list, sVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v vVar = (v) obj;
        l6bVar.getClass();
        vVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) v.c[0].getValue(), vVar.a);
        c.k(mhpVar, 1, q.a, vVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
