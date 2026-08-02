package com.yandex.passport.data.network;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements p3d {
    public static final g0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        g0 g0Var = new g0();
        a = g0Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.CheckAgeByTrackIdRequest.Result", g0Var, 2);
        j5mVar.k("is_face_recognized", false);
        j5mVar.k("is_flow_successful", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        oc3 oc3Var = oc3.a;
        return new t9f[]{oc3Var, oc3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            z = c.D(mhpVar, 0);
            z2 = c.D(mhpVar, 1);
            i = 3;
        } else {
            boolean z3 = true;
            z = false;
            boolean z4 = false;
            int i2 = 0;
            while (z3) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z3 = false;
                } else if (w == 0) {
                    z = c.D(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    z4 = c.D(mhpVar, 1);
                    i2 |= 2;
                }
            }
            z2 = z4;
            i = i2;
        }
        c.b(mhpVar);
        return new i0(i, z, z2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i0 i0Var = (i0) obj;
        l6bVar.getClass();
        i0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.j(mhpVar, 0, i0Var.a);
        c.j(mhpVar, 1, i0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
