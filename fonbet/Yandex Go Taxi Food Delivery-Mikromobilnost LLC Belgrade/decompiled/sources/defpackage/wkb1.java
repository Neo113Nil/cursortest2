package defpackage;

import android.content.Context;
import androidx.compose.animation.g;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class wkb1 {
    public static au2 a;

    public static final void a(t611 t611Var, f530 f530Var, sls slsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-988200345);
        int i3 = (btsVar.e(t611Var) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i5 = i3 | (btsVar.e(slsVar) ? 256 : 128);
        int i6 = 1;
        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
            f530Var2 = i4 != 0 ? c530.a : f530Var;
            ulb1.a(f530Var2, false, ButtonSize.S, slsVar, wwg.S(1939623496, true, new jvx0(i6, t611Var), btsVar), btsVar, ((i5 >> 3) & 14) | 24960 | ((i5 << 3) & 7168), 2);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(t611Var, f530Var2, slsVar, i, i2, 28);
        }
    }

    public static final void b(final u611 u611Var, final wls wlsVar, final tls tlsVar, f530 f530Var, fid fidVar, final int i) {
        final f530 f530Var2;
        aii0 v;
        wls wlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1091388642);
        int i2 = i | (btsVar.e(u611Var) ? 4 : 2) | (btsVar.e(wlsVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            a711 a711Var = u611Var.c;
            List list = a711Var != null ? a711Var.d : null;
            if (list == null) {
                list = EmptyList.a;
            }
            t611 t611Var = u611Var.b;
            boolean isEmpty = list.isEmpty();
            final c530 c530Var = c530.a;
            if (isEmpty && t611Var == null) {
                v = btsVar.v();
                if (v != null) {
                    final int i4 = 0;
                    wlsVar2 = new wls(u611Var, wlsVar, tlsVar, c530Var, i, i4) { // from class: gvx0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ u611 b;
                        public final /* synthetic */ wls c;
                        public final /* synthetic */ tls w;
                        public final /* synthetic */ f530 x;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(1);
                                    wkb1.b(this.b, this.c, this.w, this.x, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(1);
                                    wkb1.b(this.b, this.c, this.w, this.x, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar2;
                }
                return;
            }
            b a2 = a7y.a(0, 3, btsVar);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            f530 i5 = bb1.i(androidx.compose.ui.graphics.d.a(c530Var, new bkx0(15)), new dzw0(a2.e(), i3));
            l690 d3 = an91.d(0.0f, 0.0f, 12.0f, 0.0f, 11);
            i43 i43Var = new i43(8.0f, true, new quz(11));
            boolean e = ((i2 & 112) == 32) | btsVar.e(t611Var) | ((i2 & 896) == 256) | btsVar.e(list) | btsVar.e(u611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                u50 u50Var = new u50(t611Var, list, tlsVar, u611Var, wlsVar, 23);
                btsVar.o0(u50Var);
                Q = u50Var;
            }
            adb1.b(i5, a2, d3, i43Var, null, null, false, null, (tls) Q, btsVar, 24960, 488);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 1;
            wlsVar2 = new wls(u611Var, wlsVar, tlsVar, f530Var2, i, i6) { // from class: gvx0
                public final /* synthetic */ int a;
                public final /* synthetic */ u611 b;
                public final /* synthetic */ wls c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ f530 x;

                {
                    this.a = i6;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(1);
                            wkb1.b(this.b, this.c, this.w, this.x, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(1);
                            wkb1.b(this.b, this.c, this.w, this.x, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar2;
        }
    }

    public static final void c(u611 u611Var, sls slsVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1611968934);
        int i2 = i | (btsVar.e(u611Var) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | 384;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean k = btsVar.k(u611Var.d);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = u611Var.d;
                btsVar.o0(Q);
            }
            o611 o611Var = (o611) Q;
            boolean z = o611Var != null;
            a S = wwg.S(468808834, true, new ays0(10, slsVar, o611Var), btsVar);
            c530 c530Var = c530.a;
            g.e(z, c530Var, null, null, null, S, btsVar, 196656, 28);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(u611Var, slsVar, f530Var2, i, 9);
        }
    }

    public static final void d(u611 u611Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(966735769);
        int i2 = 16;
        int i3 = (btsVar.e(u611Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new bkx0(i2);
                btsVar.o0(Q);
            }
            f530 a2 = androidx.compose.ui.graphics.d.a(f530Var, (tls) Q);
            Integer num = u611Var.e;
            com.yandex.go.design.compose.ratingbar.a.a(a2, num != null ? num.intValue() : 0, 0, j(context), tlsVar, btsVar, (i3 << 9) & HProv.ALG_CLASS_ALL);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(u611Var, tlsVar, f530Var, i, 10);
        }
    }

    public static final void e(v611 v611Var, f530 f530Var, float f, final boolean z, tls tlsVar, fid fidVar, final int i) {
        int i2;
        f530 f530Var2;
        final tls tlsVar2;
        final v611 v611Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-532656760);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(v611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f = SlotSize.L.getSize();
            } else {
                btsVar.Y();
            }
            int i3 = i2 & (-897);
            float f2 = f;
            btsVar.u();
            if (z) {
                btsVar.e0(1526884287);
                g(v611Var, f530Var, tlsVar, btsVar, (i3 & HProv.PP_DELETE_SAVED_PASSWD) | ((i3 >> 6) & 896));
                btsVar.t(false);
                f530Var2 = f530Var;
                tlsVar2 = tlsVar;
                v611Var2 = v611Var;
            } else {
                btsVar.e0(1526949418);
                f530Var2 = f530Var;
                f(v611Var, f530Var2, f2, tlsVar, btsVar, (i3 & 1022) | ((i3 >> 3) & 7168));
                v611Var2 = v611Var;
                tlsVar2 = tlsVar;
                btsVar.t(false);
            }
            f = f2;
        } else {
            f530Var2 = f530Var;
            tlsVar2 = tlsVar;
            v611Var2 = v611Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final float f3 = f;
            final f530 f530Var3 = f530Var2;
            v.d = new wls() { // from class: lvx0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wkb1.e(v611.this, f530Var3, f3, z, tlsVar2, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(v611 v611Var, f530 f530Var, float f, tls tlsVar, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        o430 o430Var;
        boolean z;
        Object Q;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-92057017);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(v611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.b(f) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            f530 o = an91.o(f530Var, f, 0.0f, 0.0f, 0.0f, 14);
            so5 so5Var = x4c.G;
            sic a2 = qic.a(lr20.c, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var = c530.a;
            f530 o3 = an91.o(c530Var, 0.0f, 4.0f, 0.0f, 14.0f, 5);
            Object Q2 = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q2 == o430Var2) {
                Q2 = new bkx0(17);
                btsVar.o0(Q2);
            }
            f530 j = vfc.j(so5Var, androidx.compose.ui.graphics.d.a(o3, (tls) Q2));
            Integer num = v611Var.a.e;
            int intValue = num != null ? num.intValue() : 0;
            m8i0 j2 = j(context);
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var2) {
                Q3 = new uwl0(24, tlsVar);
                btsVar.o0(Q3);
            }
            com.yandex.go.design.compose.ratingbar.a.a(j, intValue, 0, j2, (tls) Q3, btsVar, 0);
            b a3 = a7y.a(0, 3, btsVar);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            f530 i4 = bb1.i(androidx.compose.ui.graphics.d.a(c530Var, new bkx0(15)), new dzw0(a3.e(), 1));
            l690 d4 = an91.d(0.0f, 0.0f, 12.0f, 0.0f, 11);
            boolean e = btsVar.e(v611Var) | (i3 == 2048);
            Object Q4 = btsVar.Q();
            if (e) {
                o430Var = o430Var2;
            } else {
                o430Var = o430Var2;
                if (Q4 != o430Var) {
                    tlsVar2 = tlsVar;
                    adb1.b(i4, a3, d4, null, null, null, false, null, (tls) Q4, btsVar, 384, 504);
                    btsVar = btsVar;
                    btsVar.t(true);
                    u611 u611Var = v611Var.a;
                    z = i3 != 2048;
                    Q = btsVar.Q();
                    if (!z || Q == o430Var) {
                        Q = new lao0(20, tlsVar2);
                        btsVar.o0(Q);
                    }
                    c(u611Var, (sls) Q, null, btsVar, 0);
                    btsVar.t(true);
                }
            }
            tlsVar2 = tlsVar;
            Q4 = new lzu0(21, v611Var, tlsVar2);
            btsVar.o0(Q4);
            adb1.b(i4, a3, d4, null, null, null, false, null, (tls) Q4, btsVar, 384, 504);
            btsVar = btsVar;
            btsVar.t(true);
            u611 u611Var2 = v611Var.a;
            if (i3 != 2048) {
            }
            Q = btsVar.Q();
            if (!z) {
            }
            Q = new lao0(20, tlsVar2);
            btsVar.o0(Q);
            c(u611Var2, (sls) Q, null, btsVar, 0);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xrl(v611Var, f530Var, f, tlsVar2, i, 2);
        }
    }

    public static final void g(v611 v611Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(161834556);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(v611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
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
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            float f = a5l0.a - 4.0f;
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.q(c530Var, f));
            f530 o2 = an91.o(new x2y(1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            u611 u611Var = v611Var.a;
            f530 o4 = an91.o(c530Var, 0.0f, 8.0f, 0.0f, 12.0f, 5);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new uwl0(22, tlsVar);
                btsVar.o0(Q);
            }
            d(u611Var, (tls) Q, o4, btsVar, 384);
            u611 u611Var2 = v611Var.a;
            boolean z2 = i3 == 256;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new rhi0(6, tlsVar);
                btsVar.o0(Q2);
            }
            wls wlsVar5 = (wls) Q2;
            boolean z3 = i3 == 256;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new uwl0(23, tlsVar);
                btsVar.o0(Q3);
            }
            b(u611Var2, wlsVar5, (tls) Q3, null, btsVar, 0);
            u611 u611Var3 = v611Var.a;
            boolean z4 = i3 == 256;
            Object Q4 = btsVar.Q();
            if (z4 || Q4 == o430Var) {
                Q4 = new lao0(19, tlsVar);
                btsVar.o0(Q4);
            }
            c(u611Var3, (sls) Q4, null, btsVar, 0);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0((Object) v611Var, f530Var, (Object) tlsVar, i, 25);
        }
    }

    public static final void h(z611 z611Var, int i, Integer num, sls slsVar, fid fidVar, int i2) {
        int i3;
        String str;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1567672911);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? btsVar.k(z611Var) : btsVar.e(z611Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.c(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.k(num) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            if (z611Var instanceof x611) {
                str = ((x611) z611Var).c;
            } else {
                if (!(z611Var instanceof y611)) {
                    w511.b();
                    return;
                }
                str = ((y611) z611Var).b;
            }
            if (i == num.intValue()) {
                btsVar.e0(-930316976);
                ohb1.b(null, false, ButtonSize.S, slsVar, wwg.S(-821929983, true, new jk30(str, 29), btsVar), btsVar, (i3 & 7168) | 24960, 3);
                btsVar.t(false);
            } else {
                btsVar.e0(-930054065);
                ulb1.a(null, false, ButtonSize.S, slsVar, wwg.S(-1897580118, true, new kvx0(str, i4), btsVar), btsVar, (i3 & 7168) | 24960, 3);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(z611Var, i, num, slsVar, i2, 27);
        }
    }

    public static final au2 i() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.k(10.0f, 19.0f);
        uq90Var.i(-7.5f, -7.5f);
        uq90Var.h(4.0f, 10.0f);
        uq90Var.i(6.0f, 6.06f);
        uq90Var.i(9.5f, -9.56f);
        uq90Var.h(21.0f, 8.0f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final m8i0 j(Context context) {
        return new m8i0(new i8i0(new up2(rzo.d(qje.t(xng0.controlMain, context)))), 5);
    }

    public static boolean k(long j, long j2) {
        return (j & j2) == j2;
    }
}
