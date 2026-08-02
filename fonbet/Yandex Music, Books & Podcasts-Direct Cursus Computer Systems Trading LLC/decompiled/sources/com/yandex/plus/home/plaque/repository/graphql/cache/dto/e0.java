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
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class e0 implements p3d {
    public static final e0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e0 e0Var = new e0();
        a = e0Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.plaque.repository.graphql.cache.dto.DefaultPlaqueDto", e0Var, 7);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("rootWidget", false);
        j5mVar.k("metricContext", false);
        j5mVar.k("notification", false);
        j5mVar.k("serviceMeta", false);
        j5mVar.k("priority", false);
        j5mVar.k("rootPredicate", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = g0.h;
        return new t9f[]{tkr.a, arfVarArr[1].getValue(), arfVarArr[2].getValue(), ff7.C((t9f) arfVarArr[3].getValue()), arfVarArr[4].getValue(), cqe.a, ff7.C((t9f) arfVarArr[6].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        p4 p4Var;
        Map map;
        int i2;
        String str;
        c6 c6Var;
        Map map2;
        t1 t1Var;
        int i3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g0.h;
        int i4 = 5;
        int i5 = 2;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            c6 c6Var2 = (c6) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            Map map3 = (Map) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            t1 t1Var2 = (t1) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            Map map4 = (Map) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            int k = c.k(mhpVar, 5);
            p4Var = (p4) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            str = g;
            i = k;
            i2 = 127;
            t1Var = t1Var2;
            map = map4;
            map2 = map3;
            c6Var = c6Var2;
        } else {
            boolean z = true;
            int i6 = 0;
            p4 p4Var2 = null;
            String str2 = null;
            c6 c6Var3 = null;
            Map map5 = null;
            t1 t1Var3 = null;
            int i7 = 0;
            Map map6 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i5 = 2;
                    case 0:
                        str2 = c.g(mhpVar, 0);
                        i7 |= 1;
                        i4 = 5;
                        i5 = 2;
                    case 1:
                        c6Var3 = (c6) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), c6Var3);
                        i7 |= 2;
                        i4 = 5;
                        i5 = 2;
                    case 2:
                        int i8 = i5;
                        map5 = (Map) c.z(mhpVar, i8, (t9f) arfVarArr[i8].getValue(), map5);
                        i7 |= 4;
                        i5 = i8;
                        i4 = 5;
                    case 3:
                        i3 = i5;
                        t1Var3 = (t1) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), t1Var3);
                        i7 |= 8;
                        i5 = i3;
                    case 4:
                        i3 = i5;
                        map6 = (Map) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), map6);
                        i7 |= 16;
                        i5 = i3;
                    case 5:
                        i6 = c.k(mhpVar, i4);
                        i7 |= 32;
                    case 6:
                        i3 = i5;
                        p4Var2 = (p4) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), p4Var2);
                        i7 |= 64;
                        i5 = i3;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i6;
            p4Var = p4Var2;
            map = map6;
            i2 = i7;
            str = str2;
            c6Var = c6Var3;
            map2 = map5;
            t1Var = t1Var3;
        }
        c.b(mhpVar);
        return new g0(i2, str, c6Var, map2, t1Var, map, i, p4Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g0 g0Var = (g0) obj;
        l6bVar.getClass();
        g0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = g0.h;
        c.p(mhpVar, 0, g0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), g0Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), g0Var.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), g0Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), g0Var.e);
        c.A(5, g0Var.f, mhpVar);
        c.q(mhpVar, 6, (t9f) arfVarArr[6].getValue(), g0Var.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
