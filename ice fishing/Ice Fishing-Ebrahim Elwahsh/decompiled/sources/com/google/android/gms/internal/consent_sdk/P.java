package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class P extends K {

    /* renamed from: v, reason: collision with root package name */
    public final transient Object f35748v;

    public P(Object obj) {
        this.f35748v = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int a(Object[] objArr) {
        objArr[0] = this.f35748v;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f35748v.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.K, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f35748v.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new L(this.f35748v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return D.y.k("[", this.f35748v.toString(), "]");
    }
}
