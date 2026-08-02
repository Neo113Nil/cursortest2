package com.google.android.gms.internal.time;

import android.os.BadParcelableException;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzae extends zzb {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaskCompletionSource zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(int i, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback", 9);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = taskCompletionSource;
                super("com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback", 9);
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
                if (i != 1) {
                    return false;
                }
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzk zzkVar = (zzk) zzc.zza(parcel, zzk.CREATOR);
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                TaskUtil.setResultOrApiException(status, zzkVar, taskCompletionSource);
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzq zzqVar = (zzq) zzc.zza(parcel, zzq.CREATOR);
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 > 0) {
                    throw new BadParcelableException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                TaskUtil.setResultOrApiException(status2, zzqVar, taskCompletionSource);
                return true;
        }
    }
}
