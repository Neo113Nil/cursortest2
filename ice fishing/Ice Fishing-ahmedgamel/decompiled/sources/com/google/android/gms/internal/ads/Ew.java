package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ew {

    /* renamed from: a, reason: collision with root package name */
    public final String f25438a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25439b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25440c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25441d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25442e;

    public Ew(String str, boolean z6, boolean z9, long j6, long j9) {
        this.f25438a = str;
        this.f25439b = z6;
        this.f25440c = z9;
        this.f25441d = j6;
        this.f25442e = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ew)) {
            return false;
        }
        Ew ew = (Ew) obj;
        return this.f25438a.equals(ew.f25438a) && this.f25439b == ew.f25439b && this.f25440c == ew.f25440c && this.f25441d == ew.f25441d && this.f25442e == ew.f25442e;
    }

    public final int hashCode() {
        return ((((((((((((this.f25438a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f25439b ? 1237 : 1231)) * 1000003) ^ (true != this.f25440c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f25441d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f25442e);
    }

    public final String toString() {
        boolean z6 = this.f25439b;
        int length = String.valueOf(z6).length();
        boolean z9 = this.f25440c;
        int length2 = String.valueOf(z9).length();
        long j6 = this.f25441d;
        int length3 = String.valueOf(j6).length();
        long j9 = this.f25442e;
        int length4 = String.valueOf(j9).length();
        String str = this.f25438a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z6);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z9);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j6);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j9);
        sb.append("}");
        return sb.toString();
    }
}
