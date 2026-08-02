package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.arf;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements p3d {
    public static final g a;

    @NotNull
    private static final mhp descriptor;

    static {
        g gVar = new g();
        a = gVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionGetSmartOffersRequestDto.Context", gVar, 9);
        j5mVar.k(Constants.KEY_PAGE, false);
        j5mVar.k("places", false);
        j5mVar.k("targetToFeatures", false);
        j5mVar.k("expTestIds", false);
        j5mVar.k("expFlags", false);
        j5mVar.k("customProperties", false);
        j5mVar.k("googleCountryCode", false);
        j5mVar.k("isNativePaymentAllowed", false);
        j5mVar.k("storeId", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = i.j;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C((t9f) arfVarArr[1].getValue()), ff7.C((t9f) arfVarArr[2].getValue()), ff7.C((t9f) arfVarArr[3].getValue()), ff7.C((t9f) arfVarArr[4].getValue()), ff7.C((t9f) arfVarArr[5].getValue()), ff7.C(tkrVar), ff7.C(oc3.a), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        Boolean bool;
        Map map;
        Set set;
        Set set2;
        String str3;
        Set set3;
        Set set4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = i.j;
        int i2 = 7;
        char c2 = 6;
        String str4 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str5 = (String) c.n(mhpVar, 0, tkrVar, null);
            Set set5 = (Set) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            Set set6 = (Set) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            Set set7 = (Set) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            Set set8 = (Set) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            Map map2 = (Map) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            String str6 = (String) c.n(mhpVar, 6, tkrVar, null);
            Boolean bool2 = (Boolean) c.n(mhpVar, 7, oc3.a, null);
            map = map2;
            str = (String) c.n(mhpVar, 8, tkrVar, null);
            bool = bool2;
            str2 = str6;
            i = 511;
            set2 = set7;
            set = set8;
            set4 = set6;
            set3 = set5;
            str3 = str5;
        } else {
            int i3 = 5;
            int i4 = 3;
            int i5 = 4;
            int i6 = 2;
            int i7 = 1;
            boolean z = true;
            int i8 = 0;
            String str7 = null;
            String str8 = null;
            Boolean bool3 = null;
            Map map3 = null;
            Set set9 = null;
            Set set10 = null;
            Set set11 = null;
            Set set12 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i7 = 1;
                        i6 = 2;
                        i4 = 3;
                        i5 = 4;
                        i3 = 5;
                    case 0:
                        str4 = (String) c.n(mhpVar, 0, tkr.a, str4);
                        i8 |= 1;
                        i2 = 7;
                        c2 = 6;
                        i7 = 1;
                        i6 = 2;
                        i4 = 3;
                        i5 = 4;
                        i3 = 5;
                    case 1:
                        set11 = (Set) c.n(mhpVar, i7, (t9f) arfVarArr[i7].getValue(), set11);
                        i8 |= 2;
                        i2 = 7;
                        c2 = 6;
                        i6 = 2;
                        i4 = 3;
                        i5 = 4;
                        i3 = 5;
                    case 2:
                        set12 = (Set) c.n(mhpVar, i6, (t9f) arfVarArr[i6].getValue(), set12);
                        i8 |= 4;
                        i2 = 7;
                        c2 = 6;
                        i4 = 3;
                        i5 = 4;
                        i3 = 5;
                    case 3:
                        set10 = (Set) c.n(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), set10);
                        i8 |= 8;
                        i2 = 7;
                        c2 = 6;
                        i5 = 4;
                        i3 = 5;
                    case 4:
                        set9 = (Set) c.n(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), set9);
                        i8 |= 16;
                        i2 = 7;
                        c2 = 6;
                        i3 = 5;
                    case 5:
                        map3 = (Map) c.n(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), map3);
                        i8 |= 32;
                        i2 = 7;
                        c2 = 6;
                    case 6:
                        str8 = (String) c.n(mhpVar, 6, tkr.a, str8);
                        i8 |= 64;
                        c2 = 6;
                        i2 = 7;
                    case 7:
                        bool3 = (Boolean) c.n(mhpVar, i2, oc3.a, bool3);
                        i8 |= 128;
                        c2 = 6;
                    case 8:
                        str7 = (String) c.n(mhpVar, 8, tkr.a, str7);
                        i8 |= 256;
                        c2 = 6;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i8;
            str = str7;
            str2 = str8;
            bool = bool3;
            map = map3;
            set = set9;
            set2 = set10;
            str3 = str4;
            set3 = set11;
            set4 = set12;
        }
        c.b(mhpVar);
        return new i(i, str3, set3, set4, set2, set, map, str2, bool, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i iVar = (i) obj;
        l6bVar.getClass();
        iVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = i.j;
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, iVar.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), iVar.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), iVar.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), iVar.d);
        c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), iVar.e);
        c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), iVar.f);
        c.q(mhpVar, 6, tkrVar, iVar.g);
        c.q(mhpVar, 7, oc3.a, iVar.h);
        c.q(mhpVar, 8, tkrVar, iVar.i);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
