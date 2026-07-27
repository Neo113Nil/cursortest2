package kotlin.text;

import android.content.Intent;
import android.content.IntentSender;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishHiltViewPager implements Runnable {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager;

    public /* synthetic */ CatchingFishHiltViewPager(int i, int i2, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGoogleMapsGson catchingFishGoogleMapsGson = (CatchingFishGoogleMapsGson) this.CatchingFishDaggerWebsocket;
                Serializable serializable = (Serializable) ((CatchingFishServiceHilt) this.CatchingFishViewModelScope).CatchingFishDaggerWebsocket;
                String str = (String) catchingFishGoogleMapsGson.CatchingFishParcelableFAB.get(Integer.valueOf(this.CatchingFishWorkManager));
                if (str != null) {
                    CatchingFishGlide catchingFishGlide = (CatchingFishGlide) catchingFishGoogleMapsGson.CatchingFishDaggerWebsocket.get(str);
                    if ((catchingFishGlide != null ? catchingFishGlide.CatchingFishParcelableFAB : null) != null) {
                        CatchingFishBundleKtor catchingFishBundleKtor = catchingFishGlide.CatchingFishParcelableFAB;
                        if (catchingFishGoogleMapsGson.CatchingFishReduxKtor.remove(str)) {
                            catchingFishBundleKtor.CatchingFishParcelableFAB(serializable);
                            break;
                        }
                    } else {
                        catchingFishGoogleMapsGson.CatchingFishViewModelScope.remove(str);
                        catchingFishGoogleMapsGson.CatchingFishWorkManager.put(str, serializable);
                        break;
                    }
                }
                break;
            case 1:
                ((CatchingFishGoogleMapsGson) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB(this.CatchingFishWorkManager, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.CatchingFishViewModelScope));
                break;
            default:
                ((CatchingFishAndroidXMVVM) this.CatchingFishDaggerWebsocket).CatchingFishSnackbar.CatchingFishReduxKtor(this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                break;
        }
    }
}
