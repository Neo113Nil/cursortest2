package com.yandex.passport.data.network;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements p3d {
    public static final d5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d5 d5Var = new d5();
        a = d5Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetConfigRequest.Backend.Location", d5Var, 5);
        j5mVar.k("location_id", false);
        j5mVar.k("mobileproxy", false);
        j5mVar.k("webam", false);
        j5mVar.k("webam_yandex", true);
        j5mVar.k("webam_id_yandex", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{mvg.a, tkrVar, tkrVar, ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str5 = null;
        if (c.m()) {
            long q = c.q(mhpVar, 0);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            tkr tkrVar = tkr.a;
            str = g;
            str3 = (String) c.n(mhpVar, 3, tkrVar, null);
            str4 = (String) c.n(mhpVar, 4, tkrVar, null);
            str2 = g2;
            i = 31;
            j = q;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            long j2 = 0;
            String str7 = null;
            String str8 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    j2 = c.q(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str7 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else if (w == 3) {
                    str8 = (String) c.n(mhpVar, 3, tkr.a, str8);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str6 = (String) c.n(mhpVar, 4, tkr.a, str6);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str5;
            str2 = str7;
            str3 = str8;
            str4 = str6;
            j = j2;
        }
        c.b(mhpVar);
        return new f5(i, j, str, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f5 f5Var = (f5) obj;
        l6bVar.getClass();
        f5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        long j = f5Var.a;
        String str = f5Var.e;
        String str2 = f5Var.d;
        c.g(mhpVar, 0, j);
        c.p(mhpVar, 1, f5Var.b);
        c.p(mhpVar, 2, f5Var.c);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 3, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 4, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
