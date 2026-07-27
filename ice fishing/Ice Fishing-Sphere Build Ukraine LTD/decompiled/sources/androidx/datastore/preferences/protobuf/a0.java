package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public int f1415e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1416f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f1417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f1418h;

    public a0(Y y2) {
        this.f1418h = y2;
    }

    public final Iterator a() {
        if (this.f1417g == null) {
            this.f1417g = this.f1418h.f1408f.entrySet().iterator();
        }
        return this.f1417g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f1415e + 1;
        Y y2 = this.f1418h;
        if (i2 >= y2.f1407e.size()) {
            return !y2.f1408f.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f1416f = true;
        int i2 = this.f1415e + 1;
        this.f1415e = i2;
        Y y2 = this.f1418h;
        return i2 < y2.f1407e.size() ? (Map.Entry) y2.f1407e.get(this.f1415e) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1416f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f1416f = false;
        int i2 = Y.f1406j;
        Y y2 = this.f1418h;
        y2.b();
        if (this.f1415e >= y2.f1407e.size()) {
            a().remove();
            return;
        }
        int i3 = this.f1415e;
        this.f1415e = i3 - 1;
        y2.h(i3);
    }
}
