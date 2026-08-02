package com.yandex.plus.home.datasource.openapi.models;

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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class r implements p3d {
    public static final r a;

    @NotNull
    private static final mhp descriptor;

    static {
        r rVar = new r();
        a = rVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkBackgroundShapeModel", rVar, 4);
        j5mVar.k("leftTopCorner", false);
        j5mVar.k("rightTopCorner", false);
        j5mVar.k("leftBottomCorner", false);
        j5mVar.k("rightBottomCorner", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        h1 h1Var = i1.Companion;
        return new t9f[]{h1Var.serializer(), h1Var.serializer(), h1Var.serializer(), h1Var.serializer()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        i1 i1Var;
        i1 i1Var2;
        i1 i1Var3;
        i1 i1Var4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        i1 i1Var5 = null;
        if (c.m()) {
            h1 h1Var = i1.Companion;
            i1 i1Var6 = (i1) c.z(mhpVar, 0, h1Var.serializer(), null);
            i1 i1Var7 = (i1) c.z(mhpVar, 1, h1Var.serializer(), null);
            i1 i1Var8 = (i1) c.z(mhpVar, 2, h1Var.serializer(), null);
            i1Var4 = (i1) c.z(mhpVar, 3, h1Var.serializer(), null);
            i = 15;
            i1Var3 = i1Var8;
            i1Var2 = i1Var7;
            i1Var = i1Var6;
        } else {
            boolean z = true;
            int i2 = 0;
            i1 i1Var9 = null;
            i1 i1Var10 = null;
            i1 i1Var11 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    i1Var5 = (i1) c.z(mhpVar, 0, i1.Companion.serializer(), i1Var5);
                    i2 |= 1;
                } else if (w == 1) {
                    i1Var9 = (i1) c.z(mhpVar, 1, i1.Companion.serializer(), i1Var9);
                    i2 |= 2;
                } else if (w == 2) {
                    i1Var10 = (i1) c.z(mhpVar, 2, i1.Companion.serializer(), i1Var10);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    i1Var11 = (i1) c.z(mhpVar, 3, i1.Companion.serializer(), i1Var11);
                    i2 |= 8;
                }
            }
            i = i2;
            i1Var = i1Var5;
            i1Var2 = i1Var9;
            i1Var3 = i1Var10;
            i1Var4 = i1Var11;
        }
        c.b(mhpVar);
        return new t(i, i1Var, i1Var2, i1Var3, i1Var4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t tVar = (t) obj;
        l6bVar.getClass();
        tVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        h1 h1Var = i1.Companion;
        c.k(mhpVar, 0, h1Var.serializer(), tVar.a);
        c.k(mhpVar, 1, h1Var.serializer(), tVar.b);
        c.k(mhpVar, 2, h1Var.serializer(), tVar.c);
        c.k(mhpVar, 3, h1Var.serializer(), tVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
