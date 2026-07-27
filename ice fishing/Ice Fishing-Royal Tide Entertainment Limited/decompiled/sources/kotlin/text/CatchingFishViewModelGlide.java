package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class CatchingFishViewModelGlide implements List, CatchingFishViewAndroidX {
    public final int CatchingFishDaggerWebsocket;
    public final Object CatchingFishReduxKtor;
    public int CatchingFishWorkManager;

    public CatchingFishViewModelGlide(List list, int i, int i2) {
        this.CatchingFishReduxKtor = list;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = i2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.CatchingFishWorkManager;
        this.CatchingFishWorkManager = i + 1;
        this.CatchingFishReduxKtor.add(i, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.CatchingFishReduxKtor.addAll(i + this.CatchingFishDaggerWebsocket, collection);
        int size = collection.size();
        this.CatchingFishWorkManager += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.CatchingFishWorkManager - 1;
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i2 <= i) {
            while (true) {
                this.CatchingFishReduxKtor.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.CatchingFishWorkManager = i2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.CatchingFishWorkManager;
        for (int i2 = this.CatchingFishDaggerWebsocket; i2 < i; i2++) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i) {
        CatchingFishBundleMockk.CatchingFishParcelableFAB(i, this);
        return this.CatchingFishReduxKtor.get(i + this.CatchingFishDaggerWebsocket);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.CatchingFishWorkManager;
        int i2 = this.CatchingFishDaggerWebsocket;
        for (int i3 = i2; i3 < i; i3++) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishWorkManager == this.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new CatchingFishRoomHandler(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.CatchingFishWorkManager - 1;
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i2 > i) {
            return -1;
        }
        while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new CatchingFishRoomHandler(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.CatchingFishWorkManager;
        for (int i2 = this.CatchingFishDaggerWebsocket; i2 < i; i2++) {
            ?? r2 = this.CatchingFishReduxKtor;
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(r2.get(i2), obj)) {
                r2.remove(i2);
                this.CatchingFishWorkManager--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.CatchingFishWorkManager;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.CatchingFishWorkManager;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.CatchingFishWorkManager;
        int i2 = i - 1;
        int i3 = this.CatchingFishDaggerWebsocket;
        if (i3 <= i2) {
            while (true) {
                ?? r3 = this.CatchingFishReduxKtor;
                if (!collection.contains(r3.get(i2))) {
                    r3.remove(i2);
                    this.CatchingFishWorkManager--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.CatchingFishWorkManager;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        CatchingFishBundleMockk.CatchingFishParcelableFAB(i, this);
        return this.CatchingFishReduxKtor.set(i + this.CatchingFishDaggerWebsocket, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.CatchingFishWorkManager - this.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        CatchingFishBundleMockk.CatchingFishSnackbar(this, i, i2);
        return new CatchingFishViewModelGlide(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.CatchingFishReduxKtor.add(i + this.CatchingFishDaggerWebsocket, obj);
        this.CatchingFishWorkManager++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new CatchingFishRoomHandler(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.CatchingFishReduxKtor.addAll(this.CatchingFishWorkManager, collection);
        int size = collection.size();
        this.CatchingFishWorkManager += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        CatchingFishBundleMockk.CatchingFishParcelableFAB(i, this);
        this.CatchingFishWorkManager--;
        return this.CatchingFishReduxKtor.remove(i + this.CatchingFishDaggerWebsocket);
    }
}
