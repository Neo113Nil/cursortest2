package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class O1 implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26636a;

    public O1(long j9) {
        this.f26636a = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && O1.class == obj.getClass() && this.f26636a == ((O1) obj).f26636a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26636a) + 527;
    }

    public final String toString() {
        long j9 = this.f26636a;
        StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j9);
        return sb.toString();
    }
}
