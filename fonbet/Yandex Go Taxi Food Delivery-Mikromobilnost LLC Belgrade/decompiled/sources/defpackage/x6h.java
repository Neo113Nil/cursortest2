package defpackage;

import androidx.compose.ui.window.c;

/* loaded from: classes10.dex */
public final class x6h {
    public static final x6h a = new x6h();

    public final void a(m2v m2vVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1565826668);
        int i2 = 4;
        int i3 = (btsVar.k(m2vVar) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            c.a((sls) m2vVar.a, (sej) m2vVar.c, wwg.S(1163527043, true, new tbb(17, m2vVar), btsVar), btsVar, 384, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(this, m2vVar, i, i2);
        }
    }
}
