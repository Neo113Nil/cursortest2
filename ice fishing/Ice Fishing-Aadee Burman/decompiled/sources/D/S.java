package D;

import h.AbstractActivityC4551k;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class S implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f463n = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final AbstractActivityC4551k f464u;

    public S(AbstractActivityC4551k abstractActivityC4551k) {
        this.f464u = abstractActivityC4551k;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f463n.iterator();
    }
}
