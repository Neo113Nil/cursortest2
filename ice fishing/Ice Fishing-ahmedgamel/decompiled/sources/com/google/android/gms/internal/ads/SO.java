package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class SO {

    /* renamed from: a, reason: collision with root package name */
    public int f27478a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27479b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27480c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27481d;

    public TO a() {
        if (this.f27479b || !(this.f27480c || this.f27481d)) {
            return new TO(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
