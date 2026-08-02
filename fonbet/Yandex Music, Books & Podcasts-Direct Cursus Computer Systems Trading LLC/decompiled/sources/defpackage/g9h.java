package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g9h extends z7 {
    public final f9h a;

    public g9h(f9h f9hVar) {
        this.a = f9hVar;
    }

    @Override // defpackage.z7
    public final boolean a(Map.Entry entry) {
        entry.getClass();
        f9h f9hVar = this.a;
        f9hVar.getClass();
        int h = f9hVar.h(entry.getKey());
        if (h < 0) {
            return false;
        }
        Object[] objArr = f9hVar.b;
        objArr.getClass();
        return Intrinsics.d(objArr[h], entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.e(collection);
    }

    @Override // defpackage.j8
    public final int f() {
        return this.a.i;
    }

    @Override // defpackage.z7
    public final boolean g(Map.Entry entry) {
        entry.getClass();
        f9h f9hVar = this.a;
        f9hVar.getClass();
        entry.getClass();
        f9hVar.c();
        int h = f9hVar.h(entry.getKey());
        if (h < 0) {
            return false;
        }
        Object[] objArr = f9hVar.b;
        objArr.getClass();
        if (!Intrinsics.d(objArr[h], entry.getValue())) {
            return false;
        }
        f9hVar.l(h);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f9h f9hVar = this.a;
        f9hVar.getClass();
        return new c9h(f9hVar, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.c();
        return super.retainAll(collection);
    }
}
