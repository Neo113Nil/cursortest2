package ru.yandex.taxi.logistics.sdk.ui.component.misc;

import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bgc;
import defpackage.bts;
import defpackage.c36;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.gl51;
import defpackage.hex0;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.mb;
import defpackage.mt71;
import defpackage.nx20;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qiy;
import defpackage.qje;
import defpackage.qm51;
import defpackage.qpm0;
import defpackage.r1b0;
import defpackage.s9z0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.tra1;
import defpackage.tse0;
import defpackage.v4v;
import defpackage.w511;
import defpackage.w9z0;
import defpackage.web1;
import defpackage.wls;
import defpackage.wu60;
import defpackage.wwg;
import defpackage.wzg0;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zoy0;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.misc.b;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class b {
    public static final void a(final boolean z, final long j, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1714984934);
        int i2 = (btsVar.a(z) ? 4 : 2) | i | (btsVar.d(j) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 n = ljs0.n(c530Var, 50.0f, 8.0f);
            z910 d = pi6.d(x4c.B, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, n);
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
            o4b1.b(mt71.m(wzg0.common_bubble_tail, 0, btsVar), null, tra1.b(c530Var, z ? 1.0f : 0.0f), null, null, 0.0f, new c36(j, 5), btsVar, 48, 56);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(z, i, j) { // from class: u9z0
                public final /* synthetic */ boolean a;
                public final /* synthetic */ long b;

                {
                    this.b = j;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    b.a(this.a, this.b, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(v4v v4vVar, String str, s9z0 s9z0Var, long j, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-244462109);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(v4vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(s9z0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.d(j) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 16384 : 8192;
        }
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 b = m4m0.b(ljs0.e(c530.a, 56.0f), j, ((YandexShapes) btsVar2.m(qm51.a)).a());
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d2);
            web1.c(ljs0.c, 56.0f, false, 0.0f, null, wwg.S(1698173722, true, new mb(v4vVar, 21), btsVar2), wwg.S(1213228473, true, new qpm0(str, 7), btsVar2), null, null, wwg.S(-241607274, true, new hex0(12, s9z0Var, tlsVar), btsVar2), null, null, false, btsVar2, 807075894, 0, 7580);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nx20(v4vVar, str, s9z0Var, j, tlsVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final f530 f530Var, final w9z0 w9z0Var, final tls tlsVar, boolean z, long j, sls slsVar, fid fidVar, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        sls slsVar2;
        final sls slsVar3;
        final boolean z3;
        final long j2;
        aii0 v;
        long d;
        int i6;
        boolean z4;
        ldc ldcVar = w9z0Var.f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1549565011);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i3 | (btsVar.k(w9z0Var) ? 32 : 16);
        int i8 = i2 & 8;
        if (i8 != 0) {
            i7 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z2 = z;
            i7 |= btsVar.a(z2) ? 2048 : 1024;
            i4 = i7 | 8192;
            i5 = i2 & 32;
            if (i5 == 0) {
                i4 = 204800 | i7;
            } else if ((196608 & i) == 0) {
                slsVar2 = slsVar;
                i4 |= btsVar.e(slsVar2) ? 131072 : 65536;
                if (btsVar.V(i4 & 1, (74899 & i4) != 74898)) {
                    btsVar.a0();
                    int i9 = i & 1;
                    o430 o430Var = did.a;
                    if (i9 == 0 || btsVar.C()) {
                        if (i8 != 0) {
                            z2 = true;
                        }
                        d = ((el51) btsVar.m(gl51.a)).d();
                        i6 = i4 & (-57345);
                        if (i5 != 0) {
                            Object Q = btsVar.Q();
                            if (Q == o430Var) {
                                Q = new bgc(12);
                                btsVar.o0(Q);
                            }
                            slsVar2 = (sls) Q;
                        }
                    } else {
                        btsVar.Y();
                        i6 = i4 & (-57345);
                        d = j;
                    }
                    btsVar.u();
                    boolean z5 = (i6 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072;
                    Object Q2 = btsVar.Q();
                    if (z5 || Q2 == o430Var) {
                        Q2 = new TimelineBubbleKt$TimelineBubble$2$1(slsVar2, null);
                        btsVar.o0(Q2);
                    }
                    zpn.e(btsVar, (wls) Q2, zy11.a);
                    sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar4);
                    } else {
                        btsVar.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar, wlsVar2, o);
                    wls wlsVar3 = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar3);
                    }
                    wls wlsVar4 = d.d;
                    qje.W(btsVar, wlsVar4, d2);
                    if (z2) {
                        btsVar.e0(-1870772310);
                        f530 c = ljs0.c(c530.a, 1.0f);
                        lhl0 a2 = khl0.a(lr20.e, x4c.D, btsVar, 6);
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o2 = btsVar.o();
                        f530 d3 = androidx.compose.ui.b.d(btsVar, c);
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar4);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar, a2);
                        qje.W(btsVar, wlsVar2, o2);
                        if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                            b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                        }
                        qje.W(btsVar, wlsVar4, d3);
                        btsVar.e0(-253603810);
                        int i10 = w9z0Var.a;
                        int i11 = 0;
                        while (i11 < i10) {
                            a(w9z0Var.b == i11, ldcVar != null ? ldcVar.a : d, btsVar, 0);
                            i11++;
                        }
                        z4 = true;
                        tse0.t(btsVar, false, true, false);
                    } else {
                        z4 = true;
                        btsVar.e0(-1870377339);
                        btsVar.t(false);
                    }
                    b(w9z0Var.c, w9z0Var.d, w9z0Var.e, ldcVar != null ? ldcVar.a : d, tlsVar, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
                    btsVar.t(z4);
                    slsVar3 = slsVar2;
                    z3 = z2;
                    j2 = d;
                } else {
                    btsVar.Y();
                    slsVar3 = slsVar2;
                    z3 = z2;
                    j2 = j;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: t9z0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b.c(f530.this, w9z0Var, tlsVar, z3, j2, slsVar3, (fid) obj, vng.O(i | 1), i2);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            slsVar2 = slsVar;
            if (btsVar.V(i4 & 1, (74899 & i4) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z2 = z;
        i4 = i7 | 8192;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        slsVar2 = slsVar;
        if (btsVar.V(i4 & 1, (74899 & i4) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final Pair d(int i, int i2, double d) {
        double f;
        Pair pair;
        double d2 = i;
        double d3 = i2;
        Quarter.Companion.getClass();
        Quarter a = c.a(d);
        int[] iArr = a.a;
        int i3 = iArr[a.ordinal()];
        if (i3 == 1) {
            f = f(d);
        } else if (i3 == 2) {
            f = -f(d);
        } else if (i3 == 3) {
            f = 3.141592653589793d - f(d);
        } else {
            if (i3 != 4) {
                w511.b();
                return null;
            }
            f = f(d) + 3.141592653589793d;
        }
        double atan2 = Math.atan2(d3, d2);
        double d4 = (2.0d * f) - atan2;
        double sqrt = Math.sqrt((d3 * d3) + (d2 * d2)) / 4.0d;
        double rint = Math.rint(((Math.cos(d4) + (Math.cos(atan2) * 3.0d)) * sqrt) * 10000.0d) / 10000.0d;
        double rint2 = Math.rint(((Math.sin(d4) + (Math.sin(atan2) * 3.0d)) * sqrt) * 10000.0d) / 10000.0d;
        int i4 = iArr[c.a(d).ordinal()];
        if (i4 == 1) {
            pair = new Pair(Double.valueOf(rint), Double.valueOf(rint2));
        } else if (i4 == 2) {
            pair = new Pair(Double.valueOf(rint), Double.valueOf(d3 - rint2));
        } else if (i4 == 3) {
            pair = new Pair(Double.valueOf(d2 - rint), Double.valueOf(rint2));
        } else {
            if (i4 != 4) {
                w511.b();
                return null;
            }
            pair = new Pair(Double.valueOf(d2 - rint), Double.valueOf(d3 - rint2));
        }
        double doubleValue = ((Number) pair.getFirst()).doubleValue();
        double doubleValue2 = ((Number) pair.getSecond()).doubleValue();
        float f2 = (float) (d3 - doubleValue2);
        Pair pair2 = new Pair(new wu60((Float.floatToRawIntBits((float) doubleValue2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits((float) doubleValue) << 32)), new wu60((Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits((float) (d2 - doubleValue)) << 32)));
        return new Pair(new wu60(((wu60) pair2.getFirst()).a), new wu60(((wu60) pair2.getSecond()).a));
    }

    public static final qiy e(Pair[] pairArr, int i, int i2, double d, int i3) {
        Pair d2 = d(i, i2, d);
        return zoy0.E((Pair[]) Arrays.copyOf(pairArr, pairArr.length), ((wu60) d2.getFirst()).a, ((wu60) d2.getSecond()).a, 8);
    }

    public static final double f(double d) {
        double d2 = d % 6.283185307179586d;
        return d2 > 3.141592653589793d ? d2 - 6.283185307179586d : d2 < -3.141592653589793d ? d2 + 6.283185307179586d : d2;
    }
}
