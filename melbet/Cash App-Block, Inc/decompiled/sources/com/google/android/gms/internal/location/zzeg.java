package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new zzac(1);
    public final LocationRequest zza;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzeg(LocationRequest locationRequest, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        int i;
        boolean z5;
        WorkSource workSource;
        LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest.zza, locationRequest.zzb);
        builder.setMinUpdateIntervalMillis(locationRequest.zzc);
        long j2 = locationRequest.zzd;
        zzae.checkArgument("maxUpdateDelayMillis must be greater than or equal to 0", j2 >= 0);
        builder.zzd = j2;
        builder.setDurationMillis(locationRequest.zze);
        int i2 = locationRequest.zzf;
        zzae.checkArgument("maxUpdates must be greater than 0", i2 > 0);
        builder.zzf = i2;
        float f = locationRequest.zzg;
        zzae.checkArgument("minUpdateDistanceMeters must be greater than or equal to 0", f >= RecyclerView.DECELERATION_RATE);
        builder.zzg = f;
        builder.zzh = locationRequest.zzh;
        builder.setMaxUpdateAgeMillis(locationRequest.zzi);
        builder.setGranularity(locationRequest.zzj);
        int i3 = locationRequest.zzk;
        if (i3 == 0 || i3 == 1) {
            i = i3;
        } else {
            if (i3 != 2) {
                i = i3;
                z5 = false;
                zzae.checkArgument(z5, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
                builder.zzk = i3;
                builder.zzl = locationRequest.zzl;
                builder.zzm = locationRequest.zzm;
                zze zzeVar = locationRequest.zzn;
                zzae.checkArgument(zzeVar != null || zzeVar.zzg == null);
                builder.zzn = zzeVar;
                if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        workSource = null;
                    } else {
                        workSource = new WorkSource();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ClientIdentity clientIdentity = (ClientIdentity) it.next();
                            WorkSourceUtil.add(workSource, clientIdentity.uid, clientIdentity.packageName);
                        }
                    }
                    builder.zzm = workSource;
                }
                if (z) {
                    builder.setGranularity(1);
                }
                if (z2) {
                    builder.zza(2);
                }
                if (z3) {
                    builder.zzl = true;
                }
                if (z4) {
                    builder.zzh = true;
                }
                if (j != Long.MAX_VALUE) {
                    builder.setMaxUpdateAgeMillis(j);
                }
                this.zza = builder.build();
            }
            i = 2;
        }
        z5 = true;
        zzae.checkArgument(z5, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
        builder.zzk = i3;
        builder.zzl = locationRequest.zzl;
        builder.zzm = locationRequest.zzm;
        zze zzeVar2 = locationRequest.zzn;
        zzae.checkArgument(zzeVar2 != null || zzeVar2.zzg == null);
        builder.zzn = zzeVar2;
        if (arrayList != null) {
        }
        if (z) {
        }
        if (z2) {
        }
        if (z3) {
        }
        if (z4) {
        }
        if (j != Long.MAX_VALUE) {
        }
        this.zza = builder.build();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzeg) {
            return zzae.equal(this.zza, ((zzeg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
