package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class O1 implements N1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26577a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26578b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26579c;

    /* renamed from: d, reason: collision with root package name */
    public final C3138eQ f26580d;

    public O1(long j6, long j9, boolean z3, C3138eQ c3138eQ) {
        boolean z6 = true;
        if (j6 != com.anythink.basead.exoplayer.b.f6382b && j9 != com.anythink.basead.exoplayer.b.f6382b && j6 > j9) {
            z6 = false;
        }
        AbstractC2772Sd.i(z6);
        this.f26577a = j6;
        this.f26578b = j9;
        this.f26579c = z3;
        this.f26580d = c3138eQ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O1.class == obj.getClass()) {
            O1 o12 = (O1) obj;
            if (this.f26577a == o12.f26577a && this.f26578b == o12.f26578b && this.f26579c == o12.f26579c && Objects.equals(this.f26580d, o12.f26580d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f26578b) + ((Long.hashCode(this.f26577a) + 527) * 31);
        C3138eQ c3138eQ = this.f26580d;
        return (((hashCode * 31) + (this.f26579c ? 1 : 0)) * 31) + (c3138eQ != null ? c3138eQ.hashCode() : 0);
    }

    public final String toString() {
        String sb;
        long j6 = this.f26577a;
        Object valueOf = j6 == com.anythink.basead.exoplayer.b.f6382b ? "UNSET" : Long.valueOf(j6);
        long j9 = this.f26578b;
        String obj = valueOf.toString();
        if (j9 == com.anythink.basead.exoplayer.b.f6382b) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j9).length() + 12);
            sb2.append(", endTimeMs=");
            sb2.append(j9);
            sb = sb2.toString();
        }
        C3138eQ c3138eQ = this.f26580d;
        String concat = c3138eQ == null ? "" : ", title=".concat(c3138eQ.toString());
        String str = true == this.f26579c ? ", hidden" : "";
        StringBuilder sb3 = new StringBuilder(str.length() + sb.length() + obj.length() + 21 + concat.length());
        u1.h.i(sb3, "Chapter: startTimeMs=", obj, sb, str);
        sb3.append(concat);
        return sb3.toString();
    }
}
