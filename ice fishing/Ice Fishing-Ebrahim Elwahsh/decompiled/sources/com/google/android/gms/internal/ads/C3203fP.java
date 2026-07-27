package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3203fP {

    /* renamed from: a, reason: collision with root package name */
    public int f30698a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30699b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30700c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30701d;

    public C3258gP a() {
        if (this.f30699b || !(this.f30700c || this.f30701d)) {
            return new C3258gP(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
