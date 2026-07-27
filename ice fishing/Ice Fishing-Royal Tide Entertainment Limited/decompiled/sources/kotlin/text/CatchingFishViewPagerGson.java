package kotlin.text;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerGson extends CatchingFishRealm {
    public final CatchingFishLayoutDataStore CatchingFishViewModelScope;
    public final Object[] CatchingFishWorkManager;

    public CatchingFishViewPagerGson(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.CatchingFishWorkManager = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.CatchingFishViewModelScope = new CatchingFishLayoutDataStore(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        CatchingFishLayoutDataStore catchingFishLayoutDataStore = this.CatchingFishViewModelScope;
        if (catchingFishLayoutDataStore.hasNext()) {
            this.CatchingFishReduxKtor++;
            return catchingFishLayoutDataStore.next();
        }
        int i = this.CatchingFishReduxKtor;
        this.CatchingFishReduxKtor = i + 1;
        return this.CatchingFishWorkManager[i - catchingFishLayoutDataStore.CatchingFishDaggerWebsocket];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.CatchingFishReduxKtor;
        CatchingFishLayoutDataStore catchingFishLayoutDataStore = this.CatchingFishViewModelScope;
        int i2 = catchingFishLayoutDataStore.CatchingFishDaggerWebsocket;
        if (i <= i2) {
            this.CatchingFishReduxKtor = i - 1;
            return catchingFishLayoutDataStore.previous();
        }
        int i3 = i - 1;
        this.CatchingFishReduxKtor = i3;
        return this.CatchingFishWorkManager[i3 - i2];
    }
}
