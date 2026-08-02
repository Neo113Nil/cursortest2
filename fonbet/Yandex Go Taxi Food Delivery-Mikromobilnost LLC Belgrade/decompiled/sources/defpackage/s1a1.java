package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Alignment;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class s1a1 {
    public static final d8m a = new d8m();

    public static final void a(b7n b7nVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1968881996);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(b7nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i4 = y6n.a[b7nVar.k.ordinal()];
            if (i4 == 1) {
                btsVar.e0(1984985314);
                c(b7nVar, tlsVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
                btsVar.t(false);
            } else {
                if (i4 != 2) {
                    throw unr0.y(1984983057, btsVar, false);
                }
                btsVar.e0(1984988445);
                d(b7nVar, tlsVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new x6n(b7nVar, tlsVar, i, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x007c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [bts, fid] */
    /* JADX WARN: Type inference failed for: r16v3, types: [f530] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(b7n b7nVar, k43 k43Var, float f, y7m y7mVar, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        float f2;
        y7m y7mVar2;
        aii0 v;
        c530 c530Var;
        boolean z;
        Throwable th;
        f530 f530Var;
        ?? r0 = (bts) fidVar;
        r0.g0(761552168);
        if ((i & 6) == 0) {
            i3 = (r0.k(b7nVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= r0.k(k43Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f2 = f;
            i3 |= r0.b(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            y7mVar2 = y7mVar;
            i3 |= r0.k(y7mVar2) ? 2048 : 1024;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= r0.e(tlsVar) ? 16384 : 8192;
            }
            if (r0.V(i3 & 1, (i3 & 9363) == 9362)) {
                r0.Y();
            } else {
                if (i4 != 0) {
                    y7mVar2 = null;
                }
                long d = ((el51) r0.m(gl51.a)).d();
                byk0 c = cyk0.c(f2);
                r0.e0(1707204642);
                gv90 gv90Var = b7nVar.l;
                c530 c530Var2 = c530.a;
                if (gv90Var != null) {
                    th = null;
                    r0.e0(2075983531);
                    mu90 mu90Var = gv90Var instanceof mu90 ? (mu90) gv90Var : null;
                    boolean z2 = mu90Var != null ? mu90Var.b : true;
                    boolean e = ((57344 & i3) == 16384) | r0.e(gv90Var);
                    Object Q = r0.Q();
                    if (e || Q == did.a) {
                        Q = new k9j(tlsVar, gv90Var, 2);
                        r0.o0(Q);
                    }
                    f530Var = q791.d(c530Var2, z2, null, null, (sls) Q, 14);
                    c530Var = c530Var2;
                    z = false;
                    r0.t(false);
                } else {
                    c530Var = c530Var2;
                    z = false;
                    th = null;
                    r0.e0(2076176909);
                    r0.t(false);
                    f530Var = c530Var;
                }
                r0.t(z);
                int i5 = i3;
                f530 j = an91.j(ocb1.f(m4m0.b(ymb1.l(ljs0.g(an91.j(an91.o(ljs0.c(c530Var, 1.0f), 0.0f, b7nVar.g, 0.0f, 0.0f, 13), b7nVar.i), b7nVar.h, 0.0f, 2), c), d, c).k(f530Var), b7nVar.m, r0, 0), b7nVar.j);
                sic a2 = qic.a(k43Var, x4c.G, r0, ((i5 & 112) >> 3) & 14);
                int hashCode = Long.hashCode(r0.T);
                r1b0 o = r0.o();
                f530 d2 = b.d(r0, j);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (r0.a == null) {
                    cma1.b0();
                    throw th;
                }
                r0.i0();
                if (r0.S) {
                    r0.n(slsVar);
                } else {
                    r0.r0();
                }
                qje.W(r0, d.f, a2);
                qje.W(r0, d.e, o);
                wls wlsVar = d.g;
                if (r0.S || !jl40.l(r0.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, r0, hashCode, wlsVar);
                }
                qje.W(r0, d.d, d2);
                aib1.b(vfc.j(f(b7nVar.e), y7mVar2 == null ? c530Var : ljs0.e(c530Var, y7mVar2.a)), b7nVar.c, r0, 0, 0);
                cyu0 cyu0Var = b7nVar.d;
                if (cyu0Var == null) {
                    r0.e0(-848959657);
                    r0.t(false);
                } else {
                    r0.e0(-848959656);
                    aib1.b(vfc.j(f(b7nVar.f), an91.o(c530Var, 0.0f, 0.0f, 0.0f, 2.0f, 7)), cyu0Var, r0, 0, 0);
                    r0.t(false);
                }
                r0.t(true);
            }
            y7m y7mVar3 = y7mVar2;
            v = r0.v();
            if (v == null) {
                v.d = new utm(b7nVar, k43Var, f2, y7mVar3, tlsVar, i, i2);
                return;
            }
            return;
        }
        y7mVar2 = y7mVar;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (r0.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        y7m y7mVar32 = y7mVar2;
        v = r0.v();
        if (v == null) {
        }
    }

    public static final void c(b7n b7nVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        b7n b7nVar2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-578800992);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(b7nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            b7nVar2 = b7nVar;
            tlsVar2 = tlsVar;
            b(b7nVar2, lr20.c, 16.0f, null, tlsVar2, btsVar, (i2 & 14) | 432 | ((i2 << 9) & HProv.ALG_CLASS_ALL), 8);
        } else {
            b7nVar2 = b7nVar;
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new x6n(b7nVar2, tlsVar2, i, i3);
        }
    }

    public static final void d(b7n b7nVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        b7n b7nVar2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1855341756);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(b7nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            b7nVar2 = b7nVar;
            tlsVar2 = tlsVar;
            b(b7nVar2, lr20.e, b7nVar.d == null ? 6.0f : 16.0f, new y7m(sty0.c(rx21.b(b7nVar.c.b, btsVar).a.b) + 1.0f), tlsVar2, btsVar, (i2 & 14) | 48 | ((i2 << 9) & HProv.ALG_CLASS_ALL), 0);
        } else {
            b7nVar2 = b7nVar;
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new x6n(b7nVar2, tlsVar2, i, i3);
        }
    }

    public static final f530 e(boolean z, boolean z2, sls slsVar) {
        f530 f530Var = c530.a;
        if (!z || !hyu0.a) {
            return f530Var;
        }
        if (z2) {
            f530Var = new iyu0(a);
        }
        return f530Var.k(new fyu0(slsVar));
    }

    public static final so5 f(DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment) {
        int i = y6n.b[deliveryStateItem$TextWidget$Alignment.ordinal()];
        if (i == 1) {
            return x4c.H;
        }
        if (i == 2) {
            return x4c.G;
        }
        if (i == 3) {
            return x4c.I;
        }
        w511.b();
        return null;
    }

    public static final f530 g(f530 f530Var, float f) {
        return f530Var.k(new cc61(f));
    }
}
