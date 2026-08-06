package j;

import java.util.Iterator;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0961b extends AbstractC0964e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0962c f8014a;

    /* renamed from: b, reason: collision with root package name */
    public C0962c f8015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8016c;

    public C0961b(C0962c c0962c, C0962c c0962c2, int i2) {
        this.f8016c = i2;
        this.f8014a = c0962c2;
        this.f8015b = c0962c;
    }

    @Override // j.AbstractC0964e
    public final void a(C0962c c0962c) {
        C0962c c0962c2;
        C0962c c0962c3 = null;
        if (this.f8014a == c0962c && c0962c == this.f8015b) {
            this.f8015b = null;
            this.f8014a = null;
        }
        C0962c c0962c4 = this.f8014a;
        if (c0962c4 == c0962c) {
            switch (this.f8016c) {
                case 0:
                    c0962c2 = c0962c4.f8020d;
                    break;
                default:
                    c0962c2 = c0962c4.f8019c;
                    break;
            }
            this.f8014a = c0962c2;
        }
        C0962c c0962c5 = this.f8015b;
        if (c0962c5 == c0962c) {
            C0962c c0962c6 = this.f8014a;
            if (c0962c5 != c0962c6 && c0962c6 != null) {
                c0962c3 = b(c0962c5);
            }
            this.f8015b = c0962c3;
        }
    }

    public final C0962c b(C0962c c0962c) {
        switch (this.f8016c) {
            case 0:
                return c0962c.f8019c;
            default:
                return c0962c.f8020d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8015b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0962c c0962c = this.f8015b;
        C0962c c0962c2 = this.f8014a;
        this.f8015b = (c0962c == c0962c2 || c0962c2 == null) ? null : b(c0962c);
        return c0962c;
    }
}
