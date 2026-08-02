package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class u3b1 {
    public static final void a(xjo0 xjo0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1266265407);
        int i3 = 4;
        int i4 = (btsVar.k(xjo0Var) ? 4 : 2) | i;
        int i5 = 5;
        if (!btsVar.V(i4 & 1, (i4 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (xjo0Var instanceof vjo0) {
                btsVar.e0(-614902783);
                c(btsVar, 0);
                btsVar.t(false);
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new ujo0(xjo0Var, i, 3);
                    return;
                }
                return;
            }
            btsVar.e0(-614872031);
            btsVar.t(false);
            ajo0 ajo0Var = ((wjo0) xjo0Var).a;
            if (ajo0Var.d()) {
                i2 = kyh0.scooters_photocontrol_verification_success_body;
            } else if (ajo0Var.b()) {
                i2 = kyh0.scooters_photocontrol_verification_failed_body;
            } else if (ajo0Var.a()) {
                i2 = kyh0.scooters_photocontrol_verification_impossible_body;
            } else {
                if (!ajo0Var.c()) {
                    aii0 v2 = btsVar.v();
                    if (v2 != null) {
                        v2.d = new ujo0(xjo0Var, i, i3);
                        return;
                    }
                    return;
                }
                i2 = kyh0.scooters_photo_verification_in_progress_body;
            }
            ydb1.a(an91.o(c530.a, 0.0f, 12.0f, 0.0f, 0.0f, 13), null, wwg.S(-2000701232, true, new vm1(i2, i5), btsVar), null, null, null, SlotSize.XS, false, btsVar, 1573254, 186);
        }
        aii0 v3 = btsVar.v();
        if (v3 != null) {
            v3.d = new ujo0(xjo0Var, i, i5);
        }
    }

    public static final void b(xjo0 xjo0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1432632553);
        int i2 = 2;
        int i3 = 4;
        int i4 = (btsVar.k(xjo0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i5 = 1;
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            f530 n = an91.n(c530.a, 8.0f, 20.0f, 8.0f, 8.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, n);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-995578033);
            if (xjo0Var instanceof vjo0) {
                btsVar.e0(-995585505);
                d(tlsVar, btsVar, (i4 >> 3) & 14);
                btsVar.t(false);
            } else {
                btsVar.e0(-995533611);
                btsVar.t(false);
                ajo0 ajo0Var = ((wjo0) xjo0Var).a;
                boolean d2 = ajo0Var.d();
                o430 o430Var = did.a;
                if (d2) {
                    btsVar.e0(-995437356);
                    int i6 = kyh0.scooters_photocontrol_verification_success_button;
                    boolean z = (i4 & 112) == 32;
                    Object Q = btsVar.Q();
                    if (z || Q == o430Var) {
                        Q = new lao0(i2, tlsVar);
                        btsVar.o0(Q);
                    }
                    i(i6, (sls) Q, btsVar, 0);
                    btsVar.t(false);
                } else if (ajo0Var.b()) {
                    btsVar.e0(-995242924);
                    int i7 = kyh0.scooters_photocontrol_verification_failed_button;
                    boolean e = ((i4 & 112) == 32) | btsVar.e(ajo0Var);
                    Object Q2 = btsVar.Q();
                    if (e || Q2 == o430Var) {
                        Q2 = new nao0(i5, tlsVar, ajo0Var);
                        btsVar.o0(Q2);
                    }
                    i(i7, (sls) Q2, btsVar, 0);
                    btsVar.t(false);
                } else if (ajo0Var.a()) {
                    btsVar.e0(-995017120);
                    int i8 = kyh0.scooters_photocontrol_verification_impossible_button_full_check;
                    boolean z2 = (i4 & 112) == 32;
                    Object Q3 = btsVar.Q();
                    if (z2 || Q3 == o430Var) {
                        Q3 = new lao0(i3, tlsVar);
                        btsVar.o0(Q3);
                    }
                    i(i8, (sls) Q3, btsVar, 0);
                    btsVar.t(false);
                } else if (ajo0Var.c()) {
                    btsVar.e0(-994801732);
                    int i9 = kyh0.common_ok;
                    boolean z3 = (i4 & 112) == 32;
                    Object Q4 = btsVar.Q();
                    if (z3 || Q4 == o430Var) {
                        Q4 = new lao0(5, tlsVar);
                        btsVar.o0(Q4);
                    }
                    i(i9, (sls) Q4, btsVar, 0);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-994679499);
                    btsVar.t(false);
                }
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(xjo0Var, tlsVar, i, 27);
        }
    }

    public static final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1443163426);
        if (btsVar.V(i & 1, i != 0)) {
            SlotSize slotSize = SlotSize.XS;
            f530 o = an91.o(c530.a, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            ocd.a.getClass();
            ydb1.a(o, null, ocd.e, null, null, null, slotSize, false, btsVar, 1573254, 186);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new arm0(i, 11);
        }
    }

    public static final void d(tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1478750510);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            int i4 = kyh0.common_close;
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lao0(3, tlsVar);
                btsVar.o0(Q);
            }
            i(i4, (sls) Q, btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yt40(i, i3, tlsVar);
        }
    }

    public static final void e(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-951926347);
        if (btsVar.V(i & 1, i != 0)) {
            hdu hduVar = new hdu(new up2(fq2.b), AppColor$Palette.Background);
            f530 o = an91.o(c530.a, 10.0f, 10.0f, 0.0f, 0.0f, 12);
            ocd.a.getClass();
            e5v.a(o, hduVar, null, null, ocd.c, btsVar, 24582, 12);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new arm0(i, 12);
        }
    }

    public static final void f(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(307711072);
        if (btsVar.V(i & 1, i != 0)) {
            SlotSize slotSize = SlotSize.XS;
            f530 o = an91.o(c530.a, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            ocd.a.getClass();
            ydb1.a(o, null, ocd.d, null, null, null, slotSize, false, btsVar, 1573254, 186);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new arm0(i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(f530 f530Var, float f, long j, float f2, zls zlsVar, fid fidVar, final int i, final int i2) {
        f530 f530Var2;
        int i3;
        float f3;
        long j2;
        int i4;
        float f4;
        int i5;
        zls zlsVar2;
        final f530 f530Var3;
        final float f5;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2017475516);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f3 = f;
            i3 |= btsVar.b(f3) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && btsVar.d(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                f4 = f2;
                i3 |= btsVar.b(f4) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    zlsVar2 = zlsVar;
                    i3 |= btsVar.e(zlsVar2) ? 16384 : 8192;
                    if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                        f5 = f3;
                    } else {
                        btsVar.a0();
                        if ((i & 1) == 0 || btsVar.C()) {
                            f530Var3 = i6 != 0 ? c530.a : f530Var2;
                            f5 = i7 != 0 ? 40.0f : f3;
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                j2 = ((el51) btsVar.m(gl51.a)).j();
                            }
                            if (i4 != 0) {
                                f4 = 24.0f;
                            }
                            if (i5 != 0) {
                                v7d.a.getClass();
                                zlsVar2 = v7d.b;
                            }
                        } else {
                            btsVar.Y();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            f530Var3 = f530Var2;
                            f5 = f3;
                        }
                        btsVar.u();
                        f530 b = m4m0.b(ljs0.m(f530Var3, f5), j2, cyk0.c(f4));
                        int i8 = ((i3 >> 3) & 7168) | 48;
                        z910 d = pi6.d(x4c.y, false);
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
                        ly3.x(((i8 >> 6) & 112) | 6, zlsVar2, cj6.a, btsVar, true);
                    }
                    final long j3 = j2;
                    final float f6 = f4;
                    final zls zlsVar3 = zlsVar2;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: c5v
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                u3b1.g(f530.this, f5, j3, f6, zlsVar3, (fid) obj, vng.O(i | 1), i2);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                zlsVar2 = zlsVar;
                if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                }
                final long j32 = j2;
                final float f62 = f4;
                final zls zlsVar32 = zlsVar2;
                v = btsVar.v();
                if (v == null) {
                }
            }
            f4 = f2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            zlsVar2 = zlsVar;
            if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
            }
            final long j322 = j2;
            final float f622 = f4;
            final zls zlsVar322 = zlsVar2;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f3 = f;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        zlsVar2 = zlsVar;
        if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        final long j3222 = j2;
        final float f6222 = f4;
        final zls zlsVar3222 = zlsVar2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void h(final xjo0 xjo0Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        long j;
        au2 au2Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1919650776);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xjo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            if (xjo0Var instanceof vjo0) {
                btsVar.e0(826797962);
                e(btsVar, 0);
                btsVar.t(false);
                v = btsVar.v();
                if (v == null) {
                    return;
                } else {
                    wlsVar = new wls() { // from class: tjo0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i4;
                            zy11 zy11Var = zy11.a;
                            int i7 = i;
                            xjo0 xjo0Var2 = xjo0Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                                case 1:
                                    u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                                case 2:
                                    u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                                default:
                                    u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                }
            } else {
                btsVar.e0(826828714);
                btsVar.t(false);
                ajo0 ajo0Var = ((wjo0) xjo0Var).a;
                if (ajo0Var.d()) {
                    j = eq2.c;
                } else if (ajo0Var.b()) {
                    j = fq2.b;
                } else if (ajo0Var.a()) {
                    j = gq2.b;
                } else if (ajo0Var.c()) {
                    j = fq2.b;
                } else {
                    v = btsVar.v();
                    if (v == null) {
                        return;
                    } else {
                        wlsVar = new wls() { // from class: tjo0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = i5;
                                zy11 zy11Var = zy11.a;
                                int i7 = i;
                                xjo0 xjo0Var2 = xjo0Var;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).intValue();
                                switch (i6) {
                                    case 0:
                                        u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                    case 1:
                                        u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                    case 2:
                                        u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                    default:
                                        u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                    }
                }
                hdu hduVar = new hdu(new up2(j), AppColor$Palette.Background);
                if (ajo0Var.d()) {
                    au2Var = zkb1.a;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("CheckRound", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 e = nnm.e(12.0f, 2.0f);
                        e.b(10.0f, 10.0f, true, false, 0.0f, 20.0f);
                        e.b(10.0f, 10.0f, false, false, 0.0f, -20.0f);
                        e.k(-1.0f, 14.5f);
                        e.i(6.5f, -6.5f);
                        e.h(16.0f, 8.5f);
                        e.i(-4.99f, 5.0f);
                        e.i(-3.01f, -3.0f);
                        e.h(6.5f, 12.0f);
                        e.c();
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                        au2Var = rya1.a(lgvVar.d(), true);
                        zkb1.a = au2Var;
                    }
                } else if (ajo0Var.b()) {
                    au2Var = tk91.d();
                } else if (ajo0Var.a()) {
                    au2Var = gub1.a;
                    if (au2Var == null) {
                        lgv lgvVar2 = new lgv("CrossRound", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var2 = new a6t0(iq2.g);
                        uq90 e2 = nnm.e(12.0f, 2.0f);
                        e2.b(10.0f, 10.0f, true, false, 0.0f, 20.0f);
                        e2.b(10.0f, 10.0f, false, false, 0.0f, -20.0f);
                        e2.j(7.29f, 8.7f);
                        e2.i(3.3f, 3.3f);
                        e2.i(-3.3f, 3.3f);
                        e2.i(1.41f, 1.4f);
                        e2.i(3.3f, -3.3f);
                        e2.i(3.3f, 3.3f);
                        e2.i(1.4f, -1.41f);
                        e2.i(-3.29f, -3.3f);
                        e2.i(3.3f, -3.3f);
                        e2.h(15.3f, 7.3f);
                        tse0.u(e2, 12.0f, 10.6f, 8.7f, 7.3f);
                        lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", e2.a);
                        au2Var = rya1.a(lgvVar2.d(), true);
                        gub1.a = au2Var;
                    }
                } else if (ajo0Var.c()) {
                    au2Var = e0b1.a;
                    if (au2Var == null) {
                        lgv lgvVar3 = new lgv("ArrowUpRound", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var3 = new a6t0(iq2.g);
                        uq90 e3 = nnm.e(12.0f, 22.0f);
                        e3.b(10.0f, 10.0f, true, false, 0.0f, -20.0f);
                        e3.b(10.0f, 10.0f, false, false, 0.0f, 20.0f);
                        e3.j(6.0f, 12.0f);
                        e3.i(6.0f, -6.0f);
                        e3.i(6.0f, 6.0f);
                        e3.i(-1.27f, 1.27f);
                        e3.i(-3.84f, -3.85f);
                        e3.o(18.0f);
                        e3.g(-1.78f);
                        e3.o(9.42f);
                        e3.i(-3.84f, 3.85f);
                        e3.c();
                        lgvVar3.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var3, null, "", e3.a);
                        au2Var = rya1.a(lgvVar3.d(), true);
                        e0b1.a = au2Var;
                    }
                } else {
                    v = btsVar.v();
                    if (v == null) {
                        return;
                    } else {
                        wlsVar = new wls() { // from class: tjo0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = i3;
                                zy11 zy11Var = zy11.a;
                                int i7 = i;
                                xjo0 xjo0Var2 = xjo0Var;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).intValue();
                                switch (i6) {
                                    case 0:
                                        u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                    case 1:
                                        u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                    case 2:
                                        u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                    default:
                                        u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                    }
                }
                e5v.a(an91.o(c530.a, 10.0f, 10.0f, 0.0f, 0.0f, 12), hduVar, null, null, wwg.S(1292058148, true, new w7o0(i5, au2Var), btsVar), btsVar, 24582, 12);
            }
            v.d = wlsVar;
        }
        btsVar.Y();
        v = btsVar.v();
        if (v != null) {
            final int i6 = 3;
            wlsVar = new wls() { // from class: tjo0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    zy11 zy11Var = zy11.a;
                    int i7 = i;
                    xjo0 xjo0Var2 = xjo0Var;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                            break;
                        case 1:
                            u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                            break;
                        case 2:
                            u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                            break;
                        default:
                            u3b1.h(xjo0Var2, fidVar2, vng.O(i7 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void i(int i, sls slsVar, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1233174658);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2 | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            d17.c(an91.o(c530.a, 0.0f, 4.0f, 0.0f, 0.0f, 13), false, null, ButtonStyle.Main, null, slsVar, wwg.S(2130529562, true, new vm1(i, 3), btsVar), btsVar, ((i3 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | 1575942, 22);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yr7(i, slsVar, i2);
        }
    }

    public static final void j(f530 f530Var, float f, long j, final zls zlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1046802273);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        }
        int i5 = i3 | 176;
        if (btsVar.V(i5 & 1, (i5 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                if (i4 != 0) {
                    f530Var = c530.a;
                }
                j = ((el51) btsVar.m(gl51.a)).j();
                f = 40.0f;
            } else {
                btsVar.Y();
            }
            btsVar.u();
            f530 a = aab1.a(0.5f, j, ljs0.m(f530Var, f), cyk0.a);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a);
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
            ly3.x(54, zlsVar, cj6.a, btsVar, true);
        } else {
            btsVar.Y();
        }
        final f530 f530Var2 = f530Var;
        final float f2 = f;
        final long j2 = j;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f2, j2, zlsVar, i, i2) { // from class: d5v
                public final /* synthetic */ float b;
                public final /* synthetic */ long c;
                public final /* synthetic */ zls w;
                public final /* synthetic */ int x;

                {
                    this.x = i2;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(3073);
                    u3b1.j(f530.this, this.b, this.c, this.w, (fid) obj, O, this.x);
                    return zy11.a;
                }
            };
        }
    }

    public static final void k(xjo0 xjo0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1556641422);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xjo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(7, xjo0Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(xjo0Var, tlsVar, i, 8);
        }
    }

    public static final void l(xjo0 xjo0Var, fid fidVar, int i) {
        aii0 v;
        ujo0 ujo0Var;
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1219359579);
        int i3 = 2;
        int i4 = (btsVar.k(xjo0Var) ? 4 : 2) | i;
        int i5 = 1;
        int i6 = 0;
        if (btsVar.V(i4 & 1, (i4 & 3) != 2)) {
            if (xjo0Var instanceof vjo0) {
                btsVar.e0(-892094170);
                f(btsVar, 0);
                btsVar.t(false);
                v = btsVar.v();
                if (v == null) {
                    return;
                } else {
                    ujo0Var = new ujo0(xjo0Var, i, i6);
                }
            } else {
                btsVar.e0(-892062457);
                btsVar.t(false);
                ajo0 ajo0Var = ((wjo0) xjo0Var).a;
                if (ajo0Var.d()) {
                    i2 = kyh0.scooters_photocontrol_verification_success;
                } else if (ajo0Var.b()) {
                    i2 = kyh0.scooters_photocontrol_verification_failed_title;
                } else if (ajo0Var.a()) {
                    i2 = kyh0.scooters_photocontrol_verification_impossible_title;
                } else if (ajo0Var.c()) {
                    i2 = kyh0.scooters_photocontrol_in_progress;
                } else {
                    v = btsVar.v();
                    if (v == null) {
                        return;
                    } else {
                        ujo0Var = new ujo0(xjo0Var, i, i5);
                    }
                }
                ydb1.a(an91.o(c530.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, wwg.S(-73314516, true, new vm1(i2, i3), btsVar), null, null, null, SlotSize.XS, false, btsVar, 1573254, 186);
            }
            v.d = ujo0Var;
        }
        btsVar.Y();
        v = btsVar.v();
        if (v != null) {
            ujo0Var = new ujo0(xjo0Var, i, i3);
            v.d = ujo0Var;
        }
    }
}
