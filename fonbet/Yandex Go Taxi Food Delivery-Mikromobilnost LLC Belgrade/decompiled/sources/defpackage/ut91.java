package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yx360.design.compose.atoms.DsButton$Style;
import com.yx360.design.compose.atoms.inlineNotification.DsInlineNotification$Tone;
import io.appmetrica.analytics.BuildConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ut91 {
    public static final void a(sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(12144765);
        if ((i & 6) == 0) {
            i2 = (btsVar.k("") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            to5 to5Var = x4c.E;
            i43 i43Var = new i43(2.0f, true, new quz(11));
            c530 c530Var = c530.a;
            f530 o = an91.o(q791.d(bzk0.c(ymb1.l(ljs0.e(c530Var, 32.0f), cyk0.c(10.0f)), AppColor$Palette.Background, cyk0.c(10.0f)), false, null, null, slsVar, 15), 12.0f, 0.0f, 8.0f, 0.0f, 10);
            lhl0 a = khl0.a(i43Var, to5Var, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            ety0 ety0Var = xya1.e(btsVar).h.b;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            jeb1.f("", null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, (i3 & 14) | 384, 0, 16378);
            btsVar = btsVar;
            sya1.a(llb1.b(), ljs0.m(c530Var, 20.0f), null, appColor$Palette, btsVar, 3120, 4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yr7(slsVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(DsInlineNotification$Tone dsInlineNotification$Tone, pa90 pa90Var, String str, f530 f530Var, fqm fqmVar, String str2, fid fidVar, int i, int i2) {
        int i3;
        fqm fqmVar2;
        int i4;
        String str3;
        int i5;
        int i6;
        long N;
        DsButton$Style dsButton$Style;
        long O;
        String str4;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(855221215);
        if ((i & 6) == 0) {
            i3 = (btsVar.c(dsInlineNotification$Tone.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(pa90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.k(str) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            fqmVar2 = fqmVar;
            i3 |= btsVar.k(fqmVar2) ? 16384 : 8192;
            int i8 = 196608 | i3;
            i4 = i2 & 64;
            if (i4 == 0) {
                i8 = 1769472 | i3;
            } else if ((1572864 & i) == 0) {
                str3 = str2;
                i8 |= btsVar.k(str3) ? 1048576 : 524288;
                i5 = i8 | 12582912;
                if ((4793491 & i5) == 4793490 || !btsVar.E()) {
                    if (i7 != 0) {
                        fqmVar2 = null;
                    }
                    String str5 = i4 != 0 ? null : str3;
                    i6 = gqm.a[dsInlineNotification$Tone.ordinal()];
                    int i9 = 1;
                    if (i6 == 1) {
                        btsVar.e0(149736964);
                        qnm qnmVar = qnm.a;
                        N = qnm.c(btsVar).N();
                        if (fqmVar2 == null || (dsButton$Style = fqmVar2.c) == null) {
                            dsButton$Style = DsButton$Style.Success;
                        }
                        O = qnm.c(btsVar).O();
                        btsVar.t(false);
                    } else if (i6 == 2) {
                        btsVar.e0(150003812);
                        qnm qnmVar2 = qnm.a;
                        N = qnm.c(btsVar).Q();
                        if (fqmVar2 == null || (dsButton$Style = fqmVar2.c) == null) {
                            dsButton$Style = DsButton$Style.Warning;
                        }
                        O = qnm.c(btsVar).R();
                        btsVar.t(false);
                    } else if (i6 == 3) {
                        btsVar.e0(150269575);
                        qnm qnmVar3 = qnm.a;
                        N = qnm.c(btsVar).G();
                        if (fqmVar2 == null || (dsButton$Style = fqmVar2.c) == null) {
                            dsButton$Style = DsButton$Style.Danger;
                        }
                        O = qnm.c(btsVar).H();
                        btsVar.t(false);
                    } else {
                        if (i6 != 4) {
                            throw unr0.y(1528849848, btsVar, false);
                        }
                        btsVar.e0(150533230);
                        qnm qnmVar4 = qnm.a;
                        N = qnm.c(btsVar).g0();
                        if (fqmVar2 == null || (dsButton$Style = fqmVar2.c) == null) {
                            dsButton$Style = DsButton$Style.Contrast;
                        }
                        O = qnm.c(btsVar).M();
                        btsVar.t(false);
                    }
                    tt91.b(O, str, wwg.S(-1660888532, true, new cpm(pa90Var, N, i9), btsVar), f530Var, fqmVar2 != null ? new fqm(fqmVar2.b, dsButton$Style, fqmVar2.a) : null, str5, btsVar, ((i5 >> 3) & 112) | 384 | (i5 & 7168) | (458752 & i5) | (3670016 & i5) | (29360128 & i5));
                    str4 = str5;
                } else {
                    btsVar.Y();
                    str4 = str3;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new tq0(dsInlineNotification$Tone, pa90Var, str, f530Var, fqmVar2, str4, i, i2);
                    return;
                }
                return;
            }
            str3 = str2;
            i5 = i8 | 12582912;
            if ((4793491 & i5) == 4793490) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            i6 = gqm.a[dsInlineNotification$Tone.ordinal()];
            int i92 = 1;
            if (i6 == 1) {
            }
            tt91.b(O, str, wwg.S(-1660888532, true, new cpm(pa90Var, N, i92), btsVar), f530Var, fqmVar2 != null ? new fqm(fqmVar2.b, dsButton$Style, fqmVar2.a) : null, str5, btsVar, ((i5 >> 3) & 112) | 384 | (i5 & 7168) | (458752 & i5) | (3670016 & i5) | (29360128 & i5));
            str4 = str5;
            v = btsVar.v();
            if (v != null) {
            }
        }
        fqmVar2 = fqmVar;
        int i82 = 196608 | i3;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        str3 = str2;
        i5 = i82 | 12582912;
        if ((4793491 & i5) == 4793490) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        i6 = gqm.a[dsInlineNotification$Tone.ordinal()];
        int i922 = 1;
        if (i6 == 1) {
        }
        tt91.b(O, str, wwg.S(-1660888532, true, new cpm(pa90Var, N, i922), btsVar), f530Var, fqmVar2 != null ? new fqm(fqmVar2.b, dsButton$Style, fqmVar2.a) : null, str5, btsVar, ((i5 >> 3) & 112) | 384 | (i5 & 7168) | (458752 & i5) | (3670016 & i5) | (29360128 & i5));
        str4 = str5;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void c(final boolean z, final sls slsVar, final sls slsVar2, final f530 f530Var, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1641290631);
        if ((i & 6) == 0) {
            i2 = (btsVar.k("") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(f530Var) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            aii0 v = btsVar.v();
            if (v != null) {
                final int i3 = 0;
                v.d = new wls() { // from class: o2l0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        zy11 zy11Var = zy11.a;
                        int i5 = i;
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int O = vng.O(i5 | 1);
                                ut91.c(z, slsVar, slsVar2, f530Var, (fid) obj, O);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int O2 = vng.O(i5 | 1);
                                ut91.c(z, slsVar, slsVar2, f530Var, (fid) obj, O2);
                                break;
                        }
                        return zy11Var;
                    }
                };
                return;
            }
            return;
        }
        btsVar.Y();
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i4 = 1;
            v2.d = new wls() { // from class: o2l0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    zy11 zy11Var = zy11.a;
                    int i5 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i5 | 1);
                            ut91.c(z, slsVar, slsVar2, f530Var, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i5 | 1);
                            ut91.c(z, slsVar, slsVar2, f530Var, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void d(sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1505042604);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new yr7(slsVar, i, i3);
                return;
            }
            return;
        }
        uo5 uo5Var = x4c.y;
        f530 d = q791.d(bzk0.c(ymb1.l(ljs0.n(c530.a, 36.0f, 32.0f), cyk0.c(10.0f)), AppColor$Palette.Background, cyk0.c(10.0f)), false, null, null, slsVar, 15);
        z910 d2 = pi6.d(uo5Var, false);
        int hashCode = Long.hashCode(btsVar.T);
        r1b0 o = btsVar.o();
        f530 d3 = b.d(btsVar, d);
        ohd.G1.getClass();
        sls slsVar2 = d.b;
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
        qje.W(btsVar, d.f, d2);
        qje.W(btsVar, d.e, o);
        qje.W(btsVar, d.g, Integer.valueOf(hashCode));
        qje.M(btsVar, d.h);
        qje.W(btsVar, d.d, d3);
        throw null;
    }

    public static final void e(txq0 txq0Var, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1299136494);
        int i3 = i & 6;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            i2 = (btsVar.k(emptyList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(txq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean a = btsVar.a(true);
            Object Q = btsVar.Q();
            if (a || Q == did.a) {
                Q = new p2l0(true);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-577091148);
            Iterator<E> it = emptyList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    ny61.u();
                    return;
                }
                d(slsVar, btsVar, (i2 >> 3) & 112);
            }
            btsVar.t(false);
            btsVar.e0(-709814763);
            a(slsVar, btsVar, (i2 >> 3) & 112);
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(txq0Var, slsVar, f530Var, i, 20);
        }
    }

    public static final void f(i0l0 i0l0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1799466703);
        int i2 = (btsVar.k(i0l0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            long j = i0l0Var.b;
            long j2 = i0l0Var.a;
            up2 up2Var = new up2(j);
            byk0 c = cyk0.c(100.0f);
            c530 c530Var = c530.a;
            f530 n = an91.n(bzk0.c(c530Var, up2Var, c), 8.0f, 4.0f, 12.0f, 4.0f);
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar, 54);
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
            int i3 = i0l0Var.c;
            f530 m = ljs0.m(c530Var, 20.0f);
            up2 up2Var2 = new up2(j2);
            pa90 a2 = wya1.a(i3, 0, btsVar);
            btsVar.e0(-1411607276);
            o4b1.b(a2, null, m, null, null, 0.0f, tse0.e(tje.n(up2Var2, btsVar), 5, btsVar, false), btsVar, 392, 56);
            jeb1.f("", null, new up2(j2), 0L, 0L, null, new sjy0(3), 0L, 2, false, 1, 0, null, xya1.e(btsVar).g.b, btsVar, 805306368, 48, 13690);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lbb0(i0l0Var, i, 13);
        }
    }

    public static final void g(w2l0 w2l0Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        w2l0 w2l0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1085201682);
        dmw0 dmw0Var = btsVar.a;
        int i2 = 2;
        int i3 = 16;
        int i4 = i | (btsVar.k(w2l0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.d(new vs9(a, i3));
                btsVar.o0(Q);
            }
            m3u0 m3u0Var = (m3u0) Q;
            k3r k3rVar = ljs0.c;
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var = c530.a;
            f530 g = s1a1.g(c530Var, 1.0f);
            igr0 b = dbb1.b(btsVar);
            gji0 gji0Var = qke.q;
            crb1.a(i9a1.f(bzk0.c(hbb1.b(g, b, gji0Var, ((Boolean) m3u0Var.getValue()).booleanValue(), 8), AppColor$Palette.BgMinor, gji0Var)), wwg.S(616627014, true, new rhi0(i2, tlsVar), btsVar), null, wwg.S(-237912444, true, new lbb0(12, w2l0Var), btsVar), null, null, null, btsVar, 3120, BuildConfig.API_LEVEL);
            btsVar = btsVar;
            x2y x2yVar = new x2y(1.0f, true);
            boolean z = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new vxj0(14, w2l0Var, tlsVar);
                btsVar.o0(Q2);
            }
            adb1.a(x2yVar, a, null, null, null, null, false, null, (tls) Q2, btsVar, 0, 508);
            f530 c = bzk0.c(ljs0.c(c530Var, 1.0f), AppColor$Palette.Background, gji0Var);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            w2l0Var2 = w2l0Var;
            tlsVar2 = tlsVar;
            ocb1.a(null, true, null, true, true, null, 0.0f, 0, wwg.S(223789201, true, new n2l0(tlsVar2, w2l0Var2), btsVar), btsVar, 805334064, 485);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            w2l0Var2 = w2l0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new n2l0(w2l0Var2, tlsVar2, i);
        }
    }

    public static final void h(w2l0 w2l0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1642405254);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(w2l0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(-1775542104, true, new m2l0(w2l0Var, tlsVar, i3), btsVar), btsVar, 27648, 7);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(w2l0Var, tlsVar, i, 19);
        }
    }

    public static final void i(w2l0 w2l0Var, tls tlsVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-565369760);
        int i2 = i | (btsVar.k(w2l0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            w2l0Var.getClass();
            vxq0 vxq0Var = w2l0Var.b;
            boolean z = false;
            jeb1.f("", an91.o(c530Var, 16.0f, 8.0f, 16.0f, 0.0f, 8), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0.a(xya1.e(btsVar).d.c, 0L, 0L, null, null, null, 0L, null, null, null, 0, uh6.E(34), null, null, 16646143), btsVar, 384, 0, 16376);
            btsVar = btsVar;
            c(w2l0Var.d, slsVar, slsVar2, an91.l(c530Var, 16.0f, 8.0f), btsVar, (i2 & 896) | HProv.ALG_CLASS_DATA_ENCRYPT | (i2 & 7168));
            txq0 txq0Var = vxq0Var.a;
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                tlsVar2 = tlsVar;
                Q = new o8k0(9, tlsVar2, w2l0Var);
                btsVar.o0(Q);
            } else {
                tlsVar2 = tlsVar;
            }
            k(txq0Var, (sls) Q, an91.o(c530Var, 0.0f, 16.0f, 0.0f, 20.0f, 5), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(w2l0Var, tlsVar2, slsVar, slsVar2, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x020e, code lost:
    
        if (r3 == r2) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(fid fidVar, int i) {
        ffu0 ffu0Var;
        oz40 oz40Var;
        o430 o430Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1126726296);
        dmw0 dmw0Var = btsVar.a;
        EmptyList emptyList = EmptyList.a;
        int i2 = i | (btsVar.k(emptyList) ? 4 : 2) | (btsVar.k("") ? 32 : 16) | (btsVar.k("") ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                Q = new ffu0();
                btsVar.o0(Q);
            }
            ffu0 ffu0Var2 = (ffu0) Q;
            boolean z = (i2 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var2) {
                Q2 = f.j(emptyList);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            c530 c530Var = c530.a;
            f530 o = an91.o(bzk0.c(ljs0.c(c530Var, 1.0f), AppColor$Palette.Background, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            so5 so5Var = x4c.G;
            sic a = qic.a(lr20.c, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
            sic a2 = qic.a(new i43(2.0f, true, new quz(11)), so5Var, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            ffu0 ffu0Var3 = ffu0Var2;
            oz40 oz40Var3 = oz40Var2;
            o430 o430Var3 = o430Var2;
            jeb1.f("", null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).f.c, btsVar, ((i2 >> 3) & 14) | 384, 0, 16378);
            jeb1.f("", null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, ((i2 >> 6) & 14) | 384, 0, 16378);
            btsVar = btsVar;
            n.y(btsVar, true, c530Var, 8.0f, btsVar);
            btsVar.e0(-2083495046);
            for (giu0 giu0Var : (List) oz40Var3.getValue()) {
                if (giu0Var instanceof fiu0) {
                    btsVar.e0(-965332065);
                    zob1.d((fiu0) giu0Var, ljs0.c(c530Var, 1.0f), xya1.e(btsVar).g.a, btsVar, 48, 0);
                    btsVar.t(false);
                    ffu0Var = ffu0Var3;
                    oz40Var = oz40Var3;
                    o430Var = o430Var3;
                } else if (giu0Var instanceof diu0) {
                    btsVar.e0(-1000965309);
                    diu0 diu0Var = (diu0) giu0Var;
                    oz40Var = oz40Var3;
                    ffu0Var = ffu0Var3;
                    boolean k = btsVar.k(oz40Var) | btsVar.e(ffu0Var);
                    Object Q3 = btsVar.Q();
                    if (k) {
                        o430Var = o430Var3;
                    } else {
                        o430Var = o430Var3;
                    }
                    Q3 = new vxj0(15, ffu0Var, oz40Var);
                    btsVar.o0(Q3);
                    zob1.a(diu0Var, (tls) Q3, ljs0.c(c530Var, 1.0f), btsVar, 392);
                    btsVar.t(false);
                } else {
                    ffu0Var = ffu0Var3;
                    oz40Var = oz40Var3;
                    o430Var = o430Var3;
                    if (!(giu0Var instanceof eiu0)) {
                        throw unr0.y(-1000972440, btsVar, false);
                    }
                    btsVar.e0(-964898158);
                    btsVar.t(false);
                }
                o430Var3 = o430Var;
                ffu0Var3 = ffu0Var;
                oz40Var3 = oz40Var;
            }
            n.y(btsVar, false, c530Var, 16.0f, btsVar);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dok0(i);
        }
    }

    public static final void k(txq0 txq0Var, sls slsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-740810023);
        int i2 = (btsVar.k(EmptyList.a) ? 4 : 2) | i | (btsVar.k(txq0Var) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.a(true) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.e0(-1929210134);
            e(txq0Var, slsVar, ljs0.c(an91.m(f530Var, 16.0f, 0.0f, 2), 1.0f), btsVar, i2 & 1022);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(txq0Var, slsVar, f530Var, i, 11);
        }
    }

    public static final String m(Collection collection) {
        return a.X(collection, ";", null, null, new fnb0(28), 30);
    }
}
