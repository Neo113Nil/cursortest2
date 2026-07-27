package kotlin.text;

import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishGsonJUnitRoom extends CatchingFishRobolectricHilt {
    public final /* synthetic */ CatchingFishGoogleMapsMoshi CatchingFishJetpackCompose;

    public CatchingFishGsonJUnitRoom(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        this.CatchingFishJetpackCompose = catchingFishGoogleMapsMoshi;
    }

    @Override // kotlin.text.CatchingFishRobolectricHilt
    public final boolean CatchingFishDagger() {
        return this.CatchingFishJetpackCompose.CatchingFishPayPalService != null;
    }

    @Override // kotlin.text.CatchingFishRobolectricHilt
    public final View CatchingFishEspressoMockk(int i) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishJetpackCompose;
        View view = catchingFishGoogleMapsMoshi.CatchingFishPayPalService;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + catchingFishGoogleMapsMoshi + " does not have a view");
    }
}
