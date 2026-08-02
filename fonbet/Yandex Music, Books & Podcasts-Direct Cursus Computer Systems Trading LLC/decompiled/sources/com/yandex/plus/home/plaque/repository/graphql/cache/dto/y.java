package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.nsa;
import defpackage.p3d;
import defpackage.rsa;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class y implements p3d {
    public static final y a;

    @NotNull
    private static final mhp descriptor;

    static {
        y yVar = new y();
        a = yVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ConditionalPlaqueDto", yVar, 10);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("rootWidget", false);
        j5mVar.k("metricContext", false);
        j5mVar.k("notification", false);
        j5mVar.k("serviceMeta", false);
        j5mVar.k("priority", false);
        j5mVar.k("showAfter", false);
        j5mVar.k("closeAfter", false);
        j5mVar.k("seenContext", false);
        j5mVar.k("rootPredicate", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = a0.k;
        tkr tkrVar = tkr.a;
        rsa rsaVar = rsa.a;
        return new t9f[]{tkrVar, arfVarArr[1].getValue(), arfVarArr[2].getValue(), ff7.C((t9f) arfVarArr[3].getValue()), arfVarArr[4].getValue(), cqe.a, ff7.C(rsaVar), ff7.C(rsaVar), ff7.C(tkrVar), ff7.C((t9f) arfVarArr[9].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        p4 p4Var;
        String str;
        nsa nsaVar;
        Map map;
        nsa nsaVar2;
        t1 t1Var;
        Map map2;
        c6 c6Var;
        int i2;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = a0.k;
        char c2 = '\b';
        int i3 = 9;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            c6 c6Var2 = (c6) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            Map map3 = (Map) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            t1 t1Var2 = (t1) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            Map map4 = (Map) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            int k = c.k(mhpVar, 5);
            rsa rsaVar = rsa.a;
            nsa nsaVar3 = (nsa) c.n(mhpVar, 6, rsaVar, null);
            nsa nsaVar4 = (nsa) c.n(mhpVar, 7, rsaVar, null);
            String str3 = (String) c.n(mhpVar, 8, tkr.a, null);
            p4Var = (p4) c.n(mhpVar, 9, (t9f) arfVarArr[9].getValue(), null);
            str2 = g;
            nsaVar = nsaVar4;
            nsaVar2 = nsaVar3;
            i = k;
            str = str3;
            i2 = 1023;
            t1Var = t1Var2;
            map = map4;
            map2 = map3;
            c6Var = c6Var2;
        } else {
            int i4 = 3;
            int i5 = 4;
            int i6 = 2;
            boolean z = true;
            int i7 = 0;
            p4 p4Var2 = null;
            String str4 = null;
            nsa nsaVar5 = null;
            Map map5 = null;
            nsa nsaVar6 = null;
            t1 t1Var3 = null;
            Map map6 = null;
            String str5 = null;
            int i8 = 0;
            c6 c6Var3 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        c2 = '\b';
                        i6 = 2;
                        i4 = 3;
                        i5 = 4;
                    case 0:
                        str5 = c.g(mhpVar, 0);
                        i8 |= 1;
                        c2 = '\b';
                        i3 = 9;
                        i6 = 2;
                        i4 = 3;
                        i5 = 4;
                    case 1:
                        c6Var3 = (c6) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), c6Var3);
                        i8 |= 2;
                        c2 = '\b';
                        i3 = 9;
                        i6 = 2;
                        i4 = 3;
                        i5 = 4;
                    case 2:
                        map6 = (Map) c.z(mhpVar, i6, (t9f) arfVarArr[i6].getValue(), map6);
                        i8 |= 4;
                        c2 = '\b';
                        i3 = 9;
                        i4 = 3;
                        i5 = 4;
                    case 3:
                        t1Var3 = (t1) c.n(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), t1Var3);
                        i8 |= 8;
                        c2 = '\b';
                        i3 = 9;
                        i5 = 4;
                    case 4:
                        map5 = (Map) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), map5);
                        i8 |= 16;
                        c2 = '\b';
                        i3 = 9;
                    case 5:
                        i7 = c.k(mhpVar, 5);
                        i8 |= 32;
                        c2 = '\b';
                        i3 = 9;
                    case 6:
                        nsaVar6 = (nsa) c.n(mhpVar, 6, rsa.a, nsaVar6);
                        i8 |= 64;
                        c2 = '\b';
                        i3 = 9;
                    case 7:
                        nsaVar5 = (nsa) c.n(mhpVar, 7, rsa.a, nsaVar5);
                        i8 |= 128;
                        c2 = '\b';
                        i3 = 9;
                    case 8:
                        str4 = (String) c.n(mhpVar, 8, tkr.a, str4);
                        i8 |= 256;
                        c2 = '\b';
                        i3 = 9;
                    case 9:
                        p4Var2 = (p4) c.n(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), p4Var2);
                        i8 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c2 = '\b';
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i7;
            p4Var = p4Var2;
            str = str4;
            nsaVar = nsaVar5;
            map = map5;
            nsaVar2 = nsaVar6;
            t1Var = t1Var3;
            map2 = map6;
            c6Var = c6Var3;
            i2 = i8;
            str2 = str5;
        }
        c.b(mhpVar);
        return new a0(i2, str2, c6Var, map2, t1Var, map, i, nsaVar2, nsaVar, str, p4Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        a0 a0Var = (a0) obj;
        l6bVar.getClass();
        a0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = a0.k;
        c.p(mhpVar, 0, a0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), a0Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), a0Var.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), a0Var.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), a0Var.e);
        c.A(5, a0Var.f, mhpVar);
        rsa rsaVar = rsa.a;
        c.q(mhpVar, 6, rsaVar, a0Var.g);
        c.q(mhpVar, 7, rsaVar, a0Var.h);
        c.q(mhpVar, 8, tkr.a, a0Var.i);
        c.q(mhpVar, 9, (t9f) arfVarArr[9].getValue(), a0Var.j);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
