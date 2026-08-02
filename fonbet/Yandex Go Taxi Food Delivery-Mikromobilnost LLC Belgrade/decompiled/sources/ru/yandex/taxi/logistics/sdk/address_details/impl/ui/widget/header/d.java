package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.header;

import defpackage.a7u0;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.bts;
import defpackage.c1y;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cuj0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.gl51;
import defpackage.i3r;
import defpackage.iws;
import defpackage.jl40;
import defpackage.k28;
import defpackage.k3r;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lq7;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qam;
import defpackage.qje;
import defpackage.qke;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.rzh0;
import defpackage.s1a1;
import defpackage.s3b1;
import defpackage.sls;
import defpackage.sm91;
import defpackage.tls;
import defpackage.uo5;
import defpackage.vng;
import defpackage.vs0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wzg0;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zez0;
import defpackage.zgb1;
import defpackage.zy11;
import defpackage.zyd;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class d {
    public static final void a(final float f, final long j, final DecorationPosition decorationPosition, fid fidVar, final int i) {
        uo5 uo5Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-982875139);
        int i2 = (btsVar.b(f) ? 32 : 16) | i | (btsVar.d(j) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 f2 = sm91.f(c530.a, 0.0f, f, 1);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new iws(17);
                btsVar.o0(Q);
            }
            f530 a = androidx.compose.ui.graphics.d.a(f2, (tls) Q);
            boolean z = (i2 & 896) == 256;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new tls() { // from class: ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.header.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        float f3;
                        long j2;
                        c1y c1yVar = (c1y) obj;
                        qam.t0(c1yVar, j, 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
                        long j3 = ldc.l;
                        int[] iArr = c.a;
                        DecorationPosition decorationPosition2 = decorationPosition;
                        int i3 = iArr[decorationPosition2.ordinal()];
                        if (i3 == 1) {
                            f3 = 180.0f;
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            f3 = 270.0f;
                        }
                        int i4 = iArr[decorationPosition2.ordinal()];
                        if (i4 == 1) {
                            j2 = 0;
                        } else {
                            if (i4 != 2) {
                                w511.b();
                                return null;
                            }
                            j2 = (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1yVar.a.c() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        }
                        k28 k28Var = c1yVar.a;
                        float intBitsToFloat = Float.intBitsToFloat((int) (k28Var.c() >> 32)) * 2.0f;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * 2.0f;
                        c1yVar.F(j3, f3, 90.0f, true, j2, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (r25 & 128) != 0 ? i3r.a : null, (r25 & 512) != 0 ? 3 : 0);
                        return zy11.a;
                    }
                };
                btsVar.o0(Q2);
            }
            f530 m = ljs0.m(bb1.i(a, (tls) Q2), f);
            int i3 = c.a[decorationPosition.ordinal()];
            if (i3 == 1) {
                uo5Var = x4c.A;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return;
                }
                uo5Var = x4c.C;
            }
            pi6.a(cj6.a.a(m, uo5Var), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f, j, decorationPosition, i) { // from class: ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.header.b
                public final /* synthetic */ float a;
                public final /* synthetic */ long b;
                public final /* synthetic */ DecorationPosition c;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(3079);
                    d.a(this.a, this.b, this.c, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(vs0 vs0Var, sls slsVar, fid fidVar, int i) {
        int i2;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1058948951);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(vs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ldc ldcVar = vs0Var.c;
            if (ldcVar == null) {
                btsVar.e0(257312240);
                j = ((el51) btsVar.m(gl51.a)).d();
                btsVar.t(false);
            } else {
                btsVar.e0(257310845);
                btsVar.t(false);
                j = ldcVar.a;
            }
            f530 g = s1a1.g(c530.a, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, g);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            long j2 = j;
            c(vs0Var, j2, slsVar, btsVar, (i2 & 14) | ((i2 << 3) & 896));
            a7u0 a7u0Var = qm51.a;
            a(((YandexShapes) btsVar.m(a7u0Var)).d, j2, DecorationPosition.START, btsVar, 3078);
            a(((YandexShapes) btsVar.m(a7u0Var)).d, j2, DecorationPosition.END, btsVar, 3078);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(vs0Var, slsVar, i, 26);
        }
    }

    public static final void c(vs0 vs0Var, long j, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-351521137);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(vs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.d(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 e = ljs0.e(m4m0.b(c530.a, j, qke.q), 64.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, e);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            k3r k3rVar = ljs0.b;
            f530 q = ljs0.q(k3rVar, 56.0f);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, q);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            s3b1.c(new cuj0(wzg0.ic_left, ohb1.e(btsVar, rzh0.logistics_back_button), null, new zez0(((el51) btsVar.m(gl51.a)).n()), 20), null, false, null, false, null, slsVar, btsVar, (i2 << 12) & 3670016, 62);
            btsVar.t(true);
            zgb1.b(vs0Var.a, vs0Var.b, new x2y(1.0f, true), x4c.H, 0, true, null, null, null, null, btsVar, 199680, 976);
            btsVar = btsVar;
            pi6.a(ljs0.q(k3rVar, 56.0f), btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lq7(vs0Var, j, slsVar, i);
        }
    }
}
