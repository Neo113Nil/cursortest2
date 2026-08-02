package com.yandex.plus.pay.data.mb.dto;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
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
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class d1 implements p3d {
    public static final d1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d1 d1Var = new d1();
        a = d1Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.Tariff", d1Var, 11);
        j5mVar.k("additionText", true);
        j5mVar.k("commonPeriod", false);
        j5mVar.k("commonPrice", false);
        j5mVar.k(DeviceService.KEY_DESC, true);
        j5mVar.k("name", false);
        j5mVar.k("offerVendorType", true);
        j5mVar.k("payload", true);
        j5mVar.k("text", true);
        j5mVar.k("title", false);
        j5mVar.k("tariff", false);
        j5mVar.k("plans", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = i1.l;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, x0.a, ff7.C(tkrVar), tkrVar, arfVarArr[5].getValue(), ff7.C((t9f) arfVarArr[6].getValue()), ff7.C(tkrVar), tkrVar, f1.a, arfVarArr[10].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        Map map;
        String str;
        k1 k1Var;
        int i;
        List list;
        h1 h1Var;
        String str2;
        z0 z0Var;
        String str3;
        String str4;
        String str5;
        String str6;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = i1.l;
        int i2 = 9;
        char c2 = 7;
        String str7 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str8 = (String) c.n(mhpVar, 0, tkrVar, null);
            String g = c.g(mhpVar, 1);
            z0 z0Var2 = (z0) c.z(mhpVar, 2, x0.a, null);
            String str9 = (String) c.n(mhpVar, 3, tkrVar, null);
            String g2 = c.g(mhpVar, 4);
            k1 k1Var2 = (k1) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            Map map2 = (Map) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            String str10 = (String) c.n(mhpVar, 7, tkrVar, null);
            String g3 = c.g(mhpVar, 8);
            h1 h1Var2 = (h1) c.z(mhpVar, 9, f1.a, null);
            list = (List) c.z(mhpVar, 10, (t9f) arfVarArr[10].getValue(), null);
            str = str10;
            h1Var = h1Var2;
            str6 = g3;
            str2 = str9;
            i = 2047;
            str5 = g2;
            z0Var = z0Var2;
            k1Var = k1Var2;
            map = map2;
            str4 = g;
            str3 = str8;
        } else {
            int i3 = 10;
            int i4 = 6;
            int i5 = 5;
            boolean z = true;
            int i6 = 0;
            Map map3 = null;
            String str11 = null;
            k1 k1Var3 = null;
            List list2 = null;
            h1 h1Var3 = null;
            String str12 = null;
            z0 z0Var3 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 9;
                        c2 = 7;
                        i5 = 5;
                        i4 = 6;
                    case 0:
                        str7 = (String) c.n(mhpVar, 0, tkr.a, str7);
                        i6 |= 1;
                        i3 = 10;
                        i2 = 9;
                        c2 = 7;
                        i5 = 5;
                        i4 = 6;
                    case 1:
                        str13 = c.g(mhpVar, 1);
                        i6 |= 2;
                        i3 = 10;
                        i2 = 9;
                        c2 = 7;
                        i5 = 5;
                        i4 = 6;
                    case 2:
                        z0Var3 = (z0) c.z(mhpVar, 2, x0.a, z0Var3);
                        i6 |= 4;
                        i3 = 10;
                        i2 = 9;
                        c2 = 7;
                        i5 = 5;
                        i4 = 6;
                    case 3:
                        str12 = (String) c.n(mhpVar, 3, tkr.a, str12);
                        i6 |= 8;
                        i3 = 10;
                        i2 = 9;
                        c2 = 7;
                        i5 = 5;
                        i4 = 6;
                    case 4:
                        str14 = c.g(mhpVar, 4);
                        i6 |= 16;
                        i3 = 10;
                        c2 = 7;
                        i4 = 6;
                    case 5:
                        k1Var3 = (k1) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), k1Var3);
                        i6 |= 32;
                        i3 = 10;
                        c2 = 7;
                        i4 = 6;
                    case 6:
                        map3 = (Map) c.n(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), map3);
                        i6 |= 64;
                        i3 = 10;
                        c2 = 7;
                    case 7:
                        str11 = (String) c.n(mhpVar, 7, tkr.a, str11);
                        i6 |= 128;
                        c2 = 7;
                        i3 = 10;
                    case 8:
                        str15 = c.g(mhpVar, 8);
                        i6 |= 256;
                        c2 = 7;
                    case 9:
                        h1Var3 = (h1) c.z(mhpVar, i2, f1.a, h1Var3);
                        i6 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c2 = 7;
                    case 10:
                        list2 = (List) c.z(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), list2);
                        i6 |= 1024;
                        c2 = 7;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            map = map3;
            str = str11;
            k1Var = k1Var3;
            i = i6;
            list = list2;
            h1Var = h1Var3;
            str2 = str12;
            z0Var = z0Var3;
            str3 = str7;
            str4 = str13;
            str5 = str14;
            str6 = str15;
        }
        c.b(mhpVar);
        return new i1(i, str3, str4, z0Var, str2, str5, k1Var, map, str, str6, h1Var, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i1 i1Var = (i1) obj;
        l6bVar.getClass();
        i1Var.getClass();
        String str = i1Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = i1.l;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        String str2 = i1Var.b;
        String str3 = i1Var.h;
        Map map = i1Var.g;
        k1 k1Var = i1Var.f;
        String str4 = i1Var.d;
        c.p(mhpVar, 1, str2);
        c.k(mhpVar, 2, x0.a, i1Var.c);
        if (c.e(mhpVar) || str4 != null) {
            c.q(mhpVar, 3, tkr.a, str4);
        }
        c.p(mhpVar, 4, i1Var.e);
        if (c.e(mhpVar) || k1Var != k1.b) {
            c.k(mhpVar, 5, (t9f) arfVarArr[5].getValue(), k1Var);
        }
        if (c.e(mhpVar) || map != null) {
            c.q(mhpVar, 6, (t9f) arfVarArr[6].getValue(), map);
        }
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 7, tkr.a, str3);
        }
        c.p(mhpVar, 8, i1Var.i);
        c.k(mhpVar, 9, f1.a, i1Var.j);
        c.k(mhpVar, 10, (t9f) arfVarArr[10].getValue(), i1Var.k);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
