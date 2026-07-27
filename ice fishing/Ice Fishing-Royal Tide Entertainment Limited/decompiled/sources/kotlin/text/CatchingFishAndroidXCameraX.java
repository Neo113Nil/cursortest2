package kotlin.text;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXCameraX implements List, CatchingFishCardViewFAB {
    public final int CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishStripeAPIOkHttp CatchingFishWorkManager;

    public CatchingFishAndroidXCameraX(CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, int i2) {
        this.CatchingFishWorkManager = catchingFishStripeAPIOkHttp;
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = i2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof CatchingFishFABStripeAPIFAB) && indexOf((CatchingFishFABStripeAPIFAB) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((CatchingFishFABStripeAPIFAB) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object CatchingFishDaggerWebsocket = this.CatchingFishWorkManager.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i + this.CatchingFishReduxKtor);
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishDaggerWebsocket, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (CatchingFishFABStripeAPIFAB) CatchingFishDaggerWebsocket;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof CatchingFishFABStripeAPIFAB)) {
            return -1;
        }
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) obj;
        int i = this.CatchingFishReduxKtor;
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i <= i2) {
            int i3 = i;
            while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishWorkManager.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i3), catchingFishFABStripeAPIFAB)) {
                if (i3 != i2) {
                    i3++;
                }
            }
            return i3 - i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.CatchingFishReduxKtor;
        return new CatchingFishEspressoMVI(this.CatchingFishWorkManager, i, i, this.CatchingFishDaggerWebsocket);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof CatchingFishFABStripeAPIFAB)) {
            return -1;
        }
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) obj;
        int i = this.CatchingFishDaggerWebsocket;
        int i2 = this.CatchingFishReduxKtor;
        if (i2 <= i) {
            while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishWorkManager.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i), catchingFishFABStripeAPIFAB)) {
                if (i != i2) {
                    i--;
                }
            }
            return i - i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.CatchingFishReduxKtor;
        return new CatchingFishEspressoMVI(this.CatchingFishWorkManager, i, i, this.CatchingFishDaggerWebsocket);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.CatchingFishDaggerWebsocket - this.CatchingFishReduxKtor;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.CatchingFishReduxKtor;
        return new CatchingFishAndroidXCameraX(this.CatchingFishWorkManager, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.CatchingFishReduxKtor;
        int i3 = this.CatchingFishDaggerWebsocket;
        return new CatchingFishEspressoMVI(this.CatchingFishWorkManager, i + i2, i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }
}
