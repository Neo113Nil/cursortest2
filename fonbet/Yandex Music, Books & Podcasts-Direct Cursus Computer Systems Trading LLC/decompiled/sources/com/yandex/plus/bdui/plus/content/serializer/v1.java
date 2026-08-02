package com.yandex.plus.bdui.plus.content.serializer;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements p3d {
    public static final v1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        v1 v1Var = new v1();
        a = v1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusWebContentSerializer.PayloadDto", v1Var, 10);
        j5mVar.k("baseUrl", false);
        j5mVar.k("entryPath", false);
        j5mVar.k("ignoreJSInterfaces", false);
        j5mVar.k("disableJS", false);
        j5mVar.k("plugins", false);
        j5mVar.k("loading", false);
        j5mVar.k("transitionUrlActions", false);
        j5mVar.k("transitionAnchorActions", false);
        j5mVar.k("webActions", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = x1.k;
        tkr tkrVar = tkr.a;
        oc3 oc3Var = oc3.a;
        return new t9f[]{tkrVar, tkrVar, oc3Var, oc3Var, arfVarArr[4].getValue(), s1.a, ff7.C((t9f) arfVarArr[6].getValue()), ff7.C((t9f) arfVarArr[7].getValue()), ff7.C((t9f) arfVarArr[8].getValue()), j1.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        l1 l1Var;
        Map map;
        Map map2;
        Map map3;
        u1 u1Var;
        List list;
        boolean z2;
        int i;
        String str;
        String str2;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = x1.k;
        int i3 = 9;
        int i4 = 6;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            boolean D = c.D(mhpVar, 2);
            boolean D2 = c.D(mhpVar, 3);
            List list2 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            u1 u1Var2 = (u1) c.z(mhpVar, 5, s1.a, null);
            Map map4 = (Map) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            Map map5 = (Map) c.n(mhpVar, 7, (t9f) arfVarArr[7].getValue(), null);
            map3 = (Map) c.n(mhpVar, 8, (t9f) arfVarArr[8].getValue(), null);
            str = g;
            l1Var = (l1) c.z(mhpVar, 9, j1.a, null);
            u1Var = u1Var2;
            z = D2;
            z2 = D;
            map = map5;
            map2 = map4;
            i = 1023;
            list = list2;
            str2 = g2;
        } else {
            int i5 = 4;
            boolean z3 = true;
            boolean z4 = false;
            int i6 = 0;
            l1 l1Var2 = null;
            Map map6 = null;
            Map map7 = null;
            Map map8 = null;
            u1 u1Var3 = null;
            String str3 = null;
            String str4 = null;
            boolean z5 = false;
            List list3 = null;
            while (z3) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z3 = false;
                        i3 = 9;
                        i5 = 4;
                    case 0:
                        str3 = c.g(mhpVar, 0);
                        i6 |= 1;
                        i3 = 9;
                        i4 = 6;
                        i5 = 4;
                    case 1:
                        str4 = c.g(mhpVar, 1);
                        i6 |= 2;
                        i3 = 9;
                        i4 = 6;
                        i5 = 4;
                    case 2:
                        i6 |= 4;
                        z5 = c.D(mhpVar, 2);
                        i3 = 9;
                        i4 = 6;
                    case 3:
                        z4 = c.D(mhpVar, 3);
                        i6 |= 8;
                        i3 = 9;
                        i4 = 6;
                    case 4:
                        list3 = (List) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), list3);
                        i6 |= 16;
                        i3 = 9;
                        i4 = 6;
                    case 5:
                        u1Var3 = (u1) c.z(mhpVar, 5, s1.a, u1Var3);
                        i6 |= 32;
                        i3 = 9;
                        i4 = 6;
                    case 6:
                        int i7 = i4;
                        map7 = (Map) c.n(mhpVar, i7, (t9f) arfVarArr[i7].getValue(), map7);
                        i6 |= 64;
                        i4 = i7;
                        i3 = 9;
                    case 7:
                        i2 = i4;
                        map6 = (Map) c.n(mhpVar, 7, (t9f) arfVarArr[7].getValue(), map6);
                        i6 |= 128;
                        i4 = i2;
                    case 8:
                        i2 = i4;
                        map8 = (Map) c.n(mhpVar, 8, (t9f) arfVarArr[8].getValue(), map8);
                        i6 |= 256;
                        i4 = i2;
                    case 9:
                        i2 = i4;
                        l1Var2 = (l1) c.z(mhpVar, i3, j1.a, l1Var2);
                        i6 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i4 = i2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            z = z4;
            l1Var = l1Var2;
            map = map6;
            map2 = map7;
            map3 = map8;
            u1Var = u1Var3;
            list = list3;
            z2 = z5;
            i = i6;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new x1(i, str, str2, z2, z, list, u1Var, map2, map, map3, l1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x1 x1Var = (x1) obj;
        l6bVar.getClass();
        x1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = x1.k;
        c.p(mhpVar, 0, x1Var.a);
        c.p(mhpVar, 1, x1Var.b);
        c.j(mhpVar, 2, x1Var.c);
        c.j(mhpVar, 3, x1Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), x1Var.e);
        c.k(mhpVar, 5, s1.a, x1Var.f);
        c.q(mhpVar, 6, (t9f) arfVarArr[6].getValue(), x1Var.g);
        c.q(mhpVar, 7, (t9f) arfVarArr[7].getValue(), x1Var.h);
        c.q(mhpVar, 8, (t9f) arfVarArr[8].getValue(), x1Var.i);
        c.k(mhpVar, 9, j1.a, x1Var.j);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
