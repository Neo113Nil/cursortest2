package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class CatchingFishLayoutMVPMVVM implements Collection, CatchingFishCardViewFAB {
    public static final CatchingFishLayoutMVPMVVM CatchingFishWorkManager = new CatchingFishLayoutMVPMVVM(CatchingFishViewPagerDagger.CatchingFishReduxKtor);
    public final int CatchingFishDaggerWebsocket;
    public final List CatchingFishReduxKtor;

    public CatchingFishLayoutMVPMVVM(List list) {
        this.CatchingFishReduxKtor = list;
        this.CatchingFishDaggerWebsocket = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof CatchingFishRoomAdMob)) {
            return false;
        }
        return this.CatchingFishReduxKtor.contains((CatchingFishRoomAdMob) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.CatchingFishReduxKtor.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishLayoutMVPMVVM) {
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, ((CatchingFishLayoutMVPMVVM) obj).CatchingFishReduxKtor);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.CatchingFishReduxKtor.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.CatchingFishReduxKtor.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.CatchingFishReduxKtor + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }
}
