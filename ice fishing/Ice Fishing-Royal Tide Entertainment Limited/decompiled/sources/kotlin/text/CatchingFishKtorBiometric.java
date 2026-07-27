package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishKtorBiometric implements CatchingFishMockkView {
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishKtorBiometric(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj == null) {
                    return Integer.valueOf(((CatchingFishMVIParcelable) obj2).CatchingFishParcelableFAB);
                }
                throw new ClassCastException();
            case 1:
                if (obj != null) {
                    throw new ClassCastException();
                }
                CatchingFishDataStoreAdMob catchingFishDataStoreAdMob = (CatchingFishDataStoreAdMob) obj2;
                CatchingFishMVPViewHilt catchingFishMVPViewHilt = new CatchingFishMVPViewHilt(catchingFishDataStoreAdMob.CatchingFishParcelableFAB);
                CatchingFishViewModelIntent catchingFishViewModelIntent = CatchingFishParcelableFlux.CatchingFishParcelableFAB;
                return CatchingFishToastCustomView.CatchingFishGradleManifest(catchingFishMVPViewHilt, Boolean.valueOf(catchingFishDataStoreAdMob.CatchingFishSnackbar));
            case 2:
                CatchingFishPicassoContext catchingFishPicassoContext = (CatchingFishPicassoContext) obj2;
                if (!(catchingFishPicassoContext instanceof CatchingFishMVPKtor)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? catchingFishPicassoContext : Integer.valueOf(intValue + 1);
            case 3:
                CatchingFishMVPKtor catchingFishMVPKtor = (CatchingFishMVPKtor) obj;
                CatchingFishPicassoContext catchingFishPicassoContext2 = (CatchingFishPicassoContext) obj2;
                if (catchingFishMVPKtor != null) {
                    return catchingFishMVPKtor;
                }
                if (catchingFishPicassoContext2 instanceof CatchingFishMVPKtor) {
                    return (CatchingFishMVPKtor) catchingFishPicassoContext2;
                }
                return null;
            default:
                return (CatchingFishMockkIntent) obj;
        }
    }
}
