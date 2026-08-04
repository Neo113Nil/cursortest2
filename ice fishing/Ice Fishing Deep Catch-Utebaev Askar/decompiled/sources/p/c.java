package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f225b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f227d;

    public c(d dVar) {
        this.f227d = dVar;
        this.f224a = dVar.f228a.iterator();
    }

    public final void a() {
        int i2;
        Object next;
        d dVar;
        do {
            Iterator it = this.f224a;
            if (it.hasNext()) {
                next = it.next();
                dVar = this.f227d;
            } else {
                i2 = 0;
            }
            this.f225b = i2;
        } while (((Boolean) dVar.f230c.invoke(next)).booleanValue() != dVar.f229b);
        this.f226c = next;
        i2 = 1;
        this.f225b = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f225b == -1) {
            a();
        }
        return this.f225b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f225b == -1) {
            a();
        }
        if (this.f225b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f226c;
        this.f226c = null;
        this.f225b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
