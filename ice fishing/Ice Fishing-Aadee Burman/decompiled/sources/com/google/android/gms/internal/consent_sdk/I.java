package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class I extends J {

    /* renamed from: v, reason: collision with root package name */
    public final transient int f35529v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f35530w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ J f35531x;

    public I(J j6, int i, int i6) {
        Objects.requireNonNull(j6);
        this.f35531x = j6;
        this.f35529v = i;
        this.f35530w = i6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int c() {
        return this.f35531x.d() + this.f35529v + this.f35530w;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int d() {
        return this.f35531x.d() + this.f35529v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final Object[] e() {
        return this.f35531x.e();
    }

    @Override // com.google.android.gms.internal.consent_sdk.J, java.util.List
    /* renamed from: f */
    public final J subList(int i, int i6) {
        E.f(i, i6, this.f35530w);
        int i9 = this.f35529v;
        return this.f35531x.subList(i + i9, i6 + i9);
    }

    @Override // java.util.List
    public final Object get(int i) {
        E.b(i, this.f35530w);
        return this.f35531x.get(i + this.f35529v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35530w;
    }
}
