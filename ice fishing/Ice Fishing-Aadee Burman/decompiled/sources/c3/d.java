package c3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: v, reason: collision with root package name */
    public final transient int f5558v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f5559w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f5560x;

    public d(e eVar, int i, int i6) {
        Objects.requireNonNull(eVar);
        this.f5560x = eVar;
        this.f5558v = i;
        this.f5559w = i6;
    }

    @Override // c3.AbstractC0541a
    public final Object[] a() {
        return this.f5560x.a();
    }

    @Override // c3.AbstractC0541a
    public final int c() {
        return this.f5560x.c() + this.f5558v;
    }

    @Override // c3.AbstractC0541a
    public final int d() {
        return this.f5560x.c() + this.f5558v + this.f5559w;
    }

    @Override // c3.e, java.util.List
    /* renamed from: g */
    public final e subList(int i, int i6) {
        com.bumptech.glide.e.m(i, i6, this.f5559w);
        int i9 = this.f5558v;
        return this.f5560x.subList(i + i9, i6 + i9);
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.bumptech.glide.e.l(i, this.f5559w);
        return this.f5560x.get(i + this.f5558v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5559w;
    }
}
