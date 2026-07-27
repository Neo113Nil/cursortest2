package kotlin.text;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class CatchingFishViewService implements View.OnClickListener {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishViewService(CatchingFishRetrofitRealm catchingFishRetrofitRealm, com.google.android.material.datepicker.CatchingFishUnitTestingGson catchingFishUnitTestingGson, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = catchingFishRetrofitRealm;
        this.CatchingFishDaggerWebsocket = catchingFishUnitTestingGson;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishRetrofitRealm catchingFishRetrofitRealm = (CatchingFishRetrofitRealm) this.CatchingFishWorkManager;
                int CatchingFishMaterialDesign = ((LinearLayoutManager) catchingFishRetrofitRealm.CatchingFishRedux.getLayoutManager()).CatchingFishMaterialDesign();
                Calendar CatchingFishParcelableFAB = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(((com.google.android.material.datepicker.CatchingFishUnitTestingGson) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishReduxKtor);
                CatchingFishParcelableFAB.add(2, CatchingFishMaterialDesign - 1);
                catchingFishRetrofitRealm.CatchingFishMutableLiveData(new CatchingFishLiveDataMVI(CatchingFishParcelableFAB));
                break;
            case 1:
                CatchingFishRetrofitRealm catchingFishRetrofitRealm2 = (CatchingFishRetrofitRealm) this.CatchingFishWorkManager;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) catchingFishRetrofitRealm2.CatchingFishRedux.getLayoutManager();
                View CatchingFishLifecycleHilt = linearLayoutManager.CatchingFishLifecycleHilt(0, linearLayoutManager.CatchingFishDaggerHiltFAB(), false);
                int CatchingFishPayPalService = CatchingFishLifecycleHilt == null ? -1 : CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishLifecycleHilt);
                Calendar CatchingFishParcelableFAB2 = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(((com.google.android.material.datepicker.CatchingFishUnitTestingGson) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishReduxKtor);
                CatchingFishParcelableFAB2.add(2, CatchingFishPayPalService + 1);
                catchingFishRetrofitRealm2.CatchingFishMutableLiveData(new CatchingFishLiveDataMVI(CatchingFishParcelableFAB2));
                break;
            default:
                CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) this.CatchingFishWorkManager;
                Window.Callback callback = catchingFishMVVMAsyncTask.CatchingFishCloudMessaging;
                if (callback != null && catchingFishMVVMAsyncTask.CatchingFishEspressoTesting) {
                    callback.onMenuItemSelected(0, (CatchingFishWidgetAnimation) this.CatchingFishDaggerWebsocket);
                    break;
                }
                break;
        }
    }

    public CatchingFishViewService(CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask) {
        this.CatchingFishReduxKtor = 2;
        this.CatchingFishWorkManager = catchingFishMVVMAsyncTask;
        Context context = catchingFishMVVMAsyncTask.CatchingFishParcelableFAB.getContext();
        CharSequence charSequence = catchingFishMVVMAsyncTask.CatchingFishViewModelFAB;
        CatchingFishWidgetAnimation catchingFishWidgetAnimation = new CatchingFishWidgetAnimation();
        catchingFishWidgetAnimation.CatchingFishDaggerWebsocket = 4096;
        catchingFishWidgetAnimation.CatchingFishViewModelScope = 4096;
        catchingFishWidgetAnimation.CatchingFishEspressoTesting = null;
        catchingFishWidgetAnimation.CatchingFishOkHttp = null;
        catchingFishWidgetAnimation.CatchingFishUnitTesting = false;
        catchingFishWidgetAnimation.CatchingFishAnimationMockk = false;
        catchingFishWidgetAnimation.CatchingFishStateLiveData = 16;
        catchingFishWidgetAnimation.CatchingFishLayout = context;
        catchingFishWidgetAnimation.CatchingFishParcelableFAB = charSequence;
        this.CatchingFishDaggerWebsocket = catchingFishWidgetAnimation;
    }
}
