package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

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
public final /* synthetic */ class k5 implements p3d {
    public static final k5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k5 k5Var = new k5();
        a = k5Var;
        j5m j5mVar = new j5m("Balance", k5Var, 8);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(Constants.KEY_ACTION, false);
        j5mVar.k("displayRules", false);
        j5mVar.k("title", false);
        j5mVar.k("subtitle", false);
        j5mVar.k("balance", false);
        j5mVar.k("templates", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = m5.i;
        return new t9f[]{tkr.a, ff7.C(b0.a), ff7.C((t9f) arfVarArr[2].getValue()), i0.a, ff7.C((t9f) arfVarArr[4].getValue()), ff7.C((t9f) arfVarArr[5].getValue()), arfVarArr[6].getValue(), arfVarArr[7].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        List list2;
        List list3;
        List list4;
        String str;
        d0 d0Var;
        i iVar;
        t0 t0Var;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = m5.i;
        int i3 = 7;
        int i4 = 4;
        String str2 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            d0 d0Var2 = (d0) c.n(mhpVar, 1, b0.a, null);
            i iVar2 = (i) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            t0 t0Var2 = (t0) c.z(mhpVar, 3, i0.a, null);
            List list5 = (List) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            List list6 = (List) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            List list7 = (List) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            list = (List) c.z(mhpVar, 7, (t9f) arfVarArr[7].getValue(), null);
            str = g;
            t0Var = t0Var2;
            i = 255;
            list2 = list7;
            list3 = list6;
            list4 = list5;
            iVar = iVar2;
            d0Var = d0Var2;
        } else {
            int i5 = 2;
            boolean z = true;
            int i6 = 0;
            List list8 = null;
            List list9 = null;
            List list10 = null;
            List list11 = null;
            d0 d0Var3 = null;
            i iVar3 = null;
            t0 t0Var3 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i4 = 4;
                        i5 = 2;
                    case 0:
                        str2 = c.g(mhpVar, 0);
                        i6 |= 1;
                        i3 = 7;
                        i4 = 4;
                        i5 = 2;
                    case 1:
                        d0Var3 = (d0) c.n(mhpVar, 1, b0.a, d0Var3);
                        i6 |= 2;
                        i3 = 7;
                        i4 = 4;
                        i5 = 2;
                    case 2:
                        iVar3 = (i) c.n(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), iVar3);
                        i6 |= 4;
                        i3 = 7;
                        i4 = 4;
                    case 3:
                        t0Var3 = (t0) c.z(mhpVar, 3, i0.a, t0Var3);
                        i6 |= 8;
                        i3 = 7;
                        i4 = 4;
                    case 4:
                        int i7 = i4;
                        list11 = (List) c.n(mhpVar, i7, (t9f) arfVarArr[i7].getValue(), list11);
                        i6 |= 16;
                        i4 = i7;
                        i3 = 7;
                    case 5:
                        i2 = i4;
                        list10 = (List) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list10);
                        i6 |= 32;
                        i4 = i2;
                    case 6:
                        i2 = i4;
                        list9 = (List) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), list9);
                        i6 |= 64;
                        i4 = i2;
                    case 7:
                        i2 = i4;
                        list8 = (List) c.z(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), list8);
                        i6 |= 128;
                        i4 = i2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i6;
            list = list8;
            list2 = list9;
            list3 = list10;
            list4 = list11;
            str = str2;
            d0Var = d0Var3;
            iVar = iVar3;
            t0Var = t0Var3;
        }
        c.b(mhpVar);
        return new m5(i, str, d0Var, iVar, t0Var, list4, list3, list2, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m5 m5Var = (m5) obj;
        l6bVar.getClass();
        m5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = m5.i;
        c.p(mhpVar, 0, m5Var.a);
        c.q(mhpVar, 1, b0.a, m5Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), m5Var.c);
        c.k(mhpVar, 3, i0.a, m5Var.d);
        c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), m5Var.e);
        c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), m5Var.f);
        c.k(mhpVar, 6, (t9f) arfVarArr[6].getValue(), m5Var.g);
        c.k(mhpVar, 7, (t9f) arfVarArr[7].getValue(), m5Var.h);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
