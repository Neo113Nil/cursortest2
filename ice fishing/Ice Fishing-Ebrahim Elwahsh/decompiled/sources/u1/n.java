package u1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f41144n;

    public n(ArrayList arrayList) {
        this.f41144n = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f41144n.iterator();
    }
}
