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
public final /* synthetic */ class t6 implements p3d {
    public static final t6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        t6 t6Var = new t6();
        a = t6Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPaySuccessContentSerializer.DataDto", t6Var, 5);
        j5mVar.k("title", false);
        j5mVar.k("subtitle", false);
        j5mVar.k("button", false);
        j5mVar.k("icons", false);
        j5mVar.k("user", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = v6.f;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(tkrVar), tkrVar, ff7.C((t9f) arfVarArr[3].getValue()), ff7.C(a.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        List list;
        c cVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = v6.f;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String str5 = (String) c.n(mhpVar, 1, tkr.a, null);
            String g2 = c.g(mhpVar, 2);
            list = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            cVar = (c) c.n(mhpVar, 4, a.a, null);
            str3 = g2;
            i = 31;
            str2 = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            List list2 = null;
            c cVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str6 = (String) c.n(mhpVar, 1, tkr.a, str6);
                    i2 |= 2;
                } else if (w == 2) {
                    str7 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else if (w == 3) {
                    list2 = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    cVar2 = (c) c.n(mhpVar, 4, a.a, cVar2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            str3 = str7;
            list = list2;
            cVar = cVar2;
        }
        c.b(mhpVar);
        return new v6(i, str, str2, str3, list, cVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v6 v6Var = (v6) obj;
        l6bVar.getClass();
        v6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = v6.f;
        c.p(mhpVar, 0, v6Var.a);
        c.q(mhpVar, 1, tkr.a, v6Var.b);
        c.p(mhpVar, 2, v6Var.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), v6Var.d);
        c.q(mhpVar, 4, a.a, v6Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
