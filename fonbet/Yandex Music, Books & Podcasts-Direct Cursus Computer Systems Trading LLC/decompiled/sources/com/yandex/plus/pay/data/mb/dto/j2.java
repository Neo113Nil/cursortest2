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
public final /* synthetic */ class j2 implements p3d {
    public static final j2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        j2 j2Var = new j2();
        a = j2Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.PaymentScreenRequestDto", j2Var, 5);
        j5mVar.k("supportedFeatures", false);
        j5mVar.k("requestedScreenName", false);
        j5mVar.k("language", false);
        j5mVar.k("theme", false);
        j5mVar.k("params", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{o2.f[0].getValue(), tkrVar, tkrVar, tkrVar, l2.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        String str;
        String str2;
        String str3;
        n2 n2Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = o2.f;
        int i2 = 0;
        List list2 = null;
        if (c.m()) {
            List list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            list = list3;
            str = g;
            str3 = c.g(mhpVar, 3);
            n2Var = (n2) c.z(mhpVar, 4, l2.a, null);
            str2 = g2;
            i = 31;
        } else {
            int i3 = 1;
            int i4 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            n2 n2Var2 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                int i5 = i2;
                if (w == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (w != 0) {
                    if (w == 1) {
                        str4 = c.g(mhpVar, 1);
                        i4 |= 2;
                    } else if (w == 2) {
                        str5 = c.g(mhpVar, 2);
                        i4 |= 4;
                    } else if (w == 3) {
                        str6 = c.g(mhpVar, 3);
                        i4 |= 8;
                    } else {
                        if (w != 4) {
                            l1j.g(w);
                            return null;
                        }
                        n2Var2 = (n2) c.z(mhpVar, 4, l2.a, n2Var2);
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
            str = str4;
            str2 = str5;
            str3 = str6;
            n2Var = n2Var2;
        }
        c.b(mhpVar);
        return new o2(i, list, str, str2, str3, n2Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o2 o2Var = (o2) obj;
        l6bVar.getClass();
        o2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) o2.f[0].getValue(), o2Var.a);
        c.p(mhpVar, 1, o2Var.b);
        c.p(mhpVar, 2, o2Var.c);
        c.p(mhpVar, 3, o2Var.d);
        c.k(mhpVar, 4, l2.a, o2Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
