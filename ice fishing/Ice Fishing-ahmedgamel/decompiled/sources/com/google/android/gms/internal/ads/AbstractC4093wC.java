package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.wC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4093wC extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return AbstractC2639Kg.C(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
