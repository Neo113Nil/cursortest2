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
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class p0 implements p3d {
    public static final p0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p0 p0Var = new p0();
        a = p0Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkConditionalPlaqueModel", p0Var, 11);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("feedbackToken", false);
        j5mVar.k("rootWidgetId", false);
        j5mVar.k("predicatesTree", false);
        j5mVar.k("priority", false);
        j5mVar.k("showAfterMillis", false);
        j5mVar.k("closeAfterMillis", false);
        j5mVar.k("notification", true);
        j5mVar.k("serviceMeta", true);
        j5mVar.k("metricContext", true);
        j5mVar.k("seenContext", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = r0.l;
        tkr tkrVar = tkr.a;
        t9f C = ff7.C(c5.Companion.serializer());
        t9f C2 = ff7.C((t9f) arfVarArr[8].getValue());
        t9f C3 = ff7.C((t9f) arfVarArr[9].getValue());
        t9f C4 = ff7.C(tkrVar);
        mvg mvgVar = mvg.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, f6.a, cqe.a, mvgVar, mvgVar, C, C2, C3, C4};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Map map;
        String str;
        Map map2;
        c5 c5Var;
        h6 h6Var;
        int i2;
        long j;
        String str2;
        String str3;
        String str4;
        long j2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = r0.l;
        int i3 = 10;
        int i4 = 7;
        int i5 = 5;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            h6 h6Var2 = (h6) c.z(mhpVar, 3, f6.a, null);
            int k = c.k(mhpVar, 4);
            long q = c.q(mhpVar, 5);
            long q2 = c.q(mhpVar, 6);
            c5 c5Var2 = (c5) c.n(mhpVar, 7, c5.Companion.serializer(), null);
            Map map3 = (Map) c.n(mhpVar, 8, (t9f) arfVarArr[8].getValue(), null);
            map = (Map) c.n(mhpVar, 9, (t9f) arfVarArr[9].getValue(), null);
            str2 = g;
            str = (String) c.n(mhpVar, 10, tkr.a, null);
            c5Var = c5Var2;
            j = q2;
            h6Var = h6Var2;
            i = k;
            str4 = g3;
            i2 = 2047;
            map2 = map3;
            str3 = g2;
            j2 = q;
        } else {
            long j3 = 0;
            boolean z = true;
            int i6 = 0;
            Map map4 = null;
            String str5 = null;
            Map map5 = null;
            c5 c5Var3 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            long j4 = 0;
            int i7 = 0;
            h6 h6Var3 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i3 = 10;
                    case 0:
                        str6 = c.g(mhpVar, 0);
                        i7 |= 1;
                        i3 = 10;
                        i4 = 7;
                    case 1:
                        str7 = c.g(mhpVar, 1);
                        i7 |= 2;
                        i3 = 10;
                        i4 = 7;
                    case 2:
                        str8 = c.g(mhpVar, 2);
                        i7 |= 4;
                        i3 = 10;
                        i4 = 7;
                    case 3:
                        h6Var3 = (h6) c.z(mhpVar, 3, f6.a, h6Var3);
                        i7 |= 8;
                        i3 = 10;
                        i4 = 7;
                    case 4:
                        i7 |= 16;
                        i6 = c.k(mhpVar, 4);
                    case 5:
                        j4 = c.q(mhpVar, i5);
                        i7 |= 32;
                    case 6:
                        j3 = c.q(mhpVar, 6);
                        i7 |= 64;
                        i5 = 5;
                    case 7:
                        c5Var3 = (c5) c.n(mhpVar, i4, c5.Companion.serializer(), c5Var3);
                        i7 |= 128;
                        i5 = 5;
                    case 8:
                        map5 = (Map) c.n(mhpVar, 8, (t9f) arfVarArr[8].getValue(), map5);
                        i7 |= 256;
                        i5 = 5;
                    case 9:
                        map4 = (Map) c.n(mhpVar, 9, (t9f) arfVarArr[9].getValue(), map4);
                        i7 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i5 = 5;
                    case 10:
                        str5 = (String) c.n(mhpVar, i3, tkr.a, str5);
                        i7 |= 1024;
                        i5 = 5;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i6;
            map = map4;
            str = str5;
            map2 = map5;
            c5Var = c5Var3;
            h6Var = h6Var3;
            i2 = i7;
            j = j3;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            j2 = j4;
        }
        c.b(mhpVar);
        return new r0(i2, str2, str3, str4, h6Var, i, j2, j, c5Var, map2, map, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r0 r0Var = (r0) obj;
        l6bVar.getClass();
        r0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = r0.l;
        String str = r0Var.a;
        String str2 = r0Var.k;
        Map map = r0Var.j;
        Map map2 = r0Var.i;
        c5 c5Var = r0Var.h;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, r0Var.b);
        c.p(mhpVar, 2, r0Var.c);
        c.k(mhpVar, 3, f6.a, r0Var.d);
        c.A(4, r0Var.e, mhpVar);
        c.g(mhpVar, 5, r0Var.f);
        c.g(mhpVar, 6, r0Var.g);
        if (c.e(mhpVar) || c5Var != null) {
            c.q(mhpVar, 7, c5.Companion.serializer(), c5Var);
        }
        if (c.e(mhpVar) || map2 != null) {
            c.q(mhpVar, 8, (t9f) arfVarArr[8].getValue(), map2);
        }
        if (c.e(mhpVar) || map != null) {
            c.q(mhpVar, 9, (t9f) arfVarArr[9].getValue(), map);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 10, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
