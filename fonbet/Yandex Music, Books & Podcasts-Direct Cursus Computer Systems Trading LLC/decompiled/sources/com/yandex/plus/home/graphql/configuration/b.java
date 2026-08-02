package com.yandex.plus.home.graphql.configuration;

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
import defpackage.oc3;
import defpackage.p3d;
import defpackage.rsa;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements p3d {
    public static final b a;

    @NotNull
    private static final mhp descriptor;

    static {
        b bVar = new b();
        a = bVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.graphql.configuration.LocalSdkConfigurationModel", bVar, 10);
        j5mVar.k("readyMessageTimeoutMillis", false);
        j5mVar.k("animationDurationMillis", false);
        j5mVar.k("hostsForOpenInSystem", false);
        j5mVar.k("allowedHosts", false);
        j5mVar.k("jsBridgeAllowedHosts", false);
        j5mVar.k("forbiddenHosts", false);
        j5mVar.k("webViewHideThreshold", false);
        j5mVar.k("webViewDownwardScrollFriction", false);
        j5mVar.k("isPanelDiagnosticEnabled", false);
        j5mVar.k("createdAt", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = d.k;
        cqe cqeVar = cqe.a;
        return new t9f[]{ff7.C(cqeVar), ff7.C(cqeVar), ff7.C((t9f) arfVarArr[2].getValue()), ff7.C((t9f) arfVarArr[3].getValue()), ff7.C((t9f) arfVarArr[4].getValue()), ff7.C((t9f) arfVarArr[5].getValue()), ff7.C(cqeVar), ff7.C(cqeVar), ff7.C(oc3.a), rsa.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        nsa nsaVar;
        Boolean bool;
        Integer num;
        Set set;
        Integer num2;
        Set set2;
        Set set3;
        Set set4;
        Integer num3;
        Integer num4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = d.k;
        int i2 = 9;
        char c2 = '\b';
        Integer num5 = null;
        if (c.m()) {
            cqe cqeVar = cqe.a;
            Integer num6 = (Integer) c.n(mhpVar, 0, cqeVar, null);
            Integer num7 = (Integer) c.n(mhpVar, 1, cqeVar, null);
            Set set5 = (Set) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            Set set6 = (Set) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            Set set7 = (Set) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            Set set8 = (Set) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            Integer num8 = (Integer) c.n(mhpVar, 6, cqeVar, null);
            Integer num9 = (Integer) c.n(mhpVar, 7, cqeVar, null);
            Boolean bool2 = (Boolean) c.n(mhpVar, 8, oc3.a, null);
            set = set8;
            num = num9;
            nsaVar = (nsa) c.z(mhpVar, 9, rsa.a, null);
            bool = bool2;
            num2 = num8;
            i = 1023;
            set3 = set6;
            set2 = set7;
            set4 = set5;
            num4 = num7;
            num3 = num6;
        } else {
            int i3 = 5;
            int i4 = 3;
            int i5 = 4;
            int i6 = 2;
            boolean z = true;
            int i7 = 0;
            nsa nsaVar2 = null;
            Boolean bool3 = null;
            Integer num10 = null;
            Set set9 = null;
            Integer num11 = null;
            Set set10 = null;
            Set set11 = null;
            Set set12 = null;
            Integer num12 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i6 = 2;
                        i4 = 3;
                        i5 = 4;
                        i3 = 5;
                    case 0:
                        num5 = (Integer) c.n(mhpVar, 0, cqe.a, num5);
                        i7 |= 1;
                        i2 = 9;
                        c2 = '\b';
                        i6 = 2;
                        i4 = 3;
                        i5 = 4;
                        i3 = 5;
                    case 1:
                        num12 = (Integer) c.n(mhpVar, 1, cqe.a, num12);
                        i7 |= 2;
                        i2 = 9;
                        c2 = '\b';
                        i6 = 2;
                        i4 = 3;
                        i5 = 4;
                        i3 = 5;
                    case 2:
                        set12 = (Set) c.n(mhpVar, i6, (t9f) arfVarArr[i6].getValue(), set12);
                        i7 |= 4;
                        i2 = 9;
                        c2 = '\b';
                        i4 = 3;
                        i5 = 4;
                        i3 = 5;
                    case 3:
                        set11 = (Set) c.n(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), set11);
                        i7 |= 8;
                        i2 = 9;
                        c2 = '\b';
                        i5 = 4;
                        i3 = 5;
                    case 4:
                        set10 = (Set) c.n(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), set10);
                        i7 |= 16;
                        i2 = 9;
                        c2 = '\b';
                        i3 = 5;
                    case 5:
                        set9 = (Set) c.n(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), set9);
                        i7 |= 32;
                        i2 = 9;
                        c2 = '\b';
                    case 6:
                        num11 = (Integer) c.n(mhpVar, 6, cqe.a, num11);
                        i7 |= 64;
                        i2 = 9;
                        c2 = '\b';
                    case 7:
                        num10 = (Integer) c.n(mhpVar, 7, cqe.a, num10);
                        i7 |= 128;
                        i2 = 9;
                        c2 = '\b';
                    case 8:
                        bool3 = (Boolean) c.n(mhpVar, 8, oc3.a, bool3);
                        i7 |= 256;
                        c2 = '\b';
                        i2 = 9;
                    case 9:
                        nsaVar2 = (nsa) c.z(mhpVar, i2, rsa.a, nsaVar2);
                        i7 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c2 = '\b';
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i7;
            nsaVar = nsaVar2;
            bool = bool3;
            num = num10;
            set = set9;
            num2 = num11;
            set2 = set10;
            set3 = set11;
            set4 = set12;
            num3 = num5;
            num4 = num12;
        }
        c.b(mhpVar);
        return new d(i, num3, num4, set4, set3, set2, set, num2, num, bool, nsaVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d dVar = (d) obj;
        l6bVar.getClass();
        dVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = d.k;
        cqe cqeVar = cqe.a;
        c.q(mhpVar, 0, cqeVar, dVar.a);
        c.q(mhpVar, 1, cqeVar, dVar.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), dVar.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), dVar.d);
        c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), dVar.e);
        c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), dVar.f);
        c.q(mhpVar, 6, cqeVar, dVar.g);
        c.q(mhpVar, 7, cqeVar, dVar.h);
        c.q(mhpVar, 8, oc3.a, dVar.i);
        c.k(mhpVar, 9, rsa.a, new nsa(dVar.j));
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
