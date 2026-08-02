package defpackage;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ErrorButtonAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.payment_button.a;
import defpackage.fd31;
import defpackage.tje;
import defpackage.u1n;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class tb31 {
    public static final byk0 a = cyk0.c(16.0f);

    public static final void a(je31 je31Var, kz6 kz6Var, z0a0 z0a0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1784711760);
        int i2 = i | (btsVar.k(je31Var) ? 4 : 2) | (btsVar.k(kz6Var) ? 32 : 16) | (btsVar.k(z0a0Var) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            c1v c1vVar = je31Var.e;
            boolean z = je31Var.f;
            if (c1vVar instanceof z0v) {
                btsVar.e0(-1544601642);
                btsVar.t(false);
            } else {
                btsVar.e0(-1544673717);
                int i3 = i2 >> 3;
                a.a(je31Var.e, z0a0Var, tlsVar, btsVar, (i3 & 896) | (i3 & 112) | 8);
                btsVar.t(false);
            }
            x2y x2yVar = new x2y(1.0f, true);
            boolean z2 = !z;
            boolean z3 = (i2 & 112) == 32;
            int i4 = i2 & 7168;
            boolean z4 = z3 | (i4 == 2048);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z4 || Q == o430Var) {
                Q = new zr01(25, kz6Var, tlsVar);
                btsVar.o0(Q);
            }
            ohb1.b(x2yVar, z2, null, (sls) Q, wwg.S(1319472409, true, new ays0(20, je31Var, kz6Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 4);
            k0s k0sVar = kz6Var.g;
            if (k0sVar == null) {
                btsVar.e0(-1544049254);
                btsVar.t(false);
            } else {
                btsVar.e0(-1544049253);
                boolean k = (i4 == 2048) | btsVar.k(k0sVar);
                Object Q2 = btsVar.Q();
                if (k || Q2 == o430Var) {
                    Q2 = new zr01(26, k0sVar, tlsVar);
                    btsVar.o0(Q2);
                }
                e(k0sVar, z, (sls) Q2, btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sb31(je31Var, kz6Var, z0a0Var, tlsVar, i, 0);
        }
    }

    public static final void b(final y9o y9oVar, final wg6 wg6Var, final tls tlsVar, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(706372930);
        int i2 = (btsVar.k(y9oVar) ? 4 : 2) | i | (btsVar.k(wg6Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            final tse tseVar = (tse) Q;
            final u1n u1nVar = y9oVar.c;
            if (u1nVar == null) {
                aii0 v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    v.d = new wls(y9oVar, wg6Var, tlsVar, i, i3) { // from class: rb31
                        public final /* synthetic */ int a;
                        public final /* synthetic */ y9o b;
                        public final /* synthetic */ wg6 c;
                        public final /* synthetic */ tls w;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            tls tlsVar2 = this.w;
                            wg6 wg6Var2 = this.c;
                            y9o y9oVar2 = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i4) {
                                case 0:
                                    tb31.b(y9oVar2, wg6Var2, tlsVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    tb31.b(y9oVar2, wg6Var2, tlsVar2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            boolean k = ((i2 & 112) == 32) | btsVar.k(u1nVar) | btsVar.e(tseVar) | ((i2 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj) {
                Q2 = new sls() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.footer.a
                    @Override // defpackage.sls
                    public final Object invoke() {
                        u1n u1nVar2 = u1n.this;
                        if (((ErrorButtonAction) u1nVar2.c) == ErrorButtonAction.EXPAND) {
                            tje.N(tseVar, null, null, new VerticalHubBottomContentKt$ErrorButton$1$1$1(wg6Var, null), 3);
                        }
                        tlsVar.invoke(new fd31((ErrorButtonAction) u1nVar2.c));
                        return zy11.a;
                    }
                };
                btsVar.o0(Q2);
            }
            ohb1.b(null, false, null, (sls) Q2, wwg.S(-35935371, true, new jvx0(22, u1nVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
        } else {
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i4 = 1;
            v2.d = new wls(y9oVar, wg6Var, tlsVar, i, i4) { // from class: rb31
                public final /* synthetic */ int a;
                public final /* synthetic */ y9o b;
                public final /* synthetic */ wg6 c;
                public final /* synthetic */ tls w;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar2 = this.w;
                    wg6 wg6Var2 = this.c;
                    y9o y9oVar2 = this.b;
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj3).getClass();
                    switch (i42) {
                        case 0:
                            tb31.b(y9oVar2, wg6Var2, tlsVar2, fidVar2, vng.O(1));
                            break;
                        default:
                            tb31.b(y9oVar2, wg6Var2, tlsVar2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void c(boolean z, iyu iyuVar, kz6 kz6Var, yur yurVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1379591047);
        int i2 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.k(iyuVar) ? 32 : 16) | (btsVar.k(kz6Var) ? 256 : 128) | (btsVar.k(null) ? 2048 : 1024);
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i2 |= btsVar.e(tlsVar) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            f530 f530Var = c530.a;
            if (kz6Var == null) {
                f530Var = i9a1.d(f530Var);
            }
            f530 f530Var2 = f530Var;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(29);
                btsVar.o0(Q);
            }
            w2o q = k.q(1, (tls) Q, null);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new mr21(27);
                btsVar.o0(Q2);
            }
            g.e(z, null, q, k.v(1, (tls) Q2, null), null, wwg.S(652595025, true, new r5y(f530Var2, (Object) yurVar, (Object) iyuVar, tlsVar, 17), btsVar), btsVar, (i2 & 14) | 200064, 18);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(i, 14, (cms) tlsVar, (Object) iyuVar, (Object) kz6Var, (Object) yurVar, z);
        }
    }

    public static final void d(kz6 kz6Var, y9o y9oVar, wg6 wg6Var, je31 je31Var, z0a0 z0a0Var, tls tlsVar, fid fidVar, int i) {
        je31 je31Var2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1339866726);
        int i2 = 4;
        int i3 = (btsVar2.k(kz6Var) ? 4 : 2) | i | (btsVar2.k(y9oVar) ? 32 : 16) | (btsVar2.k(wg6Var) ? 256 : 128) | (btsVar2.k(null) ? 2048 : 1024);
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            je31Var2 = je31Var;
            i3 |= btsVar2.k(je31Var2) ? 16384 : 8192;
        } else {
            je31Var2 = je31Var;
        }
        if ((196608 & i) == 0) {
            i3 |= (262144 & i) == 0 ? btsVar2.k(z0a0Var) : btsVar2.e(z0a0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 1048576 : 524288;
        }
        if (btsVar2.V(i3 & 1, (599187 & i3) != 599186)) {
            boolean z = (y9oVar != null ? y9oVar.c : null) != null;
            if (kz6Var != null || z) {
                btsVar2.e0(1456796618);
                ocb1.a(null, false, null, false, false, wwg.S(891469636, true, new asr0(i2, tlsVar), btsVar2), 0.0f, 0, wwg.S(-1116460360, true, new wo1(z, y9oVar, wg6Var, tlsVar, kz6Var, je31Var2, z0a0Var), btsVar2), btsVar2, 805502976, 479);
                btsVar = btsVar2;
                btsVar.t(false);
            } else {
                btsVar2.e0(1457480106);
                g(tlsVar, btsVar2, ((i3 >> 15) & 112) | ((i3 >> 9) & 14));
                btsVar2.t(false);
                btsVar = btsVar2;
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0((Object) kz6Var, (Object) y9oVar, (Object) wg6Var, (Object) je31Var, (Object) z0a0Var, tlsVar, i, 10);
        }
    }

    public static final void e(k0s k0sVar, boolean z, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(818577262);
        int i2 = (btsVar2.k(k0sVar) ? 4 : 2) | i | (btsVar2.a(z) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 d = q791.d(ymb1.l(ljs0.q(c530Var, 70.0f).k(ljs0.b), a), (z || k0sVar.c == null) ? false : true, null, null, slsVar, 14);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, d);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d3);
            v0b1.a(mja1.b(k0sVar.b, null, 6), ljs0.m(c530Var, 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar2, 48, 1020);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q2z0(k0sVar, z, slsVar, i);
        }
    }

    public static final void f(boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1677037350);
        int i2 = (btsVar.a(z) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            m3u0 b = androidx.compose.animation.core.b.b(z ? 1.0f : 0.0f, null, null, null, btsVar, 0, 30);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = zoy0.G(scc.g(new ldc(ldc.l), new ldc(ldc.b(ldc.b, 0.32f, 0.0f, 0.0f, 0.0f, 14))), 0.0f, 0.0f, 14);
                btsVar.o0(Q);
            }
            ml6 ml6Var = (ml6) Q;
            f530 b2 = cj6.a.b(c530.a);
            boolean k = btsVar.k(b);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new xo1(b, 27);
                btsVar.o0(Q2);
            }
            f530 a2 = androidx.compose.ui.graphics.d.a(b2, (tls) Q2);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new wx11(23, ml6Var);
                btsVar.o0(Q3);
            }
            pi6.a(bb1.g(a2, (tls) Q3), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vxd(z, i, 11);
        }
    }

    public static final void g(tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-276340203);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ((nx2) btsVar.m(uy2.c)).getClass();
            f530 d = i9a1.d(bzk0.c(hbb1.c(c530.a, dbb1.c(btsVar), false, 24.0f, null, 10), AppColor$Palette.Background, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)));
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ec01(17, tlsVar);
                btsVar.o0(Q);
            }
            cf91.b(d, (tls) Q, btsVar, (i2 << 3) & 112, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yt40(i, 3, tlsVar);
        }
    }

    public static final void h(je31 je31Var, tls tlsVar, wg6 wg6Var, z0a0 z0a0Var, yur yurVar, fid fidVar, int i) {
        boolean z;
        dmw0 dmw0Var;
        boolean z2;
        List list;
        oz40 oz40Var = wg6Var.g;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-331970516);
        dmw0 dmw0Var2 = btsVar.a;
        int i2 = i | (btsVar.k(je31Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.k(wg6Var) ? 256 : 128) | (btsVar.k(z0a0Var) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            iyu iyuVar = je31Var.c;
            kz6 kz6Var = iyuVar != null ? iyuVar.b : null;
            y9o y9oVar = je31Var.d;
            if (iyuVar != null && (list = iyuVar.a) != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((zxu) it.next()).j) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            if (((dtr0) oz40Var.getValue()).a != -2 && (((dtr0) oz40Var.getValue()).a == -2 || !(kz6Var == null || y9oVar != null || z))) {
                dmw0Var = dmw0Var2;
                z2 = false;
            } else {
                dmw0Var = dmw0Var2;
                z2 = true;
            }
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            dmw0 dmw0Var3 = dmw0Var;
            sls slsVar = d.b;
            if (dmw0Var3 == null) {
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f(z2, btsVar, 6);
            boolean z3 = z2;
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            int i3 = i2 << 12;
            kz6 kz6Var2 = kz6Var;
            c(z3, iyuVar, kz6Var2, yurVar, tlsVar, btsVar, (i3 & ImageMetadata.JPEG_GPS_COORDINATES) | HProv.ALG_CLASS_DATA_ENCRYPT);
            btsVar = btsVar;
            d(kz6Var2, y9oVar, wg6Var, je31Var, z0a0Var, tlsVar, btsVar, (i3 & HProv.ALG_CLASS_ALL) | (i2 & 896) | (458752 & (i2 << 6)) | ((i2 << 15) & 3670016));
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) je31Var, tlsVar, (Object) wg6Var, (Object) z0a0Var, (Object) yurVar, i, 29);
        }
    }
}
