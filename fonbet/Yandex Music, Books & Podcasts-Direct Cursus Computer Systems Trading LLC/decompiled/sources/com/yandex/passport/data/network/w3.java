package com.yandex.passport.data.network;

import defpackage.cqe;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements p3d {
    public static final w3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        w3 w3Var = new w3();
        a = w3Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetChildCodeByUidParentRequest.Response", w3Var, 3);
        j5mVar.k("status", false);
        j5mVar.k("authorization_code", false);
        j5mVar.k("expires_in", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        int i;
        String str2;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            i = c.k(mhpVar, 2);
            i2 = 7;
        } else {
            str = null;
            String str3 = null;
            boolean z = true;
            int i3 = 0;
            int i4 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i4 |= 1;
                } else if (w == 1) {
                    str3 = c.g(mhpVar, 1);
                    i4 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    i3 = c.k(mhpVar, 2);
                    i4 |= 4;
                }
            }
            i = i3;
            str2 = str3;
            i2 = i4;
        }
        c.b(mhpVar);
        return new y3(i2, i, str, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        y3 y3Var = (y3) obj;
        l6bVar.getClass();
        y3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = y3Var.a;
        int i = y3Var.c;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, y3Var.b);
        if (c.e(mhpVar) || i != Integer.MAX_VALUE) {
            c.A(2, i, mhpVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
