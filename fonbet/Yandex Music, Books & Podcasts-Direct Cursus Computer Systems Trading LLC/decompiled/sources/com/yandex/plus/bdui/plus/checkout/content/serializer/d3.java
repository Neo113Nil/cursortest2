package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements p3d {
    public static final d3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d3 d3Var = new d3();
        a = d3Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCounterOffersContentSerializer.AssetDto", d3Var, 5);
        j5mVar.k("title", false);
        j5mVar.k("benefits", false);
        j5mVar.k("icon", false);
        j5mVar.k("buttonText", false);
        j5mVar.k("additionalButtonText", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = f3.f;
        tkr tkrVar = tkr.a;
        return new t9f[]{com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, arfVarArr[1].getValue(), com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, tkrVar, ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        List list;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = f3.f;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = null;
        if (c.m()) {
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, null);
            List list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.z(mhpVar, 2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, null);
            list = list2;
            m1Var = m1Var3;
            str = c.g(mhpVar, 3);
            str2 = (String) c.n(mhpVar, 4, tkr.a, null);
            tVar = tVar2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar3 = null;
            String str3 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    m1Var2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var2);
                    i2 |= 1;
                } else if (w == 1) {
                    list3 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list3);
                    i2 |= 2;
                } else if (w == 2) {
                    tVar3 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.z(mhpVar, 2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, tVar3);
                    i2 |= 4;
                } else if (w == 3) {
                    str3 = c.g(mhpVar, 3);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = (String) c.n(mhpVar, 4, tkr.a, str4);
                    i2 |= 16;
                }
            }
            i = i2;
            m1Var = m1Var2;
            list = list3;
            tVar = tVar3;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new f3(i, m1Var, list, tVar, str, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f3 f3Var = (f3) obj;
        l6bVar.getClass();
        f3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = f3.f;
        c.k(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, f3Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), f3Var.b);
        c.k(mhpVar, 2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, f3Var.c);
        c.p(mhpVar, 3, f3Var.d);
        c.q(mhpVar, 4, tkr.a, f3Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
