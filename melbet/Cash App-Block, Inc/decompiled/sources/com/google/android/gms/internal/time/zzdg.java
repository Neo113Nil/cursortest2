package com.google.android.gms.internal.time;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzdg implements zzdi, RemoteCall, Continuation, zzec, zzdn {
    public static final zzdg zza = new zzdg(0);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzdg(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        zzbu zzbuVar = (zzbu) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.$r8$classId) {
            case 1:
                zzae zzaeVar = new zzae(0, taskCompletionSource);
                Context context = zzbuVar.zzl;
                ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, true, 0);
                zzat zzatVar = (zzat) zzbuVar.getService();
                ApiMetadata apiMetadata = new ApiMetadata(complianceOptions, false);
                apiMetadata.zze = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.time.trustedtime.internal.ITrustedTimeService");
                int i = zzc.$r8$clinit;
                obtain.writeStrongBinder(zzaeVar);
                obtain.writeInt(1);
                apiMetadata.writeToParcel(obtain, 0);
                zzatVar.zzb(obtain, 1);
                break;
            default:
                zzae zzaeVar2 = new zzae(1, taskCompletionSource);
                Context context2 = zzbuVar.zzl;
                ComplianceOptions complianceOptions2 = new ComplianceOptions(-1, -1, true, 0);
                zzat zzatVar2 = (zzat) zzbuVar.getService();
                ApiMetadata apiMetadata2 = new ApiMetadata(complianceOptions2, false);
                apiMetadata2.zze = false;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.time.trustedtime.internal.ITrustedTimeService");
                int i2 = zzc.$r8$clinit;
                obtain2.writeStrongBinder(zzaeVar2);
                obtain2.writeInt(1);
                apiMetadata2.writeToParcel(obtain2, 0);
                zzatVar2.zzb(obtain2, 4);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.$r8$classId) {
            case 3:
                if (!task.isSuccessful()) {
                    break;
                } else {
                    break;
                }
            case 4:
            default:
                zzbj zzbjVar = zzbj.zzb;
                if (!task.isSuccessful()) {
                    break;
                } else {
                    break;
                }
            case 5:
                zzbj zzbjVar2 = zzbj.zzb;
                if (!task.isSuccessful()) {
                    break;
                } else {
                    break;
                }
        }
        return zzcw.zza(task);
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "LogSite{ class=<unknown class>, method=<unknown method>, line=0 }";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.time.zzdn
    public void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.time.zzdn
    public void zzm(Object obj, String str) {
    }

    @Override // com.google.android.gms.internal.time.zzdn
    public void zzn(String str, Object obj, Object obj2) {
    }

    @Override // com.google.android.gms.internal.time.zzdn
    public void zzo(zzcf zzcfVar, Integer num, Object obj) {
    }

    public /* synthetic */ zzdg(zzah zzahVar, int i) {
        this.$r8$classId = i;
    }
}
