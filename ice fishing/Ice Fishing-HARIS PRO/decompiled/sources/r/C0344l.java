package r;

import u1.r;

/* renamed from: r.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344l extends r {

    /* renamed from: a, reason: collision with root package name */
    public int f4327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0343k f4328b;

    public C0344l(C0343k c0343k) {
        this.f4328b = c0343k;
    }

    @Override // u1.r
    public final int a() {
        int i = this.f4327a;
        this.f4327a = i + 1;
        return this.f4328b.c(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4327a < this.f4328b.e();
    }
}
