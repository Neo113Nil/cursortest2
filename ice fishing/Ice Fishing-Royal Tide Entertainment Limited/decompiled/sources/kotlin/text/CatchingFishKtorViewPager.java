package kotlin.text;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CatchingFishKtorViewPager extends AbstractList implements List, CatchingFishViewAndroidX {
    public abstract int CatchingFishParcelableFAB();

    public abstract Object CatchingFishSnackbar(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return CatchingFishSnackbar(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return CatchingFishParcelableFAB();
    }
}
