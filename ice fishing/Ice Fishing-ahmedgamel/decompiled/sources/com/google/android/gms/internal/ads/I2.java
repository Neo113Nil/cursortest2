package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class I2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26176a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26177b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26178c = false;

    public boolean a() {
        return (this.f26178c || this.f26177b) && this.f26176a;
    }

    public OO b() {
        if (this.f26176a || !(this.f26177b || this.f26178c)) {
            return new OO(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
