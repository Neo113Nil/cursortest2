package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.aO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2945aO {

    /* renamed from: a, reason: collision with root package name */
    public final long f29822a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29823b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29824c;

    public /* synthetic */ C2945aO(ZN zn) {
        this.f29822a = zn.f29661a;
        this.f29823b = zn.f29662b;
        this.f29824c = zn.f29663c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2945aO)) {
            return false;
        }
        C2945aO c2945aO = (C2945aO) obj;
        return this.f29822a == c2945aO.f29822a && this.f29823b == c2945aO.f29823b && this.f29824c == c2945aO.f29824c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f29822a), Float.valueOf(this.f29823b), Long.valueOf(this.f29824c));
    }
}
