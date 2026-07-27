package kotlin.text;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishDatabinding extends CatchingFishMultiplatform implements ListIterator {
    public final /* synthetic */ CatchingFishRealmHilt CatchingFishViewModelScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishDatabinding(CatchingFishRealmHilt catchingFishRealmHilt, int i) {
        super(catchingFishRealmHilt);
        this.CatchingFishViewModelScope = catchingFishRealmHilt;
        int CatchingFishParcelableFAB = catchingFishRealmHilt.CatchingFishParcelableFAB();
        if (i < 0 || i > CatchingFishParcelableFAB) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, CatchingFishParcelableFAB, "index: ", ", size: "));
        }
        this.CatchingFishDaggerWebsocket = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.CatchingFishDaggerWebsocket > 0;
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
        return this.CatchingFishViewModelScope.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.CatchingFishDaggerWebsocket - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
