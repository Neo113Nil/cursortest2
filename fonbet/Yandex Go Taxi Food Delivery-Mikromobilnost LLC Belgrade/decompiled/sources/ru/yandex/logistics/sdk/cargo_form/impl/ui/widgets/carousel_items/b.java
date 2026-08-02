package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items;

import androidx.compose.animation.m;
import defpackage.a990;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bjy;
import defpackage.bms;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cy8;
import defpackage.cyk0;
import defpackage.did;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.gl51;
import defpackage.hc0;
import defpackage.hy8;
import defpackage.i43;
import defpackage.jl40;
import defpackage.jrn;
import defpackage.jv8;
import defpackage.khl0;
import defpackage.ku0;
import defpackage.ky8;
import defpackage.l690;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.m4m0;
import defpackage.m6;
import defpackage.my8;
import defpackage.nx8;
import defpackage.o430;
import defpackage.ohd;
import defpackage.otr0;
import defpackage.pi6;
import defpackage.py8;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qm51;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.rb0;
import defpackage.rg4;
import defpackage.rx21;
import defpackage.ry8;
import defpackage.rzo;
import defpackage.s3b1;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.ugh;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y7m;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zgb1;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.b;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class b {
    public static final /* synthetic */ int a = 0;

    static {
        ContentAlignment contentAlignment = ContentAlignment.LEADING;
        an91.a(24.0f, 8.0f);
        Collections.singletonList(new rg4(new bjy(scc.g(new Pair(Float.valueOf(0.0f), new ldc(ldc.b(rzo.f(4281423499L), 0.33f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new ldc(rzo.f(4281423499L)))), 4.71d), null));
        an91.b(0.0f, 0.0f, 3);
    }

    public static final void a(ugh ughVar, int i, long j, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-896486178);
        int i3 = i2 | (btsVar.k(ughVar) ? 4 : 2) | (btsVar.c(i) ? 32 : 16) | (btsVar.d(j) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            Long valueOf = Long.valueOf(j);
            Integer valueOf2 = Integer.valueOf(ughVar.o());
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                CarouselItemsKt$CarouselAutoScrollEffect$1$1 carouselItemsKt$CarouselAutoScrollEffect$1$1 = new CarouselItemsKt$CarouselAutoScrollEffect$1$1(ughVar, j, i, null);
                btsVar.o0(carouselItemsKt$CarouselAutoScrollEffect$1$1);
                Q = carouselItemsKt$CarouselAutoScrollEffect$1$1;
            }
            zpn.g(ughVar, valueOf, valueOf2, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hy8(ughVar, i, j, i2);
        }
    }

    public static final void b(ugh ughVar, List list, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-476256865);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ughVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int size = list.size();
            boolean e = ((i2 & 14) == 4) | ((i2 & 896) == 256) | btsVar.e(list) | btsVar.c(size);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                CarouselItemsKt$CarouselCurrentPageShownEffect$1$1 carouselItemsKt$CarouselCurrentPageShownEffect$1$1 = new CarouselItemsKt$CarouselCurrentPageShownEffect$1$1(ughVar, tlsVar, list, size, null);
                btsVar.o0(carouselItemsKt$CarouselCurrentPageShownEffect$1$1);
                Q = carouselItemsKt$CarouselCurrentPageShownEffect$1$1;
            }
            zpn.f(ughVar, list, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(ughVar, list, tlsVar, i, 29);
        }
    }

    public static final void c(final float f, final nx8 nx8Var, final boolean z, fid fidVar, final int i) {
        int i2;
        ldc ldcVar;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1242333975);
        if ((i & 6) == 0) {
            i2 = (btsVar.b(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(nx8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                btsVar.e0(638457654);
                ldcVar = nx8Var != null ? nx8Var.a : null;
                if (ldcVar == null) {
                    btsVar.e0(-117950591);
                    j = ((el51) btsVar.m(gl51.a)).m();
                    btsVar.t(false);
                } else {
                    btsVar.e0(-117951924);
                    btsVar.t(false);
                    j = ldcVar.a;
                }
                btsVar.t(false);
            } else {
                btsVar.e0(638540641);
                ldcVar = nx8Var != null ? nx8Var.b : null;
                if (ldcVar == null) {
                    btsVar.e0(-117947511);
                    j = ldc.b(((el51) btsVar.m(gl51.a)).m(), 0.3f, 0.0f, 0.0f, 0.0f, 14);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-117949247);
                    btsVar.t(false);
                    j = ldcVar.a;
                }
                btsVar.t(false);
            }
            pi6.a(m4m0.b(ymb1.l(ljs0.m(c530.a, f), cyk0.a), ((ldc) m.a(j, null, "carousel_indicator_color", btsVar, 384, 10).getValue()).a, qke.q), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: jy8
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int O = vng.O(i | 1);
                    b.c(f, nx8Var, z, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void d(int i, ugh ughVar, nx8 nx8Var, f530 f530Var, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-621962644);
        int i3 = i2 | (btsVar.c(i) ? 4 : 2) | (btsVar.k(ughVar) ? 32 : 16) | (btsVar.k(nx8Var) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            int k = ughVar.k() % i;
            f530 c = ljs0.c(f530Var, 1.0f);
            float f = 6.0f;
            lhl0 a2 = khl0.a(new i43(6.0f, true, new m6(9, x4c.H)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
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
            btsVar.e0(1609150652);
            int i4 = 0;
            while (i4 < i) {
                int abs = Math.abs(i4 - k);
                int i5 = i4;
                c(((y7m) androidx.compose.animation.core.b.a(abs != 0 ? (abs == 1 || !(i4 == 0 || i4 == i + (-1))) ? f : 4.0f : 8.0f, null, "carousel_indicator_size", null, btsVar, 384, 10).getValue()).a, nx8Var, i5 == k, btsVar, (i3 >> 3) & 112);
                i4 = i5 + 1;
                f = 6.0f;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(i, ughVar, nx8Var, f530Var, i2);
        }
    }

    public static final void e(cy8 cy8Var, boolean z, String str, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-70765974);
        int i2 = i | (btsVar.k(cy8Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean z2 = cy8Var.f != null;
            boolean z3 = ((i2 & 14) == 4) | ((57344 & i2) == 16384);
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new ky8(tlsVar, cy8Var);
                btsVar.o0(Q);
            }
            s3b1.a(cy8Var.e, rx21.c(c, z2, (tls) Q), str, wwg.S(-1326499393, true, new my8(cy8Var, z, i3), btsVar), btsVar, (i2 & 896) | HProv.ALG_TYPE_SECURECHANNEL, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(cy8Var, z, str, f530Var, tlsVar, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(ry8 ry8Var, final tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        Throwable th;
        int i3;
        int i4;
        int i5;
        ugh ughVar;
        o430 o430Var;
        float f;
        boolean z;
        final ry8 ry8Var2 = ry8Var;
        l690 l690Var = ry8Var2.e;
        List list = ry8Var2.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1497484529);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ry8Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i6 = i2 & 896;
            boolean z2 = ((i2 & 14) == 4) | (i6 == 256);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (z2 || Q == o430Var2) {
                Q = new CarouselItemsKt$CarouselItems$1$1(tlsVar2, ry8Var2, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            final boolean z3 = list.size() > 1;
            final int size = list.size();
            if (z3) {
                th = null;
                i3 = 1073741823 - (1073741823 % size);
            } else {
                th = null;
                i3 = 0;
            }
            boolean a2 = btsVar.a(z3) | btsVar.c(size);
            Object Q2 = btsVar.Q();
            if (a2 || Q2 == o430Var2) {
                Q2 = new sls() { // from class: gy8
                    @Override // defpackage.sls
                    public final Object invoke() {
                        return Integer.valueOf(z3 ? Integer.MAX_VALUE : size);
                    }
                };
                btsVar.o0(Q2);
            }
            ugh b = a990.b(i3, (sls) Q2, btsVar, 0, 2);
            cy8 cy8Var = (cy8) list.get(b.k() % size);
            c530 c530Var = c530.a;
            int i7 = i2;
            f530 l = ymb1.l(an91.j(ljs0.c(c530Var, 1.0f), l690Var), ((YandexShapes) btsVar.m(qm51.a)).a());
            final boolean z4 = z3;
            boolean k = ((i7 & 112) == 32) | btsVar.k(cy8Var);
            Object Q3 = btsVar.Q();
            if (k || Q3 == o430Var2) {
                Q3 = new ky8(cy8Var, tlsVar);
                btsVar.o0(Q3);
            }
            f530 b2 = fnq0.b(l, false, (tls) Q3);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw th;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
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
            Long l2 = ry8Var2.g;
            Long l3 = th;
            if (z4) {
                l3 = l2;
            }
            if (l3 != 0) {
                btsVar.e0(124395243);
                o430Var = o430Var2;
                z = false;
                i4 = i6;
                f = 1.0f;
                a(b, size, l3.longValue(), btsVar, 0);
                ughVar = b;
                i5 = size;
                btsVar.t(false);
            } else {
                i4 = i6;
                i5 = size;
                ughVar = b;
                o430Var = o430Var2;
                f = 1.0f;
                z = false;
                btsVar.e0(124581677);
                btsVar.t(false);
            }
            b(ughVar, list, tlsVar2, btsVar, i4);
            f530 c = ljs0.c(c530Var, f);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = new jv8(2);
                btsVar.o0(Q4);
            }
            f530 a3 = fnq0.a(c, (tls) Q4);
            final int i8 = i5;
            final ugh ughVar2 = ughVar;
            bms bmsVar = new bms() { // from class: ly8
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    fid fidVar2 = (fid) obj3;
                    ((Integer) obj4).getClass();
                    int i9 = intValue % i8;
                    boolean z5 = intValue == ughVar2.k();
                    c530 c530Var2 = c530.a;
                    ry8 ry8Var3 = ry8Var2;
                    f530 e = ljs0.e(c530Var2, ry8Var3.d);
                    cy8 cy8Var2 = (cy8) ry8Var3.c.get(i9);
                    String str = ry8Var3.i;
                    if (!z5) {
                        str = null;
                    }
                    b.e(cy8Var2, z4, str, e, tlsVar, fidVar2, 0);
                    return zy11.a;
                }
            };
            ry8Var2 = ry8Var2;
            ugh ughVar3 = ughVar;
            otr0.a(ughVar3, a3, null, null, 0.0f, null, null, false, null, null, null, null, wwg.S(620304598, true, bmsVar, btsVar), btsVar, 0, 16380);
            btsVar = btsVar;
            if (z4) {
                btsVar.e0(125384050);
                d(i8, ughVar3, ry8Var2.f, ljs0.e(an91.l(an91.j(cj6.a.a(c530Var, x4c.B), l690Var), 24.0f, 8.0f), 24.0f), btsVar, 0);
                btsVar.t(z);
            } else {
                btsVar.e0(125850445);
                btsVar.t(z);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(ry8Var2, tlsVar, tlsVar2, i, 28);
        }
    }

    public static final void g(CharSequence charSequence, CharSequence charSequence2, ContentAlignment contentAlignment, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        int i2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1241801077);
        int i3 = i | (btsVar2.e(charSequence) ? 4 : 2) | (btsVar2.e(charSequence2) ? 32 : 16) | (btsVar2.c(contentAlignment.ordinal()) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar2.V(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = py8.a[contentAlignment.ordinal()];
            if (i4 == 1) {
                i2 = 8388611;
            } else if (i4 == 2) {
                i2 = 1;
            } else {
                if (i4 != 3) {
                    w511.b();
                    return;
                }
                i2 = 8388613;
            }
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a2 = qic.a(new i43(4.0f, true, new quz(11)), x4c.H, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, c);
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
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
            int i5 = i2;
            btsVar = btsVar2;
            zgb1.a(charSequence, ljs0.c(c530Var, 1.0f), i5, false, null, null, false, new jrn(1), btsVar, (i3 & 14) | 12582960, 120);
            if (charSequence2 == null) {
                btsVar.e0(-1380191342);
                btsVar.t(false);
            } else {
                btsVar.e0(-1380191341);
                zgb1.a(charSequence2, ljs0.c(c530Var, 1.0f), i5, false, null, null, false, new jrn(2), btsVar, ((i3 >> 3) & 14) | 12582960, 120);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) charSequence, f530Var2, (Object) charSequence2, (Object) contentAlignment, i, 12);
        }
    }
}
