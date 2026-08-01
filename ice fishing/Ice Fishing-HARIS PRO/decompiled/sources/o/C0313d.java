package o;

import java.util.Iterator;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313d extends AbstractC0314e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0312c f4121a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4122b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0315f f4123c;

    public C0313d(C0315f c0315f) {
        this.f4123c = c0315f;
    }

    @Override // o.AbstractC0314e
    public final void a(C0312c c0312c) {
        C0312c c0312c2 = this.f4121a;
        if (c0312c == c0312c2) {
            C0312c c0312c3 = c0312c2.f4120d;
            this.f4121a = c0312c3;
            this.f4122b = c0312c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4122b) {
            return this.f4123c.f4124a != null;
        }
        C0312c c0312c = this.f4121a;
        return (c0312c == null || c0312c.f4119c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4122b) {
            this.f4122b = false;
            this.f4121a = this.f4123c.f4124a;
        } else {
            C0312c c0312c = this.f4121a;
            this.f4121a = c0312c != null ? c0312c.f4119c : null;
        }
        return this.f4121a;
    }
}
