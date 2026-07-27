package kotlin.text;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishLayoutDataStore extends CatchingFishRealm {
    public boolean CatchingFishViewModelFAB;
    public Object[] CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public CatchingFishLayoutDataStore(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.CatchingFishWorkManager = i3;
        Object[] objArr2 = new Object[i3];
        this.CatchingFishViewModelScope = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.CatchingFishViewModelFAB = r5;
        objArr2[0] = objArr;
        CatchingFishSnackbar(i - r5, 1);
    }

    public final void CatchingFishCoroutine(int i) {
        int i2 = 0;
        while (CatchingFishKtorViewModel.CatchingFishNavigation(this.CatchingFishReduxKtor, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            CatchingFishSnackbar(this.CatchingFishReduxKtor, ((this.CatchingFishWorkManager - 1) - (i2 / 5)) + 1);
        }
    }

    public final Object CatchingFishParcelableFAB() {
        int i = this.CatchingFishReduxKtor & 31;
        Object obj = this.CatchingFishViewModelScope[this.CatchingFishWorkManager - 1];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i];
    }

    public final void CatchingFishSnackbar(int i, int i2) {
        int i3 = (this.CatchingFishWorkManager - i2) * 5;
        while (i2 < this.CatchingFishWorkManager) {
            Object[] objArr = this.CatchingFishViewModelScope;
            Object obj = objArr[i2 - 1];
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[CatchingFishKtorViewModel.CatchingFishNavigation(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object CatchingFishParcelableFAB = CatchingFishParcelableFAB();
        int i = this.CatchingFishReduxKtor + 1;
        this.CatchingFishReduxKtor = i;
        if (i == this.CatchingFishDaggerWebsocket) {
            this.CatchingFishViewModelFAB = true;
            return CatchingFishParcelableFAB;
        }
        CatchingFishCoroutine(0);
        return CatchingFishParcelableFAB;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.CatchingFishReduxKtor--;
        if (this.CatchingFishViewModelFAB) {
            this.CatchingFishViewModelFAB = false;
            return CatchingFishParcelableFAB();
        }
        CatchingFishCoroutine(31);
        return CatchingFishParcelableFAB();
    }
}
