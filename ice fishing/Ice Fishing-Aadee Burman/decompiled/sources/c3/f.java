package c3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class f extends e {

    /* renamed from: x, reason: collision with root package name */
    public static final f f5562x = new f(new Object[0], 0);

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f5563v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f5564w;

    public f(Object[] objArr, int i) {
        this.f5563v = objArr;
        this.f5564w = i;
    }

    @Override // c3.AbstractC0541a
    public final Object[] a() {
        return this.f5563v;
    }

    @Override // c3.AbstractC0541a
    public final int c() {
        return 0;
    }

    @Override // c3.AbstractC0541a
    public final int d() {
        return this.f5564w;
    }

    @Override // c3.e, c3.AbstractC0541a
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f5563v;
        int i = this.f5564w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.bumptech.glide.e.l(i, this.f5564w);
        Object obj = this.f5563v[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5564w;
    }
}
