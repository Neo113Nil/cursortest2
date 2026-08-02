package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3058cd {

    /* renamed from: d, reason: collision with root package name */
    public static final C3058cd f30285d = new C3058cd(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f30286a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30287b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30288c;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public C3058cd(int i, int i4, float f2) {
        this.f30286a = i;
        this.f30287b = i4;
        this.f30288c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3058cd) {
            C3058cd c3058cd = (C3058cd) obj;
            if (this.f30286a == c3058cd.f30286a && this.f30287b == c3058cd.f30287b && this.f30288c == c3058cd.f30288c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f30288c) + ((((this.f30286a + 217) * 31) + this.f30287b) * 31);
    }
}
