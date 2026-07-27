package kotlin.text;

import com.adjust.sdk.Constants;

/* loaded from: classes.dex */
public final class CatchingFishFragmentToolbar implements Comparable {
    public static final CatchingFishFragmentToolbar CatchingFishDaggerWebsocket;
    public static final CatchingFishFragmentToolbar CatchingFishViewModelScope;
    public static final CatchingFishFragmentToolbar CatchingFishWorkManager;
    public final int CatchingFishReduxKtor;

    static {
        CatchingFishFragmentToolbar catchingFishFragmentToolbar = new CatchingFishFragmentToolbar(100);
        CatchingFishFragmentToolbar catchingFishFragmentToolbar2 = new CatchingFishFragmentToolbar(200);
        CatchingFishFragmentToolbar catchingFishFragmentToolbar3 = new CatchingFishFragmentToolbar(300);
        CatchingFishFragmentToolbar catchingFishFragmentToolbar4 = new CatchingFishFragmentToolbar(Constants.MINIMAL_ERROR_STATUS_CODE);
        CatchingFishFragmentToolbar catchingFishFragmentToolbar5 = new CatchingFishFragmentToolbar(500);
        CatchingFishFragmentToolbar catchingFishFragmentToolbar6 = new CatchingFishFragmentToolbar(600);
        CatchingFishDaggerWebsocket = catchingFishFragmentToolbar6;
        CatchingFishFragmentToolbar catchingFishFragmentToolbar7 = new CatchingFishFragmentToolbar(700);
        CatchingFishFragmentToolbar catchingFishFragmentToolbar8 = new CatchingFishFragmentToolbar(800);
        CatchingFishFragmentToolbar catchingFishFragmentToolbar9 = new CatchingFishFragmentToolbar(900);
        CatchingFishWorkManager = catchingFishFragmentToolbar4;
        CatchingFishViewModelScope = catchingFishFragmentToolbar5;
        CatchingFishToastCustomView.CatchingFishLayoutInflater(catchingFishFragmentToolbar, catchingFishFragmentToolbar2, catchingFishFragmentToolbar3, catchingFishFragmentToolbar4, catchingFishFragmentToolbar5, catchingFishFragmentToolbar6, catchingFishFragmentToolbar7, catchingFishFragmentToolbar8, catchingFishFragmentToolbar9);
    }

    public CatchingFishFragmentToolbar(int i) {
        this.CatchingFishReduxKtor = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        CatchingFishReduxAsyncTask.CatchingFishParcelableFAB("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return CatchingFishFirebaseDagger.CatchingFishJetpackCompose(this.CatchingFishReduxKtor, ((CatchingFishFragmentToolbar) obj).CatchingFishReduxKtor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishFragmentToolbar) {
            return this.CatchingFishReduxKtor == ((CatchingFishFragmentToolbar) obj).CatchingFishReduxKtor;
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishReduxKtor;
    }

    public final String toString() {
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(new StringBuilder("FontWeight(weight="), this.CatchingFishReduxKtor, ')');
    }
}
