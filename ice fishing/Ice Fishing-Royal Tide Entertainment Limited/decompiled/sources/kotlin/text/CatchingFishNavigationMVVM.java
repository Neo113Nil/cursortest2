package kotlin.text;

import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishNavigationMVVM extends CatchingFishFragmentRedux {
    public static final CatchingFishNavigationMVVM CatchingFishViewModelFAB = new CatchingFishNavigationMVVM(0, new Object[0]);
    public final transient int CatchingFishViewModelScope;
    public final transient Object[] CatchingFishWorkManager;

    public CatchingFishNavigationMVVM(int i, Object[] objArr) {
        this.CatchingFishWorkManager = objArr;
        this.CatchingFishViewModelScope = i;
    }

    @Override // kotlin.text.CatchingFishGsonJUnit
    public final int CatchingFishCoroutine() {
        return this.CatchingFishViewModelScope;
    }

    @Override // kotlin.text.CatchingFishFragmentRedux, kotlin.text.CatchingFishGsonJUnit
    public final int CatchingFishDaggerWebsocket(Object[] objArr) {
        Object[] objArr2 = this.CatchingFishWorkManager;
        int i = this.CatchingFishViewModelScope;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // kotlin.text.CatchingFishGsonJUnit
    public final Object[] CatchingFishParcelableFAB() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishGsonJUnit
    public final int CatchingFishSnackbar() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        CatchingFishDaggerBiometric.CatchingFishAppCompat(i, this.CatchingFishViewModelScope);
        Object obj = this.CatchingFishWorkManager[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.CatchingFishViewModelScope;
    }
}
