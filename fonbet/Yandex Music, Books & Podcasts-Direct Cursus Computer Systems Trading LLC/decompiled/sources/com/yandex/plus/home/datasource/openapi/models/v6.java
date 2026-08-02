package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.cqe;
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
public final /* synthetic */ class v6 implements p3d {
    public static final v6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        v6 v6Var = new v6();
        a = v6Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkSdkConfigurationModel", v6Var, 7);
        j5mVar.k("hostsForOpenInSystem", false);
        j5mVar.k("allowedDomains", false);
        j5mVar.k("jsBridgeAllowedDomains", false);
        j5mVar.k("forbiddenDomains", false);
        j5mVar.k("webViewHideThreshold", false);
        j5mVar.k("webViewDownwardScrollFriction", false);
        j5mVar.k("plusHomeBaseUrl", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = x6.h;
        cqe cqeVar = cqe.a;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue(), arfVarArr[2].getValue(), arfVarArr[3].getValue(), cqeVar, cqeVar, ff7.C(tkr.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        List list;
        int i2;
        int i3;
        List list2;
        List list3;
        List list4;
        int i4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = x6.h;
        int i5 = 6;
        int i6 = 2;
        if (c.m()) {
            List list5 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            List list6 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            List list7 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            List list8 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            int k = c.k(mhpVar, 4);
            int k2 = c.k(mhpVar, 5);
            list = list8;
            list2 = list5;
            str = (String) c.n(mhpVar, 6, tkr.a, null);
            i = k2;
            i2 = k;
            i3 = 127;
            list4 = list7;
            list3 = list6;
        } else {
            int i7 = 1;
            boolean z = true;
            int i8 = 0;
            int i9 = 0;
            String str2 = null;
            List list9 = null;
            List list10 = null;
            List list11 = null;
            int i10 = 0;
            List list12 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i5 = 6;
                        i7 = 1;
                    case 0:
                        list9 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list9);
                        i9 |= 1;
                        i5 = 6;
                        i6 = 2;
                        i7 = 1;
                    case 1:
                        list10 = (List) c.z(mhpVar, i7, (t9f) arfVarArr[i7].getValue(), list10);
                        i9 |= 2;
                        i5 = 6;
                        i6 = 2;
                    case 2:
                        int i11 = i6;
                        list11 = (List) c.z(mhpVar, i11, (t9f) arfVarArr[i11].getValue(), list11);
                        i9 |= 4;
                        i6 = i11;
                        i5 = 6;
                    case 3:
                        i4 = i6;
                        list12 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list12);
                        i9 |= 8;
                        i6 = i4;
                    case 4:
                        i10 = c.k(mhpVar, 4);
                        i9 |= 16;
                    case 5:
                        i8 = c.k(mhpVar, 5);
                        i9 |= 32;
                    case 6:
                        i4 = i6;
                        str2 = (String) c.n(mhpVar, i5, tkr.a, str2);
                        i9 |= 64;
                        i6 = i4;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i8;
            str = str2;
            list = list12;
            i2 = i10;
            i3 = i9;
            list2 = list9;
            list3 = list10;
            list4 = list11;
        }
        c.b(mhpVar);
        return new x6(i3, list2, list3, list4, list, i2, i, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x6 x6Var = (x6) obj;
        l6bVar.getClass();
        x6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = x6.h;
        t9f t9fVar = (t9f) arfVarArr[0].getValue();
        List list = x6Var.a;
        String str = x6Var.g;
        c.k(mhpVar, 0, t9fVar, list);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), x6Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), x6Var.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), x6Var.d);
        c.A(4, x6Var.e, mhpVar);
        c.A(5, x6Var.f, mhpVar);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 6, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
