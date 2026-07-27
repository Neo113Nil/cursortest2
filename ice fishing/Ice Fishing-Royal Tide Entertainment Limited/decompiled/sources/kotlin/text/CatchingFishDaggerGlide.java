package kotlin.text;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishDaggerGlide extends CatchingFishFABRobolectric {
    public final /* synthetic */ CatchingFishCardViewGraphQL CatchingFishStateLiveData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishDaggerGlide(CatchingFishCardViewGraphQL catchingFishCardViewGraphQL, Context context) {
        super(context);
        this.CatchingFishStateLiveData = catchingFishCardViewGraphQL;
    }

    @Override // kotlin.text.CatchingFishFABRobolectric
    public final int CatchingFishDaggerWebsocket(int i) {
        return Math.min(100, super.CatchingFishDaggerWebsocket(i));
    }

    @Override // kotlin.text.CatchingFishFABRobolectric
    public final float CatchingFishReduxKtor(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // kotlin.text.CatchingFishFABRobolectric
    public final void CatchingFishViewModelFAB(View view, CatchingFishMVICardView catchingFishMVICardView) {
        CatchingFishCardViewGraphQL catchingFishCardViewGraphQL = this.CatchingFishStateLiveData;
        int[] CatchingFishParcelableFAB = catchingFishCardViewGraphQL.CatchingFishParcelableFAB(catchingFishCardViewGraphQL.CatchingFishParcelableFAB.getLayoutManager(), view);
        int i = CatchingFishParcelableFAB[0];
        int i2 = CatchingFishParcelableFAB[1];
        int ceil = (int) Math.ceil(CatchingFishDaggerWebsocket(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            catchingFishMVICardView.CatchingFishParcelableFAB = i;
            catchingFishMVICardView.CatchingFishSnackbar = i2;
            catchingFishMVICardView.CatchingFishCoroutine = ceil;
            catchingFishMVICardView.CatchingFishDaggerWebsocket = this.CatchingFishLayout;
            catchingFishMVICardView.CatchingFishWorkManager = true;
        }
    }
}
