package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.a91;
import defpackage.bj6;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.hq2;
import defpackage.jeb1;
import defpackage.sls;
import defpackage.sq5;
import defpackage.tls;
import defpackage.tx40;
import defpackage.up2;
import defpackage.w8a1;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class sq5 {
    public static final ck11 a = sb2.K(0, 0, null, 7);
    public static final twt0 b = sb2.G(28.0f / (2.0f * ((float) Math.sqrt(350.0d))), 500.0f, 4, null);

    public static final void a(final String str, final String str2, final int i, final long j, final boolean z, final boolean z2, final tls tlsVar, final f530 f530Var, fid fidVar, final int i2) {
        int i3;
        final boolean z3;
        f530 f530Var2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1044879185);
        if ((i2 & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar2.k(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar2.c(i) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.d(j) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.a(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z3 = z2;
            i3 |= btsVar2.a(z3) ? 131072 : 65536;
        } else {
            z3 = z2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        } else {
            f530Var2 = f530Var;
        }
        int i4 = i3;
        if (btsVar2.V(i4 & 1, (4793491 & i4) != 4793490)) {
            boolean z4 = !z;
            ButtonSize buttonSize = ButtonSize.L;
            gz6 gz6Var = new gz6(new up2(dq2.d), AppColor$Palette.TextInvert);
            boolean z5 = ((3670016 & i4) == 1048576) | ((i4 & 14) == 4);
            Object Q = btsVar2.Q();
            if (z5 || Q == did.a) {
                Q = new a91(tlsVar, str, 2);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            d17.d(f530Var2, z4, buttonSize, gz6Var, null, (sls) Q, wwg.S(-565290274, true, new zls() { // from class: com.yandex.go.rida.bids.ui.d
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    bj6 bj6Var = (bj6) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(bj6Var) ? 4 : 2;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                        f530 b2 = bj6Var.b(c530.a);
                        tls tlsVar2 = tlsVar;
                        boolean k = btsVar3.k(tlsVar2);
                        String str3 = str;
                        boolean k2 = k | btsVar3.k(str3);
                        Object Q2 = btsVar3.Q();
                        Object obj4 = did.a;
                        if (k2 || Q2 == obj4) {
                            Q2 = new a91(tlsVar2, str3, 4);
                            btsVar3.o0(Q2);
                        }
                        sls slsVar = (sls) Q2;
                        Object Q3 = btsVar3.Q();
                        if (Q3 == obj4) {
                            Q3 = androidx.compose.runtime.f.f(1.0f);
                            btsVar3.o0(Q3);
                        }
                        tx40 tx40Var = (tx40) Q3;
                        int i5 = i;
                        Integer valueOf = Integer.valueOf(i5);
                        long j2 = j;
                        Long valueOf2 = Long.valueOf(j2);
                        boolean z6 = z3;
                        Boolean valueOf3 = Boolean.valueOf(z6);
                        boolean d = btsVar3.d(j2) | btsVar3.c(i5) | btsVar3.a(z6) | btsVar3.k(slsVar);
                        Object Q4 = btsVar3.Q();
                        if (d || Q4 == obj4) {
                            Q4 = new BidsListKt$rememberAcceptButtonTimerProgressState$1$1(j2, i5, tx40Var, z6, slsVar, null);
                            btsVar3.o0(Q4);
                        }
                        zpn.g(valueOf, valueOf2, valueOf3, (wls) Q4, btsVar3);
                        w8a1.a(tx40Var, new up2(hq2.a), b2, btsVar3, 0);
                        if (z) {
                            btsVar3.e0(4630625);
                            sq5.b(btsVar3, 0);
                            btsVar3.t(false);
                        } else {
                            btsVar3.e0(4672103);
                            jeb1.f(str2, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar3, 0, 0, 32766);
                            btsVar3.t(false);
                        }
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), btsVar, ((i4 >> 21) & 14) | 1573248, 16);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: lq5
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sq5.a(str, str2, i, j, z, z2, tlsVar, f530Var, (fid) obj, vng.O(i2 | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1674732289);
        int i2 = 0;
        if (btsVar2.V(i & 1, i != 0)) {
            osv d = z5b1.d(z5b1.g("AcceptButtonSpinnerTransition", btsVar2, 0), 0.0f, 360.0f, sb2.w(sb2.K(1000, 0, ubn.d, 2), null, 0L, 6), "AcceptButtonSpinnerRotation", btsVar2, 29112, 0);
            f530 m = ljs0.m(c530.a, 24.0f);
            boolean k = btsVar2.k(d);
            Object Q = btsVar2.Q();
            if (k || Q == did.a) {
                Q = new xo1(d, 2);
                btsVar2.o0(Q);
            }
            sya1.a(gfb1.c(), d.a(m, (tls) Q), null, AppColor$Palette.TextInvert, btsVar2, 3456, 0);
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mq5(i, i2);
        }
    }

    public static final void c(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1194271164);
        int i2 = 4;
        int i3 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            f530 l = ymb1.l(ljs0.m(an91.m(an91.o(c530.a, 12.0f, 0.0f, 8.0f, 0.0f, 10), 0.0f, 12.0f, 1), 40.0f), cyk0.a);
            v0b1.a(mja1.b(str, null, 6), l, null, wwg.S(267869333, true, new os(l, i2), btsVar), wwg.S(1918006132, true, new os(l, 5), btsVar), null, null, null, 0.0f, 0, btsVar, 27648, 996);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 7);
        }
    }

    public static final void d(tq5 tq5Var, boolean z, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1392625631);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(tq5Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 o = an91.o(an91.m(ljs0.c(f530Var, 1.0f), 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 6.0f, 7);
            ((nx2) btsVar.m(uy2.c)).getClass();
            f530 c = bzk0.c(ymb1.l(o, cyk0.c(24.0f)), AppColor$Palette.Background, qke.q);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            z910 d2 = pi6.d(x4c.x, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            c530 c530Var = c530.a;
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            c(tq5Var.e, btsVar, 0);
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d4 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d4);
            j(tq5Var.d, tq5Var.o, btsVar, 0);
            i(tq5Var.f, btsVar, 0);
            btsVar.t(true);
            btsVar.t(true);
            lhl0 a4 = khl0.a(lr20.a, x4c.F, btsVar, 48);
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o5 = btsVar.o();
            f530 d5 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a4);
            qje.W(btsVar, wlsVar2, o5);
            vfc.v(hashCode4, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d5);
            nhl0 nhl0Var = nhl0.a;
            f530 a5 = nhl0Var.a(c530Var, 1.0f, true);
            long n = tje.n(yrl.a, btsVar);
            float w0 = ((fwi) btsVar.m(j.h)).w0(0.5f);
            boolean d6 = btsVar.d(n) | btsVar.b(w0);
            Object Q = btsVar.Q();
            if (d6 || Q == did.a) {
                z2 = true;
                Q = new yql(n, w0, 1);
                btsVar.o0(Q);
            } else {
                z2 = true;
            }
            h(0, btsVar, bb1.g(a5, (tls) Q), tq5Var.i, tq5Var.j);
            g(0, btsVar, nhl0Var.a(c530Var, 1.0f, z2), tq5Var.k, tq5Var.l);
            btsVar.t(z2);
            f530 o6 = an91.o(an91.m(ljs0.c(c530Var, 1.0f), 12.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 8.0f, 5);
            lhl0 a6 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode5 = Long.hashCode(btsVar.T);
            r1b0 o7 = btsVar.o();
            f530 d7 = b.d(btsVar, o6);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a6);
            qje.W(btsVar, wlsVar2, o7);
            vfc.v(hashCode5, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d7);
            f(tq5Var.a, tq5Var.b, tq5Var.m, tlsVar, nhl0Var.a(c530Var, 1.0f, true), btsVar, i2 & 7168);
            f530 a7 = nhl0Var.a(c530Var, 1.0f, true);
            a(tq5Var.a, tq5Var.n, tq5Var.h, tq5Var.g, tq5Var.b, z, tlsVar, a7, btsVar, ((i2 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i2 << 9) & 3670016));
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(tq5Var, z, f530Var, tlsVar, i, 4);
        }
    }

    public static final void e(final vq5 vq5Var, final wg6 wg6Var, final boolean z, f530 f530Var, final tls tlsVar, fid fidVar, final int i) {
        vq5 vq5Var2;
        wg6 wg6Var2;
        tls tlsVar2;
        final f530 f530Var2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1046109416);
        int i2 = i | (btsVar.k(vq5Var) ? 4 : 2) | (btsVar.k(wg6Var) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            final c530 c530Var = c530.a;
            if (!z) {
                v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    wlsVar = new wls(vq5Var, wg6Var, z, c530Var, tlsVar, i, i3) { // from class: iq5
                        public final /* synthetic */ int a;
                        public final /* synthetic */ vq5 b;
                        public final /* synthetic */ wg6 c;
                        public final /* synthetic */ boolean w;
                        public final /* synthetic */ f530 x;
                        public final /* synthetic */ tls y;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(1);
                                    sq5.e(this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(1);
                                    sq5.e(this.b, this.c, this.w, this.x, this.y, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            vq5Var2 = vq5Var;
            wg6Var2 = wg6Var;
            tlsVar2 = tlsVar;
            r1b1.a(ljs0.c(c530Var, 1.0f), wg6Var2, btsVar, i2 & 112);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = bvf0.c(EmptyList.a);
                btsVar.o0(Q);
            }
            pz40 pz40Var = (pz40) Q;
            k3r k3rVar = ljs0.c;
            boolean e = ((i2 & 14) == 4) | ((i2 & HProv.ALG_CLASS_ALL) == 16384) | btsVar.e(pz40Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new q(17, vq5Var2, tlsVar2, pz40Var);
                btsVar.o0(Q2);
            }
            adb1.a(k3rVar, null, null, null, null, null, false, null, (tls) Q2, btsVar, 100663296, 254);
            f530Var2 = c530Var;
        } else {
            vq5Var2 = vq5Var;
            wg6Var2 = wg6Var;
            tlsVar2 = tlsVar;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        v = btsVar.v();
        if (v != null) {
            final int i4 = 1;
            final vq5 vq5Var3 = vq5Var2;
            final wg6 wg6Var3 = wg6Var2;
            final tls tlsVar3 = tlsVar2;
            wlsVar = new wls(vq5Var3, wg6Var3, z, f530Var2, tlsVar3, i, i4) { // from class: iq5
                public final /* synthetic */ int a;
                public final /* synthetic */ vq5 b;
                public final /* synthetic */ wg6 c;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ f530 x;
                public final /* synthetic */ tls y;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(1);
                            sq5.e(this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(1);
                            sq5.e(this.b, this.c, this.w, this.x, this.y, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void f(String str, boolean z, String str2, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1245260002);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            f530Var2 = f530Var;
            i2 |= btsVar.k(f530Var2) ? 16384 : 8192;
        } else {
            f530Var2 = f530Var;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = !z;
            ButtonSize buttonSize = ButtonSize.L;
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new a91(tlsVar, str, 3);
                btsVar.o0(Q);
            }
            d17.c(f530Var2, z2, buttonSize, null, null, (sls) Q, wwg.S(-1442201474, true, new le(str2, 9), btsVar), btsVar, ((i2 >> 12) & 14) | 1573248, 24);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(i, 2, str, str2, tlsVar, f530Var, z);
        }
    }

    public static final void g(int i, fid fidVar, f530 f530Var, CharSequence charSequence, String str) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1715579477);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(f530Var) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            f530 o = an91.o(an91.m(f530Var, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.5f, 7);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar2, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o2);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
            qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 1, 0, null, null, btsVar2, i2 & 14, 6, 15358);
            jeb1.f(str, null, null, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, null, btsVar2, (i2 >> 3) & 14, 48, 30718);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jq5(charSequence, str, f530Var, i, 1);
        }
    }

    public static final void h(int i, fid fidVar, f530 f530Var, CharSequence charSequence, String str) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(247758284);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(f530Var) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            f530 o = an91.o(an91.m(f530Var, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.5f, 7);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar2, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o2);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
            qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 1, 0, null, null, btsVar2, i2 & 14, 6, 15358);
            jeb1.f(str, null, null, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, null, btsVar2, (i2 >> 3) & 14, 48, 30718);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jq5(charSequence, str, f530Var, i, 0);
        }
    }

    public static final void i(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1417531677);
        int i3 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 c = bzk0.c(ymb1.l(ljs0.e(an91.o(c530Var, 40.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), cyk0.a), AppColor$Palette.Background, qke.q);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            sya1.a(zeb1.a(), ljs0.m(an91.o(an91.m(c530Var, 2.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3.0f, 7), 16.0f), null, null, btsVar, 48, 12);
            qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 1, 0, xya1.e(btsVar).h.a, null, btsVar, (i3 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 6, 11254);
            btsVar = btsVar;
            i2 = 1;
            nnm.s(c530Var, 10.0f, btsVar, true);
        } else {
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, i2, charSequence);
        }
    }

    public static final void j(String str, String str2, fid fidVar, int i) {
        String str3;
        bts btsVar;
        int i2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(784801000);
        int i3 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(str2) ? 32 : 16);
        if (btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 60.0f, 0.0f, 0.0f, 0.0f, 14);
            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar2, 48);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar2, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o2);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
            jeb1.f(str, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, xya1.e(btsVar2).f.c, btsVar2, (i3 & 14) | 384, 48, 14330);
            if (str2 != null) {
                btsVar2.e0(1137853400);
                str3 = str2;
                jeb1.f(str3, an91.n(bzk0.c(ymb1.l(an91.k(c530Var, 4.0f), cyk0.a), AppColor$Palette.EverBack, qke.q), 6.0f, 2.0f, 8.0f, 2.0f), AppColor$Palette.TextInvert, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, ety0.a(xya1.e(btsVar2).h.c, 0L, 0L, lzr.z, new hzr(1), null, 0L, null, null, null, 0, 0L, null, null, 16777203), btsVar2, ((i3 >> 3) & 14) | 384, 48, 14328);
                btsVar = btsVar2;
                i2 = 0;
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                i2 = 0;
                str3 = str2;
                btsVar.e0(1138295646);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            str3 = str2;
            btsVar = btsVar2;
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq5(str, str3, i, i2);
        }
    }
}
