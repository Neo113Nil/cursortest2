package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class yos0 {
    public static final byk0 a = cyk0.c(16.0f);
    public static final float b = 4.0f;

    public static final void a(aps0 aps0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1081858455);
        int i2 = (btsVar.k(aps0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            rcb1.c(null, aps0Var.f, 0, null, wwg.S(1745528315, true, new wos0(aps0Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 13);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wos0(aps0Var, i);
        }
    }

    public static final void b(aps0 aps0Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1585922875);
        int i2 = (btsVar.k(aps0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            f530 l = ymb1.l(ljs0.c(ljs0.e(tra1.b(f530Var, aps0Var.e ? 1.0f : 0.5f), 56.0f), 1.0f), cyk0.c(20.0f));
            ldc ldcVar = aps0Var.c;
            if (ldcVar == null) {
                btsVar.e0(641522320);
                j = ((el51) btsVar.m(gl51.a)).f();
                btsVar.t(false);
            } else {
                btsVar.e0(641520956);
                btsVar.t(false);
                j = ldcVar.a;
            }
            xab1.a(m4m0.b(l, j, qke.q), null, wwg.S(2111431451, true, new ls40(22, aps0Var, oz40Var, tlsVar), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(aps0Var, tlsVar, f530Var, i, 24);
        }
    }

    public static final void c(jps0 jps0Var, float f, sls slsVar, boolean z, float f2, fid fidVar, int i) {
        bts btsVar;
        m3u0 m3u0Var;
        o430 o430Var;
        long j;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-494355839);
        int i2 = 2;
        int i3 = i | (btsVar2.k(jps0Var) ? 4 : 2) | (btsVar2.e(slsVar) ? 256 : 128) | (btsVar2.a(z) ? 2048 : 1024) | (btsVar2.b(f2) ? 16384 : 8192);
        if (btsVar2.V(i3 & 1, (i3 & 9363) != 9362)) {
            Object Q = btsVar2.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                Q = f.f(0.0f);
                btsVar2.o0(Q);
            }
            tx40 tx40Var = (tx40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var2) {
                Q2 = id00.a(0.0f);
                btsVar2.o0(Q2);
            }
            a aVar = (a) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var2) {
                Q3 = f.d(new ppr0(12, aVar, tx40Var));
                btsVar2.o0(Q3);
            }
            m3u0 m3u0Var2 = (m3u0) Q3;
            Object Q4 = btsVar2.Q();
            if (Q4 == o430Var2) {
                Q4 = id00.a(1.0f);
                btsVar2.o0(Q4);
            }
            a aVar2 = (a) Q4;
            Object Q5 = btsVar2.Q();
            if (Q5 == o430Var2) {
                Q5 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                btsVar2.o0(Q5);
            }
            tse tseVar = (tse) Q5;
            Object Q6 = btsVar2.Q();
            if (Q6 == o430Var2) {
                Q6 = f.d(new k0v(m3u0Var2, f2, i2));
                btsVar2.o0(Q6);
            }
            m3u0 m3u0Var3 = (m3u0) Q6;
            Object Q7 = btsVar2.Q();
            if (Q7 == o430Var2) {
                Q7 = f.d(new gr5(m3u0Var3, 9));
                btsVar2.o0(Q7);
            }
            m3u0 m3u0Var4 = (m3u0) Q7;
            Object Q8 = btsVar2.Q();
            if (Q8 == o430Var2) {
                Q8 = new xo1(m3u0Var2, 17);
                btsVar2.o0(Q8);
            }
            f530 b2 = tra1.b(ljs0.m(an91.k(sm91.d(c530.a, (tls) Q8), b), f), ((Number) aVar2.e()).floatValue());
            byk0 byk0Var = a;
            f530 l = ymb1.l(ibb1.c(b2, 4.0f, byk0Var, 0L, 0L, 28), byk0Var);
            ldc ldcVar = jps0Var.c;
            if (ldcVar == null) {
                btsVar2.e0(1665441223);
                long c = ((el51) btsVar2.m(gl51.a)).c();
                btsVar2.t(false);
                m3u0Var = m3u0Var4;
                o430Var = o430Var2;
                j = c;
            } else {
                m3u0Var = m3u0Var4;
                btsVar2.e0(1665439859);
                btsVar2.t(false);
                o430Var = o430Var2;
                j = ldcVar.a;
            }
            f530 b3 = m4m0.b(l, j, qke.q);
            boolean e = ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | btsVar2.e(tseVar) | btsVar2.e(aVar) | ((57344 & i3) == 16384) | btsVar2.e(aVar2);
            Object Q9 = btsVar2.Q();
            if (e || Q9 == o430Var) {
                xos0 xos0Var = new xos0(z, tseVar, aVar, f2, slsVar, m3u0Var, tx40Var, aVar2);
                btsVar2.o0(xos0Var);
                Q9 = xos0Var;
            }
            f530 a2 = exw0.a(b3, zy11.a, (PointerInputEventHandler) Q9);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, a2);
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
            qje.W(btsVar2, d.f, d);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d2);
            Boolean bool = (Boolean) m3u0Var.getValue();
            bool.getClass();
            btsVar = btsVar2;
            androidx.compose.animation.a.b(bool, null, null, null, null, null, wwg.S(-1538336054, true, new alb0(25, jps0Var), btsVar2), btsVar, 1572864, 62);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ap1(jps0Var, f, slsVar, z, f2, i);
        }
    }
}
