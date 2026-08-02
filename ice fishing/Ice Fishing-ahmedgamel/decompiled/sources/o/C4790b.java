package o;

import java.util.Iterator;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4790b extends AbstractC4793e implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public C4791c f39696n;

    /* renamed from: u, reason: collision with root package name */
    public C4791c f39697u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f39698v;

    public C4790b(C4791c c4791c, C4791c c4791c2, int i) {
        this.f39698v = i;
        this.f39696n = c4791c2;
        this.f39697u = c4791c;
    }

    @Override // o.AbstractC4793e
    public final void a(C4791c c4791c) {
        C4791c c4791c2;
        C4791c c4791c3 = null;
        if (this.f39696n == c4791c && c4791c == this.f39697u) {
            this.f39697u = null;
            this.f39696n = null;
        }
        C4791c c4791c4 = this.f39696n;
        if (c4791c4 == c4791c) {
            switch (this.f39698v) {
                case 0:
                    c4791c2 = c4791c4.f39702w;
                    break;
                default:
                    c4791c2 = c4791c4.f39701v;
                    break;
            }
            this.f39696n = c4791c2;
        }
        C4791c c4791c5 = this.f39697u;
        if (c4791c5 == c4791c) {
            C4791c c4791c6 = this.f39696n;
            if (c4791c5 != c4791c6 && c4791c6 != null) {
                c4791c3 = b(c4791c5);
            }
            this.f39697u = c4791c3;
        }
    }

    public final C4791c b(C4791c c4791c) {
        switch (this.f39698v) {
            case 0:
                return c4791c.f39701v;
            default:
                return c4791c.f39702w;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39697u != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C4791c c4791c = this.f39697u;
        C4791c c4791c2 = this.f39696n;
        this.f39697u = (c4791c == c4791c2 || c4791c2 == null) ? null : b(c4791c);
        return c4791c;
    }
}
