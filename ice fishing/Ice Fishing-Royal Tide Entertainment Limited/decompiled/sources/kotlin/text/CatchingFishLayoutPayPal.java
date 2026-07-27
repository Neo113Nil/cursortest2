package kotlin.text;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishLayoutPayPal extends ViewOutlineProvider {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(view instanceof CatchingFishMVPFluxHilt) || (outline2 = ((CatchingFishMVPFluxHilt) view).CatchingFishViewModelFAB) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(view);
                throw null;
        }
    }
}
