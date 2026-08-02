package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.eg7;
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
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements p3d {
    public static final i3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        i3 i3Var = new i3();
        a = i3Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetChallengeRequest.Params", i3Var, 9);
        j5mVar.k("os", true);
        j5mVar.k(CommonUrlParts.OS_VERSION, false);
        j5mVar.k("appID", false);
        j5mVar.k("app_version", false);
        j5mVar.k("am_version", false);
        j5mVar.k("uid", false);
        j5mVar.k("retpath", false);
        j5mVar.k("token", false);
        j5mVar.k("extid", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = k3.l;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, arfVarArr[6].getValue(), tkrVar, com.yandex.passport.data.serialization.a.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        int i;
        UUID uuid;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = k3.l;
        int i3 = 7;
        int i4 = 1;
        int i5 = 0;
        UUID uuid2 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            String g4 = c.g(mhpVar, 3);
            String g5 = c.g(mhpVar, 4);
            String g6 = c.g(mhpVar, 5);
            com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            str = bVar != null ? bVar.a : null;
            str2 = g;
            str3 = c.g(mhpVar, 7);
            str4 = g6;
            str5 = g4;
            uuid = (UUID) c.z(mhpVar, 8, com.yandex.passport.data.serialization.a.a, null);
            str6 = g5;
            str7 = g3;
            i = 511;
            str8 = g2;
        } else {
            boolean z = true;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        i2 = i4;
                        z = false;
                        i4 = i2;
                        i3 = 7;
                    case 0:
                        i2 = i4;
                        str10 = c.g(mhpVar, 0);
                        i5 |= 1;
                        i4 = i2;
                        i3 = 7;
                    case 1:
                        str16 = c.g(mhpVar, i4);
                        i5 |= 2;
                        i3 = 7;
                    case 2:
                        str15 = c.g(mhpVar, 2);
                        i5 |= 4;
                        i3 = 7;
                        i4 = 1;
                    case 3:
                        str13 = c.g(mhpVar, 3);
                        i5 |= 8;
                        i3 = 7;
                        i4 = 1;
                    case 4:
                        str14 = c.g(mhpVar, 4);
                        i5 |= 16;
                        i3 = 7;
                        i4 = 1;
                    case 5:
                        str12 = c.g(mhpVar, 5);
                        i5 |= 32;
                        i3 = 7;
                        i4 = 1;
                    case 6:
                        com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), str9 != null ? new com.yandex.passport.common.url.b(str9) : null);
                        str9 = bVar2 != null ? bVar2.a : null;
                        i5 |= 64;
                        i3 = 7;
                        i4 = 1;
                    case 7:
                        str11 = c.g(mhpVar, i3);
                        i5 |= 128;
                        i4 = 1;
                    case 8:
                        uuid2 = (UUID) c.z(mhpVar, 8, com.yandex.passport.data.serialization.a.a, uuid2);
                        i5 |= 256;
                        i4 = 1;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            str = str9;
            i = i5;
            uuid = uuid2;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
            str8 = str16;
        }
        c.b(mhpVar);
        return new k3(i, str2, str8, str7, str5, str6, str4, str, str3, uuid);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        k3 k3Var = (k3) obj;
        l6bVar.getClass();
        k3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = k3.l;
        c.p(mhpVar, 0, k3Var.c);
        c.p(mhpVar, 1, k3Var.d);
        c.p(mhpVar, 2, k3Var.e);
        c.p(mhpVar, 3, k3Var.f);
        c.p(mhpVar, 4, k3Var.g);
        c.p(mhpVar, 5, k3Var.h);
        c.k(mhpVar, 6, (t9f) arfVarArr[6].getValue(), new com.yandex.passport.common.url.b(k3Var.i));
        c.p(mhpVar, 7, k3Var.j);
        c.k(mhpVar, 8, com.yandex.passport.data.serialization.a.a, k3Var.k);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
