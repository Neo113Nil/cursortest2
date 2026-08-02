package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

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

/* loaded from: classes5.dex */
public final /* synthetic */ class v implements p3d {
    public static final v a;

    @NotNull
    private static final mhp descriptor;

    static {
        v vVar = new v();
        a = vVar;
        j5m j5mVar = new j5m("OPTION_RESPONSE", vVar, 5);
        j5mVar.k("trackId", false);
        j5mVar.k("optionId", false);
        j5mVar.k("currentStatus", false);
        j5mVar.k("disabled", false);
        j5mVar.k("show", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        t9f C = ff7.C(tkrVar);
        oc3 oc3Var = oc3.a;
        return new t9f[]{C, tkrVar, ff7.C(oc3Var), oc3Var, oc3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        int i;
        String str;
        String str2;
        Boolean bool;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            String str3 = (String) c.n(mhpVar, 0, tkr.a, null);
            String g = c.g(mhpVar, 1);
            Boolean bool2 = (Boolean) c.n(mhpVar, 2, oc3.a, null);
            str = str3;
            z = c.D(mhpVar, 3);
            z2 = c.D(mhpVar, 4);
            bool = bool2;
            str2 = g;
            i = 31;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i2 = 0;
            String str4 = null;
            String str5 = null;
            Boolean bool3 = null;
            boolean z5 = false;
            while (z3) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z3 = false;
                } else if (w == 0) {
                    str4 = (String) c.n(mhpVar, 0, tkr.a, str4);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    bool3 = (Boolean) c.n(mhpVar, 2, oc3.a, bool3);
                    i2 |= 4;
                } else if (w == 3) {
                    z4 = c.D(mhpVar, 3);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    z5 = c.D(mhpVar, 4);
                    i2 |= 16;
                }
            }
            z = z4;
            z2 = z5;
            i = i2;
            str = str4;
            str2 = str5;
            bool = bool3;
        }
        c.b(mhpVar);
        return new x(i, str, str2, bool, z, z2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x xVar = (x) obj;
        l6bVar.getClass();
        xVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, tkr.a, xVar.a);
        c.p(mhpVar, 1, xVar.b);
        c.q(mhpVar, 2, oc3.a, xVar.c);
        c.j(mhpVar, 3, xVar.d);
        c.j(mhpVar, 4, xVar.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
