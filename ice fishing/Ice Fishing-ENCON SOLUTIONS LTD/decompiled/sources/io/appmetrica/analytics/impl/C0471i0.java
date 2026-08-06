package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6158a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6159b;

    public C0471i0(String str, long j2) {
        this.f6158a = str;
        this.f6159b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0471i0.class != obj.getClass()) {
            return false;
        }
        C0471i0 c0471i0 = (C0471i0) obj;
        if (this.f6159b != c0471i0.f6159b) {
            return false;
        }
        String str = this.f6158a;
        String str2 = c0471i0.f6158a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6158a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f6159b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
