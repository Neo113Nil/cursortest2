package kotlin.text;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishToolbarRetrofit implements Handler.Callback {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishToolbarRetrofit(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (message.what != 0) {
                    return false;
                }
                CatchingFishFABFlux catchingFishFABFlux = (CatchingFishFABFlux) this.CatchingFishSnackbar;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (catchingFishFABFlux.CatchingFishReduxKtor) {
                    throw null;
                }
            case 1:
                int i = message.arg1;
                CatchingFishMVPGsonMockk catchingFishMVPGsonMockk = (CatchingFishMVPGsonMockk) this.CatchingFishSnackbar;
                synchronized (catchingFishMVPGsonMockk) {
                    try {
                        CatchingFishFluxKtor catchingFishFluxKtor = (CatchingFishFluxKtor) catchingFishMVPGsonMockk.CatchingFishDaggerWebsocket.get(i);
                        if (catchingFishFluxKtor == null) {
                            return true;
                        }
                        catchingFishMVPGsonMockk.CatchingFishDaggerWebsocket.remove(i);
                        catchingFishMVPGsonMockk.CatchingFishCoroutine();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            catchingFishFluxKtor.CatchingFishSnackbar(new CatchingFishSnackbarIntent("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (catchingFishFluxKtor.CatchingFishDaggerWebsocket) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                if (!data.getBoolean("ack", false)) {
                                    catchingFishFluxKtor.CatchingFishSnackbar(new CatchingFishSnackbarIntent("Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    catchingFishFluxKtor.toString();
                                }
                                catchingFishFluxKtor.CatchingFishSnackbar.CatchingFishParcelableFAB(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    catchingFishFluxKtor.toString();
                                    String.valueOf(bundle);
                                }
                                catchingFishFluxKtor.CatchingFishSnackbar.CatchingFishParcelableFAB(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    CatchingFishGradleService catchingFishGradleService = (CatchingFishGradleService) this.CatchingFishSnackbar;
                    synchronized (catchingFishGradleService.CatchingFishParcelableFAB) {
                        try {
                            CatchingFishXMLLayoutView catchingFishXMLLayoutView = (CatchingFishXMLLayoutView) message.obj;
                            CatchingFishMockkFlux catchingFishMockkFlux = (CatchingFishMockkFlux) catchingFishGradleService.CatchingFishParcelableFAB.get(catchingFishXMLLayoutView);
                            if (catchingFishMockkFlux != null && catchingFishMockkFlux.CatchingFishParcelableFAB.isEmpty()) {
                                if (catchingFishMockkFlux.CatchingFishCoroutine) {
                                    CatchingFishXMLLayoutView catchingFishXMLLayoutView2 = catchingFishMockkFlux.CatchingFishDaggerWebsocket;
                                    CatchingFishGradleService catchingFishGradleService2 = catchingFishMockkFlux.CatchingFishViewModelScope;
                                    catchingFishGradleService2.CatchingFishCoroutine.removeMessages(1, catchingFishXMLLayoutView2);
                                    catchingFishGradleService2.CatchingFishReduxKtor.CatchingFishCardViewRealm(catchingFishGradleService2.CatchingFishSnackbar, catchingFishMockkFlux);
                                    catchingFishMockkFlux.CatchingFishCoroutine = false;
                                    catchingFishMockkFlux.CatchingFishSnackbar = 2;
                                }
                                catchingFishGradleService.CatchingFishParcelableFAB.remove(catchingFishXMLLayoutView);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        return false;
                    }
                    CatchingFishGradleService catchingFishGradleService3 = (CatchingFishGradleService) this.CatchingFishSnackbar;
                    synchronized (catchingFishGradleService3.CatchingFishParcelableFAB) {
                        try {
                            CatchingFishXMLLayoutView catchingFishXMLLayoutView3 = (CatchingFishXMLLayoutView) message.obj;
                            CatchingFishMockkFlux catchingFishMockkFlux2 = (CatchingFishMockkFlux) catchingFishGradleService3.CatchingFishParcelableFAB.get(catchingFishXMLLayoutView3);
                            if (catchingFishMockkFlux2 != null && catchingFishMockkFlux2.CatchingFishSnackbar == 3) {
                                new StringBuilder(String.valueOf(catchingFishXMLLayoutView3).length() + 47);
                                new Exception();
                                ComponentName componentName = catchingFishMockkFlux2.CatchingFishWorkManager;
                                if (componentName == null) {
                                    catchingFishXMLLayoutView3.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = catchingFishXMLLayoutView3.CatchingFishSnackbar;
                                    CatchingFishToastHiltBundle.CatchingFishAnimationMockk(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                catchingFishMockkFlux2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
