package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

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
public final /* synthetic */ class j1 implements p3d {
    public static final j1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        j1 j1Var = new j1();
        a = j1Var;
        j5m j5mVar = new j5m("USER_CARDS_RESPONSE", j1Var, 2);
        j5mVar.k("trackId", false);
        j5mVar.k("defaultCard", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(tkr.a), ff7.C(l1.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        n1 n1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            n1Var = (n1) c.n(mhpVar, 1, l1.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            n1 n1Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    n1Var2 = (n1) c.n(mhpVar, 1, l1.a, n1Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            n1Var = n1Var2;
        }
        c.b(mhpVar);
        return new o1(i, str, n1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o1 o1Var = (o1) obj;
        l6bVar.getClass();
        o1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, tkr.a, o1Var.a);
        c.q(mhpVar, 1, l1.a, o1Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
