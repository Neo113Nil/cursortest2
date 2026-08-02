package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes11.dex */
public abstract class q3z {
    public static final a7u0 a = new a7u0(new o3z(1));

    public static final void a(lyy lyyVar, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-243408857);
        int i2 = (btsVar.k(lyyVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sb2.b(a.a(lyyVar), aVar, btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(lyyVar, aVar, i, 15);
        }
    }
}
