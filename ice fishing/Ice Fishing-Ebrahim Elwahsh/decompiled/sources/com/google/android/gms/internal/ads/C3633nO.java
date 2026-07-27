package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3633nO {

    /* renamed from: a, reason: collision with root package name */
    public final long f32859a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32860b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32861c;

    public /* synthetic */ C3633nO(C3579mO c3579mO) {
        this.f32859a = c3579mO.f32691a;
        this.f32860b = c3579mO.f32692b;
        this.f32861c = c3579mO.f32693c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3633nO)) {
            return false;
        }
        C3633nO c3633nO = (C3633nO) obj;
        return this.f32859a == c3633nO.f32859a && this.f32860b == c3633nO.f32860b && this.f32861c == c3633nO.f32861c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f32859a), Float.valueOf(this.f32860b), Long.valueOf(this.f32861c));
    }
}
