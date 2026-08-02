package e3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class f extends e {

    /* renamed from: x, reason: collision with root package name */
    public static final f f37277x = new f(new Object[0], 0);

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f37278v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f37279w;

    public f(Object[] objArr, int i) {
        this.f37278v = objArr;
        this.f37279w = i;
    }

    @Override // e3.AbstractC4480a
    public final Object[] a() {
        return this.f37278v;
    }

    @Override // e3.AbstractC4480a
    public final int c() {
        return 0;
    }

    @Override // e3.AbstractC4480a
    public final int d() {
        return this.f37279w;
    }

    @Override // e3.e, e3.AbstractC4480a
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f37278v;
        int i = this.f37279w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        S0.f.y(i, this.f37279w);
        Object obj = this.f37278v[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37279w;
    }
}
