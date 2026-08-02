package com.yandex.passport.data.network;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements p3d {
    public static final d1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d1 d1Var = new d1();
        a = d1Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.CompleteStatusRequest.Result", d1Var, 6);
        j5mVar.k("status", false);
        j5mVar.k("is_complete", true);
        j5mVar.k("is_completion_available", true);
        j5mVar.k("is_completion_recommended", true);
        j5mVar.k("is_completion_required", true);
        j5mVar.k("completion_url", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        t9f C = ff7.C(tkrVar);
        oc3 oc3Var = oc3.a;
        return new t9f[]{tkrVar, oc3Var, oc3Var, oc3Var, oc3Var, C};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 0;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            boolean D = c.D(mhpVar, 1);
            boolean D2 = c.D(mhpVar, 2);
            boolean D3 = c.D(mhpVar, 3);
            boolean D4 = c.D(mhpVar, 4);
            str = g;
            str2 = (String) c.n(mhpVar, 5, tkr.a, null);
            z = D3;
            z2 = D4;
            z3 = D2;
            z4 = D;
            i = 63;
        } else {
            int i3 = 1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i4 = 0;
            String str3 = null;
            String str4 = null;
            boolean z8 = false;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        i3 = i2;
                        continue;
                    case 0:
                        str3 = c.g(mhpVar, i2);
                        i4 |= 1;
                        continue;
                    case 1:
                        z7 = c.D(mhpVar, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        z6 = c.D(mhpVar, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        z5 = c.D(mhpVar, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        z8 = c.D(mhpVar, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        str4 = (String) c.n(mhpVar, 5, tkr.a, str4);
                        i4 |= 32;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 0;
            }
            z = z5;
            z2 = z8;
            z3 = z6;
            z4 = z7;
            i = i4;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new f1(i, str, z4, z3, z, z2, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f1 f1Var = (f1) obj;
        l6bVar.getClass();
        f1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = f1Var.a;
        String str2 = f1Var.f;
        boolean z = f1Var.e;
        boolean z2 = f1Var.d;
        boolean z3 = f1Var.c;
        boolean z4 = f1Var.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || z4) {
            c.j(mhpVar, 1, z4);
        }
        if (c.e(mhpVar) || z3) {
            c.j(mhpVar, 2, z3);
        }
        if (c.e(mhpVar) || z2) {
            c.j(mhpVar, 3, z2);
        }
        if (c.e(mhpVar) || z) {
            c.j(mhpVar, 4, z);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 5, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
