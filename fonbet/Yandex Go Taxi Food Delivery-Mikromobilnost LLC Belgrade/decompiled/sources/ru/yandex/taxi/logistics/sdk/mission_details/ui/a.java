package ru.yandex.taxi.logistics.sdk.mission_details.ui;

import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.did;
import defpackage.ejf0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fk20;
import defpackage.gl51;
import defpackage.gza1;
import defpackage.id00;
import defpackage.jb2;
import defpackage.jl40;
import defpackage.jva1;
import defpackage.lb2;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.n891;
import defpackage.nb2;
import defpackage.nfj;
import defpackage.nhf0;
import defpackage.nj20;
import defpackage.o430;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.pj20;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rzo;
import defpackage.s3b1;
import defpackage.sls;
import defpackage.tls;
import defpackage.uo5;
import defpackage.v4;
import defpackage.v4v;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y3b1;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.mission_details.ui.a;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(fk20 fk20Var, f530 f530Var, ProgressBarSize progressBarSize, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        ProgressBarSize progressBarSize2;
        f530 f530Var3;
        float f;
        ejf0 ejf0Var = fk20Var.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2117889498);
        int i4 = (btsVar.k(fk20Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i4 | (btsVar.k(f530Var2) ? 32 : 16);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.c(progressBarSize == null ? -1 : progressBarSize.ordinal()) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 f530Var4 = i5 != 0 ? c530Var : f530Var2;
            ProgressBarSize progressBarSize3 = i6 != 0 ? ProgressBarSize.M : progressBarSize;
            int i7 = pj20.a[progressBarSize3.ordinal()];
            if (i7 == 1) {
                f = 40.0f;
            } else {
                if (i7 != 2) {
                    w511.b();
                    return;
                }
                f = 65.0f;
            }
            uo5 uo5Var = x4c.y;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var4);
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
            f530 f530Var5 = f530Var4;
            double d3 = ejf0Var.a;
            ldc ldcVar = ejf0Var.b;
            long f2 = ldcVar != null ? ldcVar.a : rzo.f(4278358356L);
            ldc ldcVar2 = ejf0Var.c;
            b(d3, f2, ldcVar2 != null ? ldcVar2.a : ldc.e, fk20Var.b, progressBarSize3, btsVar, (i3 << 6) & HProv.ALG_CLASS_ALL);
            v4v v4vVar = fk20Var.a;
            if (v4vVar == null) {
                btsVar.e0(-1375281087);
                btsVar.t(false);
            } else {
                btsVar.e0(-1375281086);
                s3b1.f(v4vVar, ljs0.m(cj6.a.a(c530Var, uo5Var), f), null, btsVar, 0, 4);
                btsVar.t(false);
            }
            btsVar.t(true);
            f530Var3 = f530Var5;
            progressBarSize2 = progressBarSize3;
        } else {
            btsVar.Y();
            progressBarSize2 = progressBarSize;
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(fk20Var, f530Var3, progressBarSize2, i, i2, 21);
        }
    }

    public static final void b(final double d, final long j, final long j2, final nhf0 nhf0Var, ProgressBarSize progressBarSize, fid fidVar, final int i) {
        int i2;
        final ProgressBarSize progressBarSize2;
        float f;
        float f2;
        Object missionDetailsProgressBarKt$ProgressIndicator$1$1;
        jb2 jb2Var;
        jb2 jb2Var2;
        lb2 lb2Var;
        androidx.compose.animation.core.a aVar;
        boolean z;
        c530 c530Var;
        float f3;
        long j3;
        float f4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-824316905);
        if ((i & 6) == 0) {
            i2 = (btsVar.j(d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.d(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.d(j2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(nhf0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.c(progressBarSize.ordinal()) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            jb2 jb2Var3 = new jb2(n891.i("M65.8009 131.047C91.6504 131.047 108.003 127.832 117.852 117.982C127.702 108.133 130.916 91.7807 130.916 65.9312C130.916 40.0816 127.702 23.7296 117.852 13.88C108.003 4.0304 91.6504 0.815765 65.8009 0.815765C39.9514 0.815765 23.5994 4.0304 13.7498 13.88C3.90018 23.7296 0.685547 40.0816 0.685547 65.9312C0.685547 91.7807 3.90018 108.133 13.7498 117.982C23.5994 127.832 39.9514 131.047 65.8009 131.047Z"));
            jb2 a = nb2.a();
            jb2 a2 = nb2.a();
            lb2 a3 = jva1.a();
            a3.b(jb2Var3);
            int[] iArr = pj20.a;
            int i3 = iArr[progressBarSize.ordinal()];
            if (i3 == 1) {
                f = 104.0f;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return;
                }
                f = 168.0f;
            }
            int i4 = iArr[progressBarSize.ordinal()];
            float f5 = 20.0f;
            if (i4 == 1) {
                f2 = 12.0f;
            } else {
                if (i4 != 2) {
                    w511.b();
                    return;
                }
                f2 = 20.0f;
            }
            int i5 = iArr[progressBarSize.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    w511.b();
                    return;
                }
                f5 = 25.0f;
            }
            float f6 = f5;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = id00.a(0.0f);
                btsVar.o0(Q);
            }
            androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) Q;
            boolean e = btsVar.e(aVar2) | btsVar.e(a3) | ((i2 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                jb2Var = a2;
                jb2Var2 = jb2Var3;
                lb2Var = a3;
                aVar = aVar2;
                z = false;
                missionDetailsProgressBarKt$ProgressIndicator$1$1 = new MissionDetailsProgressBarKt$ProgressIndicator$1$1(aVar, lb2Var, d, null);
                btsVar.o0(missionDetailsProgressBarKt$ProgressIndicator$1$1);
            } else {
                missionDetailsProgressBarKt$ProgressIndicator$1$1 = Q2;
                jb2Var2 = jb2Var3;
                jb2Var = a2;
                lb2Var = a3;
                aVar = aVar2;
                z = false;
            }
            zpn.e(btsVar, (wls) missionDetailsProgressBarKt$ProgressIndicator$1$1, zy11.a);
            c530 c530Var2 = c530.a;
            f530 m = ljs0.m(c530Var2, f);
            z910 d2 = pi6.d(x4c.b, z);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, m);
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d3);
            f530 b = gza1.b(an91.k(ljs0.c, f2), -1.0f, 1.0f);
            jb2 jb2Var4 = jb2Var;
            boolean e2 = btsVar.e(jb2Var2) | btsVar.e(lb2Var) | btsVar.e(jb2Var4) | btsVar.b(f6) | ((i2 & 896) == 256) | btsVar.e(aVar) | btsVar.e(a) | ((i2 & 112) == 32);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                c530Var = c530Var2;
                nj20 nj20Var = new nj20(jb2Var2, lb2Var, jb2Var4, f6, j2, aVar, a, j);
                btsVar.o0(nj20Var);
                Q3 = nj20Var;
            } else {
                c530Var = c530Var2;
            }
            qeb1.a(0, btsVar, (tls) Q3, b);
            int i6 = iArr[progressBarSize.ordinal()];
            if (i6 == 1) {
                f3 = 5.0f;
            } else {
                if (i6 != 2) {
                    w511.b();
                    return;
                }
                f3 = 8.0f;
            }
            f530 o2 = an91.o(cj6.a.a(c530Var, x4c.B), 0.0f, 0.0f, 0.0f, f3, 7);
            ldc ldcVar = nhf0Var.a;
            if (ldcVar == null) {
                btsVar.e0(-244819593);
                j3 = ((el51) btsVar.m(gl51.a)).c();
                btsVar.t(false);
            } else {
                btsVar.e0(-244820957);
                btsVar.t(false);
                j3 = ldcVar.a;
            }
            long j4 = j3;
            int i7 = iArr[progressBarSize.ordinal()];
            if (i7 == 1) {
                f4 = 16.0f;
            } else {
                if (i7 != 2) {
                    w511.b();
                    return;
                }
                f4 = 26.0f;
            }
            progressBarSize2 = progressBarSize;
            y3b1.a(o2, j4, f4, 0.0f, 0.0f, 0L, wwg.S(-2085645385, true, new nfj(20, progressBarSize2, nhf0Var), btsVar), btsVar, 12582912, BuildConfig.API_LEVEL);
            btsVar.t(true);
        } else {
            progressBarSize2 = progressBarSize;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: oj20
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.b(d, j, j2, nhf0Var, progressBarSize2, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }
}
