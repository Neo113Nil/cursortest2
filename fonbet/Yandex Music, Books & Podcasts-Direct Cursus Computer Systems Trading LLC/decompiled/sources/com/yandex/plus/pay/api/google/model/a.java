package com.yandex.plus.pay.api.google.model;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements p3d {
    public static final a a;

    @NotNull
    private static final mhp descriptor;

    static {
        a aVar = new a();
        a = aVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.api.google.model.CompletePurchaseParams", aVar, 4);
        j5mVar.k("acknowledge", false);
        j5mVar.k("products", false);
        j5mVar.k("token", false);
        j5mVar.k("isSubscription", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = c.e;
        oc3 oc3Var = oc3.a;
        return new t9f[]{oc3Var, arfVarArr[1].getValue(), tkr.a, oc3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        int i;
        List list;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = c.e;
        if (c.m()) {
            z = c.D(mhpVar, 0);
            List list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String g = c.g(mhpVar, 2);
            list = list2;
            z2 = c.D(mhpVar, 3);
            str = g;
            i = 15;
        } else {
            boolean z3 = true;
            z = false;
            int i2 = 0;
            List list3 = null;
            String str2 = null;
            boolean z4 = false;
            while (z3) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z3 = false;
                } else if (w == 0) {
                    z = c.D(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    list3 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list3);
                    i2 |= 2;
                } else if (w == 2) {
                    str2 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    z4 = c.D(mhpVar, 3);
                    i2 |= 8;
                }
            }
            z2 = z4;
            i = i2;
            list = list3;
            str = str2;
        }
        boolean z5 = z;
        c.b(mhpVar);
        return new c(i, str, list, z5, z2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c cVar = (c) obj;
        l6bVar.getClass();
        cVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = c.e;
        c.j(mhpVar, 0, cVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), cVar.b);
        c.p(mhpVar, 2, cVar.c);
        c.j(mhpVar, 3, cVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
