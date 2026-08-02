package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class SO {

    /* renamed from: a, reason: collision with root package name */
    public int f28191a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28192b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28193c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28194d;

    public TO a() {
        if (this.f28192b || !(this.f28193c || this.f28194d)) {
            return new TO(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
