package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class u9b1 {
    public static final void a(ebp0 ebp0Var, a aVar, a aVar2, f530 f530Var, float f, to5 to5Var, to5 to5Var2, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        to5 to5Var3;
        to5 to5Var4;
        f530 f530Var3;
        to5 to5Var5 = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1716280679);
        if ((i & 48) == 0) {
            i2 = (btsVar.e(aVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar2) ? 256 : 128;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.b(f) ? 16384 : 8192;
        }
        int i4 = i3 | ImageMetadata.EDGE_MODE;
        if ((1572864 & i) == 0) {
            i4 |= btsVar.k(to5Var2) ? 1048576 : 524288;
        }
        if (btsVar.V(i4 & 1, (599185 & i4) != 599184)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                to5Var4 = to5Var5;
                f530Var3 = c530.a;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                to5Var4 = to5Var;
            }
            btsVar.u();
            int i5 = i4 >> 3;
            wub1.b(wwg.S(1599666529, true, new k2z0(aVar, 4), btsVar), wwg.S(-1477021150, true, new k2z0(aVar2, 5), btsVar), f530Var3, f, to5Var4, to5Var2, btsVar, (i5 & 896) | 54 | (i5 & 7168) | (57344 & i5) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES));
            f530Var2 = f530Var3;
            to5Var3 = to5Var4;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            to5Var3 = to5Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new f86(ebp0Var, aVar, aVar2, f530Var2, f, to5Var3, to5Var2, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (defpackage.jl40.l(r5.Q(), java.lang.Integer.valueOf(r7)) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, vge vgeVar, fid fidVar, int i) {
        a aVar;
        wls wlsVar;
        boolean z;
        a aVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1116799654);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(vgeVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, f530Var);
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
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, d);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o);
            wls wlsVar4 = d.g;
            if (btsVar.S) {
                aVar = null;
            } else {
                aVar = null;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar4);
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d2);
            a7u0 a7u0Var = gl51.a;
            long i3 = ((el51) btsVar.m(a7u0Var)).i();
            gji0 gji0Var = qke.q;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(ljs0.e(m4m0.b(c530Var, i3, gji0Var), 40.0f), 1.0f);
            uo5 uo5Var2 = x4c.B;
            cj6 cj6Var = cj6.a;
            pi6.a(cj6Var.a(c, uo5Var2), btsVar, 0);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a);
            qje.W(btsVar, wlsVar3, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                wlsVar = wlsVar4;
                b64.z(hashCode2, btsVar, hashCode2, wlsVar);
            } else {
                wlsVar = wlsVar4;
            }
            qje.W(btsVar, wlsVar5, d3);
            f530 b = m4m0.b(ljs0.e(ljs0.c(c530Var, 1.0f), 72.0f), ((el51) btsVar.m(a7u0Var)).c(), cyk0.c(18.0f));
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, d4);
            qje.W(btsVar, wlsVar3, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar);
            }
            qje.W(btsVar, wlsVar5, d5);
            f530 a2 = cj6Var.a(c530Var, x4c.y);
            v4v v4vVar = vgeVar.c;
            if (v4vVar == null) {
                btsVar.e0(-588681106);
                btsVar.t(false);
                aVar2 = aVar;
                z = true;
            } else {
                btsVar.e0(-588681105);
                z = true;
                a S = wwg.S(-745014944, true, new mb(v4vVar, 20), btsVar);
                btsVar.t(false);
                aVar2 = S;
            }
            hqb1.a(a2, vgeVar, true, aVar2, btsVar, (i2 & 112) | 384, 0);
            btsVar.t(z);
            pi6.a(m4m0.b(ljs0.e(ljs0.c(c530Var, 1.0f), 16.0f), ((el51) btsVar.m(a7u0Var)).c(), cyk0.e(18.0f, 18.0f, 0.0f, 0.0f, 12)), btsVar, 0);
            btsVar.t(true);
            c(cj6Var.a(an91.o(ljs0.c(c530Var, 1.0f), 32.0f, 0.0f, 31.0f, 14.0f, 2), uo5Var2), btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(f530Var, vgeVar, i, 5);
        }
    }

    public static final void c(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2093251297);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(new y7m(0.0f));
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            fwi fwiVar = (fwi) btsVar.m(j.h);
            boolean k = btsVar.k(fwiVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new ooi(fwiVar, oz40Var, 8);
                btsVar.o0(Q2);
            }
            f530 y = eja1.y(f530Var, (tls) Q2);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, y);
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
            float f = ((y7m) oz40Var.getValue()).a / 7.0f;
            btsVar.e0(2062859848);
            int i3 = (int) f;
            for (int i4 = 0; i4 < i3; i4++) {
                pi6.a(ljs0.m(m4m0.b(an91.o(c530.a, 0.0f, 0.0f, 3.0f, 0.0f, 11), dl51.h, cyk0.c(100.0f)), 4.0f), btsVar, 0);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new orq0(f530Var, i, 0);
        }
    }

    public static final boolean d(long j) {
        float h = ldc.h(j);
        return (((double) ldc.e(j)) * 0.0722d) + ((((double) ldc.g(j)) * 0.7152d) + (((double) h) * 0.2126d)) >= 0.5d;
    }
}
