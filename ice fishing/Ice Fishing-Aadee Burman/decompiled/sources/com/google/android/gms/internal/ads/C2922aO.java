package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.aO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2922aO {

    /* renamed from: a, reason: collision with root package name */
    public final long f29052a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29053b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29054c;

    public /* synthetic */ C2922aO(ZN zn) {
        this.f29052a = zn.f28881a;
        this.f29053b = zn.f28882b;
        this.f29054c = zn.f28883c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2922aO)) {
            return false;
        }
        C2922aO c2922aO = (C2922aO) obj;
        return this.f29052a == c2922aO.f29052a && this.f29053b == c2922aO.f29053b && this.f29054c == c2922aO.f29054c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f29052a), Float.valueOf(this.f29053b), Long.valueOf(this.f29054c));
    }
}
