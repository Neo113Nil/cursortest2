package e3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: v, reason: collision with root package name */
    public final transient int f37273v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f37274w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f37275x;

    public d(e eVar, int i, int i4) {
        Objects.requireNonNull(eVar);
        this.f37275x = eVar;
        this.f37273v = i;
        this.f37274w = i4;
    }

    @Override // e3.AbstractC4480a
    public final Object[] a() {
        return this.f37275x.a();
    }

    @Override // e3.AbstractC4480a
    public final int c() {
        return this.f37275x.c() + this.f37273v;
    }

    @Override // e3.AbstractC4480a
    public final int d() {
        return this.f37275x.c() + this.f37273v + this.f37274w;
    }

    @Override // e3.e, java.util.List
    /* renamed from: g */
    public final e subList(int i, int i4) {
        S0.f.z(i, i4, this.f37274w);
        int i6 = this.f37273v;
        return this.f37275x.subList(i + i6, i4 + i6);
    }

    @Override // java.util.List
    public final Object get(int i) {
        S0.f.y(i, this.f37274w);
        return this.f37275x.get(i + this.f37273v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37274w;
    }
}
