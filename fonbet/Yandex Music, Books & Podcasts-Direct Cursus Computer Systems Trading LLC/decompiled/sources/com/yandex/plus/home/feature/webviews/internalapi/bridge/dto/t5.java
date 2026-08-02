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
public final /* synthetic */ class t5 implements p3d {
    public static final t5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        t5 t5Var = new t5();
        a = t5Var;
        j5m j5mVar = new j5m("SUCCESS_SCREEN_BUTTON_TAPPED", t5Var, 2);
        j5mVar.k("trackId", true);
        j5mVar.k("offerType", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(tkr.a), ff7.C((t9f) v5.c[1].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = v5.c;
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            bVar = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar2 = null;
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
                    bVar2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), bVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            bVar = bVar2;
        }
        c.b(mhpVar);
        return new v5(i, str, bVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v5 v5Var = (v5) obj;
        l6bVar.getClass();
        v5Var.getClass();
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar = v5Var.b;
        String str = v5Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = v5.c;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        if (c.e(mhpVar) || bVar != null) {
            c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), bVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
