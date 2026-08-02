package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.zB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4277zB extends AbstractCollection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36090n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f36091u;

    public /* synthetic */ C4277zB(int i, Serializable serializable) {
        this.f36090n = i;
        this.f36091u = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f36090n) {
            case 0:
                ((C3363iC) this.f36091u).f();
                break;
            case 1:
                ((GB) this.f36091u).clear();
                break;
            default:
                ((C3738pB) this.f36091u).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f36090n) {
            case 0:
                return ((C3363iC) this.f36091u).d(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C3738pB) this.f36091u).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f36090n) {
            case 2:
                return ((C3738pB) this.f36091u).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f36090n) {
            case 0:
                C3363iC c3363iC = (C3363iC) this.f36091u;
                c3363iC.getClass();
                return new C3576mB(c3363iC);
            case 1:
                GB gb = (GB) this.f36091u;
                Map f2 = gb.f();
                return f2 != null ? f2.values().iterator() : new DB(gb, 2);
            default:
                return new C3309hC(((C3738pB) this.f36091u).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f36090n) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C3738pB c3738pB = (C3738pB) this.f36091u;
                    for (Map.Entry entry : c3738pB.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            c3738pB.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f36090n) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3738pB c3738pB = (C3738pB) this.f36091u;
                    for (Map.Entry entry : c3738pB.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3738pB.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f36090n) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3738pB c3738pB = (C3738pB) this.f36091u;
                    for (Map.Entry entry : c3738pB.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3738pB.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f36090n) {
            case 0:
                return ((C3363iC) this.f36091u).f31785x;
            case 1:
                return ((GB) this.f36091u).size();
            default:
                return ((C3738pB) this.f36091u).f33827v.size();
        }
    }

    public C4277zB(C3738pB c3738pB) {
        this.f36090n = 2;
        this.f36091u = c3738pB;
    }
}
