package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4096w2 implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f34915a;

    /* renamed from: b, reason: collision with root package name */
    public final C4042v2 f34916b;

    /* renamed from: c, reason: collision with root package name */
    public final C4042v2 f34917c;

    public C4096w2(float f6, C4042v2 c4042v2, C4042v2 c4042v22) {
        this.f34915a = f6;
        this.f34916b = c4042v2;
        this.f34917c = c4042v22;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4096w2)) {
            return false;
        }
        C4096w2 c4096w2 = (C4096w2) obj;
        return Float.compare(this.f34915a, c4096w2.f34915a) == 0 && Objects.equals(this.f34916b, c4096w2.f34916b) && Objects.equals(this.f34917c, c4096w2.f34917c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f34915a) * 31;
        C4042v2 c4042v2 = this.f34916b;
        int hashCode2 = (hashCode + (c4042v2 != null ? c4042v2.hashCode() : 0)) * 31;
        C4042v2 c4042v22 = this.f34917c;
        return hashCode2 + (c4042v22 != null ? c4042v22.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f34916b);
        String valueOf2 = String.valueOf(this.f34917c);
        float f6 = this.f34915a;
        int length = String.valueOf(f6).length();
        StringBuilder sb = new StringBuilder(length + 37 + valueOf.length() + 10 + valueOf2.length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f6);
        sb.append(", field 1=");
        sb.append(valueOf);
        return AbstractC5051n.g(sb, ", field 2=", valueOf2);
    }
}
