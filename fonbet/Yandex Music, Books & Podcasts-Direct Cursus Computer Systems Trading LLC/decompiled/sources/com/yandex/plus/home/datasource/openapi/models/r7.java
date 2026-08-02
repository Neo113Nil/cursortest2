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
public final /* synthetic */ class r7 implements p3d {
    public static final r7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        r7 r7Var = new r7();
        a = r7Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkSwitchWidgetModel", r7Var, 7);
        j5mVar.k("displayRules", false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("type", false);
        j5mVar.k("templates", true);
        j5mVar.k(Constants.KEY_ACTION, true);
        j5mVar.k("textItems", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = t7.h;
        t9f serializer = w0.Companion.serializer();
        t9f C = ff7.C((t9f) arfVarArr[4].getValue());
        t9f C2 = ff7.C(g.Companion.serializer());
        t9f C3 = ff7.C((t9f) arfVarArr[6].getValue());
        tkr tkrVar = tkr.a;
        return new t9f[]{t1.a, serializer, tkrVar, tkrVar, C, C2, C3};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        g gVar;
        x1 x1Var;
        w0 w0Var;
        String str;
        String str2;
        List list2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = t7.h;
        int i2 = 5;
        int i3 = 3;
        int i4 = 2;
        x1 x1Var2 = null;
        if (c.m()) {
            x1 x1Var3 = (x1) c.z(mhpVar, 0, t1.a, null);
            w0 w0Var2 = (w0) c.z(mhpVar, 1, w0.Companion.serializer(), null);
            String g = c.g(mhpVar, 2);
            String g2 = c.g(mhpVar, 3);
            List list3 = (List) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            g gVar2 = (g) c.n(mhpVar, 5, g.Companion.serializer(), null);
            list = (List) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            x1Var = x1Var3;
            gVar = gVar2;
            str2 = g2;
            str = g;
            i = 127;
            list2 = list3;
            w0Var = w0Var2;
        } else {
            boolean z = true;
            int i5 = 0;
            List list4 = null;
            g gVar3 = null;
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
                        i2 = 5;
                        i3 = 3;
                    case 1:
                        w0Var3 = (w0) c.z(mhpVar, 1, w0.Companion.serializer(), w0Var3);
                        i5 |= 2;
                        i2 = 5;
                        i3 = 3;
                    case 2:
                        str3 = c.g(mhpVar, i4);
                        i5 |= 4;
                    case 3:
                        str4 = c.g(mhpVar, i3);
                        i5 |= 8;
                        i4 = 2;
                    case 4:
                        list5 = (List) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list5);
                        i5 |= 16;
                        i4 = 2;
                    case 5:
                        gVar3 = (g) c.n(mhpVar, i2, g.Companion.serializer(), gVar3);
                        i5 |= 32;
                        i4 = 2;
                    case 6:
                        list4 = (List) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), list4);
                        i5 |= 64;
                        i4 = 2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            list = list4;
            gVar = gVar3;
            x1Var = x1Var2;
            w0Var = w0Var3;
            str = str3;
            str2 = str4;
            list2 = list5;
        }
        c.b(mhpVar);
        return new t7(i, gVar, w0Var, x1Var, str, str2, list2, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t7 t7Var = (t7) obj;
        l6bVar.getClass();
        t7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = t7.h;
        t1 t1Var = t1.a;
        x1 x1Var = t7Var.a;
        List list = t7Var.g;
        g gVar = t7Var.f;
        List list2 = t7Var.e;
        c.k(mhpVar, 0, t1Var, x1Var);
        c.k(mhpVar, 1, w0.Companion.serializer(), t7Var.b);
        c.p(mhpVar, 2, t7Var.c);
        c.p(mhpVar, 3, t7Var.d);
        if (c.e(mhpVar) || list2 != null) {
            c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list2);
        }
        if (c.e(mhpVar) || gVar != null) {
            c.q(mhpVar, 5, g.Companion.serializer(), gVar);
        }
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 6, (t9f) arfVarArr[6].getValue(), list);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
