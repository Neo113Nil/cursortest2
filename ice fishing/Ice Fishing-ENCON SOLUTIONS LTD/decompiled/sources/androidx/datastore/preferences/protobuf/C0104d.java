package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f2375a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f2376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0107g f2377c;

    public C0104d(C0107g c0107g) {
        this.f2377c = c0107g;
        this.f2376b = c0107g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2375a < this.f2376b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f2375a;
        if (i2 >= this.f2376b) {
            throw new NoSuchElementException();
        }
        this.f2375a = i2 + 1;
        return Byte.valueOf(this.f2377c.f(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
