package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3035cd {

    /* renamed from: d, reason: collision with root package name */
    public static final C3035cd f29500d = new C3035cd(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f29501a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29502b;

    /* renamed from: c, reason: collision with root package name */
    public final float f29503c;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public C3035cd(int i, int i6, float f3) {
        this.f29501a = i;
        this.f29502b = i6;
        this.f29503c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3035cd) {
            C3035cd c3035cd = (C3035cd) obj;
            if (this.f29501a == c3035cd.f29501a && this.f29502b == c3035cd.f29502b && this.f29503c == c3035cd.f29503c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f29503c) + ((((this.f29501a + 217) * 31) + this.f29502b) * 31);
    }
}
