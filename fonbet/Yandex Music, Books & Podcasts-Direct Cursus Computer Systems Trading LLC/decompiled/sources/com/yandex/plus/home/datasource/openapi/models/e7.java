package com.yandex.plus.home.datasource.openapi.models;

import com.connectsdk.device.ConnectableDevice;
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
public final /* synthetic */ class e7 implements p3d {
    public static final e7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e7 e7Var = new e7();
        a = e7Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkSimplePlaqueModel", e7Var, 6);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("feedbackToken", false);
        j5mVar.k("rootWidgetId", false);
        j5mVar.k("notification", true);
        j5mVar.k("serviceMeta", true);
        j5mVar.k("metricContext", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = g7.g;
        t9f C = ff7.C(c5.Companion.serializer());
        t9f C2 = ff7.C((t9f) arfVarArr[4].getValue());
        t9f C3 = ff7.C((t9f) arfVarArr[5].getValue());
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, C, C2, C3};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        c5 c5Var;
        Map map;
        Map map2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g7.g;
        int i2 = 0;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            c5 c5Var2 = (c5) c.n(mhpVar, 3, c5.Companion.serializer(), null);
            Map map3 = (Map) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            map2 = (Map) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            str = g;
            c5Var = c5Var2;
            str3 = g3;
            i = 63;
            map = map3;
            str2 = g2;
        } else {
            int i3 = 1;
            int i4 = 0;
            String str5 = null;
            String str6 = null;
            c5 c5Var3 = null;
            Map map4 = null;
            Map map5 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        i3 = i2;
                        continue;
                    case 0:
                        str4 = c.g(mhpVar, i2);
                        i4 |= 1;
                        continue;
                    case 1:
                        str5 = c.g(mhpVar, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        str6 = c.g(mhpVar, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        c5Var3 = (c5) c.n(mhpVar, 3, c5.Companion.serializer(), c5Var3);
                        i4 |= 8;
                        break;
                    case 4:
                        map4 = (Map) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), map4);
                        i4 |= 16;
                        break;
                    case 5:
                        map5 = (Map) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), map5);
                        i4 |= 32;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 0;
            }
            i = i4;
            str = str4;
            str2 = str5;
            str3 = str6;
            c5Var = c5Var3;
            map = map4;
            map2 = map5;
        }
        c.b(mhpVar);
        return new g7(i, str, str2, str3, c5Var, map, map2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g7 g7Var = (g7) obj;
        l6bVar.getClass();
        g7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = g7.g;
        String str = g7Var.a;
        Map map = g7Var.f;
        Map map2 = g7Var.e;
        c5 c5Var = g7Var.d;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, g7Var.b);
        c.p(mhpVar, 2, g7Var.c);
        if (c.e(mhpVar) || c5Var != null) {
            c.q(mhpVar, 3, c5.Companion.serializer(), c5Var);
        }
        if (c.e(mhpVar) || map2 != null) {
            c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), map2);
        }
        if (c.e(mhpVar) || map != null) {
            c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), map);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
