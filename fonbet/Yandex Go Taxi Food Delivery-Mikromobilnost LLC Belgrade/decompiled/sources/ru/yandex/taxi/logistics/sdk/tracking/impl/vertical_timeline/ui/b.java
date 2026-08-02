package ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import defpackage.a1z0;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dx2;
import defpackage.eja1;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.g43;
import defpackage.gji0;
import defpackage.gl51;
import defpackage.hj31;
import defpackage.j7a0;
import defpackage.jl40;
import defpackage.ke31;
import defpackage.l131;
import defpackage.lbb1;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lzr;
import defpackage.m4m0;
import defpackage.nj31;
import defpackage.nvs0;
import defpackage.o9z0;
import defpackage.ohd;
import defpackage.p9n;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.rzo;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.so5;
import defpackage.tls;
import defpackage.ts4;
import defpackage.u3b1;
import defpackage.ub31;
import defpackage.v45;
import defpackage.v4v;
import defpackage.wls;
import defpackage.wm1;
import defpackage.wwg;
import defpackage.wx11;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.yx40;
import defpackage.zpn;
import defpackage.zrb1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.ListIterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b;

/* loaded from: classes5.dex */
public abstract class b {
    public static final long a = rzo.f(4293914606L);
    public static final /* synthetic */ int b = 0;

