package com.yandex.plus.pay.repository.api.model.offers;

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
public final /* synthetic */ class y0 implements p3d {
    public static final y0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        y0 y0Var = new y0();
        a = y0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.repository.api.model.offers.RichText.Item.Link", y0Var, 4);
        j5mVar.k("altText", false);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("data", false);
        j5mVar.k("link", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            str2 = c.g(mhpVar, 3);
            str3 = g2;
            str4 = g;
            i = 15;
        } else {
            str = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
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
                    str7 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str6 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str5 = c.g(mhpVar, 3);
                    i2 |= 8;
                }
            }
            str2 = str5;
            str3 = str6;
            str4 = str7;
            i = i2;
        }
        String str8 = str;
        c.b(mhpVar);
        return new a1(i, str8, str4, str3, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        a1 a1Var = (a1) obj;
        l6bVar.getClass();
        a1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, a1Var.b);
        c.p(mhpVar, 1, a1Var.c);
        c.p(mhpVar, 2, a1Var.d);
        c.p(mhpVar, 3, a1Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
