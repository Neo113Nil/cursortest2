package kotlin.text;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerLayout extends CatchingFishNavigation implements RandomAccess {
    public static final CatchingFishViewPagerLayout CatchingFishViewModelScope = new CatchingFishViewPagerLayout(new Object[0], 0, false);
    public Object[] CatchingFishDaggerWebsocket;
    public int CatchingFishWorkManager;

    public CatchingFishViewPagerLayout(Object[] objArr, int i, boolean z) {
        this.CatchingFishReduxKtor = z;
        this.CatchingFishDaggerWebsocket = objArr;
        this.CatchingFishWorkManager = i;
    }

    public final CatchingFishViewPagerLayout CatchingFishCoroutine(int i) {
        if (i >= this.CatchingFishWorkManager) {
            return new CatchingFishViewPagerLayout(Arrays.copyOf(this.CatchingFishDaggerWebsocket, i), this.CatchingFishWorkManager, true);
        }
        throw new IllegalArgumentException();
    }

    public final void CatchingFishSnackbar(int i) {
        if (i < 0 || i >= this.CatchingFishWorkManager) {
            throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.CatchingFishWorkManager);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        CatchingFishParcelableFAB();
        int i = this.CatchingFishWorkManager;
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        if (i == objArr.length) {
            this.CatchingFishDaggerWebsocket = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.CatchingFishDaggerWebsocket;
        int i2 = this.CatchingFishWorkManager;
        this.CatchingFishWorkManager = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        CatchingFishSnackbar(i);
        return this.CatchingFishDaggerWebsocket[i];
    }

    @Override // kotlin.text.CatchingFishNavigation, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        CatchingFishParcelableFAB();
        CatchingFishSnackbar(i);
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        Object obj = objArr[i];
        if (i < this.CatchingFishWorkManager - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.CatchingFishWorkManager--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        CatchingFishParcelableFAB();
        CatchingFishSnackbar(i);
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.CatchingFishWorkManager;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        CatchingFishParcelableFAB();
        if (i >= 0 && i <= (i2 = this.CatchingFishWorkManager)) {
            Object[] objArr = this.CatchingFishDaggerWebsocket;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.CatchingFishDaggerWebsocket, i, objArr2, i + 1, this.CatchingFishWorkManager - i);
                this.CatchingFishDaggerWebsocket = objArr2;
            }
            this.CatchingFishDaggerWebsocket[i] = obj;
            this.CatchingFishWorkManager++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.CatchingFishWorkManager);
    }
}
