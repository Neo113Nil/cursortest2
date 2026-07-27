package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3924t5 {

    /* renamed from: d, reason: collision with root package name */
    public static final C3924t5 f34215d = new C3924t5(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f34216a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34217b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34218c;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C3924t5(float f3, float f9) {
        AbstractC2772Sd.i(f3 > 0.0f);
        AbstractC2772Sd.i(f9 > 0.0f);
        this.f34216a = f3;
        this.f34217b = f9;
        this.f34218c = Math.round(f3 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3924t5.class == obj.getClass()) {
            C3924t5 c3924t5 = (C3924t5) obj;
            if (this.f34216a == c3924t5.f34216a && this.f34217b == c3924t5.f34217b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f34217b) + ((Float.floatToRawIntBits(this.f34216a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f34216a), Float.valueOf(this.f34217b)};
        String str = AbstractC3159eu.f29993a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
