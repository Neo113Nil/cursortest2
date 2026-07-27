package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.CatchingFishMVPAndroidX;

/* loaded from: classes.dex */
class FirebaseApp$UserUnlockReceiver extends BroadcastReceiver {
    public static final AtomicReference CatchingFishSnackbar = new AtomicReference();
    public final Context CatchingFishParcelableFAB;

    public FirebaseApp$UserUnlockReceiver(Context context) {
        this.CatchingFishParcelableFAB = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (CatchingFishPagingLibrary.CatchingFishCloudMessaging) {
            try {
                Iterator it = ((CatchingFishMVPAndroidX) CatchingFishPagingLibrary.CatchingFishEspressoTesting.values()).iterator();
                while (it.hasNext()) {
                    ((CatchingFishPagingLibrary) it.next()).CatchingFishReduxKtor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.CatchingFishParcelableFAB.unregisterReceiver(this);
    }
}
