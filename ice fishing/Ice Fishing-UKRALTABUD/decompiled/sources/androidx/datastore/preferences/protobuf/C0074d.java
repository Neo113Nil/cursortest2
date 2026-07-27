package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074d implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public int f1415f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int f1416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0077g f1417h;

    public C0074d(C0077g c0077g) {
        this.f1417h = c0077g;
        this.f1416g = c0077g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1415f < this.f1416g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f1415f;
        if (i2 >= this.f1416g) {
            throw new NoSuchElementException();
        }
        this.f1415f = i2 + 1;
        return Byte.valueOf(this.f1417h.f(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
