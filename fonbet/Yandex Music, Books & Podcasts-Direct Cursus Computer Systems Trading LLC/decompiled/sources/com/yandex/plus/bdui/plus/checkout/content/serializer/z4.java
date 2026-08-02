package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
public final /* synthetic */ class z4 implements p3d {
    public static final z4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        z4 z4Var = new z4();
        a = z4Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayPollingContentSerializer.DataDto", z4Var, 5);
        j5mVar.k("title", false);
        j5mVar.k("subtitle", false);
        j5mVar.k("firstPaymentText", false);
        j5mVar.k("nextPaymentText", false);
        j5mVar.k("footerText", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str6 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            tkr tkrVar = tkr.a;
            String str7 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str8 = (String) c.n(mhpVar, 2, tkrVar, null);
            str = g;
            str4 = (String) c.n(mhpVar, 3, tkrVar, null);
            str5 = (String) c.n(mhpVar, 4, tkrVar, null);
            str3 = str8;
            str2 = str7;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str6 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str9 = (String) c.n(mhpVar, 1, tkr.a, str9);
                    i2 |= 2;
                } else if (w == 2) {
                    str10 = (String) c.n(mhpVar, 2, tkr.a, str10);
                    i2 |= 4;
                } else if (w == 3) {
                    str11 = (String) c.n(mhpVar, 3, tkr.a, str11);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str12 = (String) c.n(mhpVar, 4, tkr.a, str12);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str6;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str12;
        }
        c.b(mhpVar);
        return new b5(i, str, str2, str3, str4, str5);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        b5 b5Var = (b5) obj;
        l6bVar.getClass();
        b5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, b5Var.a);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 1, tkrVar, b5Var.b);
        c.q(mhpVar, 2, tkrVar, b5Var.c);
        c.q(mhpVar, 3, tkrVar, b5Var.d);
        c.q(mhpVar, 4, tkrVar, b5Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
