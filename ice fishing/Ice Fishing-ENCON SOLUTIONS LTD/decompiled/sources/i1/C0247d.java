package i1;

import java.util.RandomAccess;

/* renamed from: i1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247d extends AbstractC0248e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0248e f3404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3405b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3406c;

    public C0247d(AbstractC0248e list, int i2, int i3) {
        kotlin.jvm.internal.i.e(list, "list");
        this.f3404a = list;
        this.f3405b = i2;
        R1.d.c(i2, i3, list.a());
        this.f3406c = i3 - i2;
    }

    @Override // i1.AbstractC0248e
    public final int a() {
        return this.f3406c;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        int i3 = this.f3406c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(C1.a.h("index: ", i2, i3, ", size: "));
        }
        return this.f3404a.get(this.f3405b + i2);
    }
}
