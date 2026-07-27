package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Q1 implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26918a;

    public Q1(long j6) {
        this.f26918a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Q1.class == obj.getClass() && this.f26918a == ((Q1) obj).f26918a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26918a) + 527;
    }

    public final String toString() {
        long j6 = this.f26918a;
        StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j6);
        return sb.toString();
    }
}
