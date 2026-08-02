package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.fillr.n;
import com.google.android.filament.Box;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzw;
import com.google.mlkit.vision.text.zzd;

/* loaded from: classes4.dex */
public final class zzdv extends zzb implements zzw {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Box zza;

    public zzdv(Box box) {
        super("com.google.android.gms.location.ILocationCallback", 3);
        this.zza = box;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(Parcel parcel, int i) {
        Box box = this.zza;
        if (i == 1) {
            LocationResult locationResult = (LocationResult) zzc.zza(parcel, LocationResult.CREATOR);
            zzc.zzd(parcel);
            ((ListenerHolder) box.mCenter).notifyListener(new com.google.android.gms.tasks.zzb(locationResult, 18));
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            zzf();
            return true;
        }
        zzc.zzd(parcel);
        ((ListenerHolder) box.mCenter).notifyListener(new zzd(7));
        return true;
    }

    public final void zzf() {
        ((ListenerHolder) this.zza.mCenter).notifyListener(new n.b(this, 22));
    }

    public final void zzg() {
        ((ListenerHolder) this.zza.mCenter).zab = null;
    }
}
