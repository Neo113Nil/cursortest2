package com.yandex.passport.data.network;

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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class u6 implements p3d {
    public static final u6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        u6 u6Var = new u6();
        a = u6Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetDeviceCodeRequest.Result", u6Var, 5);
        j5mVar.k("device_code", false);
        j5mVar.k("user_code", false);
        j5mVar.k("verification_url", true);
        j5mVar.k("interval", false);
        j5mVar.k("expires_in", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        t9f C = ff7.C(tkrVar);
        cqe cqeVar = cqe.a;
        return new t9f[]{tkrVar, tkrVar, C, cqeVar, cqeVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String str4 = (String) c.n(mhpVar, 2, tkr.a, null);
            str = g;
            i = c.k(mhpVar, 3);
            i2 = c.k(mhpVar, 4);
            str3 = str4;
            str2 = g2;
            i3 = 31;
        } else {
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            int i6 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str5 = c.g(mhpVar, 0);
                    i5 |= 1;
                } else if (w == 1) {
                    str6 = c.g(mhpVar, 1);
                    i5 |= 2;
                } else if (w == 2) {
                    str7 = (String) c.n(mhpVar, 2, tkr.a, str7);
                    i5 |= 4;
                } else if (w == 3) {
                    i4 = c.k(mhpVar, 3);
                    i5 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    i6 = c.k(mhpVar, 4);
                    i5 |= 16;
                }
            }
            i = i4;
            i2 = i6;
            i3 = i5;
            str = str5;
            str2 = str6;
            str3 = str7;
        }
        c.b(mhpVar);
        return new w6(i3, str, str2, str3, i, i2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w6 w6Var = (w6) obj;
        l6bVar.getClass();
        w6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = w6Var.a;
        int i = w6Var.e;
        String str2 = w6Var.c;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, w6Var.b);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        c.A(3, w6Var.d, mhpVar);
        if (c.e(mhpVar) || i != Integer.MAX_VALUE) {
            c.A(4, i, mhpVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
