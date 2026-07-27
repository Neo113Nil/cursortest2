package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ew {

    /* renamed from: a, reason: collision with root package name */
    public final String f24682a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24683b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24684c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24685d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24686e;

    public Ew(String str, boolean z3, boolean z6, long j6, long j9) {
        this.f24682a = str;
        this.f24683b = z3;
        this.f24684c = z6;
        this.f24685d = j6;
        this.f24686e = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ew)) {
            return false;
        }
        Ew ew = (Ew) obj;
        return this.f24682a.equals(ew.f24682a) && this.f24683b == ew.f24683b && this.f24684c == ew.f24684c && this.f24685d == ew.f24685d && this.f24686e == ew.f24686e;
    }

    public final int hashCode() {
        return ((((((((((((this.f24682a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f24683b ? 1237 : 1231)) * 1000003) ^ (true != this.f24684c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f24685d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f24686e);
    }

    public final String toString() {
        boolean z3 = this.f24683b;
        int length = String.valueOf(z3).length();
        boolean z6 = this.f24684c;
        int length2 = String.valueOf(z6).length();
        long j6 = this.f24685d;
        int length3 = String.valueOf(j6).length();
        long j9 = this.f24686e;
        int length4 = String.valueOf(j9).length();
        String str = this.f24682a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z3);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z6);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j6);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j9);
        sb.append("}");
        return sb.toString();
    }
}
