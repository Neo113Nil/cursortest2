package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class dg implements v01 {
    public final AtomicReference GWasM1elztuh;

    public dg(xb xbVar) {
        this.GWasM1elztuh = new AtomicReference(xbVar);
    }

    @Override // defpackage.v01
    public final Iterator iterator() {
        v01 v01Var = (v01) this.GWasM1elztuh.getAndSet(null);
        if (v01Var != null) {
            return v01Var.iterator();
        }
        o4.jivtDDk9H("This sequence can be consumed only once.");
        return null;
    }
}
