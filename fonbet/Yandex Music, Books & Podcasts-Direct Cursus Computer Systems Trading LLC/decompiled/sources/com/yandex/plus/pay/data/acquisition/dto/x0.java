package com.yandex.plus.pay.data.acquisition.dto;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.e5b;
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
public final /* synthetic */ class x0 implements p3d {
    public static final x0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        x0 x0Var = new x0();
        a = x0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionSmartOffersBatchDto.SmartOffer.Texts", x0Var, 12);
        j5mVar.k("subscriptionName", false);
        j5mVar.k("buttonText", false);
        j5mVar.k("buttonTextWithDetails", false);
        j5mVar.k("combinedIntroductoryText", false);
        j5mVar.k("combinedPriceText", false);
        j5mVar.k("combinedFullOfferText", false);
        j5mVar.k("priceInMonth", false);
        j5mVar.k("commonPrice", false);
        j5mVar.k("currencySymbol", false);
        j5mVar.k("discountPercent", true);
        j5mVar.k("fullPriceText", true);
        j5mVar.k("customTexts", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = z0.m;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), arfVarArr[11].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Map map;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = z0.m;
        int i2 = 3;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            String g4 = c.g(mhpVar, 3);
            String g5 = c.g(mhpVar, 4);
            String g6 = c.g(mhpVar, 5);
            String g7 = c.g(mhpVar, 6);
            String g8 = c.g(mhpVar, 7);
            String g9 = c.g(mhpVar, 8);
            tkr tkrVar = tkr.a;
            String str12 = (String) c.n(mhpVar, 9, tkrVar, null);
            String str13 = (String) c.n(mhpVar, 10, tkrVar, null);
            i = 4095;
            map = (Map) c.z(mhpVar, 11, (t9f) arfVarArr[11].getValue(), null);
            str3 = g;
            str = str13;
            str2 = str12;
            str10 = g8;
            str9 = g7;
            str8 = g6;
            str6 = g4;
            str11 = g9;
            str7 = g5;
            str5 = g3;
            str4 = g2;
        } else {
            int i3 = 11;
            Map map2 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            boolean z = true;
            String str23 = null;
            i = 0;
            String str24 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i3 = 11;
                    case 0:
                        str14 = c.g(mhpVar, 0);
                        i |= 1;
                        i3 = 11;
                    case 1:
                        str15 = c.g(mhpVar, 1);
                        i |= 2;
                        i3 = 11;
                    case 2:
                        str16 = c.g(mhpVar, 2);
                        i |= 4;
                        i3 = 11;
                    case 3:
                        str17 = c.g(mhpVar, i2);
                        i |= 8;
                    case 4:
                        str18 = c.g(mhpVar, 4);
                        i |= 16;
                        i2 = 3;
                    case 5:
                        str19 = c.g(mhpVar, 5);
                        i |= 32;
                        i2 = 3;
                    case 6:
                        str20 = c.g(mhpVar, 6);
                        i |= 64;
                        i2 = 3;
                    case 7:
                        str21 = c.g(mhpVar, 7);
                        i |= 128;
                        i2 = 3;
                    case 8:
                        str22 = c.g(mhpVar, 8);
                        i |= 256;
                        i2 = 3;
                    case 9:
                        str24 = (String) c.n(mhpVar, 9, tkr.a, str24);
                        i |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i2 = 3;
                    case 10:
                        str23 = (String) c.n(mhpVar, 10, tkr.a, str23);
                        i |= 1024;
                        i2 = 3;
                    case 11:
                        map2 = (Map) c.z(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), map2);
                        i |= 2048;
                        i2 = 3;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            map = map2;
            str = str23;
            str2 = str24;
            str3 = str14;
            str4 = str15;
            str5 = str16;
            str6 = str17;
            str7 = str18;
            str8 = str19;
            str9 = str20;
            str10 = str21;
            str11 = str22;
        }
        int i4 = i;
        c.b(mhpVar);
        return new z0(i4, str3, str4, str5, str6, str7, str8, str9, str10, str11, str2, str, map);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3, r9) == false) goto L17;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        z0 z0Var = (z0) obj;
        l6bVar.getClass();
        z0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = z0.m;
        String str = z0Var.a;
        Map map = z0Var.l;
        String str2 = z0Var.k;
        String str3 = z0Var.j;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, z0Var.b);
        c.p(mhpVar, 2, z0Var.c);
        c.p(mhpVar, 3, z0Var.d);
        c.p(mhpVar, 4, z0Var.e);
        c.p(mhpVar, 5, z0Var.f);
        c.p(mhpVar, 6, z0Var.g);
        c.p(mhpVar, 7, z0Var.h);
        c.p(mhpVar, 8, z0Var.i);
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 9, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 10, tkr.a, str2);
        }
        if (!c.e(mhpVar)) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
        }
        c.k(mhpVar, 11, (t9f) arfVarArr[11].getValue(), map);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
