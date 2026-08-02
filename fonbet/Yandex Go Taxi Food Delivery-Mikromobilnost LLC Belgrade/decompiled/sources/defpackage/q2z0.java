package defpackage;

import android.text.Spanned;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.passport.internal.flags.presentation.c1;
import java.util.Calendar;

/* loaded from: classes5.dex */
public final /* synthetic */ class q2z0 implements wls {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ cms w;

    public /* synthetic */ q2z0(k0s k0sVar, boolean z, sls slsVar, int i) {
        this.c = k0sVar;
        this.b = z;
        this.w = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = this.b;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        cms cmsVar = this.w;
        switch (i) {
            case 0:
                x3z0 x3z0Var = (x3z0) obj3;
                tls tlsVar = (tls) cmsVar;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    c530 c530Var = c530.a;
                    f530 c = ljs0.c(c530Var, 1.0f);
                    sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c);
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
                    boolean z2 = this.b;
                    oeb1.c(btsVar, ljs0.e(c530Var, z2 ? 16.0f : 20.0f));
                    ety0 ety0Var = xya1.b(btsVar).e;
                    f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
                    u2z0 u2z0Var = x3z0Var.a;
                    Calendar calendar = x3z0Var.k;
                    f4z0 f4z0Var = x3z0Var.e;
                    u2z0 u2z0Var2 = x3z0Var.b;
                    u2z0 u2z0Var3 = x3z0Var.c;
                    jeb1.f(u2z0Var.a, m, x3z0Var.a.b, nwa1.i(ety0Var.a.b, z2), 0L, null, null, nwa1.i(ety0Var.b.c, z2), 0, false, 0, 0, null, ety0Var, btsVar, 48, 0, 16112);
                    oeb1.c(btsVar, ljs0.e(c530Var, z2 ? 6.0f : 8.0f));
                    ety0 ety0Var2 = xya1.d(btsVar).g.a;
                    f530 m2 = an91.m(c530Var, 16.0f, 0.0f, 2);
                    Spanned c2 = qeb1.c(u2z0Var2.a);
                    long i2 = nwa1.i(ety0Var2.a.b, z2);
                    long i3 = nwa1.i(ety0Var2.b.c, z2);
                    wp2 wp2Var = u2z0Var2.b;
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (k || Q == o430Var) {
                        Q = new uwl0(26, tlsVar);
                        btsVar.o0(Q);
                    }
                    qgy.b(c2, null, m2, wp2Var, i2, 0L, null, i3, 0, 0, 0, ety0Var2, (tls) Q, btsVar, 384, 0, 3810);
                    if (f4z0Var == null || calendar == null) {
                        btsVar.e0(-1617633323);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1617735189);
                        ru.yandex.taxi.communications.ticket.ui.component.b.g(null, f4z0Var, calendar, btsVar, 0);
                        btsVar.t(false);
                    }
                    c1z0.g(null, z2, x3z0Var.i, tlsVar, btsVar, 0);
                    if (u2z0Var3.a.length() > 0) {
                        btsVar.e0(-1617426305);
                        ety0 ety0Var3 = xya1.b(btsVar).l;
                        f530 o2 = an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                        Spanned c3 = qeb1.c(u2z0Var3.a);
                        long i4 = nwa1.i(ety0Var3.a.b, z2);
                        wp2 wp2Var2 = u2z0Var3.b;
                        boolean k2 = btsVar.k(tlsVar);
                        Object Q2 = btsVar.Q();
                        if (k2 || Q2 == o430Var) {
                            Q2 = new uwl0(27, tlsVar);
                            btsVar.o0(Q2);
                        }
                        qgy.b(c3, null, o2, wp2Var2, i4, 0L, null, 0L, 0, 0, 0, ety0Var3, (tls) Q2, btsVar, 384, 0, 4066);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1616913131);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                qrb1.b((pvs0) obj3, (wls) cmsVar, z, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                tb31.e((k0s) obj3, z, (sls) cmsVar, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                c1.g(z, (tls) cmsVar, (sls) obj3, (fid) obj, vng.O(385));
                return zy11Var;
        }
    }

    public /* synthetic */ q2z0(pvs0 pvs0Var, wls wlsVar, boolean z, int i) {
        this.c = pvs0Var;
        this.w = wlsVar;
        this.b = z;
    }

    public /* synthetic */ q2z0(boolean z, tls tlsVar, sls slsVar, int i) {
        this.b = z;
        this.w = tlsVar;
        this.c = slsVar;
    }

    public /* synthetic */ q2z0(boolean z, x3z0 x3z0Var, tls tlsVar) {
        this.b = z;
        this.c = x3z0Var;
        this.w = tlsVar;
    }
}
