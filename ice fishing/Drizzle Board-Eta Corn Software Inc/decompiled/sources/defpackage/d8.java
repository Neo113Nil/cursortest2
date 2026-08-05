package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class d8 implements k60 {
    public final AtomicReference qoPGr6Ce;

    public d8(e6 e6Var) {
        this.qoPGr6Ce = new AtomicReference(e6Var);
    }

    @Override // defpackage.k60
    public final Iterator iterator() {
        k60 k60Var = (k60) this.qoPGr6Ce.getAndSet(null);
        if (k60Var != null) {
            return k60Var.iterator();
        }
        m1.Ey6iv0m0("This sequence can be consumed only once.");
        return null;
    }
}
