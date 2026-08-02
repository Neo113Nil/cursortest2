package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class O1 implements N1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27359a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27360b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27361c;

    /* renamed from: d, reason: collision with root package name */
    public final C3323hQ f27362d;

    public O1(long j6, long j9, boolean z6, C3323hQ c3323hQ) {
        boolean z9 = true;
        if (j6 != com.anythink.basead.exoplayer.b.f7168b && j9 != com.anythink.basead.exoplayer.b.f7168b && j6 > j9) {
            z9 = false;
        }
        AbstractC2792Sd.i(z9);
        this.f27359a = j6;
        this.f27360b = j9;
        this.f27361c = z6;
        this.f27362d = c3323hQ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O1.class == obj.getClass()) {
            O1 o12 = (O1) obj;
            if (this.f27359a == o12.f27359a && this.f27360b == o12.f27360b && this.f27361c == o12.f27361c && Objects.equals(this.f27362d, o12.f27362d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f27360b) + ((Long.hashCode(this.f27359a) + 527) * 31);
        C3323hQ c3323hQ = this.f27362d;
        return (((hashCode * 31) + (this.f27361c ? 1 : 0)) * 31) + (c3323hQ != null ? c3323hQ.hashCode() : 0);
    }

    public final String toString() {
        String sb;
        long j6 = this.f27359a;
        Object valueOf = j6 == com.anythink.basead.exoplayer.b.f7168b ? "UNSET" : Long.valueOf(j6);
        long j9 = this.f27360b;
        String obj = valueOf.toString();
        if (j9 == com.anythink.basead.exoplayer.b.f7168b) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j9).length() + 12);
            sb2.append(", endTimeMs=");
            sb2.append(j9);
            sb = sb2.toString();
        }
        C3323hQ c3323hQ = this.f27362d;
        String concat = c3323hQ == null ? "" : ", title=".concat(c3323hQ.toString());
        String str = true == this.f27361c ? ", hidden" : "";
        StringBuilder sb3 = new StringBuilder(str.length() + sb.length() + obj.length() + 21 + concat.length());
        AbstractC5128c.h(sb3, "Chapter: startTimeMs=", obj, sb, str);
        sb3.append(concat);
        return sb3.toString();
    }
}
