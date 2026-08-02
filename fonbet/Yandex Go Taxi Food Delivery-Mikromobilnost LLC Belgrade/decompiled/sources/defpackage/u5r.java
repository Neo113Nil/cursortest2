package defpackage;

/* loaded from: classes11.dex */
public final class u5r {
    public final void a(d6r d6rVar, tls tlsVar, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2122627810);
        int i2 = (btsVar.k(d6rVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            y5r.c(d6rVar, tlsVar, slsVar, btsVar, i2 & 1022);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0(this, d6rVar, tlsVar, slsVar, i);
        }
    }
}
