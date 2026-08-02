package com.yandex.passport.sloth.command.data;

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
public final /* synthetic */ class u0 implements p3d {
    public static final u0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        u0 u0Var = new u0();
        a = u0Var;
        j5m j5mVar = new j5m("com.yandex.passport.sloth.command.data.SetEbsAgeConfirmStateData", u0Var, 4);
        j5mVar.k("type", false);
        j5mVar.k("application", true);
        j5mVar.k("consumer", true);
        j5mVar.k("scope", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str5 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            tkr tkrVar = tkr.a;
            String str6 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str7 = (String) c.n(mhpVar, 2, tkrVar, null);
            str = g;
            str4 = (String) c.n(mhpVar, 3, tkrVar, null);
            str3 = str7;
            str2 = str6;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str5 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str8 = (String) c.n(mhpVar, 1, tkr.a, str8);
                    i2 |= 2;
                } else if (w == 2) {
                    str9 = (String) c.n(mhpVar, 2, tkr.a, str9);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str10 = (String) c.n(mhpVar, 3, tkr.a, str10);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str5;
            str2 = str8;
            str3 = str9;
            str4 = str10;
        }
        c.b(mhpVar);
        return new w0(i, str, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w0 w0Var = (w0) obj;
        l6bVar.getClass();
        w0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = w0Var.a;
        String str2 = w0Var.d;
        String str3 = w0Var.c;
        String str4 = w0Var.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || str4 != null) {
            c.q(mhpVar, 1, tkr.a, str4);
        }
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 2, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 3, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
