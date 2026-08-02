package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.arf;
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
public final /* synthetic */ class q0 implements p3d {
    public static final q0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        q0 q0Var = new q0();
        a = q0Var;
        j5m j5mVar = new j5m("PURCHASE_PRODUCT_RESPONSE", q0Var, 5);
        j5mVar.k("trackId", false);
        j5mVar.k("purchaseType", false);
        j5mVar.k("status", false);
        j5mVar.k("errorType", false);
        j5mVar.k("errorMessage", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = s0.f;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), arfVarArr[1].getValue(), arfVarArr[2].getValue(), ff7.C((t9f) arfVarArr[3].getValue()), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0 i0Var;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0 g0Var;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = s0.f;
        String str3 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 0, tkrVar, null);
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0 i0Var2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            g0Var = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str2 = (String) c.n(mhpVar, 4, tkrVar, null);
            i = 31;
            i0Var = i0Var2;
            k0Var = k0Var2;
            str = str4;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var3 = null;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0 i0Var3 = null;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0 g0Var2 = null;
            String str5 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else if (w == 1) {
                    k0Var3 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), k0Var3);
                    i2 |= 2;
                } else if (w == 2) {
                    i0Var3 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), i0Var3);
                    i2 |= 4;
                } else if (w == 3) {
                    g0Var2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), g0Var2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str5 = (String) c.n(mhpVar, 4, tkr.a, str5);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str3;
            k0Var = k0Var3;
            i0Var = i0Var3;
            g0Var = g0Var2;
            str2 = str5;
        }
        c.b(mhpVar);
        return new s0(i, str, k0Var, i0Var, g0Var, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        s0 s0Var = (s0) obj;
        l6bVar.getClass();
        s0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = s0.f;
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, s0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), s0Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), s0Var.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), s0Var.d);
        c.q(mhpVar, 4, tkrVar, s0Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
