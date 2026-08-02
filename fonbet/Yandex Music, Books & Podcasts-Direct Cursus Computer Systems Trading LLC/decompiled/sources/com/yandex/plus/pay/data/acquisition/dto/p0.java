package com.yandex.plus.pay.data.acquisition.dto;

import com.connectsdk.service.airplay.PListParser;
import defpackage.eg7;
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
public final /* synthetic */ class p0 implements p3d {
    public static final p0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p0 p0Var = new p0();
        a = p0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionSmartOffersBatchDto.SmartOffer.Legals.Argument", p0Var, 2);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, r0.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        t0 t0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            t0Var = (t0) c.z(mhpVar, 1, r0.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            t0 t0Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    t0Var2 = (t0) c.z(mhpVar, 1, r0.a, t0Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            t0Var = t0Var2;
        }
        c.b(mhpVar);
        return new u0(i, str, t0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u0 u0Var = (u0) obj;
        l6bVar.getClass();
        u0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, u0Var.a);
        c.k(mhpVar, 1, r0.a, u0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
