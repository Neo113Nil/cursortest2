package com.yandex.plus.home.datasource.openapi.models;

import com.connectsdk.device.ConnectableDevice;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class q4 implements p3d {
    public static final q4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        q4 q4Var = new q4();
        a = q4Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkMissionDtoModel", q4Var, 14);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("isActivated", false);
        j5mVar.k("darkImageUrl", false);
        j5mVar.k("lightImageUrl", false);
        j5mVar.k("title", false);
        j5mVar.k("rewardFallbackText", false);
        j5mVar.k("status", false);
        j5mVar.k("lightCompletedImageUrl", true);
        j5mVar.k("darkCompletedImageUrl", true);
        j5mVar.k("progress", true);
        j5mVar.k("chainToolbarTitle", true);
        j5mVar.k("reward", true);
        j5mVar.k("daysLeft", true);
        j5mVar.k(Constants.KEY_ACTION, true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = t4.o;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, oc3.a, tkrVar, tkrVar, tkrVar, tkrVar, arfVarArr[6].getValue(), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(l6.a), ff7.C(tkrVar), ff7.C(r6.a), ff7.C(cqe.a), ff7.C(c.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        boolean z;
        String str;
        s4 s4Var;
        e eVar;
        t6 t6Var;
        n6 n6Var;
        String str2;
        String str3;
        Integer num;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = t4.o;
        int i2 = 10;
        char c2 = '\t';
        char c3 = '\b';
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            boolean D = c.D(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            String g3 = c.g(mhpVar, 3);
            String g4 = c.g(mhpVar, 4);
            String g5 = c.g(mhpVar, 5);
            s4 s4Var2 = (s4) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            tkr tkrVar = tkr.a;
            String str9 = (String) c.n(mhpVar, 7, tkrVar, null);
            String str10 = (String) c.n(mhpVar, 8, tkrVar, null);
            n6 n6Var2 = (n6) c.n(mhpVar, 9, l6.a, null);
            String str11 = (String) c.n(mhpVar, 10, tkrVar, null);
            t6 t6Var2 = (t6) c.n(mhpVar, 11, r6.a, null);
            Integer num2 = (Integer) c.n(mhpVar, 12, cqe.a, null);
            i = 16383;
            eVar = (e) c.n(mhpVar, 13, c.a, null);
            str4 = g;
            z = D;
            str5 = g2;
            str2 = str11;
            n6Var = n6Var2;
            str = str9;
            str8 = g5;
            str6 = g3;
            str3 = str10;
            str7 = g4;
            t6Var = t6Var2;
            num = num2;
            s4Var = s4Var2;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str12 = null;
            e eVar2 = null;
            t6 t6Var3 = null;
            n6 n6Var3 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            int i3 = 6;
            i = 0;
            s4 s4Var3 = null;
            Integer num3 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = false;
                        i2 = 10;
                        c2 = '\t';
                        i3 = 6;
                    case 0:
                        str15 = c.g(mhpVar, 0);
                        i |= 1;
                        i2 = 10;
                        c2 = '\t';
                        c3 = '\b';
                        i3 = 6;
                    case 1:
                        i |= 2;
                        z3 = c.D(mhpVar, 1);
                        i2 = 10;
                        c2 = '\t';
                        c3 = '\b';
                        i3 = 6;
                    case 2:
                        str16 = c.g(mhpVar, 2);
                        i |= 4;
                        i2 = 10;
                        c2 = '\t';
                        c3 = '\b';
                        i3 = 6;
                    case 3:
                        str17 = c.g(mhpVar, 3);
                        i |= 8;
                        i2 = 10;
                        c2 = '\t';
                        c3 = '\b';
                        i3 = 6;
                    case 4:
                        str18 = c.g(mhpVar, 4);
                        i |= 16;
                        i2 = 10;
                        c2 = '\t';
                        c3 = '\b';
                        i3 = 6;
                    case 5:
                        str19 = c.g(mhpVar, 5);
                        i |= 32;
                        i2 = 10;
                        c2 = '\t';
                        c3 = '\b';
                    case 6:
                        s4Var3 = (s4) c.z(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), s4Var3);
                        i |= 64;
                        i2 = 10;
                        c2 = '\t';
                        c3 = '\b';
                    case 7:
                        str12 = (String) c.n(mhpVar, 7, tkr.a, str12);
                        i |= 128;
                        i2 = 10;
                        c2 = '\t';
                        c3 = '\b';
                    case 8:
                        str14 = (String) c.n(mhpVar, 8, tkr.a, str14);
                        i |= 256;
                        c3 = '\b';
                        i2 = 10;
                        c2 = '\t';
                    case 9:
                        n6Var3 = (n6) c.n(mhpVar, 9, l6.a, n6Var3);
                        i |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c2 = '\t';
                        i2 = 10;
                        c3 = '\b';
                    case 10:
                        str13 = (String) c.n(mhpVar, i2, tkr.a, str13);
                        i |= 1024;
                        c2 = '\t';
                        c3 = '\b';
                    case 11:
                        t6Var3 = (t6) c.n(mhpVar, 11, r6.a, t6Var3);
                        i |= 2048;
                        c2 = '\t';
                        c3 = '\b';
                    case 12:
                        num3 = (Integer) c.n(mhpVar, 12, cqe.a, num3);
                        i |= 4096;
                        c2 = '\t';
                        c3 = '\b';
                    case 13:
                        eVar2 = (e) c.n(mhpVar, 13, c.a, eVar2);
                        i |= RemoteCameraConfig.Notification.ID;
                        c2 = '\t';
                        c3 = '\b';
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            z = z3;
            str = str12;
            s4Var = s4Var3;
            eVar = eVar2;
            t6Var = t6Var3;
            n6Var = n6Var3;
            str2 = str13;
            str3 = str14;
            num = num3;
            str4 = str15;
            str5 = str16;
            str6 = str17;
            str7 = str18;
            str8 = str19;
        }
        int i4 = i;
        c.b(mhpVar);
        return new t4(i4, str4, z, str5, str6, str7, str8, s4Var, str, str3, n6Var, str2, t6Var, num, eVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t4 t4Var = (t4) obj;
        l6bVar.getClass();
        t4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = t4.o;
        String str = t4Var.a;
        e eVar = t4Var.n;
        Integer num = t4Var.m;
        t6 t6Var = t4Var.l;
        String str2 = t4Var.k;
        n6 n6Var = t4Var.j;
        String str3 = t4Var.i;
        String str4 = t4Var.h;
        c.p(mhpVar, 0, str);
        c.j(mhpVar, 1, t4Var.b);
        c.p(mhpVar, 2, t4Var.c);
        c.p(mhpVar, 3, t4Var.d);
        c.p(mhpVar, 4, t4Var.e);
        c.p(mhpVar, 5, t4Var.f);
        c.k(mhpVar, 6, (t9f) arfVarArr[6].getValue(), t4Var.g);
        if (c.e(mhpVar) || str4 != null) {
            c.q(mhpVar, 7, tkr.a, str4);
        }
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 8, tkr.a, str3);
        }
        if (c.e(mhpVar) || n6Var != null) {
            c.q(mhpVar, 9, l6.a, n6Var);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 10, tkr.a, str2);
        }
        if (c.e(mhpVar) || t6Var != null) {
            c.q(mhpVar, 11, r6.a, t6Var);
        }
        if (c.e(mhpVar) || num != null) {
            c.q(mhpVar, 12, cqe.a, num);
        }
        if (c.e(mhpVar) || eVar != null) {
            c.q(mhpVar, 13, c.a, eVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
