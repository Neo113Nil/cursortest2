package defpackage;

/* loaded from: classes12.dex */
public final class zs8 {
    public final void a(wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-287360796);
        int i2 = (btsVar.e(wlsVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            wlsVar.invoke(btsVar, Integer.valueOf(i2 & 14));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(this, wlsVar, i, 7);
        }
    }
}
