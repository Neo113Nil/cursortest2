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
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class h7 implements p3d {
    public static final h7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h7 h7Var = new h7();
        a = h7Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkSpacerWidgetModel", h7Var, 6);
        j5mVar.k("displayRules", false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("type", false);
        j5mVar.k("templates", true);
        j5mVar.k(Constants.KEY_ACTION, true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = j7.g;
        t9f serializer = w0.Companion.serializer();
        t9f C = ff7.C((t9f) arfVarArr[4].getValue());
        t9f C2 = ff7.C(g.Companion.serializer());
        tkr tkrVar = tkr.a;
        return new t9f[]{t1.a, serializer, tkrVar, tkrVar, C, C2};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        x1 x1Var;
        w0 w0Var;
        String str;
        String str2;
        List list;
        g gVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j7.g;
        int i2 = 5;
        boolean z = false;
        x1 x1Var2 = null;
        if (c.m()) {
            x1 x1Var3 = (x1) c.z(mhpVar, 0, t1.a, null);
            w0 w0Var2 = (w0) c.z(mhpVar, 1, w0.Companion.serializer(), null);
            String g = c.g(mhpVar, 2);
            String g2 = c.g(mhpVar, 3);
            list = (List) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            x1Var = x1Var3;
            gVar = (g) c.n(mhpVar, 5, g.Companion.serializer(), null);
            str2 = g2;
            str = g;
            i = 63;
            w0Var = w0Var2;
        } else {
            boolean z2 = true;
            int i3 = 0;
            w0 w0Var3 = null;
            String str3 = null;
            String str4 = null;
            List list2 = null;
            g gVar2 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = z;
                        i2 = 5;
                    case 0:
                        x1Var2 = (x1) c.z(mhpVar, 0, t1.a, x1Var2);
                        i3 |= 1;
                        z = false;
                        i2 = 5;
                    case 1:
                        w0Var3 = (w0) c.z(mhpVar, 1, w0.Companion.serializer(), w0Var3);
                        i3 |= 2;
                        z = false;
                    case 2:
                        str3 = c.g(mhpVar, 2);
                        i3 |= 4;
                        z = false;
                    case 3:
                        str4 = c.g(mhpVar, 3);
                        i3 |= 8;
                        z = false;
                    case 4:
                        list2 = (List) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list2);
                        i3 |= 16;
                        z = false;
                    case 5:
                        gVar2 = (g) c.n(mhpVar, i2, g.Companion.serializer(), gVar2);
                        i3 |= 32;
                        z = false;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            x1Var = x1Var2;
            w0Var = w0Var3;
            str = str3;
            str2 = str4;
            list = list2;
            gVar = gVar2;
        }
        c.b(mhpVar);
        return new j7(i, x1Var, w0Var, str, str2, list, gVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j7 j7Var = (j7) obj;
        l6bVar.getClass();
        j7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j7.g;
        t1 t1Var = t1.a;
        x1 x1Var = j7Var.a;
        g gVar = j7Var.f;
        List list = j7Var.e;
        c.k(mhpVar, 0, t1Var, x1Var);
        c.k(mhpVar, 1, w0.Companion.serializer(), j7Var.b);
        c.p(mhpVar, 2, j7Var.c);
        c.p(mhpVar, 3, j7Var.d);
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list);
        }
        if (c.e(mhpVar) || gVar != null) {
            c.q(mhpVar, 5, g.Companion.serializer(), gVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
