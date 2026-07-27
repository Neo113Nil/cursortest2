package kotlin.text;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class CatchingFishToastRoom extends CatchingFishPayPalRedux {
    public final /* synthetic */ com.google.android.gms.common.internal.CatchingFishPagingLibrary CatchingFishParcelableFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishToastRoom(com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary, Looper looper) {
        super(looper, 3);
        this.CatchingFishParcelableFAB = catchingFishPagingLibrary;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        CatchingFishToolbarMockk catchingFishToolbarMockk;
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishParcelableFAB;
        if (catchingFishPagingLibrary.CatchingFishSpannableWidget.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (catchingFishToolbarMockk = (CatchingFishToolbarMockk) message.obj) != null) {
                synchronized (catchingFishToolbarMockk) {
                    catchingFishToolbarMockk.CatchingFishParcelableFAB = null;
                }
                com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary2 = catchingFishToolbarMockk.CatchingFishCoroutine;
                synchronized (catchingFishPagingLibrary2.CatchingFishCloudMessaging) {
                    catchingFishPagingLibrary2.CatchingFishCloudMessaging.remove(catchingFishToolbarMockk);
                }
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !catchingFishPagingLibrary.CatchingFishUnitTesting()) {
            CatchingFishToolbarMockk catchingFishToolbarMockk2 = (CatchingFishToolbarMockk) message.obj;
            if (catchingFishToolbarMockk2 != null) {
                synchronized (catchingFishToolbarMockk2) {
                    catchingFishToolbarMockk2.CatchingFishParcelableFAB = null;
                }
                com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary3 = catchingFishToolbarMockk2.CatchingFishCoroutine;
                synchronized (catchingFishPagingLibrary3.CatchingFishCloudMessaging) {
                    catchingFishPagingLibrary3.CatchingFishCloudMessaging.remove(catchingFishToolbarMockk2);
                }
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            catchingFishPagingLibrary.CatchingFishJetpackCompose = new ConnectionResult(message.arg2, null, null);
            if (!catchingFishPagingLibrary.CatchingFishCoroutineFlow && !TextUtils.isEmpty(catchingFishPagingLibrary.CatchingFishFragmentHandler()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(catchingFishPagingLibrary.CatchingFishFragmentHandler());
                    if (!catchingFishPagingLibrary.CatchingFishCoroutineFlow) {
                        catchingFishPagingLibrary.CatchingFishStateLiveData(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = catchingFishPagingLibrary.CatchingFishJetpackCompose;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            catchingFishPagingLibrary.CatchingFishLayout.CatchingFishParcelableFAB(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 5) {
            ConnectionResult connectionResult2 = catchingFishPagingLibrary.CatchingFishJetpackCompose;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            catchingFishPagingLibrary.CatchingFishLayout.CatchingFishParcelableFAB(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            catchingFishPagingLibrary.CatchingFishLayout.CatchingFishParcelableFAB(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i3 == 6) {
            catchingFishPagingLibrary.CatchingFishStateLiveData(5, null);
            CatchingFishEspressoPayPal catchingFishEspressoPayPal = catchingFishPagingLibrary.CatchingFishUnitTesting;
            if (catchingFishEspressoPayPal != null) {
                ((CatchingFishJUnitPicasso) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB(message.arg2);
            }
            System.currentTimeMillis();
            catchingFishPagingLibrary.CatchingFishAnimationMockk(5, 1, null);
            return;
        }
        if (i3 == 2 && !catchingFishPagingLibrary.CatchingFishOkHttp()) {
            CatchingFishToolbarMockk catchingFishToolbarMockk3 = (CatchingFishToolbarMockk) message.obj;
            if (catchingFishToolbarMockk3 != null) {
                synchronized (catchingFishToolbarMockk3) {
                    catchingFishToolbarMockk3.CatchingFishParcelableFAB = null;
                }
                com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary4 = catchingFishToolbarMockk3.CatchingFishCoroutine;
                synchronized (catchingFishPagingLibrary4.CatchingFishCloudMessaging) {
                    catchingFishPagingLibrary4.CatchingFishCloudMessaging.remove(catchingFishToolbarMockk3);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            new StringBuilder(String.valueOf(i4).length() + 34);
            new Exception();
            return;
        }
        CatchingFishToolbarMockk catchingFishToolbarMockk4 = (CatchingFishToolbarMockk) message.obj;
        synchronized (catchingFishToolbarMockk4) {
            try {
                bool = catchingFishToolbarMockk4.CatchingFishParcelableFAB;
                if (catchingFishToolbarMockk4.CatchingFishSnackbar) {
                    new StringBuilder(catchingFishToolbarMockk4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary5 = catchingFishToolbarMockk4.CatchingFishWorkManager;
            int i5 = catchingFishToolbarMockk4.CatchingFishReduxKtor;
            if (i5 != 0) {
                catchingFishPagingLibrary5.CatchingFishStateLiveData(1, null);
                Bundle bundle = catchingFishToolbarMockk4.CatchingFishDaggerWebsocket;
                catchingFishToolbarMockk4.CatchingFishSnackbar(new ConnectionResult(i5, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!catchingFishToolbarMockk4.CatchingFishParcelableFAB()) {
                catchingFishPagingLibrary5.CatchingFishStateLiveData(1, null);
                catchingFishToolbarMockk4.CatchingFishSnackbar(new ConnectionResult(8, null, null));
            }
        }
        synchronized (catchingFishToolbarMockk4) {
            catchingFishToolbarMockk4.CatchingFishSnackbar = true;
        }
        synchronized (catchingFishToolbarMockk4) {
            catchingFishToolbarMockk4.CatchingFishParcelableFAB = null;
        }
        com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary6 = catchingFishToolbarMockk4.CatchingFishCoroutine;
        synchronized (catchingFishPagingLibrary6.CatchingFishCloudMessaging) {
            catchingFishPagingLibrary6.CatchingFishCloudMessaging.remove(catchingFishToolbarMockk4);
        }
    }
}
