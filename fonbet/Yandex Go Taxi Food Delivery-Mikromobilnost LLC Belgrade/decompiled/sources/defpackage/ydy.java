package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class ydy {
    public static final void a(pey peyVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1220373486);
        int i2 = i | 16 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                peyVar = (pey) btsVar.m(n3z.a);
            } else {
                btsVar.Y();
            }
            int i3 = i2 & (-113);
            btsVar.u();
            boolean k = btsVar.k(zy11.a) | btsVar.k(peyVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new xey(peyVar.getLifecycle());
                btsVar.o0(Q);
            }
            b(peyVar, (xey) Q, tlsVar, btsVar, i3 & 896);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(peyVar, tlsVar, i, 11);
        }
    }

    public static final void b(pey peyVar, xey xeyVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(912823238);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(peyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(xeyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean e = btsVar.e(xeyVar) | ((i2 & 896) == 256) | btsVar.e(peyVar);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ynn(18, peyVar, xeyVar, tlsVar);
                btsVar.o0(Q);
            }
            zpn.b(peyVar, xeyVar, (tls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(peyVar, xeyVar, tlsVar, i, 27);
        }
    }

    public static final void c(Boolean bool, Object obj, pey peyVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(696924721);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                peyVar = (pey) btsVar.m(n3z.a);
            } else {
                btsVar.Y();
            }
            int i3 = i2 & (-897);
            btsVar.u();
            boolean k = btsVar.k(bool) | btsVar.k(obj) | btsVar.k(peyVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new bfy(peyVar.getLifecycle());
                btsVar.o0(Q);
            }
            d(peyVar, (bfy) Q, tlsVar, btsVar, (i3 >> 3) & 896);
        } else {
            btsVar.Y();
        }
        pey peyVar2 = peyVar;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(bool, obj, peyVar2, tlsVar, i, 4);
        }
    }

    public static final void d(pey peyVar, bfy bfyVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(228371534);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(peyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(bfyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean e = btsVar.e(bfyVar) | ((i2 & 896) == 256) | btsVar.e(peyVar);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ynn(19, peyVar, bfyVar, tlsVar);
                btsVar.o0(Q);
            }
            zpn.b(peyVar, bfyVar, (tls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(peyVar, bfyVar, tlsVar, i, 28);
        }
    }
}
