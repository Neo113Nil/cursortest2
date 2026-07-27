package o;

import java.util.Iterator;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4774b extends AbstractC4777e implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public C4775c f39529n;

    /* renamed from: u, reason: collision with root package name */
    public C4775c f39530u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f39531v;

    public C4774b(C4775c c4775c, C4775c c4775c2, int i) {
        this.f39531v = i;
        this.f39529n = c4775c2;
        this.f39530u = c4775c;
    }

    @Override // o.AbstractC4777e
    public final void a(C4775c c4775c) {
        C4775c c4775c2;
        C4775c c4775c3 = null;
        if (this.f39529n == c4775c && c4775c == this.f39530u) {
            this.f39530u = null;
            this.f39529n = null;
        }
        C4775c c4775c4 = this.f39529n;
        if (c4775c4 == c4775c) {
            switch (this.f39531v) {
                case 0:
                    c4775c2 = c4775c4.f39535w;
                    break;
                default:
                    c4775c2 = c4775c4.f39534v;
                    break;
            }
            this.f39529n = c4775c2;
        }
        C4775c c4775c5 = this.f39530u;
        if (c4775c5 == c4775c) {
            C4775c c4775c6 = this.f39529n;
            if (c4775c5 != c4775c6 && c4775c6 != null) {
                c4775c3 = b(c4775c5);
            }
            this.f39530u = c4775c3;
        }
    }

    public final C4775c b(C4775c c4775c) {
        switch (this.f39531v) {
            case 0:
                return c4775c.f39534v;
            default:
                return c4775c.f39535w;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39530u != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C4775c c4775c = this.f39530u;
        C4775c c4775c2 = this.f39529n;
        this.f39530u = (c4775c == c4775c2 || c4775c2 == null) ? null : b(c4775c);
        return c4775c;
    }
}
