package kotlin.text;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CatchingFishBundleManifest extends CatchingFishFABGoogleMaps {
    public final /* synthetic */ com.google.android.material.datepicker.CatchingFishUnitTestingGson CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishRetrofitRealm CatchingFishSnackbar;

    public CatchingFishBundleManifest(CatchingFishRetrofitRealm catchingFishRetrofitRealm, com.google.android.material.datepicker.CatchingFishUnitTestingGson catchingFishUnitTestingGson) {
        this.CatchingFishSnackbar = catchingFishRetrofitRealm;
        this.CatchingFishParcelableFAB = catchingFishUnitTestingGson;
    }

    @Override // kotlin.text.CatchingFishFABGoogleMaps
    public final void CatchingFishSnackbar(RecyclerView recyclerView, int i, int i2) {
        int CatchingFishMaterialDesign;
        CatchingFishCardViewOkHttp catchingFishCardViewOkHttp = this.CatchingFishParcelableFAB.CatchingFishReduxKtor;
        CatchingFishRetrofitRealm catchingFishRetrofitRealm = this.CatchingFishSnackbar;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) catchingFishRetrofitRealm.CatchingFishRedux.getLayoutManager();
            View CatchingFishLifecycleHilt = linearLayoutManager.CatchingFishLifecycleHilt(0, linearLayoutManager.CatchingFishDaggerHiltFAB(), false);
            CatchingFishMaterialDesign = CatchingFishLifecycleHilt == null ? -1 : CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishLifecycleHilt);
        } else {
            CatchingFishMaterialDesign = ((LinearLayoutManager) catchingFishRetrofitRealm.CatchingFishRedux.getLayoutManager()).CatchingFishMaterialDesign();
        }
        Calendar CatchingFishParcelableFAB = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(catchingFishCardViewOkHttp.CatchingFishReduxKtor.CatchingFishReduxKtor);
        CatchingFishParcelableFAB.add(2, CatchingFishMaterialDesign);
        CatchingFishLiveDataMVI catchingFishLiveDataMVI = new CatchingFishLiveDataMVI(CatchingFishParcelableFAB);
        catchingFishRetrofitRealm.CatchingFishStripeAPI = catchingFishLiveDataMVI;
        MaterialButton materialButton = catchingFishRetrofitRealm.CatchingFishPicasso;
        Calendar CatchingFishParcelableFAB2 = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(catchingFishCardViewOkHttp.CatchingFishReduxKtor.CatchingFishReduxKtor);
        CatchingFishParcelableFAB2.add(2, CatchingFishMaterialDesign);
        CatchingFishParcelableFAB2.set(5, 1);
        Calendar CatchingFishParcelableFAB3 = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(CatchingFishParcelableFAB2);
        CatchingFishParcelableFAB3.get(2);
        CatchingFishParcelableFAB3.get(1);
        CatchingFishParcelableFAB3.getMaximum(7);
        CatchingFishParcelableFAB3.getActualMaximum(5);
        CatchingFishParcelableFAB3.getTimeInMillis();
        long timeInMillis = CatchingFishParcelableFAB3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        catchingFishRetrofitRealm.CatchingFishPayPalService(catchingFishCardViewOkHttp.CatchingFishReduxKtor.CatchingFishReduxKtor(catchingFishLiveDataMVI));
    }
}
