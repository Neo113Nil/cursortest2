package com.yandex.plus.home.datasource.openapi.models;

import com.connectsdk.device.ConnectableDevice;
import defpackage.arf;
import defpackage.cqe;
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
public final /* synthetic */ class x7 implements p3d {
    public static final x7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        x7 x7Var = new x7();
        a = x7Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkTextWidgetModel", x7Var, 8);
        j5mVar.k("displayRules", false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("type", false);
        j5mVar.k("textItems", false);
        j5mVar.k("templates", true);
        j5mVar.k(Constants.KEY_ACTION, true);
        j5mVar.k("lineHeight", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = z7.i;
        tkr tkrVar = tkr.a;
        return new t9f[]{t1.a, w0.Companion.serializer(), tkrVar, tkrVar, arfVarArr[4].getValue(), ff7.C((t9f) arfVarArr[5].getValue()), ff7.C(g.Companion.serializer()), ff7.C(cqe.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Integer num;
        g gVar;
        List list;
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
        arf[] arfVarArr = z7.i;
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
            List list4 = (List) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            g gVar2 = (g) c.n(mhpVar, 6, g.Companion.serializer(), null);
            list = list4;
            x1Var = x1Var3;
            num = (Integer) c.n(mhpVar, 7, cqe.a, null);
            gVar = gVar2;
            str2 = g2;
            str = g;
            i = 255;
            list2 = list3;
            w0Var = w0Var2;
        } else {
            boolean z = true;
            int i7 = 0;
            Integer num2 = null;
            g gVar3 = null;
            List list5 = null;
            List list6 = null;
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
                        list6 = (List) c.z(mhpVar, i3, (t9f) arfVarArr[i8].getValue(), list6);
                        i7 |= 16;
                        i6 = i3;
                        i4 = 7;
                    case 5:
                        i2 = i6;
                        list5 = (List) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list5);
                        i7 |= 32;
                        i6 = i2;
                    case 6:
                        i2 = i6;
                        gVar3 = (g) c.n(mhpVar, i5, g.Companion.serializer(), gVar3);
                        i7 |= 64;
                        i6 = i2;
                    case 7:
                        i2 = i6;
                        num2 = (Integer) c.n(mhpVar, i4, cqe.a, num2);
                        i7 |= 128;
                        i6 = i2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i7;
            num = num2;
            gVar = gVar3;
            list = list5;
            list2 = list6;
            x1Var = x1Var2;
            w0Var = w0Var3;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new z7(i, x1Var, w0Var, str, str2, list2, list, gVar, num);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        z7 z7Var = (z7) obj;
        l6bVar.getClass();
        z7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = z7.i;
        t1 t1Var = t1.a;
        x1 x1Var = z7Var.a;
        Integer num = z7Var.h;
        g gVar = z7Var.g;
        List list = z7Var.f;
        c.k(mhpVar, 0, t1Var, x1Var);
        c.k(mhpVar, 1, w0.Companion.serializer(), z7Var.b);
        c.p(mhpVar, 2, z7Var.c);
        c.p(mhpVar, 3, z7Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), z7Var.e);
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list);
        }
        if (c.e(mhpVar) || gVar != null) {
            c.q(mhpVar, 6, g.Companion.serializer(), gVar);
        }
        if (c.e(mhpVar) || num != null) {
            c.q(mhpVar, 7, cqe.a, num);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
