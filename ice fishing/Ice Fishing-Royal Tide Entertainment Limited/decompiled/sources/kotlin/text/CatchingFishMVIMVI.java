package kotlin.text;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishMVIMVI extends CatchingFishViewWebsocket implements CatchingFishMockkView {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishMockkView CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishRetrofitRoom CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishMVIMVI(CatchingFishRetrofitRoom catchingFishRetrofitRoom, CatchingFishMockkView catchingFishMockkView, int i) {
        super(2);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishRetrofitRoom;
        this.CatchingFishViewModelScope = catchingFishMockkView;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = (CatchingFishSharedFlowMVI) obj;
                int intValue = ((Number) obj2).intValue();
                if (catchingFishSharedFlowMVI.CatchingFishDagger(intValue & 1, (intValue & 3) != 2)) {
                    CatchingFishFABExoPlayer.CatchingFishParcelableFAB(this.CatchingFishWorkManager.CatchingFishReduxKtor, this.CatchingFishViewModelScope, catchingFishSharedFlowMVI, 0);
                } else {
                    catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
                }
                break;
            default:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI2 = (CatchingFishSharedFlowMVI) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (catchingFishSharedFlowMVI2.CatchingFishDagger(intValue2 & 1, (intValue2 & 3) != 2)) {
                    CatchingFishRetrofitRoom catchingFishRetrofitRoom = this.CatchingFishWorkManager;
                    CatchingFishGradleCameraX catchingFishGradleCameraX = catchingFishRetrofitRoom.CatchingFishReduxKtor;
                    Object tag = catchingFishGradleCameraX.getTag(R.id.inspection_slot_table_set);
                    Set set = (!(tag instanceof Set) || ((tag instanceof CatchingFishCardViewFAB) && !(tag instanceof CatchingFishContextMVP))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = catchingFishGradleCameraX.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof CatchingFishCardViewFAB) && !(tag2 instanceof CatchingFishContextMVP))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        CatchingFishReduxFragment catchingFishReduxFragment = catchingFishSharedFlowMVI2.CatchingFishRecyclerView;
                        if (catchingFishReduxFragment == null) {
                            catchingFishReduxFragment = new CatchingFishReduxFragment(catchingFishSharedFlowMVI2.CatchingFishViewModelScope);
                            catchingFishSharedFlowMVI2.CatchingFishRecyclerView = catchingFishReduxFragment;
                        }
                        set.add(catchingFishReduxFragment);
                        catchingFishSharedFlowMVI2.CatchingFishStateLiveData = true;
                        catchingFishSharedFlowMVI2.CatchingFishCardViewView = true;
                        catchingFishSharedFlowMVI2.CatchingFishCoroutine.CatchingFishSnackbar();
                        catchingFishSharedFlowMVI2.CatchingFishJobScheduler.CatchingFishSnackbar();
                        CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP = catchingFishSharedFlowMVI2.CatchingFishPayPalService;
                        CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom = catchingFishGoogleMapsMVP.CatchingFishParcelableFAB;
                        catchingFishGoogleMapsMVP.CatchingFishDaggerWebsocket = catchingFishMVVMMVIRoom.CatchingFishOkHttp;
                        catchingFishGoogleMapsMVP.CatchingFishWorkManager = catchingFishMVVMMVIRoom.CatchingFishUnitTesting;
                    }
                    boolean CatchingFishViewModelScope = catchingFishSharedFlowMVI2.CatchingFishViewModelScope(catchingFishRetrofitRoom);
                    Object CatchingFishPayPalService = catchingFishSharedFlowMVI2.CatchingFishPayPalService();
                    CatchingFishGradleMVVM catchingFishGradleMVVM = CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
                    if (CatchingFishViewModelScope || CatchingFishPayPalService == catchingFishGradleMVVM) {
                        CatchingFishPayPalService = new CatchingFishServiceMVVMView(catchingFishRetrofitRoom, null);
                        catchingFishSharedFlowMVI2.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
                    }
                    CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket(catchingFishGradleCameraX, catchingFishSharedFlowMVI2, (CatchingFishMockkView) CatchingFishPayPalService);
                    boolean CatchingFishViewModelScope2 = catchingFishSharedFlowMVI2.CatchingFishViewModelScope(catchingFishRetrofitRoom);
                    Object CatchingFishPayPalService2 = catchingFishSharedFlowMVI2.CatchingFishPayPalService();
                    if (CatchingFishViewModelScope2 || CatchingFishPayPalService2 == catchingFishGradleMVVM) {
                        CatchingFishPayPalService2 = new CatchingFishMVVMJUnit(catchingFishRetrofitRoom, null);
                        catchingFishSharedFlowMVI2.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService2);
                    }
                    CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket(catchingFishGradleCameraX, catchingFishSharedFlowMVI2, (CatchingFishMockkView) CatchingFishPayPalService2);
                    CatchingFishAdMobFAB.CatchingFishSnackbar(CatchingFishDaggerIntent.CatchingFishParcelableFAB.CatchingFishParcelableFAB(set), CatchingFishBiometricBundle.CatchingFishMutableLiveData(-280240369, new CatchingFishMVIMVI(catchingFishRetrofitRoom, this.CatchingFishViewModelScope, 0), catchingFishSharedFlowMVI2), catchingFishSharedFlowMVI2, 56);
                } else {
                    catchingFishSharedFlowMVI2.CatchingFishPayPalLiveData();
                }
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
