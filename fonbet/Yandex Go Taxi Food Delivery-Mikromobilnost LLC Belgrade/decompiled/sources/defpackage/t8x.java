package defpackage;

import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.a;

/* loaded from: classes9.dex */
public abstract class t8x extends a implements m1k, iqv {
    public c z;

    @Override // defpackage.iqv
    public final de60 b() {
        return null;
    }

    @Override // defpackage.m1k
    public final void dispose() {
        Object N;
        Object i;
        a aVar;
        c cVar = this.z;
        if (cVar == null) {
            cVar = null;
        }
        do {
            N = cVar.N();
            if (!(N instanceof t8x)) {
                if (!(N instanceof iqv) || ((iqv) N).b() == null) {
                    return;
                }
                do {
                    i = i();
                    if (i instanceof hxi0) {
                        return;
                    }
                    if (i == this) {
                        return;
                    } else {
                        aVar = (a) i;
                    }
                } while (!nzs.v(a.a, this, i, aVar.m()));
                aVar.f();
                return;
            }
            if (N != this) {
                return;
            }
        } while (!nzs.x(c.a, cVar, (t8x) N));
    }

    @Override // defpackage.iqv
    public final boolean isActive() {
        return true;
    }

    public abstract boolean n();

    public abstract void o(Throwable th);

    @Override // kotlinx.coroutines.internal.a
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(wwg.s(this));
        sb.append("[job@");
        c cVar = this.z;
        if (cVar == null) {
            cVar = null;
        }
        sb.append(wwg.s(cVar));
        sb.append(']');
        return sb.toString();
    }
}
