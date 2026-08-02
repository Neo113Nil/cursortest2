package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes4.dex */
public final class zzfk extends zzb {
    public final /* synthetic */ zzfl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfk(zzfl zzflVar) {
        super("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback", 4);
        this.zza = zzflVar;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(Parcel parcel, int i) {
        zzad zzadVar = null;
        zzfl zzflVar = this.zza;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
                zzadVar = queryLocalInterface instanceof zzad ? (zzad) queryLocalInterface : new zzab(readStrongBinder);
            }
            zzl.zzb(parcel);
            zzflVar.zzc(zzadVar);
            return true;
        }
        int i2 = 0;
        if (i != 3) {
            return false;
        }
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        zzl.zzb(parcel);
        if (readInt == 1) {
            i2 = 601;
        } else if (readInt == 2) {
            i2 = 604;
        } else if (readInt == 3) {
            i2 = 607;
        }
        zzflVar.zzd(zzcm.zzb(i2, "AiCore service is not connected. Service provider failure: ".concat(String.valueOf(readString)), null));
        return true;
    }
}
