package o;

import java.util.Iterator;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4776d extends AbstractC4777e implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public C4775c f39536n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39537u = true;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4778f f39538v;

    public C4776d(C4778f c4778f) {
        this.f39538v = c4778f;
    }

    @Override // o.AbstractC4777e
    public final void a(C4775c c4775c) {
        C4775c c4775c2 = this.f39536n;
        if (c4775c == c4775c2) {
            C4775c c4775c3 = c4775c2.f39535w;
            this.f39536n = c4775c3;
            this.f39537u = c4775c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39537u) {
            return this.f39538v.f39539n != null;
        }
        C4775c c4775c = this.f39536n;
        return (c4775c == null || c4775c.f39534v == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f39537u) {
            this.f39537u = false;
            this.f39536n = this.f39538v.f39539n;
        } else {
            C4775c c4775c = this.f39536n;
            this.f39536n = c4775c != null ? c4775c.f39534v : null;
        }
        return this.f39536n;
    }
}
