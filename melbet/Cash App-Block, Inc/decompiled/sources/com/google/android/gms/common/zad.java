package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.core.app.PendingIntentCompat;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class zad extends zao {
    public final /* synthetic */ GoogleApiAvailability zaa;
    public final Context zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zad(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.zaa = googleApiAvailability;
        this.zab = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.zaa;
        Context context = this.zab;
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.sCanceledAvailabilityNotification;
        if (isGooglePlayServicesAvailable == 1 || isGooglePlayServicesAvailable == 2 || isGooglePlayServicesAvailable == 3 || isGooglePlayServicesAvailable == 9) {
            Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, "n");
            googleApiAvailability.zac(context, isGooglePlayServicesAvailable, errorResolutionIntent == null ? null : PendingIntentCompat.getActivity(context, errorResolutionIntent));
        }
    }
}
