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
public final /* synthetic */ class t0 implements p3d {
    public static final t0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        t0 t0Var = new t0();
        a = t0Var;
        j5m j5mVar = new j5m("PURCHASE_PRODUCT_RESULT", t0Var, 5);
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
        arf[] arfVarArr = v0.f;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), arfVarArr[1].getValue(), arfVarArr[2].getValue(), ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0 i0Var;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = v0.f;
        String str4 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str5 = (String) c.n(mhpVar, 0, tkrVar, null);
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0 i0Var2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            String str6 = (String) c.n(mhpVar, 3, tkrVar, null);
            i0Var = i0Var2;
            str3 = (String) c.n(mhpVar, 4, tkrVar, null);
            str2 = str6;
            i = 31;
            k0Var = k0Var2;
            str = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var3 = null;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0 i0Var3 = null;
            String str7 = null;
            String str8 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = (String) c.n(mhpVar, 0, tkr.a, str4);
                    i2 |= 1;
                } else if (w == 1) {
                    k0Var3 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), k0Var3);
                    i2 |= 2;
                } else if (w == 2) {
                    i0Var3 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), i0Var3);
                    i2 |= 4;
                } else if (w == 3) {
                    str7 = (String) c.n(mhpVar, 3, tkr.a, str7);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str8 = (String) c.n(mhpVar, 4, tkr.a, str8);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str4;
            k0Var = k0Var3;
            i0Var = i0Var3;
            str2 = str7;
            str3 = str8;
        }
        c.b(mhpVar);
        return new v0(i, str, k0Var, i0Var, str2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v0 v0Var = (v0) obj;
        l6bVar.getClass();
        v0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = v0.f;
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, v0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), v0Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), v0Var.c);
        c.q(mhpVar, 3, tkrVar, v0Var.d);
        c.q(mhpVar, 4, tkrVar, v0Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
