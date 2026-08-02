package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class wub1 {
    public static final void a(a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-640259012);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
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
            qje.W(btsVar, d.f, mk11.a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            nnm.p(6, aVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new k2z0(i, 27, aVar);
        }
    }

    public static final void b(a aVar, a aVar2, f530 f530Var, float f, to5 to5Var, to5 to5Var2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1062500082);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.b(f) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(to5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(to5Var2) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            boolean z = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new nk11(f, to5Var, to5Var2);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            a(wwg.S(93249129, true, new k2z0(aVar, 25), btsVar), btsVar, 6);
            a(wwg.S(17164256, true, new k2z0(aVar2, 26), btsVar), btsVar, 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ls7(aVar, aVar2, f530Var, f, to5Var, to5Var2, i);
        }
    }

    public static final Throwable c(Throwable th, jc70 jc70Var, ows0 ows0Var, yss yssVar) {
        if (jc70Var == null) {
            return th;
        }
        kpb1.d(th, new b700(14, yssVar, ows0Var, jc70Var));
        return th;
    }

    public static final ht10 d(jc70 jc70Var, ows0 ows0Var) {
        return new ht10(jc70Var, ows0Var, false, 21);
    }

    public static j2g e(r51 r51Var, ddf ddfVar, h0j h0jVar, m3o m3oVar, i6r i6rVar, w4l0 w4l0Var, lvq0 lvq0Var) {
        i6rVar.getClass();
        m3oVar.getClass();
        w4l0Var.getClass();
        return new j2g(r51Var, ddfVar, h0jVar, m3oVar, i6rVar, w4l0Var, lvq0Var);
    }

    public static final void f(ows0 ows0Var, o13 o13Var, int i) {
        while (true) {
            int i2 = ows0Var.v;
            if (i > i2 && i < ows0Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            ows0Var.O();
            if (ows0Var.y(ows0Var.v)) {
                o13Var.p();
            }
            ows0Var.j();
        }
    }
}
