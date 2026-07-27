package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishSpannableGradle implements CatchingFishMockkView, CatchingFishDaggerStateFlow, Serializable {
    public final Class CatchingFishDaggerWebsocket;
    public final int CatchingFishLayout;
    public final Object CatchingFishReduxKtor;
    public final String CatchingFishViewModelScope;
    public final String CatchingFishWorkManager;
    public final boolean CatchingFishViewModelFAB = false;
    public final int CatchingFishFragmentHandler = 4;

    public CatchingFishSpannableGradle(int i, Class cls, Object obj, String str, String str2) {
        this.CatchingFishReduxKtor = obj;
        this.CatchingFishDaggerWebsocket = cls;
        this.CatchingFishWorkManager = str;
        this.CatchingFishViewModelScope = str2;
        this.CatchingFishLayout = i;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        ((CatchingFishLifecycleRedux) this.CatchingFishReduxKtor).CatchingFishWorkManager(intValue, (CatchingFishSharedFlowMVI) obj);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishDaggerStateFlow
    public final int CatchingFishSnackbar() {
        return this.CatchingFishLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishSpannableGradle)) {
            return false;
        }
        CatchingFishSpannableGradle catchingFishSpannableGradle = (CatchingFishSpannableGradle) obj;
        return this.CatchingFishViewModelFAB == catchingFishSpannableGradle.CatchingFishViewModelFAB && this.CatchingFishLayout == catchingFishSpannableGradle.CatchingFishLayout && this.CatchingFishFragmentHandler == catchingFishSpannableGradle.CatchingFishFragmentHandler && this.CatchingFishReduxKtor.equals(catchingFishSpannableGradle.CatchingFishReduxKtor) && this.CatchingFishDaggerWebsocket.equals(catchingFishSpannableGradle.CatchingFishDaggerWebsocket) && this.CatchingFishWorkManager.equals(catchingFishSpannableGradle.CatchingFishWorkManager) && this.CatchingFishViewModelScope.equals(catchingFishSpannableGradle.CatchingFishViewModelScope);
    }

    public final int hashCode() {
        return ((((((this.CatchingFishViewModelScope.hashCode() + ((this.CatchingFishWorkManager.hashCode() + ((this.CatchingFishDaggerWebsocket.hashCode() + (this.CatchingFishReduxKtor.hashCode() * 31)) * 31)) * 31)) * 31) + (this.CatchingFishViewModelFAB ? 1231 : 1237)) * 31) + this.CatchingFishLayout) * 31) + this.CatchingFishFragmentHandler;
    }

    public final String toString() {
        CatchingFishContextFlux.CatchingFishParcelableFAB.getClass();
        return CatchingFishAsyncTaskBundle.CatchingFishParcelableFAB(this);
    }
}
