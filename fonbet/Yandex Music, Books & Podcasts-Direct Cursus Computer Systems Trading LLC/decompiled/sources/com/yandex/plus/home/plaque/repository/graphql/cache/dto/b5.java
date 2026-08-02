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
public final /* synthetic */ class b5 implements p3d {
    public static final b5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b5 b5Var = new b5();
        a = b5Var;
        j5m j5mVar = new j5m("Box", b5Var, 5);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(Constants.KEY_ACTION, false);
        j5mVar.k("displayRules", false);
        j5mVar.k("widgetsIds", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = d5.f;
        return new t9f[]{tkr.a, ff7.C(b0.a), ff7.C((t9f) arfVarArr[2].getValue()), i0.a, arfVarArr[4].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        d0 d0Var;
        i iVar;
        t0 t0Var;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = d5.f;
        String str2 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            d0 d0Var2 = (d0) c.n(mhpVar, 1, b0.a, null);
            i iVar2 = (i) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            t0 t0Var2 = (t0) c.z(mhpVar, 3, i0.a, null);
            list = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            str = g;
            t0Var = t0Var2;
            i = 31;
            iVar = iVar2;
            d0Var = d0Var2;
        } else {
            boolean z = true;
            int i2 = 0;
            d0 d0Var3 = null;
            i iVar3 = null;
            t0 t0Var3 = null;
            List list2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    d0Var3 = (d0) c.n(mhpVar, 1, b0.a, d0Var3);
                    i2 |= 2;
                } else if (w == 2) {
                    iVar3 = (i) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), iVar3);
                    i2 |= 4;
                } else if (w == 3) {
                    t0Var3 = (t0) c.z(mhpVar, 3, i0.a, t0Var3);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str2;
            d0Var = d0Var3;
            iVar = iVar3;
            t0Var = t0Var3;
            list = list2;
        }
        c.b(mhpVar);
        return new d5(i, str, d0Var, iVar, t0Var, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d5 d5Var = (d5) obj;
        l6bVar.getClass();
        d5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = d5.f;
        c.p(mhpVar, 0, d5Var.a);
        c.q(mhpVar, 1, b0.a, d5Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), d5Var.c);
        c.k(mhpVar, 3, i0.a, d5Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), d5Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
