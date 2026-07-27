package kotlin.text;

import android.animation.ValueAnimator;
import android.view.View;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.InstallReferrerReadListener;
import com.adjust.sdk.Util;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class CatchingFishMVPSharedFlow implements Runnable {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishViewModelFAB;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishMVPSharedFlow(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishViewModelFAB = obj;
        this.CatchingFishDaggerWebsocket = obj2;
        this.CatchingFishWorkManager = obj3;
        this.CatchingFishViewModelScope = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InstallReferrerReadListener installReferrerReadListener;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSpannableMockk catchingFishSpannableMockk = (CatchingFishSpannableMockk) ((CatchingFishServiceHilt) this.CatchingFishViewModelFAB).CatchingFishDaggerWebsocket;
                CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) this.CatchingFishWorkManager;
                CatchingFishMockkRetrofit catchingFishMockkRetrofit = (CatchingFishMockkRetrofit) this.CatchingFishDaggerWebsocket;
                if (catchingFishMockkRetrofit != null) {
                    catchingFishSpannableMockk.CatchingFishMVPRobolectric = true;
                    catchingFishMockkRetrofit.CatchingFishSnackbar.CatchingFishCoroutine(false);
                    catchingFishSpannableMockk.CatchingFishMVPRobolectric = false;
                }
                if (catchingFishKtorAdMob.isEnabled() && catchingFishKtorAdMob.hasSubMenu()) {
                    ((CatchingFishSharedFlowAdMob) this.CatchingFishViewModelScope).CatchingFishRoomDatabase(catchingFishKtorAdMob, null, 4);
                    break;
                }
                break;
            case 1:
                InstallReferrer installReferrer = (InstallReferrer) this.CatchingFishViewModelFAB;
                try {
                    installReferrer.invokeI(this.CatchingFishDaggerWebsocket, (Method) this.CatchingFishWorkManager, (Object[]) this.CatchingFishViewModelScope);
                    break;
                } catch (Throwable th) {
                    installReferrerReadListener = installReferrer.referrerCallback;
                    installReferrerReadListener.onFail(Util.formatString("invoke error (%s) thrown by (%s)", th.getMessage(), th.getClass().getCanonicalName()));
                    return;
                }
            default:
                CatchingFishAdMobCameraXFAB.CatchingFishLayout((View) this.CatchingFishDaggerWebsocket, (CatchingFishGoogleMapsJUnit) this.CatchingFishWorkManager, (CatchingFishViewModelIntent) this.CatchingFishViewModelScope);
                ((ValueAnimator) this.CatchingFishViewModelFAB).start();
                break;
        }
    }

    public CatchingFishMVPSharedFlow(View view, CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit, CatchingFishViewModelIntent catchingFishViewModelIntent, ValueAnimator valueAnimator) {
        this.CatchingFishReduxKtor = 2;
        this.CatchingFishDaggerWebsocket = view;
        this.CatchingFishWorkManager = catchingFishGoogleMapsJUnit;
        this.CatchingFishViewModelScope = catchingFishViewModelIntent;
        this.CatchingFishViewModelFAB = valueAnimator;
    }
}
