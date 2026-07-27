package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishGradleView implements Iterator, CatchingFishCardViewFAB {
    public final int CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public int CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishGradleView(int i, int i2, int i3) {
        this.CatchingFishReduxKtor = i3;
        this.CatchingFishDaggerWebsocket = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.CatchingFishWorkManager = z;
        this.CatchingFishViewModelScope = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.CatchingFishWorkManager;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.CatchingFishViewModelScope;
        if (i != this.CatchingFishDaggerWebsocket) {
            this.CatchingFishViewModelScope = this.CatchingFishReduxKtor + i;
            return i;
        }
        if (!this.CatchingFishWorkManager) {
            throw new NoSuchElementException();
        }
        this.CatchingFishWorkManager = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
