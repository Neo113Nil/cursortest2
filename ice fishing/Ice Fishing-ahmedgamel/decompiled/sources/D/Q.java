package D;

import h.AbstractActivityC4555k;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Q implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f360n = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final AbstractActivityC4555k f361u;

    public Q(AbstractActivityC4555k abstractActivityC4555k) {
        this.f361u = abstractActivityC4555k;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f360n.iterator();
    }
}
