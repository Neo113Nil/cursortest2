package kotlin.text;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishMockkFlux implements ServiceConnection {
    public boolean CatchingFishCoroutine;
    public final CatchingFishXMLLayoutView CatchingFishDaggerWebsocket;
    public IBinder CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishGradleService CatchingFishViewModelScope;
    public ComponentName CatchingFishWorkManager;
    public final HashMap CatchingFishParcelableFAB = new HashMap();
    public int CatchingFishSnackbar = 2;

    public CatchingFishMockkFlux(CatchingFishGradleService catchingFishGradleService, CatchingFishXMLLayoutView catchingFishXMLLayoutView) {
        this.CatchingFishViewModelScope = catchingFishGradleService;
        this.CatchingFishDaggerWebsocket = catchingFishXMLLayoutView;
    }

    public final ConnectionResult CatchingFishParcelableFAB(String str, Executor executor) {
        try {
            Intent CatchingFishParcelableFAB = CatchingFishAdMobHiltGlide.CatchingFishParcelableFAB(this.CatchingFishViewModelScope.CatchingFishSnackbar, this.CatchingFishDaggerWebsocket);
            this.CatchingFishSnackbar = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(CatchingFishDaggerHiltRealm.CatchingFishParcelableFAB(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                CatchingFishGradleService catchingFishGradleService = this.CatchingFishViewModelScope;
                CatchingFishServiceHilt catchingFishServiceHilt = catchingFishGradleService.CatchingFishReduxKtor;
                Context context = catchingFishGradleService.CatchingFishSnackbar;
                CatchingFishXMLLayoutView catchingFishXMLLayoutView = this.CatchingFishDaggerWebsocket;
                try {
                    boolean CatchingFishCardViewView = catchingFishServiceHilt.CatchingFishCardViewView(context, str, CatchingFishParcelableFAB, this, 4225, executor);
                    this.CatchingFishCoroutine = CatchingFishCardViewView;
                    if (CatchingFishCardViewView) {
                        catchingFishGradleService.CatchingFishCoroutine.sendMessageDelayed(catchingFishGradleService.CatchingFishCoroutine.obtainMessage(1, catchingFishXMLLayoutView), catchingFishGradleService.CatchingFishWorkManager);
                        ConnectionResult connectionResult = ConnectionResult.CatchingFishLayout;
                        StrictMode.setVmPolicy(vmPolicy);
                        return connectionResult;
                    }
                    this.CatchingFishSnackbar = 2;
                    try {
                        catchingFishGradleService.CatchingFishReduxKtor.CatchingFishCardViewRealm(catchingFishGradleService.CatchingFishSnackbar, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (CatchingFishFABIntentMVI e) {
            return e.CatchingFishReduxKtor;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CatchingFishGradleService catchingFishGradleService = this.CatchingFishViewModelScope;
        synchronized (catchingFishGradleService.CatchingFishParcelableFAB) {
            try {
                catchingFishGradleService.CatchingFishCoroutine.removeMessages(1, this.CatchingFishDaggerWebsocket);
                this.CatchingFishReduxKtor = iBinder;
                this.CatchingFishWorkManager = componentName;
                Iterator it = this.CatchingFishParcelableFAB.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.CatchingFishSnackbar = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        CatchingFishGradleService catchingFishGradleService = this.CatchingFishViewModelScope;
        synchronized (catchingFishGradleService.CatchingFishParcelableFAB) {
            try {
                catchingFishGradleService.CatchingFishCoroutine.removeMessages(1, this.CatchingFishDaggerWebsocket);
                this.CatchingFishReduxKtor = null;
                this.CatchingFishWorkManager = componentName;
                Iterator it = this.CatchingFishParcelableFAB.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.CatchingFishSnackbar = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
