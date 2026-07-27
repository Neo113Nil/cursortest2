package kotlin.text;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class CatchingFishFluxRobolectric extends DataSetObserver {
    public final /* synthetic */ CatchingFishAndroidXService CatchingFishParcelableFAB;

    public CatchingFishFluxRobolectric(CatchingFishAndroidXService catchingFishAndroidXService) {
        this.CatchingFishParcelableFAB = catchingFishAndroidXService;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        CatchingFishAndroidXService catchingFishAndroidXService = this.CatchingFishParcelableFAB;
        if (catchingFishAndroidXService.CatchingFishMVPRobolectric.isShowing()) {
            catchingFishAndroidXService.CatchingFishReduxKtor();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.CatchingFishParcelableFAB.dismiss();
    }
}
