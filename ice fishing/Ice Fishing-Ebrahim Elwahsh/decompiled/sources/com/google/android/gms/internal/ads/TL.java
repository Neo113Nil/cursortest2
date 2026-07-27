package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class TL extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27744n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f27745u;

    public /* synthetic */ TL(AbstractMap abstractMap, int i) {
        this.f27744n = i;
        this.f27745u = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        switch (this.f27744n) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((QL) this.f27745u).put((Comparable) entry.getKey(), entry.getValue());
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    ((com.google.android.gms.internal.consent_sdk.K2) this.f27745u).put((Comparable) entry2.getKey(), entry2.getValue());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f27744n) {
            case 0:
                ((QL) this.f27745u).clear();
                break;
            default:
                ((com.google.android.gms.internal.consent_sdk.K2) this.f27745u).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f27744n) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((QL) this.f27745u).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    if (obj2 == null || !obj2.equals(value)) {
                        break;
                    }
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((com.google.android.gms.internal.consent_sdk.K2) this.f27745u).get(entry2.getKey());
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
        switch (this.f27744n) {
            case 0:
                return new SL((QL) this.f27745u);
            default:
                return new SL((com.google.android.gms.internal.consent_sdk.K2) this.f27745u);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f27744n) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((QL) this.f27745u).remove(entry.getKey());
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((com.google.android.gms.internal.consent_sdk.K2) this.f27745u).remove(entry2.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f27744n) {
            case 0:
                return ((QL) this.f27745u).size();
            default:
                return ((com.google.android.gms.internal.consent_sdk.K2) this.f27745u).size();
        }
    }
}
