package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class I extends J {

    /* renamed from: v, reason: collision with root package name */
    public final transient int f36298v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f36299w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ J f36300x;

    public I(J j6, int i, int i4) {
        Objects.requireNonNull(j6);
        this.f36300x = j6;
        this.f36298v = i;
        this.f36299w = i4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int c() {
        return this.f36300x.d() + this.f36298v + this.f36299w;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int d() {
        return this.f36300x.d() + this.f36298v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final Object[] e() {
        return this.f36300x.e();
    }

    @Override // com.google.android.gms.internal.consent_sdk.J, java.util.List
    /* renamed from: f */
    public final J subList(int i, int i4) {
        E.f(i, i4, this.f36299w);
        int i6 = this.f36298v;
        return this.f36300x.subList(i + i6, i4 + i6);
    }

    @Override // java.util.List
    public final Object get(int i) {
        E.b(i, this.f36299w);
        return this.f36300x.get(i + this.f36298v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36299w;
    }
}
