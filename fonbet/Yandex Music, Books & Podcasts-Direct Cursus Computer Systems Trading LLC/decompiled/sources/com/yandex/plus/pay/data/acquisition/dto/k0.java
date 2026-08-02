package com.yandex.plus.pay.data.acquisition.dto;

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
public final /* synthetic */ class k0 implements p3d {
    public static final k0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k0 k0Var = new k0();
        a = k0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionSmartOffersBatchDto.SmartOffer.Analytics", k0Var, 3);
        j5mVar.k("batchId", false);
        j5mVar.k("positionId", false);
        j5mVar.k("placeId", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str4 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            str3 = (String) c.n(mhpVar, 2, tkr.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str6 = (String) c.n(mhpVar, 2, tkr.a, str6);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        c.b(mhpVar);
        return new m0(str, i, str2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m0 m0Var = (m0) obj;
        l6bVar.getClass();
        m0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = m0Var.a;
        String str2 = m0Var.c;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, m0Var.b);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
