package defpackage;

import android.webkit.CookieManager;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.android.material.navigation.NavigationBarView;
import java.util.List;
import kotlin.Pair;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.e;

/* loaded from: classes5.dex */
public abstract class qrb1 {
    public static final void a(eqs0 eqs0Var, fid fidVar, int i) {
        Pair pair;
        bts btsVar = (bts) fidVar;
        btsVar.g0(814569168);
        int i2 = (btsVar.k(eqs0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            int i3 = p701.a[eqs0Var.a.ordinal()];
            if (i3 == 1) {
                pair = new Pair(x4c.H, 17);
            } else if (i3 == 2) {
                pair = new Pair(x4c.G, Integer.valueOf(NavigationBarView.ITEM_GRAVITY_START_CENTER));
            } else {
                if (i3 != 3) {
                    w511.b();
                    return;
                }
                pair = new Pair(x4c.I, 8388629);
            }
            zgb1.b(eqs0Var.b, eqs0Var.c, null, (it1) pair.getFirst(), ((Number) pair.getSecond()).intValue(), false, null, null, null, null, btsVar, 0, 996);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o701(eqs0Var, i);
        }
    }

    public static final void b(pvs0 pvs0Var, wls wlsVar, boolean z, fid fidVar, int i) {
        tls tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1987202865);
        int i2 = (btsVar.k(pvs0Var) ? 4 : 2) | i | (btsVar.e(wlsVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else {
            if (pvs0Var == null) {
                throw unr0.y(-1558488676, btsVar, false);
            }
            boolean z2 = pvs0Var.e;
            btsVar.e0(-1068459873);
            o430 o430Var = did.a;
            if (z || !z2) {
                btsVar.e0(-1068042675);
                btsVar.t(false);
                tlsVar = null;
            } else {
                btsVar.e0(-1068382249);
                boolean k = btsVar.k(pvs0Var.b) | btsVar.k(pvs0Var.c) | btsVar.k(pvs0Var.d);
                Object Q = btsVar.Q();
                if (k || Q == o430Var) {
                    Q = new rmy0(20, pvs0Var, wlsVar);
                    btsVar.o0(Q);
                }
                tlsVar = (tls) Q;
                btsVar.t(false);
            }
            boolean z3 = pvs0Var.a;
            if (tlsVar == null) {
                btsVar.e0(-1067892945);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new jiu(13);
                    btsVar.o0(Q2);
                }
                tlsVar = (tls) Q2;
            } else {
                btsVar.e0(-1558469402);
            }
            btsVar.t(false);
            e.a(ljs0.e(ljs0.q(an91.o(c530.a, 0.0f, 0.0f, 16.0f, 0.0f, 11), 52.0f), 34.0f), z3, !z && z2, 0L, 0L, 0L, tlsVar, null, btsVar, 0, 184);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q2z0(pvs0Var, wlsVar, z, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0059  */
    /* JADX WARN: Type inference failed for: r4v10, types: [f530] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(wts0 wts0Var, tls tlsVar, wls wlsVar, boolean z, fid fidVar, int i, int i2) {
        int i3;
        wls wlsVar2;
        int i4;
        bts btsVar;
        boolean z2;
        wls wlsVar3;
        aii0 v;
        wls wlsVar4;
        a aVar;
        a S;
        a aVar2;
        ?? b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2002953075);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(wts0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            wlsVar2 = wlsVar;
            i3 |= btsVar2.e(wlsVar2) ? 256 : 128;
            i4 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
            int i6 = 1;
            byte b2 = 0;
            if (btsVar2.V(i4 & 1, (i4 & 1171) == 1170)) {
                btsVar = btsVar2;
                btsVar.Y();
                z2 = z;
                wlsVar3 = wlsVar2;
            } else {
                o430 o430Var = did.a;
                if (i5 != 0) {
                    Object Q = btsVar2.Q();
                    if (Q == o430Var) {
                        Q = new jiz0(i6);
                        btsVar2.o0(Q);
                    }
                    wlsVar4 = (wls) Q;
                } else {
                    wlsVar4 = wlsVar2;
                }
                ous0 ous0Var = wts0Var.g;
                ldc ldcVar = ous0Var.b;
                c530 c530Var = c530.a;
                if (ldcVar != null && (b = m4m0.b(c530Var, ldcVar.a, cyk0.c(ous0Var.c))) != 0) {
                    c530Var = b;
                }
                boolean z3 = wts0Var.e != null;
                boolean z4 = ((i4 & 112) == 32) | ((i4 & 14) == 4);
                Object Q2 = btsVar2.Q();
                int i7 = 19;
                if (z4 || Q2 == o430Var) {
                    Q2 = new rmy0(i7, tlsVar, wts0Var);
                    btsVar2.o0(Q2);
                }
                f530 f = ocb1.f(rx21.c(c530Var, z3, (tls) Q2), wts0Var.j, btsVar2, 0);
                float f2 = wts0Var.h;
                hts0 hts0Var = wts0Var.b;
                a aVar3 = null;
                if (hts0Var == null) {
                    btsVar2.e0(6318782);
                    btsVar2.t(false);
                    aVar = null;
                } else {
                    btsVar2.e0(6318783);
                    a S2 = wwg.S(-1396992613, true, new v61(hts0Var, 5, b2), btsVar2);
                    btsVar2.t(false);
                    aVar = S2;
                }
                eqs0 eqs0Var = wts0Var.c;
                if (eqs0Var == null) {
                    btsVar2.e0(6465598);
                    btsVar2.t(false);
                    S = null;
                } else {
                    btsVar2.e0(6465599);
                    S = wwg.S(1605603380, true, new o701(eqs0Var, i6, b2), btsVar2);
                    btsVar2.t(false);
                }
                eqs0 eqs0Var2 = wts0Var.d;
                if (eqs0Var2 == null) {
                    btsVar2.e0(6549918);
                    btsVar2.t(false);
                    aVar2 = null;
                } else {
                    btsVar2.e0(6549919);
                    a S3 = wwg.S(-531978173, true, new o701(eqs0Var2, 2, b2), btsVar2);
                    btsVar2.t(false);
                    aVar2 = S3;
                }
                pvs0 pvs0Var = wts0Var.f;
                if (pvs0Var == null) {
                    btsVar2.e0(6640841);
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(6640842);
                    aVar3 = wwg.S(-905378635, true, new nvs0(i7, wlsVar4, pvs0Var, wts0Var), btsVar2);
                    btsVar2.t(false);
                }
                btsVar = btsVar2;
                web1.c(f, f2, false, wts0Var.i, null, aVar, wwg.S(-1557565839, true, new but0(18, wts0Var), btsVar2), S, aVar2, aVar3, null, oa01.d, true, btsVar, 1573248, (i4 >> 3) & 896, 1040);
                wlsVar3 = wlsVar4;
                z2 = true;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new fo1(wts0Var, tlsVar, wlsVar3, z2, i, i2, 7);
                return;
            }
            return;
        }
        wlsVar2 = wlsVar;
        i4 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
        int i62 = 1;
        byte b22 = 0;
        if (btsVar2.V(i4 & 1, (i4 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static List d(CookieManager cookieManager, String str) {
        if (qp41.N.a()) {
            return ((WebViewCookieManagerBoundaryInterface) ei6.a(WebViewCookieManagerBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) mq41.a.b).convertCookieManager(cookieManager))).getCookieInfo(str);
        }
        throw qp41.a();
    }

    public static final k550 e(tls tlsVar) {
        l550 l550Var = new l550();
        tlsVar.invoke(l550Var);
        boolean z = l550Var.b;
        j550 j550Var = l550Var.a;
        j550Var.a = z;
        j550Var.b = l550Var.c;
        int i = l550Var.d;
        boolean z2 = l550Var.e;
        j550Var.c = i;
        j550Var.d = null;
        j550Var.e = false;
        j550Var.f = z2;
        return j550Var.a();
    }
}
