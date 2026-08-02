package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class K7 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f26617a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26618b;

    /* renamed from: c, reason: collision with root package name */
    public int f26619c;

    /* renamed from: d, reason: collision with root package name */
    public long f26620d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26621e;

    /* renamed from: f, reason: collision with root package name */
    public C3865re f26622f = C3865re.f34414b;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final void a(Integer num, Object obj, int i, long j6, boolean z6) {
        C3865re c3865re = C3865re.f34414b;
        this.f26617a = num;
        this.f26618b = obj;
        this.f26619c = i;
        this.f26620d = j6;
        this.f26622f = c3865re;
        this.f26621e = z6;
    }

    public final long b(int i, int i4) {
        C2920a a9 = this.f26622f.a(i);
        return a9.f29753a != -1 ? a9.f29757e[i4] : com.anythink.basead.exoplayer.b.f7168b;
    }

    public final void c(int i) {
        this.f26622f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !K7.class.equals(obj.getClass())) {
            return false;
        }
        K7 k72 = (K7) obj;
        return Objects.equals(this.f26617a, k72.f26617a) && Objects.equals(this.f26618b, k72.f26618b) && this.f26619c == k72.f26619c && this.f26620d == k72.f26620d && this.f26621e == k72.f26621e && Objects.equals(this.f26622f, k72.f26622f);
    }

    public final int hashCode() {
        Integer num = this.f26617a;
        int hashCode = num == null ? 0 : num.hashCode();
        Object obj = this.f26618b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.f26619c;
        long j6 = this.f26620d;
        return this.f26622f.hashCode() + (((((hashCode2 * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 961) + (this.f26621e ? 1 : 0)) * 31);
    }
}
