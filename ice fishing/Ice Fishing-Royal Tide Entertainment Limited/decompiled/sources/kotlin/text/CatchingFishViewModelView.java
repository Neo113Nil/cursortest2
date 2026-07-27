package kotlin.text;

import android.content.Context;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.adjust.sdk.OnIsEnabledListener;
import com.adjust.sdk.OnSdkVersionReadListener;
import com.adjust.sdk.Util;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishViewModelView extends AsyncTaskExecutor {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishViewModelView(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        String googleAdId;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Util.getSdkVersion();
            case 1:
                return Boolean.valueOf(Util.isEnabledFromActivityStateFile(((Context[]) objArr)[0]));
            default:
                ILogger logger = AdjustFactory.getLogger();
                googleAdId = Util.getGoogleAdId(((Context[]) objArr)[0]);
                logger.debug("GoogleAdId read " + googleAdId, new Object[0]);
                return googleAdId;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((OnSdkVersionReadListener) this.CatchingFishSnackbar).onSdkVersionRead((String) obj);
                break;
            case 1:
                ((OnIsEnabledListener) this.CatchingFishSnackbar).onIsEnabledRead(((Boolean) obj).booleanValue());
                break;
            default:
                String str = (String) obj;
                OnGoogleAdIdReadListener onGoogleAdIdReadListener = (OnGoogleAdIdReadListener) this.CatchingFishSnackbar;
                if (onGoogleAdIdReadListener != null) {
                    onGoogleAdIdReadListener.onGoogleAdIdRead(str);
                    break;
                }
                break;
        }
    }
}
