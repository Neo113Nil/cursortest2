package o;

import java.util.Iterator;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4819b extends AbstractC4822e implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public C4820c f39660n;

    /* renamed from: u, reason: collision with root package name */
    public C4820c f39661u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f39662v;

    public C4819b(C4820c c4820c, C4820c c4820c2, int i) {
        this.f39662v = i;
        this.f39660n = c4820c2;
        this.f39661u = c4820c;
    }

    @Override // o.AbstractC4822e
    public final void a(C4820c c4820c) {
        C4820c c4820c2;
        C4820c c4820c3 = null;
        if (this.f39660n == c4820c && c4820c == this.f39661u) {
            this.f39661u = null;
            this.f39660n = null;
        }
        C4820c c4820c4 = this.f39660n;
        if (c4820c4 == c4820c) {
            switch (this.f39662v) {
                case 0:
                    c4820c2 = c4820c4.f39666w;
                    break;
                default:
                    c4820c2 = c4820c4.f39665v;
                    break;
            }
            this.f39660n = c4820c2;
        }
        C4820c c4820c5 = this.f39661u;
        if (c4820c5 == c4820c) {
            C4820c c4820c6 = this.f39660n;
            if (c4820c5 != c4820c6 && c4820c6 != null) {
                c4820c3 = b(c4820c5);
            }
            this.f39661u = c4820c3;
        }
    }

    public final C4820c b(C4820c c4820c) {
        switch (this.f39662v) {
            case 0:
                return c4820c.f39665v;
            default:
                return c4820c.f39666w;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39661u != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C4820c c4820c = this.f39661u;
        C4820c c4820c2 = this.f39660n;
        this.f39661u = (c4820c == c4820c2 || c4820c2 == null) ? null : b(c4820c);
        return c4820c;
    }
}
