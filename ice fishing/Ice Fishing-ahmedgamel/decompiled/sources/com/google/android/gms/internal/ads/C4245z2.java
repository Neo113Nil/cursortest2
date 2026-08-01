package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4245z2 implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f35265a;

    /* renamed from: b, reason: collision with root package name */
    public final C4191y2 f35266b;

    /* renamed from: c, reason: collision with root package name */
    public final C4191y2 f35267c;

    public C4245z2(float f3, C4191y2 c4191y2, C4191y2 c4191y22) {
        this.f35265a = f3;
        this.f35266b = c4191y2;
        this.f35267c = c4191y22;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4245z2)) {
            return false;
        }
        C4245z2 c4245z2 = (C4245z2) obj;
        return Float.compare(this.f35265a, c4245z2.f35265a) == 0 && Objects.equals(this.f35266b, c4245z2.f35266b) && Objects.equals(this.f35267c, c4245z2.f35267c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f35265a) * 31;
        C4191y2 c4191y2 = this.f35266b;
        int hashCode2 = (hashCode + (c4191y2 != null ? c4191y2.hashCode() : 0)) * 31;
        C4191y2 c4191y22 = this.f35267c;
        return hashCode2 + (c4191y22 != null ? c4191y22.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f35266b);
        String valueOf2 = String.valueOf(this.f35267c);
        float f3 = this.f35265a;
        int length = String.valueOf(f3).length();
        StringBuilder sb = new StringBuilder(length + 37 + valueOf.length() + 10 + valueOf2.length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f3);
        sb.append(", field 1=");
        sb.append(valueOf);
        return u1.h.g(sb, ", field 2=", valueOf2);
    }
}
