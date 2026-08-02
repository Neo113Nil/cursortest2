package v7;

import java.util.List;
import java.util.RandomAccess;
import w.AbstractC5128c;

/* renamed from: v7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5112c extends AbstractC5113d implements RandomAccess {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC5113d f41211n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41212u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41213v;

    public C5112c(AbstractC5113d abstractC5113d, int i, int i4) {
        this.f41211n = abstractC5113d;
        this.f41212u = i;
        S0.f.c(i, i4, abstractC5113d.a());
        this.f41213v = i4 - i;
    }

    @Override // v7.AbstractC5110a
    public final int a() {
        return this.f41213v;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i4 = this.f41213v;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        return this.f41211n.get(this.f41212u + i);
    }

    @Override // v7.AbstractC5113d, java.util.List
    public final List subList(int i, int i4) {
        S0.f.c(i, i4, this.f41213v);
        int i6 = this.f41212u;
        return new C5112c(this.f41211n, i + i6, i6 + i4);
    }
}
