package android.content.Context;

import android.content.Context;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.adjust.sdk.OnIsEnabledListener;
import com.adjust.sdk.OnSdkVersionReadListener;
import com.adjust.sdk.Util;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterProGuardEpicShadow8615 extends AsyncTaskExecutor {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ Object FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterProGuardEpicShadow8615(int i, Object obj) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        String googleAdId;
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
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
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((OnSdkVersionReadListener) obj2).onSdkVersionRead((String) obj);
                break;
            case 1:
                ((OnIsEnabledListener) obj2).onIsEnabledRead(((Boolean) obj).booleanValue());
                break;
            default:
                String str = (String) obj;
                OnGoogleAdIdReadListener onGoogleAdIdReadListener = (OnGoogleAdIdReadListener) obj2;
                if (onGoogleAdIdReadListener != null) {
                    onGoogleAdIdReadListener.onGoogleAdIdRead(str);
                    break;
                }
                break;
        }
    }
}
