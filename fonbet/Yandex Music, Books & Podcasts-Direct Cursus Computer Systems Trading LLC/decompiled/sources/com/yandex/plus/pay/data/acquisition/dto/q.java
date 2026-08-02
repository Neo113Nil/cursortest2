package com.yandex.plus.pay.data.acquisition.dto;

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
public final /* synthetic */ class q implements p3d {
    public static final q a;

    @NotNull
    private static final mhp descriptor;

    static {
        q qVar = new q();
        a = qVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOfferAssetsDto", qVar, 3);
        j5mVar.k("buttonText", false);
        j5mVar.k("buttonTextWithDetails", false);
        j5mVar.k("subscriptionName", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        String str2;
        String str3;
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str3 = c.g(mhpVar, 1);
            str2 = c.g(mhpVar, 2);
            i = 7;
        } else {
            str = null;
            String str4 = null;
            String str5 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = c.g(mhpVar, 2);
                    i2 |= 4;
                }
            }
            str2 = str4;
            str3 = str5;
            i = i2;
        }
        c.b(mhpVar);
        return new s(str, i, str3, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        s sVar = (s) obj;
        l6bVar.getClass();
        sVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, sVar.a);
        c.p(mhpVar, 1, sVar.b);
        c.p(mhpVar, 2, sVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
