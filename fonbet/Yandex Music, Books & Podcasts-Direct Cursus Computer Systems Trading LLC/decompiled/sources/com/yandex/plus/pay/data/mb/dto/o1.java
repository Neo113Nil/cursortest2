package com.yandex.plus.pay.data.mb.dto;

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

/* loaded from: classes5.dex */
public final /* synthetic */ class o1 implements p3d {
    public static final o1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        o1 o1Var = new o1();
        a = o1Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.CounterOffersDto.CounterOffer", o1Var, 6);
        j5mVar.k("offer", false);
        j5mVar.k("title", false);
        j5mVar.k("benefits", false);
        j5mVar.k("buttonText", false);
        j5mVar.k("additionalButtonText", true);
        j5mVar.k("icon", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = q1.g;
        tkr tkrVar = tkr.a;
        return new t9f[]{j.a, c3.a, arfVarArr[2].getValue(), tkrVar, ff7.C(tkrVar), a2.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        l1 l1Var;
        j3 j3Var;
        List list;
        String str;
        String str2;
        c2 c2Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = q1.g;
        int i2 = 5;
        boolean z = false;
        l1 l1Var2 = null;
        if (c.m()) {
            l1 l1Var3 = (l1) c.z(mhpVar, 0, j.a, null);
            j3 j3Var2 = (j3) c.z(mhpVar, 1, c3.a, null);
            List list2 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            String g = c.g(mhpVar, 3);
            String str3 = (String) c.n(mhpVar, 4, tkr.a, null);
            list = list2;
            l1Var = l1Var3;
            c2Var = (c2) c.z(mhpVar, 5, a2.a, null);
            str = g;
            str2 = str3;
            i = 63;
            j3Var = j3Var2;
        } else {
            boolean z2 = true;
            int i3 = 0;
            j3 j3Var3 = null;
            List list3 = null;
            String str4 = null;
            String str5 = null;
            c2 c2Var2 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = z;
                        i2 = 5;
                    case 0:
                        l1Var2 = (l1) c.z(mhpVar, 0, j.a, l1Var2);
                        i3 |= 1;
                        z = false;
                        i2 = 5;
                    case 1:
                        j3Var3 = (j3) c.z(mhpVar, 1, c3.a, j3Var3);
                        i3 |= 2;
                        z = false;
                    case 2:
                        list3 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list3);
                        i3 |= 4;
                        z = false;
                    case 3:
                        str4 = c.g(mhpVar, 3);
                        i3 |= 8;
                        z = false;
                    case 4:
                        str5 = (String) c.n(mhpVar, 4, tkr.a, str5);
                        i3 |= 16;
                        z = false;
                    case 5:
                        c2Var2 = (c2) c.z(mhpVar, i2, a2.a, c2Var2);
                        i3 |= 32;
                        z = false;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            l1Var = l1Var2;
            j3Var = j3Var3;
            list = list3;
            str = str4;
            str2 = str5;
            c2Var = c2Var2;
        }
        c.b(mhpVar);
        return new q1(i, l1Var, j3Var, list, str, str2, c2Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q1 q1Var = (q1) obj;
        l6bVar.getClass();
        q1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = q1.g;
        j jVar = j.a;
        l1 l1Var = q1Var.a;
        String str = q1Var.e;
        c.k(mhpVar, 0, jVar, l1Var);
        c.k(mhpVar, 1, c3.a, q1Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), q1Var.c);
        c.p(mhpVar, 3, q1Var.d);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 4, tkr.a, str);
        }
        c.k(mhpVar, 5, a2.a, q1Var.f);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
