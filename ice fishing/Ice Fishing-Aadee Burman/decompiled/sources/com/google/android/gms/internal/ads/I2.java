package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class I2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25433a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25434b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25435c = false;

    public boolean a() {
        return (this.f25435c || this.f25434b) && this.f25433a;
    }

    public OO b() {
        if (this.f25433a || !(this.f25434b || this.f25435c)) {
            return new OO(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
