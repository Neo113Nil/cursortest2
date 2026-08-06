package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z01 implements Iterable, q40 {
    public final /* synthetic */ cl OOA6hdeuvCS;

    public z01(cl clVar) {
        this.OOA6hdeuvCS = clVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bl(this.OOA6hdeuvCS);
    }
}
