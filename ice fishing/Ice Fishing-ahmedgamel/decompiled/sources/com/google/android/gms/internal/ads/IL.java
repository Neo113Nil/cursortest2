package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class IL extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26237n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f26238u;

    public /* synthetic */ IL(AbstractMap abstractMap, int i) {
        this.f26237n = i;
        this.f26238u = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        switch (this.f26237n) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                ((FL) this.f26238u).c(entry.getValue());
                return true;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((com.google.android.gms.internal.consent_sdk.K2) this.f26238u).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f26237n) {
            case 0:
                ((FL) this.f26238u).clear();
                break;
            default:
                ((com.google.android.gms.internal.consent_sdk.K2) this.f26238u).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f26237n) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((FL) this.f26238u).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    if (obj2 == null || !obj2.equals(value)) {
                        break;
                    }
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((com.google.android.gms.internal.consent_sdk.K2) this.f26238u).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    if (obj3 == null || !obj3.equals(value2)) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f26237n) {
            case 0:
                return new HL((FL) this.f26238u);
            default:
                return new HL((com.google.android.gms.internal.consent_sdk.K2) this.f26238u);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f26237n) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((FL) this.f26238u).remove(entry.getKey());
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((com.google.android.gms.internal.consent_sdk.K2) this.f26238u).remove(entry2.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f26237n) {
            case 0:
                return ((FL) this.f26238u).size();
            default:
                return ((com.google.android.gms.internal.consent_sdk.K2) this.f26238u).size();
        }
    }
}
