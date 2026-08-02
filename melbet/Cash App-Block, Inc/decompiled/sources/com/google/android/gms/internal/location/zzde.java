package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzde extends zzb {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaskCompletionSource zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzde(int i, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 3);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = taskCompletionSource;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 3);
                break;
            default:
                this.zza = taskCompletionSource;
                break;
        }
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(Parcel parcel, int i) {
        int i2 = this.$r8$classId;
        TaskCompletionSource taskCompletionSource = this.zza;
        switch (i2) {
            case 0:
                if (i == 1) {
                    LocationSettingsResult locationSettingsResult = (LocationSettingsResult) zzc.zza(parcel, LocationSettingsResult.CREATOR);
                    zzc.zzd(parcel);
                    Status status = locationSettingsResult.zza;
                    LocationSettingsResponse locationSettingsResponse = new LocationSettingsResponse();
                    locationSettingsResponse.zza = locationSettingsResult;
                    TaskUtil.setResultOrApiException(status, locationSettingsResponse, taskCompletionSource);
                    break;
                }
                break;
            default:
                if (i == 1) {
                    Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                    Location location = (Location) zzc.zza(parcel, Location.CREATOR);
                    zzc.zzd(parcel);
                    TaskUtil.setResultOrApiException(status2, location, taskCompletionSource);
                    break;
                }
                break;
        }
        return true;
    }
}
