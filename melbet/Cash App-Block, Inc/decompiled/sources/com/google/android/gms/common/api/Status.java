package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtilsKt;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public final int zza;
    public final String zzb;
    public final PendingIntent zzc;
    public final ConnectionResult zzd;
    public static final Status RESULT_SUCCESS = new Status(0, null, null, null);
    public static final Status RESULT_INTERRUPTED = new Status(14, null, null, null);
    public static final Status RESULT_INTERNAL_ERROR = new Status(8, null, null, null);
    public static final Status RESULT_TIMEOUT = new Status(15, null, null, null);
    public static final Status RESULT_CANCELED = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new com.google.android.gms.common.zza(4);

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.zza = i;
        this.zzb = str;
        this.zzc = pendingIntent;
        this.zzd = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.zza == status.zza && zzae.equal(this.zzb, status.zzb) && zzae.equal(this.zzc, status.zzc) && zzae.equal(this.zzd, status.zzd);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd});
    }

    public final boolean isSuccess() {
        return this.zza <= 0;
    }

    public final void startResolutionForResult(int i, Activity activity) {
        PendingIntent pendingIntent = this.zzc;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            zzae.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0, bundle);
        }
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        String str = this.zzb;
        if (str == null) {
            str = EmulatorDeviceUtilsKt.getStatusCodeString(this.zza);
        }
        workLauncherImpl.add(str, "statusCode");
        workLauncherImpl.add(this.zzc, "resolution");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = MooncakeHeaderViewKt.beginObjectHeader(parcel);
        MooncakeHeaderViewKt.writeInt(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.finishObjectHeader(parcel, beginObjectHeader);
    }
}
