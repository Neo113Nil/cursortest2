package o;

import java.util.Iterator;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311b extends AbstractC0314e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0312c f4114a;

    /* renamed from: b, reason: collision with root package name */
    public C0312c f4115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4116c;

    public C0311b(C0312c c0312c, C0312c c0312c2, int i) {
        this.f4116c = i;
        this.f4114a = c0312c2;
        this.f4115b = c0312c;
    }

    @Override // o.AbstractC0314e
    public final void a(C0312c c0312c) {
        C0312c c0312c2;
        C0312c c0312c3 = null;
        if (this.f4114a == c0312c && c0312c == this.f4115b) {
            this.f4115b = null;
            this.f4114a = null;
        }
        C0312c c0312c4 = this.f4114a;
        if (c0312c4 == c0312c) {
            switch (this.f4116c) {
                case 0:
                    c0312c2 = c0312c4.f4120d;
                    break;
                default:
                    c0312c2 = c0312c4.f4119c;
                    break;
            }
            this.f4114a = c0312c2;
        }
        C0312c c0312c5 = this.f4115b;
        if (c0312c5 == c0312c) {
            C0312c c0312c6 = this.f4114a;
            if (c0312c5 != c0312c6 && c0312c6 != null) {
                c0312c3 = b(c0312c5);
            }
            this.f4115b = c0312c3;
        }
    }

    public final C0312c b(C0312c c0312c) {
        switch (this.f4116c) {
            case 0:
                return c0312c.f4119c;
            default:
                return c0312c.f4120d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4115b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0312c c0312c = this.f4115b;
        C0312c c0312c2 = this.f4114a;
        this.f4115b = (c0312c == c0312c2 || c0312c2 == null) ? null : b(c0312c);
        return c0312c;
    }
}
