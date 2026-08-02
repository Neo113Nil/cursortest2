package com.yandex.plus.home.dailyquests.repository.rest.prefs;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements p3d {
    public static final b a;

    @NotNull
    private static final mhp descriptor;

    static {
        b bVar = new b();
        a = bVar;
        j5m j5mVar = new j5m("done_daily_quest", bVar, 10);
        j5mVar.k("created_at", false);
        j5mVar.k("shortcut_id", false);
        j5mVar.k("popup_id", false);
        j5mVar.k("deeplink", false);
        j5mVar.k("title", false);
        j5mVar.k("subtitle", false);
        j5mVar.k("light_image_url", false);
        j5mVar.k("dark_image_url", false);
        j5mVar.k("light_completed_image_url", false);
        j5mVar.k("dark__completed_image_url", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = l.k;
        tkr tkrVar = tkr.a;
        return new t9f[]{mvg.a, tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), tkrVar, arfVarArr[5].getValue(), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        k kVar;
        String str5;
        String str6;
        String str7;
        String str8;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = l.k;
        int i2 = 9;
        int i3 = 7;
        char c2 = 6;
        String str9 = null;
        if (c.m()) {
            long q = c.q(mhpVar, 0);
            String g = c.g(mhpVar, 1);
            tkr tkrVar = tkr.a;
            String str10 = (String) c.n(mhpVar, 2, tkrVar, null);
            String str11 = (String) c.n(mhpVar, 3, tkrVar, null);
            String g2 = c.g(mhpVar, 4);
            k kVar2 = (k) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            String str12 = (String) c.n(mhpVar, 6, tkrVar, null);
            String str13 = (String) c.n(mhpVar, 7, tkrVar, null);
            String str14 = (String) c.n(mhpVar, 8, tkrVar, null);
            kVar = kVar2;
            str6 = g;
            str4 = (String) c.n(mhpVar, 9, tkrVar, null);
            str = str13;
            str3 = str12;
            str5 = str11;
            str2 = str14;
            str8 = g2;
            str7 = str10;
            i = 1023;
            j = q;
        } else {
            int i4 = 5;
            boolean z = true;
            int i5 = 0;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            k kVar3 = null;
            String str19 = null;
            long j2 = 0;
            String str20 = null;
            String str21 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 9;
                        c2 = 6;
                        i4 = 5;
                    case 0:
                        j2 = c.q(mhpVar, 0);
                        i5 |= 1;
                        i2 = 9;
                        i3 = 7;
                        c2 = 6;
                        i4 = 5;
                    case 1:
                        str9 = c.g(mhpVar, 1);
                        i5 |= 2;
                        i2 = 9;
                        i3 = 7;
                        c2 = 6;
                        i4 = 5;
                    case 2:
                        str20 = (String) c.n(mhpVar, 2, tkr.a, str20);
                        i5 |= 4;
                        i2 = 9;
                        i3 = 7;
                        c2 = 6;
                        i4 = 5;
                    case 3:
                        str19 = (String) c.n(mhpVar, 3, tkr.a, str19);
                        i5 |= 8;
                        i2 = 9;
                        i3 = 7;
                        c2 = 6;
                        i4 = 5;
                    case 4:
                        str21 = c.g(mhpVar, 4);
                        i5 |= 16;
                        i2 = 9;
                        c2 = 6;
                    case 5:
                        kVar3 = (k) c.z(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), kVar3);
                        i5 |= 32;
                        i2 = 9;
                        c2 = 6;
                    case 6:
                        str17 = (String) c.n(mhpVar, 6, tkr.a, str17);
                        i5 |= 64;
                        c2 = 6;
                        i2 = 9;
                    case 7:
                        str15 = (String) c.n(mhpVar, i3, tkr.a, str15);
                        i5 |= 128;
                        c2 = 6;
                    case 8:
                        str16 = (String) c.n(mhpVar, 8, tkr.a, str16);
                        i5 |= 256;
                        c2 = 6;
                    case 9:
                        str18 = (String) c.n(mhpVar, i2, tkr.a, str18);
                        i5 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c2 = 6;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            str = str15;
            str2 = str16;
            str3 = str17;
            str4 = str18;
            kVar = kVar3;
            str5 = str19;
            str6 = str9;
            str7 = str20;
            str8 = str21;
            j = j2;
        }
        c.b(mhpVar);
        return new l(i, j, str6, str7, str5, str8, kVar, str3, str, str2, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l lVar = (l) obj;
        l6bVar.getClass();
        lVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = l.k;
        c.g(mhpVar, 0, lVar.a);
        c.p(mhpVar, 1, lVar.b);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 2, tkrVar, lVar.c);
        c.q(mhpVar, 3, tkrVar, lVar.d);
        c.p(mhpVar, 4, lVar.e);
        c.k(mhpVar, 5, (t9f) arfVarArr[5].getValue(), lVar.f);
        c.q(mhpVar, 6, tkrVar, lVar.g);
        c.q(mhpVar, 7, tkrVar, lVar.h);
        c.q(mhpVar, 8, tkrVar, lVar.i);
        c.q(mhpVar, 9, tkrVar, lVar.j);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
