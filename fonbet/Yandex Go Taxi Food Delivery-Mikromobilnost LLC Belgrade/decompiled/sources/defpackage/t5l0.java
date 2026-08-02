package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.random.Random;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class t5l0 {
    public static final void a(m3u0 m3u0Var, wls wlsVar, tls tlsVar, tls tlsVar2, sls slsVar, fid fidVar, int i) {
        int i2;
        sls slsVar2 = slsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-290554623);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(m3u0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(slsVar2) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            b a = a7y.a(0, 3, btsVar);
            int i3 = ((Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            z5l0 z5l0Var = (z5l0) m3u0Var.getValue();
            f530 f = ljs0.f(c530.a, 0.0f, (float) (i3 * 0.75d));
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d);
            d(z5l0Var.a, btsVar, 0);
            b(new x2y(1.0f, false), z5l0Var.b, wlsVar, tlsVar, tlsVar2, a, btsVar, (i2 << 3) & 65408);
            slsVar2 = slsVar;
            lbb1.b(null, a.b(), 0.0f, 0.0f, null, null, wwg.S(1794323344, true, new o990(29, z5l0Var, slsVar2), btsVar), btsVar, 1572864, 61);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0((Object) m3u0Var, (Object) wlsVar, (Object) tlsVar, (Object) tlsVar2, slsVar2, i, 2);
        }
    }

    public static final void b(final f530 f530Var, final List list, final wls wlsVar, final tls tlsVar, final tls tlsVar2, final b bVar, fid fidVar, final int i) {
        final wls wlsVar2;
        final tls tlsVar3;
        final tls tlsVar4;
        final b bVar2;
        aii0 v;
        wls wlsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1877162774);
        int i2 = (i & 6) == 0 ? (btsVar.k(f530Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            wlsVar2 = wlsVar;
            i2 |= btsVar.e(wlsVar2) ? 256 : 128;
        } else {
            wlsVar2 = wlsVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            tlsVar3 = tlsVar;
            i2 |= btsVar.e(tlsVar3) ? 2048 : 1024;
        } else {
            tlsVar3 = tlsVar;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            tlsVar4 = tlsVar2;
            i2 |= btsVar.e(tlsVar4) ? 16384 : 8192;
        } else {
            tlsVar4 = tlsVar2;
        }
        if ((196608 & i) == 0) {
            bVar2 = bVar;
            i2 |= btsVar.k(bVar2) ? 131072 : 65536;
        } else {
            bVar2 = bVar;
        }
        if (!btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.Y();
        } else {
            if (list.isEmpty()) {
                v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    wlsVar3 = new wls() { // from class: s5l0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i5 | 1);
                                    t5l0.b(f530Var, list, wlsVar2, tlsVar3, tlsVar4, bVar2, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(i5 | 1);
                                    t5l0.b(f530Var, list, wlsVar2, tlsVar3, tlsVar4, bVar2, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar3;
                }
                return;
            }
            Random.a.getClass();
            int b = Random.b.b();
            f530 o = an91.o(f530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            btsVar.e0(67174945);
            List<dcl0> list2 = list;
            int i4 = i2;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (dcl0 dcl0Var : list2) {
                boolean z = dcl0Var.d;
                int i5 = dcl0Var.a;
                a S = wwg.S(776595410, true, new pdf0(16, dcl0Var), btsVar);
                cbd.a.getClass();
                a aVar = cbd.b;
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new z0l0(8);
                    btsVar.o0(Q);
                }
                arrayList.add(new z8m(S, aVar, null, null, i5, (tls) Q, z, null));
            }
            btsVar.t(false);
            ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.a.a(o, Integer.valueOf(b), arrayList, false, wlsVar, tlsVar, tlsVar2, bVar, btsVar, (i4 << 6) & 33546240, 8);
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 1;
            wlsVar3 = new wls() { // from class: s5l0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i6;
                    zy11 zy11Var = zy11.a;
                    int i52 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i52 | 1);
                            t5l0.b(f530Var, list, wlsVar, tlsVar, tlsVar2, bVar, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i52 | 1);
                            t5l0.b(f530Var, list, wlsVar, tlsVar, tlsVar2, bVar, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar3;
        }
    }

    public static final void c(String str, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1016934979);
        int i2 = (btsVar2.k(str) ? 4 : 2) | i | (btsVar2.e(slsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 e = ljs0.e(an91.k(ljs0.c(c530.a, 1.0f), 8.0f), 56.0f);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new zvr(27, slsVar);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a((sls) Q, e, null, 0L, 0L, null, false, null, null, null, wwg.S(-1883621900, true, new jk30(str, 15), btsVar2), btsVar, 48, 4092);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fj5(i, 7, slsVar, str);
        }
    }

    public static final void d(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(787312932);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.e0(23207388);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new z0l0(9);
                btsVar.o0(Q);
            }
            web1.c(fnq0.b(c530.a, false, (tls) Q), 0.0f, false, 0.0f, null, null, wwg.S(2132591938, true, new fzv(str, 21), btsVar), null, null, null, null, null, false, btsVar, 1572864, 0, 8126);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 22);
        }
    }

    public static final void e(int i, dcl0 dcl0Var, fid fidVar, int i2) {
        int i3;
        bts btsVar;
        String e;
        long h;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(142672030);
        if ((i2 & 6) == 0) {
            i3 = (btsVar2.c(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar2.k(dcl0Var) ? 32 : 16;
        }
        if (btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
            if (i == 0) {
                btsVar2.e0(-1675078015);
                e = ohb1.e(btsVar2, rzh0.address_details_where_from);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1675005661);
                e = ohb1.e(btsVar2, rzh0.address_details_where_to);
                btsVar2.t(false);
            }
            String str = e;
            if (dcl0Var.c) {
                btsVar2.e0(-1674894247);
                h = ((el51) btsVar2.m(gl51.a)).n();
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1674845732);
                h = ((el51) btsVar2.m(gl51.a)).h();
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.e(null, null, null, dcl0Var.b, null, h, null, null, null, 0, false, 0, null, str, null, null, null, null, false, 0L, 0, false, 0, true, null, false, btsVar, 0, 0, ImageMetadata.EDGE_MODE, 234848183);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new an1(i, dcl0Var, i2, 3);
        }
    }
}
