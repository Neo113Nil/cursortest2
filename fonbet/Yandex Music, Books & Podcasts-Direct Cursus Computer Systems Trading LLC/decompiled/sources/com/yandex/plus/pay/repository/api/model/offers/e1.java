package com.yandex.plus.pay.repository.api.model.offers;

import com.connectsdk.service.airplay.PListParser;
import defpackage.arf;
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
public final /* synthetic */ class e1 implements p3d {
    public static final e1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e1 e1Var = new e1();
        a = e1Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.repository.api.model.offers.RichText.Item.TextColor", e1Var, 4);
        j5mVar.k("altText", false);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("data", false);
        j5mVar.k("color", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = g1.f;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, arfVarArr[3].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        com.yandex.plus.core.data.common.v vVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g1.f;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            vVar = (com.yandex.plus.core.data.common.v) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            str3 = g3;
            i = 15;
            str2 = g2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            com.yandex.plus.core.data.common.v vVar2 = null;
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
                } else if (w == 2) {
                    str6 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    vVar2 = (com.yandex.plus.core.data.common.v) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), vVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
            vVar = vVar2;
        }
        c.b(mhpVar);
        return new g1(i, str, str2, str3, vVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g1 g1Var = (g1) obj;
        l6bVar.getClass();
        g1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = g1.f;
        c.p(mhpVar, 0, g1Var.b);
        c.p(mhpVar, 1, g1Var.c);
        c.p(mhpVar, 2, g1Var.d);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), g1Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