    public static final void a(final int i, final int i2, final boolean z, final boolean z2, final long j, final float f, fid fidVar, final int i3) {
        aii0 v;
        wls wlsVar;
        gji0 gji0Var = qke.q;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2097555114);
        int i4 = i3 | (btsVar.c(i) ? 32 : 16) | (btsVar.c(i2) ? 256 : 128) | (btsVar.a(z) ? 2048 : 1024) | (btsVar.a(z2) ? 16384 : 8192) | (btsVar.d(j) ? 131072 : 65536) | (btsVar.b(f) ? 1048576 : 524288);
        if (!btsVar.V(i4 & 1, (599187 & i4) != 599186)) {
            btsVar.Y();
        } else {
            if (i == i2) {
                v = btsVar.v();
                if (v != null) {
                    final int i5 = 0;
                    wlsVar = new wls(i, i2, z, z2, j, f, i3, i5) { // from class: oj31
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ boolean w;
                        public final /* synthetic */ boolean x;
                        public final /* synthetic */ long y;
                        public final /* synthetic */ float z;

                        {
                            this.a = i5;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(7);
                                    b.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(7);
                                    b.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            c530 c530Var = c530.a;
            cj6 cj6Var = cj6.a;
            if (z) {
                btsVar.e0(-784458740);
                btsVar.t(false);
            } else {
                btsVar.e0(-784952694);
                pi6.a(cj6Var.a(m4m0.b(ymb1.l(ljs0.e(ljs0.q(c530Var, 6.0f), f / 2.0f), cyk0.c(i2 + 1 == i ? 15.0f : 0.0f)), j, gji0Var), x4c.c), btsVar, 0);
                btsVar.t(false);
            }
            if (z2) {
                btsVar.e0(-783928020);
                btsVar.t(false);
            } else {
                btsVar.e0(-784424857);
                pi6.a(cj6Var.a(m4m0.b(ymb1.l(ljs0.e(ljs0.q(c530Var, 6.0f), f / 2.0f), cyk0.c(i2 + (-1) == i ? 15.0f : 0.0f)), j, gji0Var), x4c.B), btsVar, 0);
                btsVar.t(false);
            }
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 1;
            wlsVar = new wls(i, i2, z, z2, j, f, i3, i6) { // from class: oj31
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ long y;
                public final /* synthetic */ float z;

                {
                    this.a = i6;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i62) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(7);
                            b.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(7);
                            b.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(o9z0 o9z0Var, tls tlsVar, sls slsVar, boolean z, fid fidVar, int i) {
        int i2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-166073354);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(o9z0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            lbb1.b(ljs0.c(c530.a, 1.0f), z, 0.0f, 0.0f, null, null, wwg.S(-1966246191, true, new nvs0(o9z0Var, slsVar, tlsVar, 28), btsVar), btsVar, ((i2 >> 6) & 112) | 1572870, 60);
            z2 = z;
        } else {
            z2 = z;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a1z0(o9z0Var, tlsVar, slsVar, z2, i);
        }
    }

    public static final void c(o9z0 o9z0Var, boolean z, fid fidVar, int i) {
        int i2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(12234172);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(o9z0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            z2 = z;
            lbb1.b(ljs0.c(c530.a, 1.0f), z2, 0.0f, 8.0f, null, null, wwg.S(-1391196223, true, new l131(5, o9z0Var), btsVar), btsVar, (i2 & 112) | 1575942, 52);
        } else {
            z2 = z;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wm1(i, 2, o9z0Var, z2);
        }
    }

    public static final void d(int i, long j, fid fidVar, v4v v4vVar, boolean z) {
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(609383602);
        int i2 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.d(j) ? 32 : 16) | (btsVar.k(v4vVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            float f = v4vVar == null ? 14.0f : 40.0f;
            if (v4vVar == null || !z) {
                z2 = true;
                btsVar.e0(-679555568);
                btsVar.t(false);
            } else {
                btsVar.e0(-679662239);
                z2 = true;
                u3b1.g(null, 48.0f, ldc.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), 0.0f, null, btsVar, 48, 25);
                btsVar.t(false);
            }
            u3b1.g(null, f, j, 0.0f, wwg.S(-164527732, z2, new j7a0(v4vVar, 2), btsVar), btsVar, ((i2 << 3) & 896) | HProv.ALG_CLASS_DATA_ENCRYPT, 9);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p9n(z, j, v4vVar, i);
        }
    }

    public static final void e(hj31 hj31Var, fid fidVar, int i) {
        int i2;
        long o;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1166164308);
        int i3 = i | (btsVar.k(hj31Var) ? 4 : 2);
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            f530 q = ljs0.q(c530.a, 56.0f);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new ke31(9);
                btsVar.o0(Q);
            }
            f530 b2 = fnq0.b(q, true, (tls) Q);
            sic a2 = qic.a(lr20.e, x4c.I, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            String str = hj31Var.a;
            if (str == null) {
                btsVar.e0(1955395920);
                btsVar.t(false);
                z = false;
            } else {
                btsVar.e0(1955395921);
                lzr lzrVar = lzr.E;
                if (hj31Var.c) {
                    btsVar.e0(-1353331493);
                    o = ((el51) btsVar.m(gl51.a)).n();
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1353259046);
                    o = ((el51) btsVar.m(gl51.a)).o();
                    btsVar.t(false);
                }
                z = false;
                ymb1.f(str, null, o, null, lzrVar, null, 0L, 0L, 0L, new sjy0(6), 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 64490);
                btsVar = btsVar;
                btsVar.t(false);
            }
            String str2 = hj31Var.b;
            if (str2 == null) {
                btsVar.e0(1955782366);
                btsVar.t(z);
            } else {
                btsVar.e0(1955782367);
                bts btsVar2 = btsVar;
                ymb1.f(str2, null, ((el51) btsVar.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, new sjy0(6), 0, false, 0, null, null, btsVar2, 0, 0, 64506);
                btsVar = btsVar2;
                btsVar.t(z);
            }
            i2 = 1;
            btsVar.t(true);
        } else {
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nj31(hj31Var, i, i2);
        }
    }

    public static final void f(hj31 hj31Var, fid fidVar, int i) {
        int i2;
        long j;
        long j2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2108893792);
        int i3 = i | (btsVar.k(hj31Var) ? 4 : 2);
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new wx11(26, hj31Var);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 b2 = fnq0.b(c530Var, true, (tls) Q);
            sic a2 = qic.a(lr20.e, x4c.G, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            f530 o2 = an91.o(c530Var, 0.0f, 12.0f, 0.0f, hj31Var.g == null ? 12.0f : 0.0f, 5);
            String str = hj31Var.e;
            ldc ldcVar = hj31Var.f;
            if (ldcVar == null) {
                btsVar.e0(588182322);
                j = ((el51) btsVar.m(gl51.a)).n();
                btsVar.t(false);
            } else {
                btsVar.e0(588181144);
                btsVar.t(false);
                j = ldcVar.a;
            }
            i2 = 0;
            ymb1.e(str, o2, j, null, null, null, 0L, 0L, 0L, null, 0, false, 2, null, null, btsVar, 0, HProv.ALG_TYPE_SECURECHANNEL, 57336);
            btsVar = btsVar;
            String str2 = hj31Var.g;
            if (str2 == null) {
                btsVar.e0(1053859152);
                btsVar.t(false);
            } else {
                btsVar.e0(1053859153);
                f530 o3 = an91.o(c530Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                ldc ldcVar2 = hj31Var.h;
                if (ldcVar2 == null) {
                    btsVar.e0(1574257233);
                    j2 = ((el51) btsVar.m(gl51.a)).o();
                    btsVar.t(false);
                } else {
                    btsVar.e0(1574255962);
                    btsVar.t(false);
                    j2 = ldcVar2.a;
                }
                ymb1.f(str2, o3, j2, null, null, null, 0L, 0L, 0L, null, 0, false, 2, null, null, btsVar, 48, HProv.ALG_TYPE_SECURECHANNEL, 57336);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nj31(hj31Var, i, i2);
        }
    }

    public static final void g(o9z0 o9z0Var, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(964278960);
        int i3 = i | (btsVar.k(o9z0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024) | (btsVar.e(slsVar3) ? 16384 : 8192);
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            ArrayList arrayList = o9z0Var.c;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i2 = -1;
                    break;
                } else if (((hj31) listIterator.previous()).c) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            }
            boolean z = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object Q2 = btsVar.Q();
            if (z || Q2 == obj) {
                Q2 = new ts4(4, slsVar2, slsVar3);
                btsVar.o0(Q2);
            }
            zpn.a(zy11.a, (tls) Q2, btsVar);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar4 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar4);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            androidx.compose.foundation.lazy.b a3 = a7y.a(0, 3, btsVar);
            int i4 = i3 & 14;
            c(o9z0Var, a3.e(), btsVar, i4);
            f530 o2 = an91.o(ljs0.c(androidx.compose.ui.input.nestedscroll.b.a(c530Var, zrb1.f(btsVar), null).k(new x2y(1.0f, false)), 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = new dx2(yx40Var, 15);
                btsVar.o0(Q3);
            }
            f530 y = eja1.y(o2, (tls) Q3);
            boolean k = btsVar.k(fwiVar) | (i4 == 4) | btsVar.c(i2);
            Object Q4 = btsVar.Q();
            if (k || Q4 == obj) {
                Q4 = new v45(o9z0Var, fwiVar, i2, 9);
                btsVar.o0(Q4);
            }
            int i5 = i2;
            adb1.a(y, a3, null, g43Var, null, null, false, null, (tls) Q4, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 492);
            Integer valueOf = Integer.valueOf(yx40Var.getIntValue());
            boolean c = btsVar.c(i5) | btsVar.k(a3);
            Object Q5 = btsVar.Q();
            if (c || Q5 == obj) {
                Q5 = new VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1(i5, a3, yx40Var, null);
                btsVar.o0(Q5);
            }
            zpn.e(btsVar, (wls) Q5, valueOf);
            btsVar = btsVar;
            b(o9z0Var, tlsVar, slsVar, a3.b(), btsVar, i3 & 1022);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ub31(o9z0Var, tlsVar, slsVar, slsVar2, slsVar3, i);
        }
    }
}
