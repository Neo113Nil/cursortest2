package com.yandex.plus.home.feature.webviews.internalapi.subscription;

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
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements p3d {
    public static final a a;

    @NotNull
    private static final mhp descriptor;

    static {
        a aVar = new a();
        a = aVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError.EmptyProductsByTarget", aVar, 7);
        j5mVar.k(Constants.KEY_MESSAGE, false);
        j5mVar.k("place", false);
        j5mVar.k("storyId", false);
        j5mVar.k("targetId", false);
        j5mVar.k("vendorType", false);
        j5mVar.k("offersIds", false);
        j5mVar.k("paymentMethod", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = c.h;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), tkrVar, tkrVar, arfVarArr[5].getValue(), tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = c.h;
        int i2 = 6;
        int i3 = 3;
        String str7 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str8 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str9 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str10 = (String) c.n(mhpVar, 2, tkrVar, null);
            String g = c.g(mhpVar, 3);
            String g2 = c.g(mhpVar, 4);
            list = (List) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            str3 = str10;
            str6 = c.g(mhpVar, 6);
            str4 = g;
            str5 = g2;
            i = 127;
            str2 = str9;
            str = str8;
        } else {
            boolean z = true;
            int i4 = 0;
            List list2 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i3 = 3;
                    case 0:
                        str7 = (String) c.n(mhpVar, 0, tkr.a, str7);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 3;
                    case 1:
                        str11 = (String) c.n(mhpVar, 1, tkr.a, str11);
                        i4 |= 2;
                        i2 = 6;
                    case 2:
                        str12 = (String) c.n(mhpVar, 2, tkr.a, str12);
                        i4 |= 4;
                        i2 = 6;
                    case 3:
                        str13 = c.g(mhpVar, i3);
                        i4 |= 8;
                        i2 = 6;
                    case 4:
                        str14 = c.g(mhpVar, 4);
                        i4 |= 16;
                        i2 = 6;
                    case 5:
                        list2 = (List) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list2);
                        i4 |= 32;
                        i2 = 6;
                    case 6:
                        str15 = c.g(mhpVar, i2);
                        i4 |= 64;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i4;
            list = list2;
            str = str7;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            str5 = str14;
            str6 = str15;
        }
        c.b(mhpVar);
        return new c(i, str, str2, str3, str4, str5, list, str6);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c cVar = (c) obj;
        l6bVar.getClass();
        cVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = c.h;
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, cVar.a);
        c.q(mhpVar, 1, tkrVar, cVar.b);
        c.q(mhpVar, 2, tkrVar, cVar.c);
        c.p(mhpVar, 3, cVar.d);
        c.p(mhpVar, 4, cVar.e);
        c.k(mhpVar, 5, (t9f) arfVarArr[5].getValue(), cVar.f);
        c.p(mhpVar, 6, cVar.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
