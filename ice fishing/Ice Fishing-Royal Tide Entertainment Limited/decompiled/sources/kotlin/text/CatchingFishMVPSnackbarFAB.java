package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVPSnackbarFAB extends CatchingFishFragmentRedux {
    public final transient CatchingFishFragmentRedux CatchingFishWorkManager;

    public CatchingFishMVPSnackbarFAB(CatchingFishFragmentRedux catchingFishFragmentRedux) {
        this.CatchingFishWorkManager = catchingFishFragmentRedux;
    }

    @Override // kotlin.text.CatchingFishFragmentRedux, java.util.List
    /* renamed from: CatchingFishViewModelScope */
    public final CatchingFishFragmentRedux subList(int i, int i2) {
        CatchingFishFragmentRedux catchingFishFragmentRedux = this.CatchingFishWorkManager;
        CatchingFishDaggerBiometric.CatchingFishDataStoreIntent(i, i2, catchingFishFragmentRedux.size());
        return catchingFishFragmentRedux.subList(catchingFishFragmentRedux.size() - i2, catchingFishFragmentRedux.size() - i).CatchingFishWorkManager();
    }

    @Override // kotlin.text.CatchingFishFragmentRedux
    public final CatchingFishFragmentRedux CatchingFishWorkManager() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishFragmentRedux, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.CatchingFishWorkManager.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        CatchingFishFragmentRedux catchingFishFragmentRedux = this.CatchingFishWorkManager;
        CatchingFishDaggerBiometric.CatchingFishAppCompat(i, catchingFishFragmentRedux.size());
        return catchingFishFragmentRedux.get((catchingFishFragmentRedux.size() - 1) - i);
    }

    @Override // kotlin.text.CatchingFishFragmentRedux, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.CatchingFishWorkManager.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // kotlin.text.CatchingFishFragmentRedux, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.CatchingFishWorkManager.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.CatchingFishWorkManager.size();
    }
}
