package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public final class zzd extends Fragment {
    public static final /* synthetic */ int $r8$clinit = 0;
    public boolean zza;
    public int zzc;
    public zzc zzd;

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzc = getArguments().getInt("requestCode");
        if (AutoResolveHelper.zza != getArguments().getLong("initializationElapsedRealtime")) {
            this.zzd = null;
        } else {
            this.zzd = (zzc) zzc.zzb.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.zza = z;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        zzc zzcVar = this.zzd;
        if (zzcVar == null || zzcVar.zze != this) {
            return;
        }
        zzcVar.zze = null;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        zzc zzcVar = this.zzd;
        if (zzcVar != null) {
            zzcVar.zze = this;
            zzcVar.zzd();
        } else {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
            }
            zzc(null);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.zza);
        zzc zzcVar = this.zzd;
        if (zzcVar == null || zzcVar.zze != this) {
            return;
        }
        zzcVar.zze = null;
    }

    public final void zzc(Task task) {
        if (this.zza) {
            return;
        }
        int i = 1;
        this.zza = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        int i2 = this.zzc;
        if (task == null) {
            AutoResolveHelper.zzf(activity, i2, 0, new Intent());
            return;
        }
        int i3 = AutoResolveHelper.$r8$clinit;
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exception).mStatus.startResolutionForResult(i2, activity);
                return;
            } catch (IntentSender.SendIntentException e) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (task.isSuccessful()) {
            PaymentData paymentData = (PaymentData) task.getResult();
            paymentData.getClass();
            Parcel obtain = Parcel.obtain();
            paymentData.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
            i = -1;
        } else if (exception instanceof ApiException) {
            ApiException apiException = (ApiException) exception;
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(apiException.mStatus.zza, apiException.getMessage(), null, null));
        } else {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
            }
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
        }
        AutoResolveHelper.zzf(activity, i2, i, intent);
    }
}
