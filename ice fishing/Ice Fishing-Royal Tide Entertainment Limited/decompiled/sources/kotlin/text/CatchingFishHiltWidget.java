package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishHiltWidget implements CatchingFishManifestJUnit {
    public static final CatchingFishHiltWidget CatchingFishSnackbar = new CatchingFishHiltWidget(0);
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishHiltWidget(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    @Override // kotlin.text.CatchingFishManifestJUnit
    public final CatchingFishSharedFlowMVP CatchingFishParcelableFAB(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, List list, long j) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int size = list.size();
                if (size == 0) {
                    return catchingFishWidgetXMLLayout.CatchingFishFirebase(CatchingFishGradleGraphQL.CatchingFishLayout(j), CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j), CatchingFishGradleRetrofit.CatchingFishViewModelScope);
                }
                if (size == 1) {
                    CatchingFishPicassoMVI CatchingFishSnackbar2 = ((CatchingFishWidgetDagger) list.get(0)).CatchingFishSnackbar(j);
                    return catchingFishWidgetXMLLayout.CatchingFishFirebase(CatchingFishAsyncTaskGradle.CatchingFishDaggerWebsocket(CatchingFishSnackbar2.CatchingFishReduxKtor, j), CatchingFishAsyncTaskGradle.CatchingFishReduxKtor(CatchingFishSnackbar2.CatchingFishDaggerWebsocket, j), new CatchingFishFABAppCompat(CatchingFishSnackbar2, 2));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    CatchingFishPicassoMVI CatchingFishSnackbar3 = ((CatchingFishWidgetDagger) list.get(i3)).CatchingFishSnackbar(j);
                    i = Math.max(CatchingFishSnackbar3.CatchingFishReduxKtor, i);
                    i2 = Math.max(CatchingFishSnackbar3.CatchingFishDaggerWebsocket, i2);
                    arrayList.add(CatchingFishSnackbar3);
                }
                return catchingFishWidgetXMLLayout.CatchingFishFirebase(CatchingFishAsyncTaskGradle.CatchingFishDaggerWebsocket(i, j), CatchingFishAsyncTaskGradle.CatchingFishReduxKtor(i2, j), new CatchingFishMVVM(17, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
