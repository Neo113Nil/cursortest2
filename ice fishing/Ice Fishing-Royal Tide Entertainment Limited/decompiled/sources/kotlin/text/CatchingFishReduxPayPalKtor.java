package kotlin.text;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishReduxPayPalKtor implements ServiceConnection {
    public final ScheduledThreadPoolExecutor CatchingFishCoroutine;
    public CatchingFishMVIMockkService CatchingFishDaggerWebsocket;
    public final Context CatchingFishParcelableFAB;
    public final ArrayDeque CatchingFishReduxKtor;
    public final Intent CatchingFishSnackbar;
    public boolean CatchingFishWorkManager;

    public CatchingFishReduxPayPalKtor(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new CatchingFishMoshiWidgetMVP("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.CatchingFishReduxKtor = new ArrayDeque();
        this.CatchingFishWorkManager = false;
        Context applicationContext = context.getApplicationContext();
        this.CatchingFishParcelableFAB = applicationContext;
        this.CatchingFishSnackbar = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.CatchingFishCoroutine = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r1.CatchingFishCardViewView(r2, r2.getClass().getName(), r8.CatchingFishSnackbar, r5, 65, null) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void CatchingFishParcelableFAB() {
        CatchingFishReduxPayPalKtor catchingFishReduxPayPalKtor;
        while (!this.CatchingFishReduxKtor.isEmpty()) {
            try {
                try {
                    CatchingFishMVIMockkService catchingFishMVIMockkService = this.CatchingFishDaggerWebsocket;
                    if (catchingFishMVIMockkService == null || !catchingFishMVIMockkService.isBinderAlive()) {
                        if (!this.CatchingFishWorkManager) {
                            this.CatchingFishWorkManager = true;
                            try {
                                CatchingFishServiceHilt CatchingFishDaggerHiltFAB = CatchingFishServiceHilt.CatchingFishDaggerHiltFAB();
                                Context context = this.CatchingFishParcelableFAB;
                                catchingFishReduxPayPalKtor = this;
                            } catch (SecurityException unused) {
                                catchingFishReduxPayPalKtor = this;
                            }
                        }
                    }
                    this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB((CatchingFishBundleKtorFlux) this.CatchingFishReduxKtor.poll());
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        return;
        catchingFishReduxPayPalKtor.CatchingFishWorkManager = false;
        ArrayDeque arrayDeque = catchingFishReduxPayPalKtor.CatchingFishReduxKtor;
        while (!arrayDeque.isEmpty()) {
            ((CatchingFishBundleKtorFlux) arrayDeque.poll()).CatchingFishSnackbar.CatchingFishCoroutine(null);
        }
    }

    public final synchronized CatchingFishWorkManagerMVP CatchingFishSnackbar(Intent intent) {
        CatchingFishBundleKtorFlux catchingFishBundleKtorFlux;
        catchingFishBundleKtorFlux = new CatchingFishBundleKtorFlux(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.CatchingFishCoroutine;
        catchingFishBundleKtorFlux.CatchingFishSnackbar.CatchingFishParcelableFAB.CatchingFishParcelableFAB(scheduledThreadPoolExecutor, new CatchingFishLayoutCoroutine(12, scheduledThreadPoolExecutor.schedule(new CatchingFishMVPLayout(23, catchingFishBundleKtorFlux), 20L, TimeUnit.SECONDS)));
        this.CatchingFishReduxKtor.add(catchingFishBundleKtorFlux);
        CatchingFishParcelableFAB();
        return catchingFishBundleKtorFlux.CatchingFishSnackbar.CatchingFishParcelableFAB;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.CatchingFishWorkManager = false;
            if (iBinder instanceof CatchingFishMVIMockkService) {
                this.CatchingFishDaggerWebsocket = (CatchingFishMVIMockkService) iBinder;
                CatchingFishParcelableFAB();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.CatchingFishReduxKtor;
                while (!arrayDeque.isEmpty()) {
                    ((CatchingFishBundleKtorFlux) arrayDeque.poll()).CatchingFishSnackbar.CatchingFishCoroutine(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        CatchingFishParcelableFAB();
    }
}
