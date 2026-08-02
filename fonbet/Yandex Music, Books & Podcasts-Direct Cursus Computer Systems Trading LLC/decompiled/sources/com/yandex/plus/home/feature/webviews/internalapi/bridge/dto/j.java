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
public final /* synthetic */ class j implements p3d {
    public static final j a;

    @NotNull
    private static final mhp descriptor;

    static {
        j jVar = new j();
        a = jVar;
        j5m j5mVar = new j5m("CHANGE_OPTION_STATUS_RESPONSE", jVar, 6);
        j5mVar.k("trackId", false);
        j5mVar.k("optionId", false);
        j5mVar.k("currentStatus", false);
        j5mVar.k("disabled", false);
        j5mVar.k("show", false);
        j5mVar.k("errorMessage", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        t9f C = ff7.C(tkrVar);
        oc3 oc3Var = oc3.a;
        return new t9f[]{C, tkrVar, ff7.C(oc3Var), oc3Var, oc3Var, ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        boolean z;
        boolean z2;
        String str;
        String str2;
        Boolean bool;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 5;
        boolean z3 = false;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 0, tkrVar, null);
            String g = c.g(mhpVar, 1);
            Boolean bool2 = (Boolean) c.n(mhpVar, 2, oc3.a, null);
            boolean D = c.D(mhpVar, 3);
            boolean D2 = c.D(mhpVar, 4);
            str3 = (String) c.n(mhpVar, 5, tkrVar, null);
            i = 63;
            z = D;
            z2 = D2;
            bool = bool2;
            str2 = g;
            str = str4;
        } else {
            boolean z4 = true;
            int i3 = 0;
            boolean z5 = false;
            String str5 = null;
            String str6 = null;
            Boolean bool3 = null;
            String str7 = null;
            boolean z6 = false;
            while (z4) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z4 = z3;
                        i2 = 5;
                    case 0:
                        str5 = (String) c.n(mhpVar, 0, tkr.a, str5);
                        i3 |= 1;
                        z3 = false;
                        i2 = 5;
                    case 1:
                        str6 = c.g(mhpVar, 1);
                        i3 |= 2;
                        z3 = false;
                    case 2:
                        bool3 = (Boolean) c.n(mhpVar, 2, oc3.a, bool3);
                        i3 |= 4;
                        z3 = false;
                    case 3:
                        z6 = c.D(mhpVar, 3);
                        i3 |= 8;
                        z3 = false;
                    case 4:
                        z5 = c.D(mhpVar, 4);
                        i3 |= 16;
                        z3 = false;
                    case 5:
                        str7 = (String) c.n(mhpVar, i2, tkr.a, str7);
                        i3 |= 32;
                        z3 = false;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            z = z6;
            z2 = z5;
            str = str5;
            str2 = str6;
            bool = bool3;
            str3 = str7;
        }
        c.b(mhpVar);
        return new l(i, str, str2, bool, z, z2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l lVar = (l) obj;
        l6bVar.getClass();
        lVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, lVar.a);
        c.p(mhpVar, 1, lVar.b);
        c.q(mhpVar, 2, oc3.a, lVar.c);
        c.j(mhpVar, 3, lVar.d);
        c.j(mhpVar, 4, lVar.e);
        c.q(mhpVar, 5, tkrVar, lVar.f);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
