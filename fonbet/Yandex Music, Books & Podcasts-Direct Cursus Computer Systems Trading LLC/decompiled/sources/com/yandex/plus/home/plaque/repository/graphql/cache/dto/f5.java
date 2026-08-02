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
public final /* synthetic */ class f5 implements p3d {
    public static final f5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        f5 f5Var = new f5();
        a = f5Var;
        j5m j5mVar = new j5m("Line", f5Var, 6);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(Constants.KEY_ACTION, false);
        j5mVar.k("displayRules", false);
        j5mVar.k("widgetIds", false);
        j5mVar.k("orientation", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = i5.g;
        return new t9f[]{tkr.a, ff7.C(b0.a), ff7.C((t9f) arfVarArr[2].getValue()), i0.a, arfVarArr[4].getValue(), arfVarArr[5].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        d0 d0Var;
        i iVar;
        t0 t0Var;
        List list;
        h5 h5Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = i5.g;
        int i2 = 0;
        String str2 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            d0 d0Var2 = (d0) c.n(mhpVar, 1, b0.a, null);
            i iVar2 = (i) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            t0 t0Var2 = (t0) c.z(mhpVar, 3, i0.a, null);
            List list2 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            h5Var = (h5) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            str = g;
            t0Var = t0Var2;
            i = 63;
            list = list2;
            iVar = iVar2;
            d0Var = d0Var2;
        } else {
            int i3 = 1;
            int i4 = 0;
            d0 d0Var3 = null;
            i iVar3 = null;
            t0 t0Var3 = null;
            List list3 = null;
            h5 h5Var2 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        i3 = i2;
                        continue;
                    case 0:
                        str2 = c.g(mhpVar, i2);
                        i4 |= 1;
                        continue;
                    case 1:
                        d0Var3 = (d0) c.n(mhpVar, 1, b0.a, d0Var3);
                        i4 |= 2;
                        break;
                    case 2:
                        iVar3 = (i) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), iVar3);
                        i4 |= 4;
                        break;
                    case 3:
                        t0Var3 = (t0) c.z(mhpVar, 3, i0.a, t0Var3);
                        i4 |= 8;
                        break;
                    case 4:
                        list3 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list3);
                        i4 |= 16;
                        break;
                    case 5:
                        h5Var2 = (h5) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), h5Var2);
                        i4 |= 32;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 0;
            }
            i = i4;
            str = str2;
            d0Var = d0Var3;
            iVar = iVar3;
            t0Var = t0Var3;
            list = list3;
            h5Var = h5Var2;
        }
        c.b(mhpVar);
        return new i5(i, str, d0Var, iVar, t0Var, list, h5Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i5 i5Var = (i5) obj;
        l6bVar.getClass();
        i5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = i5.g;
        c.p(mhpVar, 0, i5Var.a);
        c.q(mhpVar, 1, b0.a, i5Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), i5Var.c);
        c.k(mhpVar, 3, i0.a, i5Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), i5Var.e);
        c.k(mhpVar, 5, (t9f) arfVarArr[5].getValue(), i5Var.f);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
