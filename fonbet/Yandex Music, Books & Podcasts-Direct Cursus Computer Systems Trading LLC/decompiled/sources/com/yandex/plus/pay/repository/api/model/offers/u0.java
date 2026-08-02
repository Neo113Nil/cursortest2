package com.yandex.plus.pay.repository.api.model.offers;

import com.connectsdk.service.airplay.PListParser;
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
public final /* synthetic */ class u0 implements p3d {
    public static final u0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        u0 u0Var = new u0();
        a = u0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.repository.api.model.offers.RichText.Item.Icon", u0Var, 4);
        j5mVar.k("altText", false);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("data", true);
        j5mVar.k("image", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, ff7.C(tkrVar), com.yandex.plus.core.data.common.w.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        com.yandex.plus.core.data.common.y yVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String str5 = (String) c.n(mhpVar, 2, tkr.a, null);
            str = g;
            yVar = (com.yandex.plus.core.data.common.y) c.z(mhpVar, 3, com.yandex.plus.core.data.common.w.a, null);
            str3 = str5;
            str2 = g2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            com.yandex.plus.core.data.common.y yVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str6 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str7 = (String) c.n(mhpVar, 2, tkr.a, str7);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    yVar2 = (com.yandex.plus.core.data.common.y) c.z(mhpVar, 3, com.yandex.plus.core.data.common.w.a, yVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            str3 = str7;
            yVar = yVar2;
        }
        c.b(mhpVar);
        return new x0(i, str, str2, str3, yVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x0 x0Var = (x0) obj;
        l6bVar.getClass();
        x0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = x0Var.b;
        String str2 = x0Var.d;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, x0Var.c);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        c.k(mhpVar, 3, com.yandex.plus.core.data.common.w.a, x0Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
