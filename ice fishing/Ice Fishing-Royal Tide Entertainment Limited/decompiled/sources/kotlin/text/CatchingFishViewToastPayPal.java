package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewToastPayPal extends CatchingFishFragmentRedux {
    public final /* synthetic */ CatchingFishFragmentRedux CatchingFishViewModelFAB;
    public final transient int CatchingFishViewModelScope;
    public final transient int CatchingFishWorkManager;

    public CatchingFishViewToastPayPal(CatchingFishFragmentRedux catchingFishFragmentRedux, int i, int i2) {
        this.CatchingFishViewModelFAB = catchingFishFragmentRedux;
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = i2;
    }

    @Override // kotlin.text.CatchingFishGsonJUnit
    public final int CatchingFishCoroutine() {
        return this.CatchingFishViewModelFAB.CatchingFishSnackbar() + this.CatchingFishWorkManager + this.CatchingFishViewModelScope;
    }

    @Override // kotlin.text.CatchingFishGsonJUnit
    public final Object[] CatchingFishParcelableFAB() {
        return this.CatchingFishViewModelFAB.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishGsonJUnit
    public final int CatchingFishSnackbar() {
        return this.CatchingFishViewModelFAB.CatchingFishSnackbar() + this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishFragmentRedux, java.util.List
    /* renamed from: CatchingFishViewModelScope */
    public final CatchingFishFragmentRedux subList(int i, int i2) {
        CatchingFishDaggerBiometric.CatchingFishDataStoreIntent(i, i2, this.CatchingFishViewModelScope);
        int i3 = this.CatchingFishWorkManager;
        return this.CatchingFishViewModelFAB.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        CatchingFishDaggerBiometric.CatchingFishAppCompat(i, this.CatchingFishViewModelScope);
        return this.CatchingFishViewModelFAB.get(i + this.CatchingFishWorkManager);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.CatchingFishViewModelScope;
    }
}
