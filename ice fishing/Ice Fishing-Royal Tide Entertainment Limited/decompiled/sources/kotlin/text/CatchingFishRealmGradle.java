package kotlin.text;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishRealmGradle extends CatchingFishLiveDataViewMVI {
    public final HashMap CatchingFishViewModelFAB = new HashMap();

    @Override // kotlin.text.CatchingFishLiveDataViewMVI
    public final CatchingFishPayPalGraphQL CatchingFishParcelableFAB(Object obj) {
        return (CatchingFishPayPalGraphQL) this.CatchingFishViewModelFAB.get(obj);
    }

    @Override // kotlin.text.CatchingFishLiveDataViewMVI
    public final Object CatchingFishSnackbar(Object obj) {
        Object CatchingFishSnackbar = super.CatchingFishSnackbar(obj);
        this.CatchingFishViewModelFAB.remove(obj);
        return CatchingFishSnackbar;
    }
}
