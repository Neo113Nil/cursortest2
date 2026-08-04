package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f159a = e0.NotReady;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f160b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        e0 e0Var = this.f159a;
        e0 e0Var2 = e0.Failed;
        if (!(e0Var != e0Var2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iOrdinal = e0Var.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f159a = e0Var2;
            a();
            if (this.f159a == e0.Ready) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f159a = e0.NotReady;
        return this.f160b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
