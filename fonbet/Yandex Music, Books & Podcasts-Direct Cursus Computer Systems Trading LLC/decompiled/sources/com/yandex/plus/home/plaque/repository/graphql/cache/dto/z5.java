package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

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
public final /* synthetic */ class z5 implements p3d {
    public static final z5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        z5 z5Var = new z5();
        a = z5Var;
        j5m j5mVar = new j5m("Text", z5Var, 7);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(Constants.KEY_ACTION, false);
        j5mVar.k("displayRules", false);
        j5mVar.k("text", false);
        j5mVar.k("templates", false);
        j5mVar.k("lineHeight", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = b6.h;
        return new t9f[]{tkr.a, ff7.C(b0.a), ff7.C((t9f) arfVarArr[2].getValue()), i0.a, arfVarArr[4].getValue(), arfVarArr[5].getValue(), ff7.C(cqe.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Integer num;
        List list;
        String str;
        d0 d0Var;
        i iVar;
        t0 t0Var;
        List list2;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = b6.h;
        int i3 = 6;
        int i4 = 2;
        String str2 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            d0 d0Var2 = (d0) c.n(mhpVar, 1, b0.a, null);
            i iVar2 = (i) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            t0 t0Var2 = (t0) c.z(mhpVar, 3, i0.a, null);
            List list3 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            list = (List) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            str = g;
            num = (Integer) c.n(mhpVar, 6, cqe.a, null);
            t0Var = t0Var2;
            i = 127;
            list2 = list3;
            iVar = iVar2;
            d0Var = d0Var2;
        } else {
            boolean z = true;
            int i5 = 0;
            Integer num2 = null;
            List list4 = null;
            d0 d0Var3 = null;
            i iVar3 = null;
            t0 t0Var3 = null;
            List list5 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i4 = 2;
                    case 0:
                        str2 = c.g(mhpVar, 0);
                        i5 |= 1;
                        i3 = 6;
                        i4 = 2;
                    case 1:
                        d0Var3 = (d0) c.n(mhpVar, 1, b0.a, d0Var3);
                        i5 |= 2;
                        i3 = 6;
                        i4 = 2;
                    case 2:
                        int i6 = i4;
                        iVar3 = (i) c.n(mhpVar, i6, (t9f) arfVarArr[i6].getValue(), iVar3);
                        i5 |= 4;
                        i4 = i6;
                        i3 = 6;
                    case 3:
                        i2 = i4;
                        t0Var3 = (t0) c.z(mhpVar, 3, i0.a, t0Var3);
                        i5 |= 8;
                        i4 = i2;
                    case 4:
                        i2 = i4;
                        list5 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list5);
                        i5 |= 16;
                        i4 = i2;
                    case 5:
                        i2 = i4;
                        list4 = (List) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list4);
                        i5 |= 32;
                        i4 = i2;
                    case 6:
                        i2 = i4;
                        num2 = (Integer) c.n(mhpVar, i3, cqe.a, num2);
                        i5 |= 64;
                        i4 = i2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            num = num2;
            list = list4;
            str = str2;
            d0Var = d0Var3;
            iVar = iVar3;
            t0Var = t0Var3;
            list2 = list5;
        }
        c.b(mhpVar);
        return new b6(i, str, d0Var, iVar, t0Var, list2, list, num);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        b6 b6Var = (b6) obj;
        l6bVar.getClass();
        b6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = b6.h;
        c.p(mhpVar, 0, b6Var.a);
        c.q(mhpVar, 1, b0.a, b6Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), b6Var.c);
        c.k(mhpVar, 3, i0.a, b6Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), b6Var.e);
        c.k(mhpVar, 5, (t9f) arfVarArr[5].getValue(), b6Var.f);
        c.q(mhpVar, 6, cqe.a, b6Var.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
