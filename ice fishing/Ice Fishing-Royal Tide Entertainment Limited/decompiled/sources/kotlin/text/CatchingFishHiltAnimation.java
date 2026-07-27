package kotlin.text;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class CatchingFishHiltAnimation extends CatchingFishFABGoogleMaps {
    public final /* synthetic */ CatchingFishGsonNavigation CatchingFishParcelableFAB;

    public CatchingFishHiltAnimation(CatchingFishGsonNavigation catchingFishGsonNavigation) {
        this.CatchingFishParcelableFAB = catchingFishGsonNavigation;
    }

    @Override // kotlin.text.CatchingFishFABGoogleMaps
    public final void CatchingFishSnackbar(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        CatchingFishGsonNavigation catchingFishGsonNavigation = this.CatchingFishParcelableFAB;
        int i3 = catchingFishGsonNavigation.CatchingFishParcelableFAB;
        int computeVerticalScrollRange = catchingFishGsonNavigation.CatchingFish.computeVerticalScrollRange();
        int i4 = catchingFishGsonNavigation.CatchingFishNavigation;
        catchingFishGsonNavigation.CatchingFishJetpackCompose = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int computeHorizontalScrollRange = catchingFishGsonNavigation.CatchingFish.computeHorizontalScrollRange();
        int i5 = catchingFishGsonNavigation.CatchingFishRoomDatabase;
        boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        catchingFishGsonNavigation.CatchingFishCoroutineFlow = z;
        boolean z2 = catchingFishGsonNavigation.CatchingFishJetpackCompose;
        if (!z2 && !z) {
            if (catchingFishGsonNavigation.CatchingFishDaggerHiltFAB != 0) {
                catchingFishGsonNavigation.CatchingFishWorkManager(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            catchingFishGsonNavigation.CatchingFishEspressoTesting = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            catchingFishGsonNavigation.CatchingFishCloudMessaging = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (catchingFishGsonNavigation.CatchingFishCoroutineFlow) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            catchingFishGsonNavigation.CatchingFishAnimationMockk = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            catchingFishGsonNavigation.CatchingFishUnitTesting = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = catchingFishGsonNavigation.CatchingFishDaggerHiltFAB;
        if (i6 == 0 || i6 == 1) {
            catchingFishGsonNavigation.CatchingFishWorkManager(1);
        }
    }
}
