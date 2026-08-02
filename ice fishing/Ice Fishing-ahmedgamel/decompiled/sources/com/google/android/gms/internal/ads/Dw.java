package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Dw {

    /* renamed from: a, reason: collision with root package name */
    public String f25251a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25252b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25253c;

    /* renamed from: d, reason: collision with root package name */
    public long f25254d;

    /* renamed from: e, reason: collision with root package name */
    public long f25255e;

    /* renamed from: f, reason: collision with root package name */
    public byte f25256f;

    public final Ew a() {
        String str;
        if (this.f25256f == 63 && (str = this.f25251a) != null) {
            return new Ew(str, this.f25252b, this.f25253c, this.f25254d, this.f25255e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f25251a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f25256f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f25256f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f25256f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f25256f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f25256f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f25256f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
