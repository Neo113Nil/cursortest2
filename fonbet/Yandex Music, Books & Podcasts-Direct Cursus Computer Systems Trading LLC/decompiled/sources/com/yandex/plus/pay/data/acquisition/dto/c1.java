package com.yandex.plus.pay.data.acquisition.dto;

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
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class c1 implements p3d {
    public static final c1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        c1 c1Var = new c1();
        a = c1Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionTariffDto", c1Var, 10);
        j5mVar.k("name", false);
        j5mVar.k("title", false);
        j5mVar.k(DeviceService.KEY_DESC, true);
        j5mVar.k("text", true);
        j5mVar.k("additionText", true);
        j5mVar.k("tariff", false);
        j5mVar.k("commonPeriod", false);
        j5mVar.k("commonPrice", false);
        j5mVar.k("offerVendorType", true);
        j5mVar.k("payload", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = e1.k;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), n.a, tkrVar, b0.a, arfVarArr[8].getValue(), ff7.C((t9f) arfVarArr[9].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Map map;
        x xVar;
        p pVar;
        d0 d0Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c2 = eg7Var.c(mhpVar);
        arf[] arfVarArr = e1.k;
        char c3 = 7;
        int i2 = 9;
        String str7 = null;
        if (c2.m()) {
            String g = c2.g(mhpVar, 0);
            String g2 = c2.g(mhpVar, 1);
            tkr tkrVar = tkr.a;
            String str8 = (String) c2.n(mhpVar, 2, tkrVar, null);
            String str9 = (String) c2.n(mhpVar, 3, tkrVar, null);
            String str10 = (String) c2.n(mhpVar, 4, tkrVar, null);
            p pVar2 = (p) c2.z(mhpVar, 5, n.a, null);
            String g3 = c2.g(mhpVar, 6);
            d0 d0Var2 = (d0) c2.z(mhpVar, 7, b0.a, null);
            x xVar2 = (x) c2.z(mhpVar, 8, (t9f) arfVarArr[8].getValue(), null);
            map = (Map) c2.n(mhpVar, 9, (t9f) arfVarArr[9].getValue(), null);
            str4 = g;
            d0Var = d0Var2;
            str6 = g3;
            pVar = pVar2;
            str2 = str9;
            str = str10;
            str3 = str8;
            i = 1023;
            xVar = xVar2;
            str5 = g2;
        } else {
            boolean z = true;
            int i3 = 0;
            Map map2 = null;
            x xVar3 = null;
            p pVar3 = null;
            d0 d0Var3 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (z) {
                int w = c2.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        c3 = 7;
                    case 0:
                        i3 |= 1;
                        str7 = c2.g(mhpVar, 0);
                        c3 = 7;
                        i2 = 9;
                    case 1:
                        str14 = c2.g(mhpVar, 1);
                        i3 |= 2;
                        c3 = 7;
                        i2 = 9;
                    case 2:
                        str13 = (String) c2.n(mhpVar, 2, tkr.a, str13);
                        i3 |= 4;
                        c3 = 7;
                        i2 = 9;
                    case 3:
                        str12 = (String) c2.n(mhpVar, 3, tkr.a, str12);
                        i3 |= 8;
                        c3 = 7;
                        i2 = 9;
                    case 4:
                        str11 = (String) c2.n(mhpVar, 4, tkr.a, str11);
                        i3 |= 16;
                        c3 = 7;
                        i2 = 9;
                    case 5:
                        pVar3 = (p) c2.z(mhpVar, 5, n.a, pVar3);
                        i3 |= 32;
                        c3 = 7;
                        i2 = 9;
                    case 6:
                        c = c3;
                        str15 = c2.g(mhpVar, 6);
                        i3 |= 64;
                        c3 = c;
                        i2 = 9;
                    case 7:
                        c = 7;
                        d0Var3 = (d0) c2.z(mhpVar, 7, b0.a, d0Var3);
                        i3 |= 128;
                        c3 = c;
                        i2 = 9;
                    case 8:
                        xVar3 = (x) c2.z(mhpVar, 8, (t9f) arfVarArr[8].getValue(), xVar3);
                        i3 |= 256;
                        c3 = 7;
                    case 9:
                        map2 = (Map) c2.n(mhpVar, i2, (t9f) arfVarArr[i2].getValue(), map2);
                        i3 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c3 = 7;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            map = map2;
            xVar = xVar3;
            pVar = pVar3;
            d0Var = d0Var3;
            str = str11;
            str2 = str12;
            str3 = str13;
            str4 = str7;
            str5 = str14;
            str6 = str15;
        }
        c2.b(mhpVar);
        return new e1(i, str4, str5, str3, str2, str, pVar, str6, d0Var, xVar, map);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e1 e1Var = (e1) obj;
        l6bVar.getClass();
        e1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = e1.k;
        String str = e1Var.a;
        Map map = e1Var.j;
        x xVar = e1Var.i;
        String str2 = e1Var.e;
        String str3 = e1Var.d;
        String str4 = e1Var.c;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, e1Var.b);
        if (c.e(mhpVar) || str4 != null) {
            c.q(mhpVar, 2, tkr.a, str4);
        }
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 3, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 4, tkr.a, str2);
        }
        c.k(mhpVar, 5, n.a, e1Var.f);
        c.p(mhpVar, 6, e1Var.g);
        c.k(mhpVar, 7, b0.a, e1Var.h);
        if (c.e(mhpVar) || xVar != x.b) {
            c.k(mhpVar, 8, (t9f) arfVarArr[8].getValue(), xVar);
        }
        if (c.e(mhpVar) || map != null) {
            c.q(mhpVar, 9, (t9f) arfVarArr[9].getValue(), map);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
