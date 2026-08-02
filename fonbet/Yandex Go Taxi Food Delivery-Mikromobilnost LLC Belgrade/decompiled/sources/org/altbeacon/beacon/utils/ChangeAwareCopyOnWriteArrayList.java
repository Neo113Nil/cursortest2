package org.altbeacon.beacon.utils;

import defpackage.l99;
import defpackage.sr4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/altbeacon/beacon/utils/ChangeAwareCopyOnWriteArrayList;", "E", "Ljava/util/ArrayList;", "<init>", "()V", "Ll99;", "notifier", "Ll99;", "getNotifier", "()Ll99;", "a", "(Ll99;)V", "android-beacon-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChangeAwareCopyOnWriteArrayList<E> extends ArrayList<E> {
    private l99 notifier;

    public final void a(sr4 sr4Var) {
        this.notifier = sr4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        boolean add = super.add(obj);
        l99 l99Var = this.notifier;
        if (l99Var != null) {
            ((sr4) l99Var).n();
        }
        return add;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        boolean addAll = super.addAll(collection);
        l99 l99Var = this.notifier;
        if (l99Var != null) {
            ((sr4) l99Var).n();
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        super.clear();
        l99 l99Var = this.notifier;
        if (l99Var != null) {
            ((sr4) l99Var).n();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        l99 l99Var = this.notifier;
        if (l99Var != null) {
            ((sr4) l99Var).n();
        }
        return remove;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        boolean removeAll = super.removeAll(collection);
        l99 l99Var = this.notifier;
        if (l99Var != null) {
            ((sr4) l99Var).n();
        }
        return removeAll;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        boolean removeIf = super.removeIf(predicate);
        l99 l99Var = this.notifier;
        if (l99Var != null) {
            ((sr4) l99Var).n();
        }
        return removeIf;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        l99 l99Var = this.notifier;
        if (l99Var != null) {
            ((sr4) l99Var).n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = super.set(i, obj);
        l99 l99Var = this.notifier;
        if (l99Var != null) {
            ((sr4) l99Var).n();
        }
        return obj2;
    }
}
