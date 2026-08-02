package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class q4 implements p3d {
    public static final q4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        q4 q4Var = new q4();
        a = q4Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ShapeSettingsDto", q4Var, 4);
        j5mVar.k("leftTopCorner", false);
        j5mVar.k("rightTopCorner", false);
        j5mVar.k("leftBottomCorner", false);
        j5mVar.k("rightBottomCorner", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = z4.e;
        return new t9f[]{ff7.C((t9f) arfVarArr[0].getValue()), ff7.C((t9f) arfVarArr[1].getValue()), ff7.C((t9f) arfVarArr[2].getValue()), ff7.C((t9f) arfVarArr[3].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        y4 y4Var;
        y4 y4Var2;
        y4 y4Var3;
        y4 y4Var4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = z4.e;
        y4 y4Var5 = null;
        if (c.m()) {
            y4 y4Var6 = (y4) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            y4 y4Var7 = (y4) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            y4 y4Var8 = (y4) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            y4Var4 = (y4) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            y4Var = y4Var6;
            i = 15;
            y4Var3 = y4Var8;
            y4Var2 = y4Var7;
        } else {
            boolean z = true;
            int i2 = 0;
            y4 y4Var9 = null;
            y4 y4Var10 = null;
            y4 y4Var11 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    y4Var5 = (y4) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), y4Var5);
                    i2 |= 1;
                } else if (w == 1) {
                    y4Var9 = (y4) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), y4Var9);
                    i2 |= 2;
                } else if (w == 2) {
                    y4Var10 = (y4) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), y4Var10);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    y4Var11 = (y4) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), y4Var11);
                    i2 |= 8;
                }
            }
            i = i2;
            y4Var = y4Var5;
            y4Var2 = y4Var9;
            y4Var3 = y4Var10;
            y4Var4 = y4Var11;
        }
        c.b(mhpVar);
        return new z4(i, y4Var, y4Var2, y4Var3, y4Var4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        z4 z4Var = (z4) obj;
        l6bVar.getClass();
        z4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = z4.e;
        c.q(mhpVar, 0, (t9f) arfVarArr[0].getValue(), z4Var.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), z4Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), z4Var.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), z4Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
