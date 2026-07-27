package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishViewExoPlayer implements CatchingFishManifestJUnit {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public static final CatchingFishViewExoPlayer CatchingFishSnackbar = new CatchingFishViewExoPlayer(0);
    public static final CatchingFishViewExoPlayer CatchingFishCoroutine = new CatchingFishViewExoPlayer(1);

    public /* synthetic */ CatchingFishViewExoPlayer(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    @Override // kotlin.text.CatchingFishManifestJUnit
    public final CatchingFishSharedFlowMVP CatchingFishParcelableFAB(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, List list, long j) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return catchingFishWidgetXMLLayout.CatchingFishFirebase(CatchingFishGradleGraphQL.CatchingFishLayout(j), CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j), CatchingFishMVI.CatchingFishDaggerHiltFAB);
            default:
                return catchingFishWidgetXMLLayout.CatchingFishFirebase(CatchingFishGradleGraphQL.CatchingFishDaggerWebsocket(j) ? CatchingFishGradleGraphQL.CatchingFishViewModelScope(j) : 0, CatchingFishGradleGraphQL.CatchingFishReduxKtor(j) ? CatchingFishGradleGraphQL.CatchingFishWorkManager(j) : 0, CatchingFishGradleRetrofit.CatchingFishFragmentHandler);
        }
    }
}
