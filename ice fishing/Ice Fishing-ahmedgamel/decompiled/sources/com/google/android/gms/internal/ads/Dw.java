package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Dw {

    /* renamed from: a, reason: collision with root package name */
    public String f24490a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24491b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24492c;

    /* renamed from: d, reason: collision with root package name */
    public long f24493d;

    /* renamed from: e, reason: collision with root package name */
    public long f24494e;

    /* renamed from: f, reason: collision with root package name */
    public byte f24495f;

    public final Ew a() {
        String str;
        if (this.f24495f == 63 && (str = this.f24490a) != null) {
            return new Ew(str, this.f24491b, this.f24492c, this.f24493d, this.f24494e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f24490a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f24495f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f24495f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f24495f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f24495f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f24495f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f24495f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
