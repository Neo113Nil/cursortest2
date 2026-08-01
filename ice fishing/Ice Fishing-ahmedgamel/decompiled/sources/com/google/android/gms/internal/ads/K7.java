package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class K7 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f25865a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25866b;

    /* renamed from: c, reason: collision with root package name */
    public int f25867c;

    /* renamed from: d, reason: collision with root package name */
    public long f25868d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25869e;

    /* renamed from: f, reason: collision with root package name */
    public C3842re f25870f = C3842re.f33641b;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final void a(Integer num, Object obj, int i, long j6, boolean z3) {
        C3842re c3842re = C3842re.f33641b;
        this.f25865a = num;
        this.f25866b = obj;
        this.f25867c = i;
        this.f25868d = j6;
        this.f25870f = c3842re;
        this.f25869e = z3;
    }

    public final long b(int i, int i6) {
        C2897a a9 = this.f25870f.a(i);
        return a9.f28983a != -1 ? a9.f28987e[i6] : com.anythink.basead.exoplayer.b.f6382b;
    }

    public final void c(int i) {
        this.f25870f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !K7.class.equals(obj.getClass())) {
            return false;
        }
        K7 k72 = (K7) obj;
        return Objects.equals(this.f25865a, k72.f25865a) && Objects.equals(this.f25866b, k72.f25866b) && this.f25867c == k72.f25867c && this.f25868d == k72.f25868d && this.f25869e == k72.f25869e && Objects.equals(this.f25870f, k72.f25870f);
    }

    public final int hashCode() {
        Integer num = this.f25865a;
        int hashCode = num == null ? 0 : num.hashCode();
        Object obj = this.f25866b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.f25867c;
        long j6 = this.f25868d;
        return this.f25870f.hashCode() + (((((hashCode2 * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 961) + (this.f25869e ? 1 : 0)) * 31);
    }
}
