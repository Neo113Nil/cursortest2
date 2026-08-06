package j;

import java.util.Iterator;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963d extends AbstractC0964e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0962c f8021a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8022b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0965f f8023c;

    public C0963d(C0965f c0965f) {
        this.f8023c = c0965f;
    }

    @Override // j.AbstractC0964e
    public final void a(C0962c c0962c) {
        C0962c c0962c2 = this.f8021a;
        if (c0962c == c0962c2) {
            C0962c c0962c3 = c0962c2.f8020d;
            this.f8021a = c0962c3;
            this.f8022b = c0962c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8022b) {
            return this.f8023c.f8024a != null;
        }
        C0962c c0962c = this.f8021a;
        return (c0962c == null || c0962c.f8019c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8022b) {
            this.f8022b = false;
            this.f8021a = this.f8023c.f8024a;
        } else {
            C0962c c0962c = this.f8021a;
            this.f8021a = c0962c != null ? c0962c.f8019c : null;
        }
        return this.f8021a;
    }
}
