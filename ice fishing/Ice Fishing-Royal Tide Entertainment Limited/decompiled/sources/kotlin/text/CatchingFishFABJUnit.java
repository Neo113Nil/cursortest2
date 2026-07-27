package kotlin.text;

import java.util.Set;

/* loaded from: classes.dex */
public interface CatchingFishFABJUnit {
    CatchingFishLiveDataHandler CatchingFishCoroutine(CatchingFishFABDagger catchingFishFABDagger);

    CatchingFishFABWebSocket CatchingFishDaggerWebsocket(CatchingFishFABDagger catchingFishFABDagger);

    default Object CatchingFishParcelableFAB(Class cls) {
        return CatchingFishWorkManager(CatchingFishFABDagger.CatchingFishParcelableFAB(cls));
    }

    default CatchingFishLiveDataHandler CatchingFishReduxKtor(Class cls) {
        return CatchingFishViewModelFAB(CatchingFishFABDagger.CatchingFishParcelableFAB(cls));
    }

    default Set CatchingFishSnackbar(CatchingFishFABDagger catchingFishFABDagger) {
        return (Set) CatchingFishCoroutine(catchingFishFABDagger).get();
    }

    CatchingFishLiveDataHandler CatchingFishViewModelFAB(CatchingFishFABDagger catchingFishFABDagger);

    default CatchingFishFABWebSocket CatchingFishViewModelScope(Class cls) {
        return CatchingFishDaggerWebsocket(CatchingFishFABDagger.CatchingFishParcelableFAB(cls));
    }

    default Object CatchingFishWorkManager(CatchingFishFABDagger catchingFishFABDagger) {
        CatchingFishLiveDataHandler CatchingFishViewModelFAB = CatchingFishViewModelFAB(catchingFishFABDagger);
        if (CatchingFishViewModelFAB == null) {
            return null;
        }
        return CatchingFishViewModelFAB.get();
    }
}
