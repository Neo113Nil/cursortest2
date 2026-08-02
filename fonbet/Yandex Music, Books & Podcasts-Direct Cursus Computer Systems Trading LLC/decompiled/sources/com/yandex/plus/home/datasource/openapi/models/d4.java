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
public final /* synthetic */ class d4 implements p3d {
    public static final d4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d4 d4Var = new d4();
        a = d4Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkLineWidgetGroupModel", d4Var, 8);
        j5mVar.k("displayRules", false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("type", false);
        j5mVar.k("widgetIds", false);
        j5mVar.k("orientation", false);
        j5mVar.k("templates", true);
        j5mVar.k(Constants.KEY_ACTION, true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = g4.i;
        tkr tkrVar = tkr.a;
        return new t9f[]{t1.a, w0.Companion.serializer(), tkrVar, tkrVar, arfVarArr[4].getValue(), arfVarArr[5].getValue(), ff7.C((t9f) arfVarArr[6].getValue()), ff7.C(g.Companion.serializer())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        g gVar;
        List list;
        f4 f4Var;
        List list2;
        x1 x1Var;
        w0 w0Var;
        String str;
        String str2;
        int i2;
        int i3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g4.i;
        int i4 = 7;
        int i5 = 6;
        int i6 = 4;
        x1 x1Var2 = null;
        if (c.m()) {
            x1 x1Var3 = (x1) c.z(mhpVar, 0, t1.a, null);
            w0 w0Var2 = (w0) c.z(mhpVar, 1, w0.Companion.serializer(), null);
            String g = c.g(mhpVar, 2);
            String g2 = c.g(mhpVar, 3);
            List list3 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            f4 f4Var2 = (f4) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            list = (List) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            x1Var = x1Var3;
            gVar = (g) c.n(mhpVar, 7, g.Companion.serializer(), null);
            str2 = g2;
            str = g;
            i = 255;
            f4Var = f4Var2;
            list2 = list3;
            w0Var = w0Var2;
        } else {
            boolean z = true;
            int i7 = 0;
            g gVar2 = null;
            List list4 = null;
            f4 f4Var3 = null;
            List list5 = null;
            w0 w0Var3 = null;
            String str3 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i5 = 6;
                        i6 = 4;
                    case 0:
                        x1Var2 = (x1) c.z(mhpVar, 0, t1.a, x1Var2);
                        i7 |= 1;
                        i4 = 7;
                        i5 = 6;
                        i6 = 4;
                    case 1:
                        w0Var3 = (w0) c.z(mhpVar, 1, w0.Companion.serializer(), w0Var3);
                        i7 |= 2;
                        i4 = 7;
                        i5 = 6;
                        i6 = 4;
                    case 2:
                        i7 |= 4;
                        i6 = i6;
                        str3 = c.g(mhpVar, 2);
                        i4 = 7;
                    case 3:
                        i3 = i6;
                        str4 = c.g(mhpVar, 3);
                        i7 |= 8;
                        i6 = i3;
                        i4 = 7;
                    case 4:
                        int i8 = i6;
                        i3 = i8;
                        list5 = (List) c.z(mhpVar, i3, (t9f) arfVarArr[i8].getValue(), list5);
                        i7 |= 16;
                        i6 = i3;
                        i4 = 7;
                    case 5:
                        i2 = i6;
                        f4Var3 = (f4) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), f4Var3);
                        i7 |= 32;
                        i6 = i2;
                    case 6:
                        i2 = i6;
                        list4 = (List) c.n(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), list4);
                        i7 |= 64;
                        i6 = i2;
                    case 7:
                        i2 = i6;
                        gVar2 = (g) c.n(mhpVar, i4, g.Companion.serializer(), gVar2);
                        i7 |= 128;
                        i6 = i2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i7;
            gVar = gVar2;
            list = list4;
            f4Var = f4Var3;
            list2 = list5;
            x1Var = x1Var2;
            w0Var = w0Var3;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new g4(i, x1Var, w0Var, str, str2, list2, f4Var, list, gVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g4 g4Var = (g4) obj;
        l6bVar.getClass();
        g4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = g4.i;
        t1 t1Var = t1.a;
        x1 x1Var = g4Var.a;
        g gVar = g4Var.h;
        List list = g4Var.g;
        c.k(mhpVar, 0, t1Var, x1Var);
        c.k(mhpVar, 1, w0.Companion.serializer(), g4Var.b);
        c.p(mhpVar, 2, g4Var.c);
        c.p(mhpVar, 3, g4Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), g4Var.e);
        c.k(mhpVar, 5, (t9f) arfVarArr[5].getValue(), g4Var.f);
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 6, (t9f) arfVarArr[6].getValue(), list);
        }
        if (c.e(mhpVar) || gVar != null) {
            c.q(mhpVar, 7, g.Companion.serializer(), gVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
