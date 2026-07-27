package kotlin.text;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class CatchingFishMVVMEspresso extends CatchingFishFABGoogleMaps {
    public boolean CatchingFishParcelableFAB = false;
    public final /* synthetic */ CatchingFishCardViewGraphQL CatchingFishSnackbar;

    public CatchingFishMVVMEspresso(CatchingFishCardViewGraphQL catchingFishCardViewGraphQL) {
        this.CatchingFishSnackbar = catchingFishCardViewGraphQL;
    }

    @Override // kotlin.text.CatchingFishFABGoogleMaps
    public final void CatchingFishParcelableFAB(int i) {
        if (i == 0 && this.CatchingFishParcelableFAB) {
            this.CatchingFishParcelableFAB = false;
            this.CatchingFishSnackbar.CatchingFishWorkManager();
        }
    }

    @Override // kotlin.text.CatchingFishFABGoogleMaps
    public final void CatchingFishSnackbar(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.CatchingFishParcelableFAB = true;
    }
}
