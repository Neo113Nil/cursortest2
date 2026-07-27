package kotlin.text;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class CatchingFishRoomHandler implements ListIterator, CatchingFishCardViewFAB {
    public int CatchingFishDaggerWebsocket;
    public final Object CatchingFishReduxKtor;

    public CatchingFishRoomHandler(int i, List list) {
        this.CatchingFishReduxKtor = list;
        this.CatchingFishDaggerWebsocket = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.CatchingFishReduxKtor.add(this.CatchingFishDaggerWebsocket, obj);
        this.CatchingFishDaggerWebsocket++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.CatchingFishDaggerWebsocket < this.CatchingFishReduxKtor.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.CatchingFishDaggerWebsocket > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.CatchingFishDaggerWebsocket;
        this.CatchingFishDaggerWebsocket = i + 1;
        return this.CatchingFishReduxKtor.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.CatchingFishDaggerWebsocket;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.CatchingFishDaggerWebsocket - 1;
        this.CatchingFishDaggerWebsocket = i;
        return this.CatchingFishReduxKtor.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.CatchingFishDaggerWebsocket - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.CatchingFishDaggerWebsocket - 1;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishReduxKtor.remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.CatchingFishReduxKtor.set(this.CatchingFishDaggerWebsocket, obj);
    }
}
