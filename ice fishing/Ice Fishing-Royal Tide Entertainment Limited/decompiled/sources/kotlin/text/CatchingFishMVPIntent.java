package kotlin.text;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class CatchingFishMVPIntent implements ServiceConnection {
    public final int CatchingFishParcelableFAB;
    public final /* synthetic */ com.google.android.gms.common.internal.CatchingFishPagingLibrary CatchingFishSnackbar;

    public CatchingFishMVPIntent(com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary, int i) {
        this.CatchingFishSnackbar = catchingFishPagingLibrary;
        this.CatchingFishParcelableFAB = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishSnackbar;
        if (iBinder == null) {
            synchronized (catchingFishPagingLibrary.CatchingFishWorkManager) {
                i = catchingFishPagingLibrary.CatchingFishOkHttp;
            }
            if (i == 3) {
                catchingFishPagingLibrary.CatchingFishCoroutineFlow = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            CatchingFishToastRoom catchingFishToastRoom = catchingFishPagingLibrary.CatchingFishDaggerWebsocket;
            catchingFishToastRoom.sendMessage(catchingFishToastRoom.obtainMessage(i2, catchingFishPagingLibrary.CatchingFishSpannableWidget.get(), 16));
            return;
        }
        synchronized (catchingFishPagingLibrary.CatchingFishViewModelScope) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                catchingFishPagingLibrary.CatchingFishViewModelFAB = (queryLocalInterface == null || !(queryLocalInterface instanceof CatchingFishBundleMVPIntent)) ? new CatchingFishBundleMVPIntent(iBinder) : (CatchingFishBundleMVPIntent) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary2 = this.CatchingFishSnackbar;
        int i3 = this.CatchingFishParcelableFAB;
        catchingFishPagingLibrary2.getClass();
        CatchingFishMoshiJUnit catchingFishMoshiJUnit = new CatchingFishMoshiJUnit(catchingFishPagingLibrary2, 0, null);
        CatchingFishToastRoom catchingFishToastRoom2 = catchingFishPagingLibrary2.CatchingFishDaggerWebsocket;
        catchingFishToastRoom2.sendMessage(catchingFishToastRoom2.obtainMessage(7, i3, -1, catchingFishMoshiJUnit));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishSnackbar;
        synchronized (catchingFishPagingLibrary.CatchingFishViewModelScope) {
            catchingFishPagingLibrary.CatchingFishViewModelFAB = null;
        }
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary2 = this.CatchingFishSnackbar;
        int i = this.CatchingFishParcelableFAB;
        CatchingFishToastRoom catchingFishToastRoom = catchingFishPagingLibrary2.CatchingFishDaggerWebsocket;
        catchingFishToastRoom.sendMessage(catchingFishToastRoom.obtainMessage(6, i, 1));
    }
}
