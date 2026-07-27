package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class OQ {

    /* renamed from: a, reason: collision with root package name */
    public final int f26699a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26700b;

    public OQ(int i, boolean z8) {
        this.f26699a = i;
        this.f26700b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OQ.class != obj.getClass()) {
            return false;
        }
        OQ oq = (OQ) obj;
        return this.f26699a == oq.f26699a && this.f26700b == oq.f26700b;
    }

    public final int hashCode() {
        return (this.f26699a * 31) + (this.f26700b ? 1 : 0);
    }
}
