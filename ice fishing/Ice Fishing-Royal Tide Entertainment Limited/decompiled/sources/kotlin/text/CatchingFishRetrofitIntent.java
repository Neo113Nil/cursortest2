package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitIntent extends CatchingFishBiometricMVP {
    public static final CatchingFishRetrofitIntent CatchingFishCoroutine = new CatchingFishRetrofitIntent(0, 2, 1);

    @Override // kotlin.text.CatchingFishBiometricMVP
    public final void CatchingFishParcelableFAB(CatchingFishWidgetFAB catchingFishWidgetFAB, CatchingFishViewFlux catchingFishViewFlux, CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP, CatchingFishExoPlayerBundle catchingFishExoPlayerBundle, CatchingFishViewRobolectric catchingFishViewRobolectric) {
        int i = ((CatchingFishGraphQLOkHttp) catchingFishWidgetFAB.CatchingFishDaggerWebsocket(0)).CatchingFishParcelableFAB;
        List list = (List) catchingFishWidgetFAB.CatchingFishDaggerWebsocket(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            catchingFishViewFlux.CatchingFishSnackbar(i3, obj);
            catchingFishViewFlux.CatchingFishViewModelScope(i3, obj);
        }
    }
}
