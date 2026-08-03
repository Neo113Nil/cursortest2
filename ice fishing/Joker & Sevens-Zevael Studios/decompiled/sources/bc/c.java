package bc;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends b implements ListIterator {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f1053j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i10) {
        super(eVar);
        this.f1053j = eVar;
        int a6 = eVar.a();
        if (i10 < 0 || i10 > a6) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, a6, "index: ", ", size: "));
        }
        this.f1048h = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1048h > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1048h;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f1048h - 1;
        this.f1048h = i10;
        return this.f1053j.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1048h - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
