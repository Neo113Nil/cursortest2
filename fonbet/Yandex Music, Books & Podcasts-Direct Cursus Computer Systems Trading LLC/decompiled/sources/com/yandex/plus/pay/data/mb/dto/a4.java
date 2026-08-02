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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class a4 implements p3d {
    public static final a4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        a4 a4Var = new a4();
        a = a4Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.TopupScreenDto.WidgetUrl", a4Var, 3);
        j5mVar.k("lightTheme", false);
        j5mVar.k("darkTheme", false);
        j5mVar.k("widgetPollingParameters", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f C = ff7.C(x3.a);
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, C};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        z3 z3Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str3 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            z3Var = (z3) c.n(mhpVar, 2, x3.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            z3 z3Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    z3Var2 = (z3) c.n(mhpVar, 2, x3.a, z3Var2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            z3Var = z3Var2;
        }
        c.b(mhpVar);
        return new c4(i, str, str2, z3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c4 c4Var = (c4) obj;
        l6bVar.getClass();
        c4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, c4Var.a);
        c.p(mhpVar, 1, c4Var.b);
        c.q(mhpVar, 2, x3.a, c4Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
