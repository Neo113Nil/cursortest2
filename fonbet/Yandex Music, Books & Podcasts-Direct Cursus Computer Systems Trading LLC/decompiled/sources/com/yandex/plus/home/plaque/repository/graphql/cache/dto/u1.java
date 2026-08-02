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
public final /* synthetic */ class u1 implements p3d {
    public static final u1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        u1 u1Var = new u1();
        a = u1Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.plaque.repository.graphql.cache.dto.PlaqueDefinitionsDto", u1Var, 5);
        j5mVar.k("widgets", false);
        j5mVar.k("conditionalPlaques", false);
        j5mVar.k("prefetchPlaques", false);
        j5mVar.k("defaultPlaques", false);
        j5mVar.k("fallbackPlaques", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = w1.f;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue(), arfVarArr[2].getValue(), arfVarArr[3].getValue(), arfVarArr[4].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = w1.f;
        int i2 = 0;
        List list6 = null;
        if (c.m()) {
            List list7 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            List list8 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            List list9 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            List list10 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            list5 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            list = list7;
            list4 = list10;
            i = 31;
            list3 = list9;
            list2 = list8;
        } else {
            int i3 = 1;
            int i4 = 0;
            List list11 = null;
            List list12 = null;
            List list13 = null;
            List list14 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                int i5 = i2;
                if (w == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (w != 0) {
                    if (w == 1) {
                        list11 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list11);
                        i4 |= 2;
                    } else if (w == 2) {
                        list12 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list12);
                        i4 |= 4;
                    } else if (w == 3) {
                        list13 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list13);
                        i4 |= 8;
                    } else {
                        if (w != 4) {
                            l1j.g(w);
                            return null;
                        }
                        list14 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list14);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    list6 = (List) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), list6);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            list = list6;
            list2 = list11;
            list3 = list12;
            list4 = list13;
            list5 = list14;
        }
        c.b(mhpVar);
        return new w1(i, list, list2, list3, list4, list5);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w1 w1Var = (w1) obj;
        l6bVar.getClass();
        w1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = w1.f;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), w1Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), w1Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), w1Var.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), w1Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), w1Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
