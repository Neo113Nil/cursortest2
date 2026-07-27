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
public final class C4254zB extends AbstractCollection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35306n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f35307u;

    public /* synthetic */ C4254zB(int i, Serializable serializable) {
        this.f35306n = i;
        this.f35307u = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f35306n) {
            case 0:
                ((C3340iC) this.f35307u).f();
                break;
            case 1:
                ((GB) this.f35307u).clear();
                break;
            default:
                ((C3715pB) this.f35307u).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f35306n) {
            case 0:
                return ((C3340iC) this.f35307u).d(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C3715pB) this.f35307u).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f35306n) {
            case 2:
                return ((C3715pB) this.f35307u).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f35306n) {
            case 0:
                C3340iC c3340iC = (C3340iC) this.f35307u;
                c3340iC.getClass();
                return new C3553mB(c3340iC);
            case 1:
                GB gb = (GB) this.f35307u;
                Map f3 = gb.f();
                return f3 != null ? f3.values().iterator() : new DB(gb, 2);
            default:
                return new C3286hC(((C3715pB) this.f35307u).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f35306n) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C3715pB c3715pB = (C3715pB) this.f35307u;
                    for (Map.Entry entry : c3715pB.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            c3715pB.remove(entry.getKey());
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
        switch (this.f35306n) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3715pB c3715pB = (C3715pB) this.f35307u;
                    for (Map.Entry entry : c3715pB.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3715pB.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f35306n) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3715pB c3715pB = (C3715pB) this.f35307u;
                    for (Map.Entry entry : c3715pB.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3715pB.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f35306n) {
            case 0:
                return ((C3340iC) this.f35307u).f31012x;
            case 1:
                return ((GB) this.f35307u).size();
            default:
                return ((C3715pB) this.f35307u).f33037v.size();
        }
    }

    public C4254zB(C3715pB c3715pB) {
        this.f35306n = 2;
        this.f35307u = c3715pB;
    }
}
