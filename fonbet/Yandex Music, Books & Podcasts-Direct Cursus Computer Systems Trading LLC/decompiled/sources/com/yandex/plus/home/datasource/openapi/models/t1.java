package com.yandex.plus.home.datasource.openapi.models;

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
public final /* synthetic */ class t1 implements p3d {
    public static final t1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        t1 t1Var = new t1();
        a = t1Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel", t1Var, 7);
        j5mVar.k("widthType", false);
        j5mVar.k("backgroundColors", false);
        j5mVar.k("backgroundShape", false);
        j5mVar.k("opacity", true);
        j5mVar.k("indents", true);
        j5mVar.k("horizontalGravity", true);
        j5mVar.k("verticalGravity", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = x1.h;
        return new t9f[]{h8.Companion.serializer(), arfVarArr[1].getValue(), r.a, ff7.C(cqe.a), ff7.C(r3.a), ff7.C((t9f) arfVarArr[5].getValue()), ff7.C((t9f) arfVarArr[6].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        w1 w1Var;
        v1 v1Var;
        h8 h8Var;
        List list;
        t tVar;
        Integer num;
        t3 t3Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = x1.h;
        int i2 = 3;
        char c2 = 2;
        h8 h8Var2 = null;
        if (c.m()) {
            h8 h8Var3 = (h8) c.z(mhpVar, 0, h8.Companion.serializer(), null);
            List list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            t tVar2 = (t) c.z(mhpVar, 2, r.a, null);
            Integer num2 = (Integer) c.n(mhpVar, 3, cqe.a, null);
            t3 t3Var2 = (t3) c.n(mhpVar, 4, r3.a, null);
            v1 v1Var2 = (v1) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            w1Var = (w1) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            h8Var = h8Var3;
            num = num2;
            t3Var = t3Var2;
            tVar = tVar2;
            i = 127;
            v1Var = v1Var2;
            list = list2;
        } else {
            int i3 = 1;
            boolean z = true;
            int i4 = 0;
            w1 w1Var2 = null;
            v1 v1Var3 = null;
            List list3 = null;
            t tVar3 = null;
            Integer num3 = null;
            t3 t3Var3 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 3;
                        i3 = 1;
                    case 0:
                        h8Var2 = (h8) c.z(mhpVar, 0, h8.Companion.serializer(), h8Var2);
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
                        tVar3 = (t) c.z(mhpVar, 2, r.a, tVar3);
                        i4 |= 4;
                        c2 = 2;
                        i2 = 3;
                    case 3:
                        num3 = (Integer) c.n(mhpVar, i2, cqe.a, num3);
                        i4 |= 8;
                        c2 = 2;
                    case 4:
                        t3Var3 = (t3) c.n(mhpVar, 4, r3.a, t3Var3);
                        i4 |= 16;
                        c2 = 2;
                    case 5:
                        v1Var3 = (v1) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), v1Var3);
                        i4 |= 32;
                        c2 = 2;
                    case 6:
                        w1Var2 = (w1) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), w1Var2);
                        i4 |= 64;
                        c2 = 2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i4;
            w1Var = w1Var2;
            v1Var = v1Var3;
            h8Var = h8Var2;
            list = list3;
            tVar = tVar3;
            num = num3;
            t3Var = t3Var3;
        }
        c.b(mhpVar);
        return new x1(i, h8Var, list, tVar, num, t3Var, v1Var, w1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x1 x1Var = (x1) obj;
        l6bVar.getClass();
        x1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = x1.h;
        t9f serializer = h8.Companion.serializer();
        h8 h8Var = x1Var.a;
        w1 w1Var = x1Var.g;
        v1 v1Var = x1Var.f;
        t3 t3Var = x1Var.e;
        Integer num = x1Var.d;
        c.k(mhpVar, 0, serializer, h8Var);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), x1Var.b);
        c.k(mhpVar, 2, r.a, x1Var.c);
        if (c.e(mhpVar) || num != null) {
            c.q(mhpVar, 3, cqe.a, num);
        }
        if (c.e(mhpVar) || t3Var != null) {
            c.q(mhpVar, 4, r3.a, t3Var);
        }
        if (c.e(mhpVar) || v1Var != null) {
            c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), v1Var);
        }
        if (c.e(mhpVar) || w1Var != null) {
            c.q(mhpVar, 6, (t9f) arfVarArr[6].getValue(), w1Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
