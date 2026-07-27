package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishParcelableJUnit implements CatchingFishReduxView {
    public final int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishToastSharedFlow CatchingFishSnackbar;

    public CatchingFishParcelableJUnit(CatchingFishToastSharedFlow catchingFishToastSharedFlow, int i) {
        this.CatchingFishSnackbar = catchingFishToastSharedFlow;
        this.CatchingFishParcelableFAB = i;
    }

    @Override // kotlin.text.CatchingFishReduxView
    public final boolean CatchingFishParcelableFAB(ArrayList arrayList, ArrayList arrayList2) {
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishSnackbar;
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishToastSharedFlow.CatchingFishSpannableWidget;
        int i = this.CatchingFishParcelableFAB;
        if (catchingFishGoogleMapsMoshi == null || i >= 0 || !catchingFishGoogleMapsMoshi.CatchingFishViewModelScope().CatchingFishHandler(-1, 0)) {
            return catchingFishToastSharedFlow.CatchingFishPayPalLiveData(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
