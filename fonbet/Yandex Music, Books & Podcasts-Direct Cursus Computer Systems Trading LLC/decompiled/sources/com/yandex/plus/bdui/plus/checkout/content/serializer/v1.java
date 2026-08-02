package com.yandex.plus.bdui.plus.checkout.content.serializer;

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

/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements p3d {
    public static final v1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        v1 v1Var = new v1();
        a = v1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.TariffOrOptionDto", v1Var, 5);
        j5mVar.k("name", true);
        j5mVar.k("title", false);
        j5mVar.k("text", false);
        j5mVar.k("additionText", false);
        j5mVar.k("image", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str5 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str6 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str7 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str8 = (String) c.n(mhpVar, 2, tkrVar, null);
            str4 = (String) c.n(mhpVar, 3, tkrVar, null);
            tVar = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.n(mhpVar, 4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, null);
            i = 31;
            str3 = str8;
            str2 = str7;
            str = str6;
        } else {
            boolean z = true;
            int i2 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str5 = (String) c.n(mhpVar, 0, tkr.a, str5);
                    i2 |= 1;
                } else if (w == 1) {
                    str9 = (String) c.n(mhpVar, 1, tkr.a, str9);
                    i2 |= 2;
                } else if (w == 2) {
                    str10 = (String) c.n(mhpVar, 2, tkr.a, str10);
                    i2 |= 4;
                } else if (w == 3) {
                    str11 = (String) c.n(mhpVar, 3, tkr.a, str11);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    tVar2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.n(mhpVar, 4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, tVar2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str5;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            tVar = tVar2;
        }
        c.b(mhpVar);
        return new x1(i, str, str2, str3, str4, tVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x1 x1Var = (x1) obj;
        l6bVar.getClass();
        x1Var.getClass();
        String str = x1Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 1, tkrVar, x1Var.b);
        c.q(mhpVar, 2, tkrVar, x1Var.c);
        c.q(mhpVar, 3, tkrVar, x1Var.d);
        c.q(mhpVar, 4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, x1Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
