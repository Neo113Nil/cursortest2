package kotlin.text;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishGradleService {
    public static HandlerThread CatchingFishLayout;
    public static CatchingFishGradleService CatchingFishViewModelFAB;
    public static final Object CatchingFishViewModelScope = new Object();
    public volatile CatchingFishPayPalRedux CatchingFishCoroutine;
    public final long CatchingFishDaggerWebsocket;
    public final HashMap CatchingFishParcelableFAB = new HashMap();
    public final CatchingFishServiceHilt CatchingFishReduxKtor;
    public final Context CatchingFishSnackbar;
    public final long CatchingFishWorkManager;

    public CatchingFishGradleService(Context context, Looper looper) {
        CatchingFishToolbarRetrofit catchingFishToolbarRetrofit = new CatchingFishToolbarRetrofit(2, this);
        this.CatchingFishSnackbar = context.getApplicationContext();
        CatchingFishPayPalRedux catchingFishPayPalRedux = new CatchingFishPayPalRedux(looper, catchingFishToolbarRetrofit);
        Looper.getMainLooper();
        this.CatchingFishCoroutine = catchingFishPayPalRedux;
        this.CatchingFishReduxKtor = CatchingFishServiceHilt.CatchingFishDaggerHiltFAB();
        this.CatchingFishDaggerWebsocket = 5000L;
        this.CatchingFishWorkManager = 300000L;
    }

    public final ConnectionResult CatchingFishParcelableFAB(CatchingFishXMLLayoutView catchingFishXMLLayoutView, CatchingFishMVPIntent catchingFishMVPIntent, String str) {
        ConnectionResult connectionResult;
        HashMap hashMap = this.CatchingFishParcelableFAB;
        synchronized (hashMap) {
            try {
                CatchingFishMockkFlux catchingFishMockkFlux = (CatchingFishMockkFlux) hashMap.get(catchingFishXMLLayoutView);
                if (catchingFishMockkFlux == null) {
                    catchingFishMockkFlux = new CatchingFishMockkFlux(this, catchingFishXMLLayoutView);
                    catchingFishMockkFlux.CatchingFishParcelableFAB.put(catchingFishMVPIntent, catchingFishMVPIntent);
                    connectionResult = catchingFishMockkFlux.CatchingFishParcelableFAB(str, null);
                    hashMap.put(catchingFishXMLLayoutView, catchingFishMockkFlux);
                } else {
                    this.CatchingFishCoroutine.removeMessages(0, catchingFishXMLLayoutView);
                    if (catchingFishMockkFlux.CatchingFishParcelableFAB.containsKey(catchingFishMVPIntent)) {
                        String catchingFishXMLLayoutView2 = catchingFishXMLLayoutView.toString();
                        StringBuilder sb = new StringBuilder(catchingFishXMLLayoutView2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(catchingFishXMLLayoutView2);
                        throw new IllegalStateException(sb.toString());
                    }
                    catchingFishMockkFlux.CatchingFishParcelableFAB.put(catchingFishMVPIntent, catchingFishMVPIntent);
                    int i = catchingFishMockkFlux.CatchingFishSnackbar;
                    if (i == 1) {
                        catchingFishMVPIntent.onServiceConnected(catchingFishMockkFlux.CatchingFishWorkManager, catchingFishMockkFlux.CatchingFishReduxKtor);
                    } else if (i == 2) {
                        connectionResult = catchingFishMockkFlux.CatchingFishParcelableFAB(str, null);
                    }
                    connectionResult = null;
                }
                if (catchingFishMockkFlux.CatchingFishCoroutine) {
                    return ConnectionResult.CatchingFishLayout;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1, null, null);
                }
                return connectionResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishSnackbar(String str, ServiceConnection serviceConnection, boolean z) {
        CatchingFishXMLLayoutView catchingFishXMLLayoutView = new CatchingFishXMLLayoutView(str, z);
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.CatchingFishParcelableFAB;
        synchronized (hashMap) {
            try {
                CatchingFishMockkFlux catchingFishMockkFlux = (CatchingFishMockkFlux) hashMap.get(catchingFishXMLLayoutView);
                if (catchingFishMockkFlux == null) {
                    String catchingFishXMLLayoutView2 = catchingFishXMLLayoutView.toString();
                    StringBuilder sb = new StringBuilder(catchingFishXMLLayoutView2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(catchingFishXMLLayoutView2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!catchingFishMockkFlux.CatchingFishParcelableFAB.containsKey(serviceConnection)) {
                    String catchingFishXMLLayoutView3 = catchingFishXMLLayoutView.toString();
                    StringBuilder sb2 = new StringBuilder(catchingFishXMLLayoutView3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(catchingFishXMLLayoutView3);
                    throw new IllegalStateException(sb2.toString());
                }
                catchingFishMockkFlux.CatchingFishParcelableFAB.remove(serviceConnection);
                if (catchingFishMockkFlux.CatchingFishParcelableFAB.isEmpty()) {
                    this.CatchingFishCoroutine.sendMessageDelayed(this.CatchingFishCoroutine.obtainMessage(0, catchingFishXMLLayoutView), this.CatchingFishDaggerWebsocket);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
