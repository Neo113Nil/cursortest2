package kotlin.text;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishMVPGsonMockk implements ServiceConnection {
    public CatchingFishContextPicasso CatchingFishCoroutine;
    public final SparseArray CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB = 0;
    public final ArrayDeque CatchingFishReduxKtor;
    public final Messenger CatchingFishSnackbar;
    public final /* synthetic */ CatchingFishFluxFirebase CatchingFishWorkManager;

    public CatchingFishMVPGsonMockk(CatchingFishFluxFirebase catchingFishFluxFirebase) {
        this.CatchingFishWorkManager = catchingFishFluxFirebase;
        CatchingFishPayPalRedux catchingFishPayPalRedux = new CatchingFishPayPalRedux(Looper.getMainLooper(), new CatchingFishToolbarRetrofit(1, this));
        Looper.getMainLooper();
        this.CatchingFishSnackbar = new Messenger(catchingFishPayPalRedux);
        this.CatchingFishReduxKtor = new ArrayDeque();
        this.CatchingFishDaggerWebsocket = new SparseArray();
    }

    public final synchronized void CatchingFishCoroutine() {
        if (this.CatchingFishParcelableFAB == 2 && this.CatchingFishReduxKtor.isEmpty() && this.CatchingFishDaggerWebsocket.size() == 0) {
            this.CatchingFishParcelableFAB = 3;
            CatchingFishServiceHilt.CatchingFishDaggerHiltFAB().CatchingFishCardViewRealm((Context) this.CatchingFishWorkManager.CatchingFishSnackbar, this);
        }
    }

    public final synchronized void CatchingFishParcelableFAB(String str) {
        CatchingFishSnackbar(str, null);
    }

    public final synchronized boolean CatchingFishReduxKtor(CatchingFishFluxKtor catchingFishFluxKtor) {
        Throwable th;
        CatchingFishServiceHilt CatchingFishDaggerHiltFAB;
        Context context;
        try {
            try {
                int i = this.CatchingFishParcelableFAB;
                if (i != 0) {
                    try {
                        if (i == 1) {
                            this.CatchingFishReduxKtor.add(catchingFishFluxKtor);
                            return true;
                        }
                        if (i != 2) {
                            return false;
                        }
                        this.CatchingFishReduxKtor.add(catchingFishFluxKtor);
                        ((ScheduledExecutorService) this.CatchingFishWorkManager.CatchingFishCoroutine).execute(new CatchingFishMVVMRoomRedux(this, 0));
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.CatchingFishReduxKtor.add(catchingFishFluxKtor);
                if (this.CatchingFishParcelableFAB != 0) {
                    throw new IllegalStateException();
                }
                this.CatchingFishParcelableFAB = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    CatchingFishDaggerHiltFAB = CatchingFishServiceHilt.CatchingFishDaggerHiltFAB();
                    context = (Context) this.CatchingFishWorkManager.CatchingFishSnackbar;
                } catch (SecurityException e) {
                    e = e;
                }
                try {
                    if (CatchingFishDaggerHiltFAB.CatchingFishCardViewView(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.CatchingFishWorkManager.CatchingFishCoroutine).schedule(new CatchingFishMVVMRoomRedux(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        CatchingFishParcelableFAB("Unable to bind to service");
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    CatchingFishSnackbar("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized void CatchingFishSnackbar(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.CatchingFishParcelableFAB;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.CatchingFishParcelableFAB = 4;
                return;
            }
            this.CatchingFishParcelableFAB = 4;
            CatchingFishServiceHilt.CatchingFishDaggerHiltFAB().CatchingFishCardViewRealm((Context) this.CatchingFishWorkManager.CatchingFishSnackbar, this);
            CatchingFishSnackbarIntent catchingFishSnackbarIntent = new CatchingFishSnackbarIntent(str, securityException);
            Iterator it = this.CatchingFishReduxKtor.iterator();
            while (it.hasNext()) {
                ((CatchingFishFluxKtor) it.next()).CatchingFishSnackbar(catchingFishSnackbarIntent);
            }
            this.CatchingFishReduxKtor.clear();
            for (int i2 = 0; i2 < this.CatchingFishDaggerWebsocket.size(); i2++) {
                ((CatchingFishFluxKtor) this.CatchingFishDaggerWebsocket.valueAt(i2)).CatchingFishSnackbar(catchingFishSnackbarIntent);
            }
            this.CatchingFishDaggerWebsocket.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.CatchingFishWorkManager.CatchingFishCoroutine).execute(new CatchingFishGsonRealmMoshi(7, this, iBinder, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.CatchingFishWorkManager.CatchingFishCoroutine).execute(new CatchingFishMVVMRoomRedux(this, 2));
    }
}
