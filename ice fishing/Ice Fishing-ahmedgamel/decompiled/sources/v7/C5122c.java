package v7;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: v7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5122c extends AbstractC5123d implements RandomAccess {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC5123d f41432n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41433u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41434v;

    public C5122c(AbstractC5123d abstractC5123d, int i, int i6) {
        this.f41432n = abstractC5123d;
        this.f41433u = i;
        com.bumptech.glide.g.c(i, i6, abstractC5123d.a());
        this.f41434v = i6 - i;
    }

    @Override // v7.AbstractC5120a
    public final int a() {
        return this.f41434v;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i6 = this.f41434v;
        if (i < 0 || i >= i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        return this.f41432n.get(this.f41433u + i);
    }

    @Override // v7.AbstractC5123d, java.util.List
    public final List subList(int i, int i6) {
        com.bumptech.glide.g.c(i, i6, this.f41434v);
        int i9 = this.f41433u;
        return new C5122c(this.f41432n, i + i9, i9 + i6);
    }
}
