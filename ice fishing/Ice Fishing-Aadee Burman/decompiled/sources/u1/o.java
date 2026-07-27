package u1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f41127n;

    public o(ArrayList arrayList) {
        this.f41127n = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f41127n.iterator();
    }
}
