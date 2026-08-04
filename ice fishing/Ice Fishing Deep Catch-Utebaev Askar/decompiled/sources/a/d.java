package a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f20e;

    public d(a aVar, int i2) {
        this.f20e = aVar;
        this.f16a = i2;
        this.f17b = aVar.f3d.f10c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18c < this.f17b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = this.f20e.a(this.f18c, this.f16a);
        this.f18c++;
        this.f19d = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19d) {
            throw new IllegalStateException();
        }
        int i2 = this.f18c - 1;
        this.f18c = i2;
        this.f17b--;
        this.f19d = false;
        this.f20e.b(i2);
    }
}
