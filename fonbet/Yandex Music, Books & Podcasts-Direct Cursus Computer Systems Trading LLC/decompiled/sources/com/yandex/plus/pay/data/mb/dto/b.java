package com.yandex.plus.pay.data.mb.dto;

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
public final /* synthetic */ class b implements p3d {
    public static final b a;

    @NotNull
    private static final mhp descriptor;

    static {
        b bVar = new b();
        a = bVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.ClosingOfferDto.ClosingOfferAsset", bVar, 4);
        j5mVar.k("title", false);
        j5mVar.k("price", false);
        j5mVar.k("icon", false);
        j5mVar.k("additionalButtonText", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        c3 c3Var = c3.a;
        return new t9f[]{c3Var, c3Var, a2.a, ff7.C(c3Var)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        j3 j3Var;
        j3 j3Var2;
        c2 c2Var;
        j3 j3Var3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        j3 j3Var4 = null;
        if (c.m()) {
            c3 c3Var = c3.a;
            j3 j3Var5 = (j3) c.z(mhpVar, 0, c3Var, null);
            j3 j3Var6 = (j3) c.z(mhpVar, 1, c3Var, null);
            c2 c2Var2 = (c2) c.z(mhpVar, 2, a2.a, null);
            j3Var3 = (j3) c.n(mhpVar, 3, c3Var, null);
            i = 15;
            c2Var = c2Var2;
            j3Var2 = j3Var6;
            j3Var = j3Var5;
        } else {
            boolean z = true;
            int i2 = 0;
            j3 j3Var7 = null;
            c2 c2Var3 = null;
            j3 j3Var8 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    j3Var4 = (j3) c.z(mhpVar, 0, c3.a, j3Var4);
                    i2 |= 1;
                } else if (w == 1) {
                    j3Var7 = (j3) c.z(mhpVar, 1, c3.a, j3Var7);
                    i2 |= 2;
                } else if (w == 2) {
                    c2Var3 = (c2) c.z(mhpVar, 2, a2.a, c2Var3);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    j3Var8 = (j3) c.n(mhpVar, 3, c3.a, j3Var8);
                    i2 |= 8;
                }
            }
            i = i2;
            j3Var = j3Var4;
            j3Var2 = j3Var7;
            c2Var = c2Var3;
            j3Var3 = j3Var8;
        }
        c.b(mhpVar);
        return new d(i, j3Var, j3Var2, c2Var, j3Var3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d dVar = (d) obj;
        l6bVar.getClass();
        dVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c3 c3Var = c3.a;
        j3 j3Var = dVar.a;
        j3 j3Var2 = dVar.d;
        c.k(mhpVar, 0, c3Var, j3Var);
        c.k(mhpVar, 1, c3Var, dVar.b);
        c.k(mhpVar, 2, a2.a, dVar.c);
        if (c.e(mhpVar) || j3Var2 != null) {
            c.q(mhpVar, 3, c3Var, j3Var2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
