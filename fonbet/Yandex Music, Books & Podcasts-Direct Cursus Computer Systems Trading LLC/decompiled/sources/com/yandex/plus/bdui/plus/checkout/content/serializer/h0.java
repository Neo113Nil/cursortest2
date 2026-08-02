package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.c5b;
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
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements p3d {
    public static final h0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h0 h0Var = new h0();
        a = h0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.AdditionalOfferDto", h0Var, 13);
        j5mVar.k("offerName", false);
        j5mVar.k("positionId", false);
        j5mVar.k("offersBatchId", false);
        j5mVar.k("isSelected", false);
        j5mVar.k("isAvailable", false);
        j5mVar.k("title", false);
        j5mVar.k("offerText", false);
        j5mVar.k("additionalOfferText", false);
        j5mVar.k("iconImages", false);
        j5mVar.k("benefits", false);
        j5mVar.k("disclaimer", true);
        j5mVar.k("offerSwitchToggle", true);
        j5mVar.k("offersReplace", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = j0.n;
        tkr tkrVar = tkr.a;
        oc3 oc3Var = oc3.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, oc3Var, oc3Var, tkrVar, tkrVar, tkrVar, arfVarArr[8].getValue(), arfVarArr[9].getValue(), ff7.C(tkrVar), ff7.C(x0.a), arfVarArr[12].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        Map map;
        String str;
        String str2;
        int i;
        z0 z0Var;
        List list;
        String str3;
        List list2;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        boolean z2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j0.n;
        int i2 = 10;
        int i3 = 6;
        String str8 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            boolean D = c.D(mhpVar, 3);
            boolean D2 = c.D(mhpVar, 4);
            String g4 = c.g(mhpVar, 5);
            String g5 = c.g(mhpVar, 6);
            String g6 = c.g(mhpVar, 7);
            Map map2 = (Map) c.z(mhpVar, 8, (t9f) arfVarArr[8].getValue(), null);
            List list3 = (List) c.z(mhpVar, 9, (t9f) arfVarArr[9].getValue(), null);
            String str9 = (String) c.n(mhpVar, 10, tkr.a, null);
            z0Var = (z0) c.n(mhpVar, 11, x0.a, null);
            str2 = g;
            list = (List) c.z(mhpVar, 12, (t9f) arfVarArr[12].getValue(), null);
            str3 = str9;
            str7 = g6;
            str6 = g5;
            str5 = g4;
            z = D;
            z2 = D2;
            str4 = g3;
            i = 8191;
            list2 = list3;
            map = map2;
            str = g2;
        } else {
            int i4 = 12;
            int i5 = 0;
            boolean z3 = false;
            boolean z4 = false;
            Map map3 = null;
            String str10 = null;
            z0 z0Var2 = null;
            List list4 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            boolean z5 = true;
            List list5 = null;
            while (z5) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z5 = false;
                        i2 = 10;
                        i4 = 12;
                    case 0:
                        i5 |= 1;
                        str8 = c.g(mhpVar, 0);
                        i2 = 10;
                        i4 = 12;
                    case 1:
                        i5 |= 2;
                        str10 = c.g(mhpVar, 1);
                        i2 = 10;
                        i4 = 12;
                    case 2:
                        str12 = c.g(mhpVar, 2);
                        i5 |= 4;
                        i2 = 10;
                        i4 = 12;
                    case 3:
                        z3 = c.D(mhpVar, 3);
                        i5 |= 8;
                        i2 = 10;
                        i4 = 12;
                    case 4:
                        z4 = c.D(mhpVar, 4);
                        i5 |= 16;
                        i2 = 10;
                        i4 = 12;
                    case 5:
                        str13 = c.g(mhpVar, 5);
                        i5 |= 32;
                        i2 = 10;
                        i4 = 12;
                    case 6:
                        str14 = c.g(mhpVar, i3);
                        i5 |= 64;
                        i4 = 12;
                    case 7:
                        str15 = c.g(mhpVar, 7);
                        i5 |= 128;
                        i3 = 6;
                        i4 = 12;
                    case 8:
                        map3 = (Map) c.z(mhpVar, 8, (t9f) arfVarArr[8].getValue(), map3);
                        i5 |= 256;
                        i3 = 6;
                        i4 = 12;
                    case 9:
                        list5 = (List) c.z(mhpVar, 9, (t9f) arfVarArr[9].getValue(), list5);
                        i5 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i3 = 6;
                        i4 = 12;
                    case 10:
                        str11 = (String) c.n(mhpVar, i2, tkr.a, str11);
                        i5 |= 1024;
                        i3 = 6;
                        i4 = 12;
                    case 11:
                        z0Var2 = (z0) c.n(mhpVar, 11, x0.a, z0Var2);
                        i5 |= 2048;
                        i3 = 6;
                        i4 = 12;
                    case 12:
                        list4 = (List) c.z(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), list4);
                        i5 |= 4096;
                        i3 = 6;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            map = map3;
            str = str10;
            str2 = str8;
            i = i5;
            z0Var = z0Var2;
            list = list4;
            str3 = str11;
            list2 = list5;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
            z = z3;
            z2 = z4;
        }
        c.b(mhpVar);
        return new j0(i, str2, str, str4, z, z2, str5, str6, str7, map, list2, str3, z0Var, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j0 j0Var = (j0) obj;
        l6bVar.getClass();
        j0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j0.n;
        String str = j0Var.a;
        List list = j0Var.m;
        z0 z0Var = j0Var.l;
        String str2 = j0Var.k;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, j0Var.b);
        c.p(mhpVar, 2, j0Var.c);
        c.j(mhpVar, 3, j0Var.d);
        c.j(mhpVar, 4, j0Var.e);
        c.p(mhpVar, 5, j0Var.f);
        c.p(mhpVar, 6, j0Var.g);
        c.p(mhpVar, 7, j0Var.h);
        c.k(mhpVar, 8, (t9f) arfVarArr[8].getValue(), j0Var.i);
        c.k(mhpVar, 9, (t9f) arfVarArr[9].getValue(), j0Var.j);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 10, tkr.a, str2);
        }
        if (c.e(mhpVar) || z0Var != null) {
            c.q(mhpVar, 11, x0.a, z0Var);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(mhpVar, 12, (t9f) arfVarArr[12].getValue(), list);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
