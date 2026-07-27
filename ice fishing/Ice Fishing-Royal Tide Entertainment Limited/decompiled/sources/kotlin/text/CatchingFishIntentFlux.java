package kotlin.text;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishIntentFlux implements IBinder.DeathRecipient {
    public final /* synthetic */ Object CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishReduxWebSocket CatchingFishSnackbar;

    public /* synthetic */ CatchingFishIntentFlux(CatchingFishReduxWebSocket catchingFishReduxWebSocket, Object obj, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = catchingFishReduxWebSocket;
        this.CatchingFishCoroutine = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishReduxWebSocket catchingFishReduxWebSocket = this.CatchingFishSnackbar;
                CatchingFishToastExoPlayer catchingFishToastExoPlayer = (CatchingFishToastExoPlayer) this.CatchingFishCoroutine;
                CustomTabsService customTabsService = catchingFishReduxWebSocket.CatchingFishEspressoTesting;
                customTabsService.getClass();
                try {
                    synchronized (customTabsService.CatchingFishReduxKtor) {
                        try {
                            CatchingFishMVILifecycle catchingFishMVILifecycle = catchingFishToastExoPlayer.CatchingFishParcelableFAB;
                            IBinder asBinder = catchingFishMVILifecycle == null ? null : catchingFishMVILifecycle.asBinder();
                            if (asBinder == null) {
                                return;
                            }
                            asBinder.unlinkToDeath((IBinder.DeathRecipient) customTabsService.CatchingFishReduxKtor.get(asBinder), 0);
                            customTabsService.CatchingFishReduxKtor.remove(asBinder);
                            return;
                        } finally {
                        }
                    }
                } catch (NoSuchElementException unused) {
                    return;
                }
            default:
                CatchingFishReduxWebSocket catchingFishReduxWebSocket2 = this.CatchingFishSnackbar;
                CatchingFishParcelableGlide catchingFishParcelableGlide = (CatchingFishParcelableGlide) this.CatchingFishCoroutine;
                CustomTabsService customTabsService2 = catchingFishReduxWebSocket2.CatchingFishEspressoTesting;
                customTabsService2.getClass();
                try {
                    synchronized (customTabsService2.CatchingFishReduxKtor) {
                        try {
                            CatchingFishCoroutinePayPal catchingFishCoroutinePayPal = catchingFishParcelableGlide.CatchingFishParcelableFAB;
                            IBinder iBinder = catchingFishCoroutinePayPal == null ? null : ((CatchingFishMockkDagger) catchingFishCoroutinePayPal).CatchingFishEspressoTesting;
                            if (iBinder == null) {
                                return;
                            }
                            iBinder.unlinkToDeath((IBinder.DeathRecipient) customTabsService2.CatchingFishReduxKtor.get(iBinder), 0);
                            customTabsService2.CatchingFishReduxKtor.remove(iBinder);
                            return;
                        } finally {
                        }
                    }
                } catch (NoSuchElementException unused2) {
                    return;
                }
        }
    }
}
