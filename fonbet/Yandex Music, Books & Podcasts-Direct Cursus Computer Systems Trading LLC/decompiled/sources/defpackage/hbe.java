package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class hbe implements cg7 {
    @Override // defpackage.cg7
    public final dg7 a(r3r r3rVar, rwj rwjVar) {
        ij3 o = r3rVar.a.o();
        if (!o.A0(0L, mcd.b) && !o.A0(0L, mcd.a) && (!o.A0(0L, mcd.c) || !o.A0(8L, mcd.d) || !o.A0(12L, mcd.e) || !o.request(17L) || ((byte) (o.h().P(16L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !o.A0(4L, mcd.f)) {
                return null;
            }
            if (!o.A0(8L, mcd.g) && !o.A0(8L, mcd.h) && !o.A0(8L, mcd.i)) {
                return null;
            }
        }
        return new nbe(r3rVar.a, rwjVar);
    }

    public final boolean equals(Object obj) {
        return obj instanceof hbe;
    }

    public final int hashCode() {
        return hbe.class.hashCode();
    }
}
