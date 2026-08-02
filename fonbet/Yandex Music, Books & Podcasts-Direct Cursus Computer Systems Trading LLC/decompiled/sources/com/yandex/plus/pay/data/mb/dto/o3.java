package com.yandex.plus.pay.data.mb.dto;

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

/* loaded from: classes5.dex */
public final /* synthetic */ class o3 implements p3d {
    public static final o3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        o3 o3Var = new o3();
        a = o3Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto.SynchronizationStateDto", o3Var, 4);
        j5mVar.k("ottSubscriptionSync", true);
        j5mVar.k("featuresSync", true);
        j5mVar.k("familyRoleSync", true);
        j5mVar.k("totalSync", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        oc3 oc3Var = oc3.a;
        return new t9f[]{oc3Var, oc3Var, oc3Var, oc3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            z = c.D(mhpVar, 0);
            boolean D = c.D(mhpVar, 1);
            boolean D2 = c.D(mhpVar, 2);
            z2 = c.D(mhpVar, 3);
            z3 = D2;
            z4 = D;
            i = 15;
        } else {
            boolean z5 = true;
            z = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i2 = 0;
            while (z5) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z5 = false;
                } else if (w == 0) {
                    z = c.D(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    z8 = c.D(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    z7 = c.D(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    z6 = c.D(mhpVar, 3);
                    i2 |= 8;
                }
            }
            z2 = z6;
            z3 = z7;
            z4 = z8;
            i = i2;
        }
        boolean z9 = z;
        c.b(mhpVar);
        return new q3(i, z9, z4, z3, z2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q3 q3Var = (q3) obj;
        l6bVar.getClass();
        q3Var.getClass();
        boolean z = q3Var.d;
        boolean z2 = q3Var.c;
        boolean z3 = q3Var.b;
        boolean z4 = q3Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || !z4) {
            c.j(mhpVar, 0, z4);
        }
        if (c.e(mhpVar) || !z3) {
            c.j(mhpVar, 1, z3);
        }
        if (c.e(mhpVar) || !z2) {
            c.j(mhpVar, 2, z2);
        }
        if (c.e(mhpVar) || !z) {
            c.j(mhpVar, 3, z);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
