package bc;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 extends e {

    /* renamed from: g, reason: collision with root package name */
    public final List f1054g;

    public c0(List list) {
        pc.j.e(list, "delegate");
        this.f1054g = list;
    }

    @Override // bc.a
    public final int a() {
        return this.f1054g.size();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 <= n.K(this)) {
            return this.f1054g.get(n.K(this) - i10);
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new uc.d(0, n.K(this), 1) + "].");
    }

    @Override // bc.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new b0(this, 0);
    }

    @Override // bc.e, java.util.List
    public final ListIterator listIterator() {
        return new b0(this, 0);
    }

    @Override // bc.e, java.util.List
    public final ListIterator listIterator(int i10) {
        return new b0(this, i10);
    }
}
