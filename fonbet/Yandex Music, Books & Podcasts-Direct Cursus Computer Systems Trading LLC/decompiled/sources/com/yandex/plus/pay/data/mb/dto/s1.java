package com.yandex.plus.pay.data.mb.dto;

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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class s1 implements p3d {
    public static final s1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        s1 s1Var = new s1();
        a = s1Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.CounterOffersRequestDto", s1Var, 5);
        j5mVar.k("offers", false);
        j5mVar.k("target", false);
        j5mVar.k("eventSessionId", false);
        j5mVar.k("language", false);
        j5mVar.k("counterOfferReason", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{u1.f[0].getValue(), tkrVar, tkrVar, tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = u1.f;
        int i2 = 0;
        List list2 = null;
        if (c.m()) {
            List list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            list = list3;
            str = g;
            str3 = c.g(mhpVar, 3);
            str4 = c.g(mhpVar, 4);
            str2 = g2;
            i = 31;
        } else {
            int i3 = 1;
            int i4 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                int i5 = i2;
                if (w == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (w != 0) {
                    if (w == 1) {
                        str5 = c.g(mhpVar, 1);
                        i4 |= 2;
                    } else if (w == 2) {
                        str6 = c.g(mhpVar, 2);
                        i4 |= 4;
                    } else if (w == 3) {
                        str7 = c.g(mhpVar, 3);
                        i4 |= 8;
                    } else {
                        if (w != 4) {
                            l1j.g(w);
                            return null;
                        }
                        str8 = c.g(mhpVar, 4);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    list2 = (List) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), list2);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            list = list2;
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
        }
        c.b(mhpVar);
        return new u1(i, list, str, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u1 u1Var = (u1) obj;
        l6bVar.getClass();
        u1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) u1.f[0].getValue(), u1Var.a);
        c.p(mhpVar, 1, u1Var.b);
        c.p(mhpVar, 2, u1Var.c);
        c.p(mhpVar, 3, u1Var.d);
        c.p(mhpVar, 4, u1Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
