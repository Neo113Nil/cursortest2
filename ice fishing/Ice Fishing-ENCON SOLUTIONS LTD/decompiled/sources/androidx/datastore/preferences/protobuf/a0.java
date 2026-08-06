package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f2367a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2368b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f2369c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f2370d;

    public a0(Y y2) {
        this.f2370d = y2;
    }

    public final Iterator a() {
        if (this.f2369c == null) {
            this.f2369c = this.f2370d.f2360b.entrySet().iterator();
        }
        return this.f2369c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f2367a + 1;
        Y y2 = this.f2370d;
        if (i2 >= y2.f2359a.size()) {
            return !y2.f2360b.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f2368b = true;
        int i2 = this.f2367a + 1;
        this.f2367a = i2;
        Y y2 = this.f2370d;
        return i2 < y2.f2359a.size() ? (Map.Entry) y2.f2359a.get(this.f2367a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2368b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f2368b = false;
        int i2 = Y.f2358f;
        Y y2 = this.f2370d;
        y2.b();
        if (this.f2367a >= y2.f2359a.size()) {
            a().remove();
            return;
        }
        int i3 = this.f2367a;
        this.f2367a = i3 - 1;
        y2.h(i3);
    }
}
