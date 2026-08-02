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
public final /* synthetic */ class h0 implements p3d {
    public static final h0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h0 h0Var = new h0();
        a = h0Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkButtonWidgetModel", h0Var, 7);
        j5mVar.k("displayRules", false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("type", false);
        j5mVar.k("textItems", false);
        j5mVar.k("templates", true);
        j5mVar.k(Constants.KEY_ACTION, true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = j0.h;
        tkr tkrVar = tkr.a;
        return new t9f[]{t1.a, w0.Companion.serializer(), tkrVar, tkrVar, arfVarArr[4].getValue(), ff7.C((t9f) arfVarArr[5].getValue()), ff7.C(g.Companion.serializer())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        g gVar;
        List list;
        x1 x1Var;
        w0 w0Var;
        String str;
        String str2;
        List list2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j0.h;
        int i2 = 6;
        int i3 = 3;
        int i4 = 2;
        x1 x1Var2 = null;
        if (c.m()) {
            x1 x1Var3 = (x1) c.z(mhpVar, 0, t1.a, null);
            w0 w0Var2 = (w0) c.z(mhpVar, 1, w0.Companion.serializer(), null);
            String g = c.g(mhpVar, 2);
            String g2 = c.g(mhpVar, 3);
            List list3 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            list = (List) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            x1Var = x1Var3;
            gVar = (g) c.n(mhpVar, 6, g.Companion.serializer(), null);
            str2 = g2;
            str = g;
            i = 127;
            list2 = list3;
            w0Var = w0Var2;
        } else {
            boolean z = true;
            int i5 = 0;
            g gVar2 = null;
            List list4 = null;
            w0 w0Var3 = null;
            String str3 = null;
            String str4 = null;
            List list5 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i3 = 3;
                    case 0:
                        x1Var2 = (x1) c.z(mhpVar, 0, t1.a, x1Var2);
                        i5 |= 1;
                        i2 = 6;
                        i3 = 3;
                    case 1:
                        w0Var3 = (w0) c.z(mhpVar, 1, w0.Companion.serializer(), w0Var3);
                        i5 |= 2;
                        i2 = 6;
                        i3 = 3;
                    case 2:
                        str3 = c.g(mhpVar, i4);
                        i5 |= 4;
                    case 3:
                        str4 = c.g(mhpVar, i3);
                        i5 |= 8;
                        i4 = 2;
                    case 4:
                        list5 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list5);
                        i5 |= 16;
                        i4 = 2;
                    case 5:
                        list4 = (List) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list4);
                        i5 |= 32;
                        i4 = 2;
                    case 6:
                        gVar2 = (g) c.n(mhpVar, i2, g.Companion.serializer(), gVar2);
                        i5 |= 64;
                        i4 = 2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            gVar = gVar2;
            list = list4;
            x1Var = x1Var2;
            w0Var = w0Var3;
            str = str3;
            str2 = str4;
            list2 = list5;
        }
        c.b(mhpVar);
        return new j0(i, gVar, w0Var, x1Var, str, str2, list2, list);
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
        arf[] arfVarArr = j0.h;
        t1 t1Var = t1.a;
        x1 x1Var = j0Var.a;
        g gVar = j0Var.g;
        List list = j0Var.f;
        c.k(mhpVar, 0, t1Var, x1Var);
        c.k(mhpVar, 1, w0.Companion.serializer(), j0Var.b);
        c.p(mhpVar, 2, j0Var.c);
        c.p(mhpVar, 3, j0Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), j0Var.e);
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list);
        }
        if (c.e(mhpVar) || gVar != null) {
            c.q(mhpVar, 6, g.Companion.serializer(), gVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
