package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataRealm implements CatchingFishMockkView {
    public final /* synthetic */ int CatchingFishReduxKtor;
    public static final CatchingFishLiveDataRealm CatchingFishDaggerWebsocket = new CatchingFishLiveDataRealm(0);
    public static final CatchingFishLiveDataRealm CatchingFishWorkManager = new CatchingFishLiveDataRealm(1);
    public static final CatchingFishLiveDataRealm CatchingFishViewModelScope = new CatchingFishLiveDataRealm(2);

    public /* synthetic */ CatchingFishLiveDataRealm(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = (CatchingFishSharedFlowMVI) obj;
                int intValue = ((Number) obj2).intValue();
                if (!catchingFishSharedFlowMVI.CatchingFishDagger(intValue & 1, (intValue & 3) != 2)) {
                    catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI2 = (CatchingFishSharedFlowMVI) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!catchingFishSharedFlowMVI2.CatchingFishDagger(intValue2 & 1, (intValue2 & 3) != 2)) {
                    catchingFishSharedFlowMVI2.CatchingFishPayPalLiveData();
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                long j = ((CatchingFishToastFragment) obj2).CatchingFishParcelableFAB;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(CatchingFishFirebaseDagger.CatchingFishStateFlow(j));
        }
    }
}
