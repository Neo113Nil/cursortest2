package o;

import java.util.Iterator;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4792d extends AbstractC4793e implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public C4791c f39703n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39704u = true;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4794f f39705v;

    public C4792d(C4794f c4794f) {
        this.f39705v = c4794f;
    }

    @Override // o.AbstractC4793e
    public final void a(C4791c c4791c) {
        C4791c c4791c2 = this.f39703n;
        if (c4791c == c4791c2) {
            C4791c c4791c3 = c4791c2.f39702w;
            this.f39703n = c4791c3;
            this.f39704u = c4791c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39704u) {
            return this.f39705v.f39706n != null;
        }
        C4791c c4791c = this.f39703n;
        return (c4791c == null || c4791c.f39701v == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f39704u) {
            this.f39704u = false;
            this.f39703n = this.f39705v.f39706n;
        } else {
            C4791c c4791c = this.f39703n;
            this.f39703n = c4791c != null ? c4791c.f39701v : null;
        }
        return this.f39703n;
    }
}
