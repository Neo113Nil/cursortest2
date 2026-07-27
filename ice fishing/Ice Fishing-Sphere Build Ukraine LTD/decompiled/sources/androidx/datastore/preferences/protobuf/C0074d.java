package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074d implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public int f1423e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f1424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0077g f1425g;

    public C0074d(C0077g c0077g) {
        this.f1425g = c0077g;
        this.f1424f = c0077g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1423e < this.f1424f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f1423e;
        if (i2 >= this.f1424f) {
            throw new NoSuchElementException();
        }
        this.f1423e = i2 + 1;
        return Byte.valueOf(this.f1425g.f(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
