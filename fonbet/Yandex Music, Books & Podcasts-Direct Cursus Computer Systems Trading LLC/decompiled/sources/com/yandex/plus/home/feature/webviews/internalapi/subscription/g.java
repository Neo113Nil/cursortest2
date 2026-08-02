package com.yandex.plus.home.feature.webviews.internalapi.subscription;

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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements p3d {
    public static final g a;

    @NotNull
    private static final mhp descriptor;

    static {
        g gVar = new g();
        a = gVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError.NoProductsByTarget", gVar, 6);
        j5mVar.k(Constants.KEY_MESSAGE, false);
        j5mVar.k("place", false);
        j5mVar.k("storyId", false);
        j5mVar.k("targetId", false);
        j5mVar.k("errorMessage", false);
        j5mVar.k("paymentMethod", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), tkrVar, ff7.C(tkrVar), tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 5;
        String str7 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str8 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str9 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str10 = (String) c.n(mhpVar, 2, tkrVar, null);
            String g = c.g(mhpVar, 3);
            str5 = (String) c.n(mhpVar, 4, tkrVar, null);
            str6 = c.g(mhpVar, 5);
            str4 = g;
            i = 63;
            str3 = str10;
            str2 = str9;
            str = str8;
        } else {
            boolean z = true;
            int i3 = 0;
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
                        continue;
                    case 0:
                        str7 = (String) c.n(mhpVar, 0, tkr.a, str7);
                        i3 |= 1;
                        break;
                    case 1:
                        str11 = (String) c.n(mhpVar, 1, tkr.a, str11);
                        i3 |= 2;
                        break;
                    case 2:
                        str12 = (String) c.n(mhpVar, 2, tkr.a, str12);
                        i3 |= 4;
                        break;
                    case 3:
                        str13 = c.g(mhpVar, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        str14 = (String) c.n(mhpVar, 4, tkr.a, str14);
                        i3 |= 16;
                        break;
                    case 5:
                        str15 = c.g(mhpVar, i2);
                        i3 |= 32;
                        continue;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 5;
            }
            i = i3;
            str = str7;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            str5 = str14;
            str6 = str15;
        }
        c.b(mhpVar);
        return new i(i, str, str2, str3, str4, str5, str6);
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
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, iVar.a);
        c.q(mhpVar, 1, tkrVar, iVar.b);
        c.q(mhpVar, 2, tkrVar, iVar.c);
        c.p(mhpVar, 3, iVar.d);
        c.q(mhpVar, 4, tkrVar, iVar.e);
        c.p(mhpVar, 5, iVar.f);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
