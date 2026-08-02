package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzjy extends zzbm {
    public final /* synthetic */ int $r8$classId = 2;
    public final Object zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjy(zzkk zzkkVar, ListenerHolder listenerHolder) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        switch (this.$r8$classId) {
            case 0:
                if (i == 2) {
                    Status status = (Status) zzbn.zzb(parcel, Status.CREATOR);
                    byte[] createByteArray = parcel.createByteArray();
                    zzbn.zzf(parcel);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zza;
                    if (status.isSuccess()) {
                        try {
                            zzadf zzadfVar = zzadf.zzd;
                            int i2 = zzacf.$r8$clinit;
                            TaskUtil.setResultOrApiException(status, zzno.zzc(createByteArray, zzadf.zza), taskCompletionSource);
                        } catch (zzaeh e) {
                            taskCompletionSource.setException(e);
                        }
                    } else {
                        TaskUtil.setResultOrApiException(status, null, taskCompletionSource);
                    }
                    break;
                }
                break;
            case 1:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.zza;
                switch (i) {
                    case 1:
                        Status status2 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status2, null, taskCompletionSource2);
                        break;
                    case 2:
                        Status status3 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status3, null, taskCompletionSource2);
                        break;
                    case 3:
                        Status status4 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status4, null, taskCompletionSource2);
                        break;
                    case 4:
                        Status status5 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzjh zzjhVar = (zzjh) zzbn.zzb(parcel, zzjh.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status5, zzjhVar, taskCompletionSource2);
                        break;
                    case 5:
                        Status status6 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status6, null, taskCompletionSource2);
                        break;
                    case 6:
                        Status status7 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzjl zzjlVar = (zzjl) zzbn.zzb(parcel, zzjl.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status7, zzjlVar, taskCompletionSource2);
                        break;
                    case 7:
                        Status status8 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzjj zzjjVar = (zzjj) zzbn.zzb(parcel, zzjj.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status8, zzjjVar, taskCompletionSource2);
                        break;
                    case 8:
                        Status status9 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status9, null, taskCompletionSource2);
                        break;
                    case 9:
                        Status status10 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzjo zzjoVar = (zzjo) zzbn.zzb(parcel, zzjo.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status10, zzjoVar, taskCompletionSource2);
                        break;
                    case 10:
                        Status status11 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzjh zzjhVar2 = (zzjh) zzbn.zzb(parcel, zzjh.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status11, zzjhVar2, taskCompletionSource2);
                        break;
                    case 11:
                        Status status12 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        parcel.readLong();
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status12, null, taskCompletionSource2);
                        break;
                    case 12:
                        Status status13 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status13, null, taskCompletionSource2);
                        break;
                    case 13:
                        Status status14 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzjs zzjsVar = (zzjs) zzbn.zzb(parcel, zzjs.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status14, zzjsVar, taskCompletionSource2);
                        break;
                    case 14:
                        Status status15 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status15, null, taskCompletionSource2);
                        break;
                    case 15:
                        Status status16 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status16, null, taskCompletionSource2);
                        break;
                    case 16:
                        Status status17 = (Status) zzbn.zzb(parcel, Status.CREATOR);
                        long readLong = parcel.readLong();
                        zzbn.zzf(parcel);
                        TaskUtil.setResultOrApiException(status17, Long.valueOf(readLong), taskCompletionSource2);
                        break;
                }
                break;
            default:
                if (i == 2) {
                    byte[] createByteArray2 = parcel.createByteArray();
                    zzbn.zzf(parcel);
                    ((ListenerHolder) this.zza).notifyListener(new zzj(this, createByteArray2));
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjy(zzkk zzkkVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.zza = taskCompletionSource;
    }

    public zzjy(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.zza = taskCompletionSource;
    }
}
