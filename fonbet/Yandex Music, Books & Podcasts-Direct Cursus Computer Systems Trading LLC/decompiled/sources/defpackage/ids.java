package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ids {
    public final ppc a;
    public final jx7 b;
    public final xof c;
    public final lum d;

    public ids(ppc ppcVar, jx7 jx7Var, xof xofVar, int i) {
        lum lumVar;
        this.a = ppcVar;
        this.b = jx7Var;
        this.c = xofVar;
        if (i > 0) {
            lumVar = new lum();
            lumVar.a = i != 1 ? new e0h(i) : null;
        } else {
            lumVar = null;
        }
        this.d = lumVar;
    }

    public static cds a(ids idsVar, String str, ges gesVar, int i, boolean z, int i2, long j, int i3) {
        if ((i3 & 2) != 0) {
            gesVar = ges.d;
        }
        ges gesVar2 = gesVar;
        int i4 = (i3 & 4) != 0 ? 1 : i;
        boolean z2 = (i3 & 8) != 0 ? true : z;
        int i5 = (i3 & 16) != 0 ? Integer.MAX_VALUE : i2;
        long b = (i3 & 32) != 0 ? ia6.b(0, 0, 15) : j;
        xof xofVar = idsVar.c;
        jx7 jx7Var = idsVar.b;
        ppc ppcVar = idsVar.a;
        idsVar.getClass();
        return b(idsVar, new mn0(str), gesVar2, i4, z2, i5, b, xofVar, jx7Var, ppcVar, 32);
    }

    public static cds b(ids idsVar, mn0 mn0Var, ges gesVar, int i, boolean z, int i2, long j, xof xofVar, jx7 jx7Var, ppc ppcVar, int i3) {
        cds cdsVar;
        c5b c5bVar = c5b.a;
        ppc ppcVar2 = (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? idsVar.a : ppcVar;
        lum lumVar = idsVar.d;
        ppc ppcVar3 = ppcVar2;
        bds bdsVar = new bds(mn0Var, gesVar, c5bVar, i2, z, i, jx7Var, xofVar, ppcVar3, j);
        cds cdsVar2 = null;
        if (lumVar != null) {
            mq3 mq3Var = new mq3(bdsVar);
            e0h e0hVar = (e0h) lumVar.a;
            if (e0hVar != null) {
                cdsVar = (cds) e0hVar.get(mq3Var);
            } else if (Intrinsics.d((mq3) lumVar.b, mq3Var)) {
                cdsVar = (cds) lumVar.c;
            }
            if (cdsVar != null && !cdsVar.b.a.a()) {
                cdsVar2 = cdsVar;
            }
        }
        if (cdsVar2 != null) {
            return new cds(bdsVar, cdsVar2.b, ia6.d(j, (((int) Math.ceil(r14.e)) & 4294967295L) | (((int) Math.ceil(r14.d)) << 32)));
        }
        dn9 dn9Var = new dn9(mn0Var, u7g.T(gesVar, xofVar), c5bVar, jx7Var, ppcVar3);
        int k = ga6.k(j);
        int i4 = ((z || i == 2 || i == 4 || i == 5) && ga6.e(j)) ? ga6.i(j) : Integer.MAX_VALUE;
        int i5 = (z || !(i == 2 || i == 4 || i == 5)) ? i2 : 1;
        if (k != i4) {
            i4 = yhn.d((int) Math.ceil(dn9Var.b()), k, i4);
        }
        cds cdsVar3 = new cds(bdsVar, new ogi(dn9Var, qld.A(0, i4, 0, ga6.h(j)), i5, i), ia6.d(j, (((int) Math.ceil(r0.e)) & 4294967295L) | (((int) Math.ceil(r0.d)) << 32)));
        if (lumVar != null) {
            e0h e0hVar2 = (e0h) lumVar.a;
            if (e0hVar2 != null) {
                e0hVar2.put(new mq3(bdsVar), cdsVar3);
                return cdsVar3;
            }
            lumVar.b = new mq3(bdsVar);
            lumVar.c = cdsVar3;
        }
        return cdsVar3;
    }
}
