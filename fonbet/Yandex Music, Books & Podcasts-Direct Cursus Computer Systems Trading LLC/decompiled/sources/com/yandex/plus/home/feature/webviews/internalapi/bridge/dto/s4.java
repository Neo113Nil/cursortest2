package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.arf;
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
public final /* synthetic */ class s4 implements p3d {
    public static final s4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        s4 s4Var = new s4();
        a = s4Var;
        j5m j5mVar = new j5m("PURCHASE_PRODUCT_REQUEST", s4Var, 5);
        j5mVar.k("trackId", true);
        j5mVar.k("purchaseType", false);
        j5mVar.k("productId", false);
        j5mVar.k("target", true);
        j5mVar.k("forceSelectCard", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = u4.f;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), arfVarArr[1].getValue(), tkrVar, ff7.C(tkrVar), ff7.C(oc3.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var;
        String str2;
        String str3;
        Boolean bool;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = u4.f;
        String str4 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str5 = (String) c.n(mhpVar, 0, tkrVar, null);
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String g = c.g(mhpVar, 2);
            k0Var = k0Var2;
            str3 = (String) c.n(mhpVar, 3, tkrVar, null);
            bool = (Boolean) c.n(mhpVar, 4, oc3.a, null);
            i = 31;
            str2 = g;
            str = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var3 = null;
            String str6 = null;
            String str7 = null;
            Boolean bool2 = null;
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
                    str6 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else if (w == 3) {
                    str7 = (String) c.n(mhpVar, 3, tkr.a, str7);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    bool2 = (Boolean) c.n(mhpVar, 4, oc3.a, bool2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str4;
            k0Var = k0Var3;
            str2 = str6;
            str3 = str7;
            bool = bool2;
        }
        c.b(mhpVar);
        return new u4(i, str, k0Var, str2, str3, bool);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u4 u4Var = (u4) obj;
        l6bVar.getClass();
        u4Var.getClass();
        String str = u4Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = u4.f;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        t9f t9fVar = (t9f) arfVarArr[1].getValue();
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var = u4Var.b;
        Boolean bool = u4Var.e;
        String str2 = u4Var.d;
        c.k(mhpVar, 1, t9fVar, k0Var);
        c.p(mhpVar, 2, u4Var.c);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 3, tkr.a, str2);
        }
        if (c.e(mhpVar) || bool != null) {
            c.q(mhpVar, 4, oc3.a, bool);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
