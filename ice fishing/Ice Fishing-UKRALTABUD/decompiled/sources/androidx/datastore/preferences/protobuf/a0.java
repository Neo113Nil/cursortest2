package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public int f1407f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1408g;

    /* renamed from: h, reason: collision with root package name */
    public Iterator f1409h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y f1410i;

    public a0(Y y2) {
        this.f1410i = y2;
    }

    public final Iterator a() {
        if (this.f1409h == null) {
            this.f1409h = this.f1410i.f1400g.entrySet().iterator();
        }
        return this.f1409h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f1407f + 1;
        Y y2 = this.f1410i;
        if (i2 >= y2.f1399f.size()) {
            return !y2.f1400g.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f1408g = true;
        int i2 = this.f1407f + 1;
        this.f1407f = i2;
        Y y2 = this.f1410i;
        return i2 < y2.f1399f.size() ? (Map.Entry) y2.f1399f.get(this.f1407f) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1408g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f1408g = false;
        int i2 = Y.f1398k;
        Y y2 = this.f1410i;
        y2.b();
        if (this.f1407f >= y2.f1399f.size()) {
            a().remove();
            return;
        }
        int i3 = this.f1407f;
        this.f1407f = i3 - 1;
        y2.h(i3);
    }
}
