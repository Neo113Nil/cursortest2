package kotlin.text;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class CatchingFishRealm implements ListIterator, CatchingFishCardViewFAB {
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;

    public CatchingFishRealm(int i, int i2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.CatchingFishReduxKtor < this.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.CatchingFishReduxKtor > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.CatchingFishReduxKtor;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.CatchingFishReduxKtor - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
