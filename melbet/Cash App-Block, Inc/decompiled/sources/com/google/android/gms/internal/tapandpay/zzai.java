package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class zzai extends zzah {
    public final WeakReference zza;
    public final int zzb;

    public zzai(int i, Activity activity) {
        this.zza = new WeakReference(activity);
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah
    public final void zzt(Status status) {
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            Log.d("TapAndPayClientImpl", "Ignoring onHandlePendingIntent, Activity is gone");
            return;
        }
        PendingIntent pendingIntent = status.zzc;
        int i = this.zzb;
        if (pendingIntent != null) {
            try {
                status.startResolutionForResult(i, activity);
                return;
            } catch (IntentSender.SendIntentException e) {
                Log.w("TapAndPayClientImpl", "Exception starting pending intent", e);
            }
        }
        PendingIntent createPendingResult = activity.createPendingResult(i, new Intent(), 1073741824);
        if (createPendingResult == null) {
            Log.w("TapAndPayClientImpl", "Null pending result returned for onHandleStatusPendingIntent");
            return;
        }
        try {
            createPendingResult.send(status.isSuccess() ? -1 : status.zza);
        } catch (PendingIntent.CanceledException e2) {
            Log.w("TapAndPayClientImpl", "Exception setting pending result", e2);
        }
    }
}
