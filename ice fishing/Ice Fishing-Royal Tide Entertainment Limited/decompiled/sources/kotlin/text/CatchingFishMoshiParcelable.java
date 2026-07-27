package kotlin.text;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishMoshiParcelable implements ListIterator, Iterator {
    public int CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final CatchingFishFragmentRedux CatchingFishWorkManager;

    public CatchingFishMoshiParcelable(CatchingFishFragmentRedux catchingFishFragmentRedux, int i) {
        int size = catchingFishFragmentRedux.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(CatchingFishDaggerBiometric.CatchingFishStateFlow("index", i, size));
        }
        this.CatchingFishReduxKtor = size;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishFragmentRedux;
    }

    public final Object CatchingFishParcelableFAB(int i) {
        return this.CatchingFishWorkManager.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.CatchingFishDaggerWebsocket < this.CatchingFishReduxKtor;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.CatchingFishDaggerWebsocket > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.CatchingFishDaggerWebsocket;
        this.CatchingFishDaggerWebsocket = i + 1;
        return CatchingFishParcelableFAB(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.CatchingFishDaggerWebsocket - 1;
        this.CatchingFishDaggerWebsocket = i;
        return CatchingFishParcelableFAB(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.CatchingFishDaggerWebsocket - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
