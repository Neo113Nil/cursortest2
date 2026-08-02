package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.g;
import androidx.compose.ui.node.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class vk4 implements wls {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ vk4(pa90 pa90Var, long j, long j2, f530 f530Var, int i) {
        this.x = pa90Var;
        this.b = j;
        this.c = j2;
        this.w = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        pa90 pa90Var;
        long j;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                y3b1.d((String) obj4, (f530) obj3, this.b, this.c, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                pa90 pa90Var2 = (pa90) obj4;
                f530 f530Var = (f530) obj3;
                ((Integer) obj2).getClass();
                int O = vng.O(3073);
                bts btsVar = (bts) ((fid) obj);
                btsVar.g0(-685062998);
                int i2 = (btsVar.e(pa90Var2) ? 4 : 2) | O;
                long j2 = this.b;
                int i3 = i2 | (btsVar.d(j2) ? 32 : 16);
                long j3 = this.c;
                int i4 = (btsVar.d(j3) ? 256 : 128) | i3 | (btsVar.k(null) ? 16384 : 8192);
                if ((i4 & 9363) == 9362 && btsVar.E()) {
                    btsVar.Y();
                    pa90Var = pa90Var2;
                    j = j2;
                } else {
                    f530 m = ljs0.m(f530Var, 48.0f);
                    qnm.e.getClass();
                    f530 b = m4m0.b(m, j3, cyk0.c(16.0f));
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, b);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d2);
                    pa90Var = pa90Var2;
                    q4v.b(pa90Var, null, cj6.a.a(ljs0.m(c530.a, 24.0f), x4c.y), j2, btsVar, (i4 & 14) | ((i4 >> 9) & 112) | ((i4 << 6) & 7168), 0);
                    j = j2;
                    btsVar.t(true);
                }
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new vk4(pa90Var, j, j3, f530Var, O);
                }
                return zy11Var;
            case 2:
                zvd0 zvd0Var = (zvd0) obj;
                ((SnapshotStateList) obj3).add(new yyz0(zvd0Var.c, com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b.i(zvd0Var.c, ((g) ((hwd0) obj4)).C, this.b, this.c), System.currentTimeMillis()));
                return zy11Var;
            default:
                wsy0 wsy0Var = (wsy0) obj4;
                wsy0 wsy0Var2 = (wsy0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar;
                if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    String str = wsy0Var.a;
                    eyr eyrVar = wsy0Var.e;
                    lzr lzrVar = wsy0Var.b;
                    long j4 = wsy0Var.d;
                    int i5 = wsy0Var.c;
                    String str2 = wsy0Var2 != null ? wsy0Var2.a : null;
                    sty0 sty0Var = wsy0Var2 != null ? new sty0(wsy0Var2.d) : null;
                    web1.e(null, null, null, str, eyrVar, this.b, lzrVar, new hzr(i5), new sty0(j4), 0, false, 0, null, str2, wsy0Var2 != null ? wsy0Var2.e : null, wsy0Var2 != null ? wsy0Var2.b : null, wsy0Var2 != null ? new hzr(wsy0Var2.c) : null, sty0Var, false, this.c, 0, false, 0, false, null, false, btsVar2, 0, 0, 0, 265321511);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ vk4(hwd0 hwd0Var, long j, long j2, SnapshotStateList snapshotStateList) {
        this.x = hwd0Var;
        this.b = j;
        this.c = j2;
        this.w = snapshotStateList;
    }

    public /* synthetic */ vk4(wsy0 wsy0Var, wsy0 wsy0Var2, long j, long j2) {
        this.x = wsy0Var;
        this.w = wsy0Var2;
        this.b = j;
        this.c = j2;
    }

    public /* synthetic */ vk4(String str, f530 f530Var, long j, long j2, int i) {
        this.x = str;
        this.w = f530Var;
        this.b = j;
        this.c = j2;
    }
}
