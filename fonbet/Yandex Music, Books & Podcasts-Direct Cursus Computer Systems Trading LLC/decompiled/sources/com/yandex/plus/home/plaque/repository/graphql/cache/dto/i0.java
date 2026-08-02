package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
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
public final /* synthetic */ class i0 implements p3d {
    public static final i0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        i0 i0Var = new i0();
        a = i0Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto", i0Var, 7);
        j5mVar.k("indent", false);
        j5mVar.k("backgroundColorSettings", false);
        j5mVar.k("backgroundShapeSettings", false);
        j5mVar.k("opacity", false);
        j5mVar.k("horizontalRule", false);
        j5mVar.k("verticalRule", false);
        j5mVar.k("widthType", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = t0.h;
        return new t9f[]{u0.a, arfVarArr[1].getValue(), q4.a, ff7.C(cqe.a), ff7.C((t9f) arfVarArr[4].getValue()), ff7.C((t9f) arfVarArr[5].getValue()), arfVarArr[6].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        s0 s0Var;
        l0 l0Var;
        w0 w0Var;
        List list;
        z4 z4Var;
        Integer num;
        k0 k0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = t0.h;
        int i2 = 3;
        char c2 = 2;
        w0 w0Var2 = null;
        if (c.m()) {
            w0 w0Var3 = (w0) c.z(mhpVar, 0, u0.a, null);
            List list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            z4 z4Var2 = (z4) c.z(mhpVar, 2, q4.a, null);
            Integer num2 = (Integer) c.n(mhpVar, 3, cqe.a, null);
            k0 k0Var2 = (k0) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            l0 l0Var2 = (l0) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            s0Var = (s0) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            w0Var = w0Var3;
            num = num2;
            z4Var = z4Var2;
            i = 127;
            l0Var = l0Var2;
            k0Var = k0Var2;
            list = list2;
        } else {
            int i3 = 1;
            boolean z = true;
            int i4 = 0;
            s0 s0Var2 = null;
            l0 l0Var3 = null;
            List list3 = null;
            z4 z4Var3 = null;
            Integer num3 = null;
            k0 k0Var3 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 3;
                        i3 = 1;
                    case 0:
                        w0Var2 = (w0) c.z(mhpVar, 0, u0.a, w0Var2);
                        i4 |= 1;
                        i2 = 3;
                        c2 = 2;
                        i3 = 1;
                    case 1:
                        list3 = (List) c.z(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), list3);
                        i4 |= 2;
                        i2 = 3;
                        c2 = 2;
                    case 2:
                        z4Var3 = (z4) c.z(mhpVar, 2, q4.a, z4Var3);
                        i4 |= 4;
                        c2 = 2;
                        i2 = 3;
                    case 3:
                        num3 = (Integer) c.n(mhpVar, i2, cqe.a, num3);
                        i4 |= 8;
                        c2 = 2;
                    case 4:
                        k0Var3 = (k0) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), k0Var3);
                        i4 |= 16;
                        c2 = 2;
                    case 5:
                        l0Var3 = (l0) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), l0Var3);
                        i4 |= 32;
                        c2 = 2;
                    case 6:
                        s0Var2 = (s0) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), s0Var2);
                        i4 |= 64;
                        c2 = 2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i4;
            s0Var = s0Var2;
            l0Var = l0Var3;
            w0Var = w0Var2;
            list = list3;
            z4Var = z4Var3;
            num = num3;
            k0Var = k0Var3;
        }
        c.b(mhpVar);
        return new t0(i, w0Var, list, z4Var, num, k0Var, l0Var, s0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t0 t0Var = (t0) obj;
        l6bVar.getClass();
        t0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = t0.h;
        c.k(mhpVar, 0, u0.a, t0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), t0Var.b);
        c.k(mhpVar, 2, q4.a, t0Var.c);
        c.q(mhpVar, 3, cqe.a, t0Var.d);
        c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), t0Var.e);
        c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), t0Var.f);
        c.k(mhpVar, 6, (t9f) arfVarArr[6].getValue(), t0Var.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
