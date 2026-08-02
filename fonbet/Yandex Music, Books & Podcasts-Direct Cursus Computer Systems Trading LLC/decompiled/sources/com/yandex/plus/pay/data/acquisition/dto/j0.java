package com.yandex.plus.pay.data.acquisition.dto;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
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
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class j0 implements p3d {
    public static final j0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        j0 j0Var = new j0();
        a = j0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionSmartOffersBatchDto.SmartOffer", j0Var, 10);
        j5mVar.k("analyticData", false);
        j5mVar.k("purchaseToken", true);
        j5mVar.k("place", true);
        j5mVar.k("position", false);
        j5mVar.k("target", false);
        j5mVar.k("requestedFeatures", true);
        j5mVar.k("oneClickAvailable", true);
        j5mVar.k("offerTexts", false);
        j5mVar.k("legalInfo", false);
        j5mVar.k("catalogCompositeOffer", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = a1.k;
        tkr tkrVar = tkr.a;
        return new t9f[]{k0.a, ff7.C(tkrVar), ff7.C(tkrVar), cqe.a, tkrVar, ff7.C((t9f) arfVarArr[5].getValue()), ff7.C(oc3.a), x0.a, o0.a, t.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        v vVar;
        Boolean bool;
        z0 z0Var;
        Set set;
        w0 w0Var;
        String str;
        String str2;
        int i2;
        m0 m0Var;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = a1.k;
        int i3 = 9;
        char c2 = 7;
        if (c.m()) {
            m0 m0Var2 = (m0) c.z(mhpVar, 0, k0.a, null);
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str5 = (String) c.n(mhpVar, 2, tkrVar, null);
            int k = c.k(mhpVar, 3);
            String g = c.g(mhpVar, 4);
            Set set2 = (Set) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            Boolean bool2 = (Boolean) c.n(mhpVar, 6, oc3.a, null);
            z0 z0Var2 = (z0) c.z(mhpVar, 7, x0.a, null);
            w0 w0Var2 = (w0) c.z(mhpVar, 8, o0.a, null);
            set = set2;
            m0Var = m0Var2;
            vVar = (v) c.z(mhpVar, 9, t.a, null);
            z0Var = z0Var2;
            bool = bool2;
            i = k;
            w0Var = w0Var2;
            str3 = g;
            str = str5;
            i2 = 1023;
            str2 = str4;
        } else {
            int i4 = 5;
            boolean z = true;
            int i5 = 0;
            v vVar2 = null;
            Boolean bool3 = null;
            z0 z0Var3 = null;
            Set set3 = null;
            w0 w0Var3 = null;
            String str6 = null;
            m0 m0Var3 = null;
            String str7 = null;
            int i6 = 0;
            String str8 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        c2 = 7;
                        i4 = 5;
                    case 0:
                        m0Var3 = (m0) c.z(mhpVar, 0, k0.a, m0Var3);
                        i6 |= 1;
                        i3 = 9;
                        c2 = 7;
                        i4 = 5;
                    case 1:
                        str8 = (String) c.n(mhpVar, 1, tkr.a, str8);
                        i6 |= 2;
                        i3 = 9;
                        c2 = 7;
                        i4 = 5;
                    case 2:
                        str6 = (String) c.n(mhpVar, 2, tkr.a, str6);
                        i6 |= 4;
                        i3 = 9;
                        c2 = 7;
                        i4 = 5;
                    case 3:
                        i6 |= 8;
                        i5 = c.k(mhpVar, 3);
                        i3 = 9;
                        c2 = 7;
                    case 4:
                        str7 = c.g(mhpVar, 4);
                        i6 |= 16;
                        i3 = 9;
                        c2 = 7;
                    case 5:
                        set3 = (Set) c.n(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), set3);
                        i6 |= 32;
                        i3 = 9;
                        c2 = 7;
                    case 6:
                        bool3 = (Boolean) c.n(mhpVar, 6, oc3.a, bool3);
                        i6 |= 64;
                        i3 = 9;
                        c2 = 7;
                    case 7:
                        z0Var3 = (z0) c.z(mhpVar, 7, x0.a, z0Var3);
                        i6 |= 128;
                        c2 = 7;
                        i3 = 9;
                    case 8:
                        w0Var3 = (w0) c.z(mhpVar, 8, o0.a, w0Var3);
                        i6 |= 256;
                        c2 = 7;
                    case 9:
                        vVar2 = (v) c.z(mhpVar, i3, t.a, vVar2);
                        i6 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c2 = 7;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            vVar = vVar2;
            bool = bool3;
            z0Var = z0Var3;
            set = set3;
            w0Var = w0Var3;
            str = str6;
            str2 = str8;
            i2 = i6;
            m0Var = m0Var3;
            str3 = str7;
        }
        c.b(mhpVar);
        return new a1(i2, m0Var, str2, str, i, str3, set, bool, z0Var, w0Var, vVar);
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
        arf[] arfVarArr = a1.k;
        k0 k0Var = k0.a;
        m0 m0Var = a1Var.a;
        Boolean bool = a1Var.g;
        Set set = a1Var.f;
        String str = a1Var.c;
        String str2 = a1Var.b;
        c.k(mhpVar, 0, k0Var, m0Var);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 1, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 2, tkr.a, str);
        }
        c.A(3, a1Var.d, mhpVar);
        c.p(mhpVar, 4, a1Var.e);
        if (c.e(mhpVar) || set != null) {
            c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), set);
        }
        if (c.e(mhpVar) || bool != null) {
            c.q(mhpVar, 6, oc3.a, bool);
        }
        c.k(mhpVar, 7, x0.a, a1Var.h);
        c.k(mhpVar, 8, o0.a, a1Var.i);
        c.k(mhpVar, 9, t.a, a1Var.j);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
