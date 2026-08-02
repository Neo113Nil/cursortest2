package defpackage;

import android.os.Build;
import android.os.Parcel;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.HashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

/* loaded from: classes12.dex */
public abstract class u691 {
    public static pzt0 a;

    public static final void a(f530 f530Var, efa efaVar, boolean z, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1265003259);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(efaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(slsVar) ? 2048 : 1024;
        }
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar = btsVar2;
            qgy.b(efaVar.a, null, an91.l(bzk0.c(ymb1.l(q791.b(ljs0.c(f530Var, 1.0f), null, null, z, null, new awk0(0), slsVar, 8), cyk0.e(20.0f, 20.0f, 0.0f, 0.0f, 12)), efaVar.b, qke.q), 16.0f, 9.0f), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar, 0, 0, 12154);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(f530Var, efaVar, z, slsVar, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25 */
    public static final void b(hfa hfaVar, boolean z, f530 f530Var, tls tlsVar, tls tlsVar2, sls slsVar, fid fidVar, int i) {
        int i2;
        final hfa hfaVar2;
        final tls tlsVar3;
        boolean z2;
        AppColor$Palette appColor$Palette;
        g43 g43Var;
        gfa gfaVar;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1117931040);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(hfaVar) : btsVar.e(hfaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(slsVar) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            f530 l = ymb1.l(ljs0.c(f530Var, 1.0f), cyk0.c(20.0f));
            AppColor$Palette appColor$Palette2 = AppColor$Palette.BgMinor;
            gji0 gji0Var = qke.q;
            f530 c = bzk0.c(l, appColor$Palette2, gji0Var);
            so5 so5Var = x4c.G;
            g43 g43Var2 = lr20.c;
            sic a2 = qic.a(g43Var2, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            int i3 = i2;
            sls slsVar2 = d.b;
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar4 = d.h;
            qje.M(btsVar, tlsVar4);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            boolean z4 = hfaVar instanceof gfa;
            c530 c530Var = c530.a;
            if (z4) {
                btsVar.e0(-282306267);
                gfa gfaVar2 = (gfa) hfaVar;
                efa efaVar = gfaVar2.f;
                if (efaVar == null) {
                    btsVar.e0(-282308376);
                    btsVar.t(false);
                    g43Var = g43Var2;
                    gfaVar = gfaVar2;
                    z3 = 0;
                    appColor$Palette = appColor$Palette2;
                } else {
                    btsVar.e0(-282308375);
                    appColor$Palette = appColor$Palette2;
                    g43Var = g43Var2;
                    gfaVar = gfaVar2;
                    a(ljs0.c(c530Var, 1.0f), efaVar, z, slsVar, btsVar, ((i3 << 3) & 896) | 6 | ((i3 >> 6) & 7168));
                    btsVar = btsVar;
                    z3 = 0;
                    btsVar.t(false);
                }
                f530 c2 = efaVar != null ? bzk0.c(ymb1.l(bzk0.c(c530Var, efaVar.b, gji0Var), cyk0.c(20.0f)), appColor$Palette, gji0Var) : c530Var;
                sic a3 = qic.a(g43Var, so5Var, btsVar, z3);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = b.d(btsVar, c2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a3);
                qje.W(btsVar, wlsVar2, o2);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar4);
                qje.W(btsVar, wlsVar4, d2);
                gfa gfaVar3 = gfaVar;
                c(gfaVar3.b, gfaVar3.c, gfaVar3.e, z, tlsVar, btsVar, ((i3 << 6) & 7168) | ((i3 << 3) & HProv.ALG_CLASS_ALL));
                d(gfaVar3.d, an91.l(c530Var, 16.0f, 12.0f), btsVar, 48);
                z2 = true;
                btsVar.t(true);
                btsVar.t(z3);
                hfaVar2 = hfaVar;
                tlsVar3 = tlsVar2;
            } else {
                hfaVar2 = hfaVar;
                z2 = true;
                z2 = true;
                final int i4 = 0;
                boolean z5 = hfaVar2 instanceof cfa;
                int i5 = 29;
                o430 o430Var = did.a;
                if (z5) {
                    btsVar.e0(-281242161);
                    cfa cfaVar = (cfa) hfaVar2;
                    CharSequence charSequence = cfaVar.b;
                    CharSequence charSequence2 = cfaVar.c;
                    Object Q = btsVar.Q();
                    if (Q == o430Var) {
                        Q = new ew9(i5);
                        btsVar.o0(Q);
                    }
                    c(charSequence, charSequence2, null, false, (tls) Q, btsVar, 28032);
                    ButtonSize buttonSize = ButtonSize.XS;
                    f530 c3 = ljs0.c(an91.l(c530Var, 16.0f, 12.0f), 1.0f);
                    ?? r3 = ((i3 & HProv.ALG_CLASS_ALL) == 16384) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && btsVar.e(hfaVar2)));
                    Object Q2 = btsVar.Q();
                    if (r3 == true || Q2 == o430Var) {
                        tlsVar3 = tlsVar2;
                        Q2 = new sls() { // from class: kfa
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i6 = i4;
                                zy11 zy11Var = zy11.a;
                                tls tlsVar5 = tlsVar3;
                                hfa hfaVar3 = hfaVar2;
                                switch (i6) {
                                    case 0:
                                        ila ilaVar = ((cfa) hfaVar3).d.c;
                                        if (ilaVar != null) {
                                            tlsVar5.invoke(ilaVar);
                                            break;
                                        }
                                        break;
                                    default:
                                        ila ilaVar2 = ((dfa) hfaVar3).d.c;
                                        if (ilaVar2 != null) {
                                            tlsVar5.invoke(ilaVar2);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q2);
                    } else {
                        tlsVar3 = tlsVar2;
                    }
                    ohb1.b(c3, z, buttonSize, (sls) Q2, wwg.S(1251546730, true, new zls() { // from class: lfa
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i6 = i4;
                            zy11 zy11Var = zy11.a;
                            c530 c530Var2 = c530.a;
                            hfa hfaVar3 = hfaVar2;
                            switch (i6) {
                                case 0:
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    bts btsVar2 = (bts) fidVar2;
                                    if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                        btsVar2.Y();
                                        break;
                                    } else {
                                        qgy.b(((cfa) hfaVar3).d.a, null, an91.m(c530Var2, 0.0f, 9.0f, 1), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar2, 384, 0, 12282);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        qgy.b(((dfa) hfaVar3).d.a, null, an91.m(c530Var2, 0.0f, 9.0f, 1), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, 384, 0, 12282);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar), btsVar, (i3 & 112) | 24966, 0);
                    btsVar.t(false);
                } else {
                    tlsVar3 = tlsVar2;
                    if (!(hfaVar2 instanceof dfa)) {
                        throw unr0.y(-1256032954, btsVar, false);
                    }
                    btsVar.e0(-280427729);
                    dfa dfaVar = (dfa) hfaVar2;
                    CharSequence charSequence3 = dfaVar.b;
                    CharSequence charSequence4 = dfaVar.c;
                    Object Q3 = btsVar.Q();
                    if (Q3 == o430Var) {
                        Q3 = new ew9(i5);
                        btsVar.o0(Q3);
                    }
                    c(charSequence3, charSequence4, null, false, (tls) Q3, btsVar, 28032);
                    ButtonSize buttonSize2 = ButtonSize.XS;
                    f530 c4 = ljs0.c(an91.l(c530Var, 16.0f, 12.0f), 1.0f);
                    ?? r4 = ((i3 & HProv.ALG_CLASS_ALL) == 16384) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && btsVar.e(hfaVar2)));
                    Object Q4 = btsVar.Q();
                    if (r4 != false || Q4 == o430Var) {
                        final int i6 = z2 ? 1 : 0;
                        Q4 = new sls() { // from class: kfa
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i62 = i6;
                                zy11 zy11Var = zy11.a;
                                tls tlsVar5 = tlsVar3;
                                hfa hfaVar3 = hfaVar2;
                                switch (i62) {
                                    case 0:
                                        ila ilaVar = ((cfa) hfaVar3).d.c;
                                        if (ilaVar != null) {
                                            tlsVar5.invoke(ilaVar);
                                            break;
                                        }
                                        break;
                                    default:
                                        ila ilaVar2 = ((dfa) hfaVar3).d.c;
                                        if (ilaVar2 != null) {
                                            tlsVar5.invoke(ilaVar2);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q4);
                    }
                    final int i7 = z2 ? 1 : 0;
                    ohb1.b(c4, z, buttonSize2, (sls) Q4, wwg.S(-83826999, true, new zls() { // from class: lfa
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i62 = i7;
                            zy11 zy11Var = zy11.a;
                            c530 c530Var2 = c530.a;
                            hfa hfaVar3 = hfaVar2;
                            switch (i62) {
                                case 0:
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    bts btsVar2 = (bts) fidVar2;
                                    if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                        btsVar2.Y();
                                        break;
                                    } else {
                                        qgy.b(((cfa) hfaVar3).d.a, null, an91.m(c530Var2, 0.0f, 9.0f, 1), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar2, 384, 0, 12282);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        qgy.b(((dfa) hfaVar3).d.a, null, an91.m(c530Var2, 0.0f, 9.0f, 1), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, 384, 0, 12282);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar), btsVar, (i3 & 112) | 24966, 0);
                    btsVar.t(false);
                }
            }
            btsVar.t(z2);
        } else {
            hfaVar2 = hfaVar;
            tlsVar3 = tlsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(hfaVar2, z, f530Var, tlsVar, tlsVar3, slsVar, i, 1);
        }
    }

    public static final void c(CharSequence charSequence, CharSequence charSequence2, wj90 wj90Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1161398843);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(charSequence2) : btsVar.e(charSequence2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(wj90Var) : btsVar.e(wj90Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            ydb1.a(null, null, wwg.S(1878307980, true, new mfa(charSequence, charSequence2, i3), btsVar), null, wwg.S(-1817482170, true, new jfa(wj90Var, z, tlsVar, i3), btsVar), null, null, false, btsVar, 24960, 235);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(charSequence, charSequence2, wj90Var, z, tlsVar, i, 5);
        }
    }

    public static final void d(ffa ffaVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1873853322);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = (btsVar2.k(ffaVar) ? 4 : 2) | i;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            byk0 c = cyk0.c(32.0f);
            f530 c2 = ljs0.c(f530Var, 1.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, c2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            c530 c530Var = c530.a;
            f530 c3 = bzk0.c(ymb1.l(ljs0.e(ljs0.c(c530Var, 1.0f), 6.0f), c), ffaVar.c, qke.q);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d3 = b.d(btsVar2, c3);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, d2);
            qje.W(btsVar2, wlsVar2, o2);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
            qje.W(btsVar2, wlsVar4, d3);
            pi6.a(bzk0.c(ljs0.c(c530Var, ffaVar.a).k(ljs0.b), ffaVar.d, c), btsVar2, 0);
            btsVar2.t(true);
            qgy.b(ffaVar.b, null, an91.o(c530Var, 0.0f, 7.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar2).h.a, null, btsVar2, 805309824, 6, 10738);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(ffaVar, f530Var, i, 4);
        }
    }

    public static final Object e(UserCardProfileName userCardProfileName, Object obj, Object obj2) {
        int i = pk21.a[userCardProfileName.ordinal()];
        if (i == 1 || i == 2) {
            return obj;
        }
        if (i == 3 || i == 4) {
            return obj2;
        }
        w511.b();
        return null;
    }

    public static void f(Parcel parcel, HashMap hashMap, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT >= 34) {
            rh.k(parcel, hashMap, classLoader);
        } else {
            parcel.readMap(hashMap, classLoader);
        }
    }
}
