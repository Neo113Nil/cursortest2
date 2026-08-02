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
public final /* synthetic */ class f0 implements p3d {
    public static final f0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        f0 f0Var = new f0();
        a = f0Var;
        j5m j5mVar = new j5m("PURCHASE_PRODUCT_AUTOSTART", f0Var, 3);
        j5mVar.k("trackId", false);
        j5mVar.k("purchaseType", false);
        j5mVar.k("offerType", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = h0.d;
        return new t9f[]{ff7.C(tkr.a), arfVarArr[1].getValue(), arfVarArr[2].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = h0.d;
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            k0Var = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            bVar = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0 k0Var2 = null;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else if (w == 1) {
                    k0Var2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), k0Var2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    bVar2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), bVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            k0Var = k0Var2;
            bVar = bVar2;
        }
        c.b(mhpVar);
        return new h0(i, str, k0Var, bVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h0 h0Var = (h0) obj;
        l6bVar.getClass();
        h0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = h0.d;
        c.q(mhpVar, 0, tkr.a, h0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), h0Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), h0Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
