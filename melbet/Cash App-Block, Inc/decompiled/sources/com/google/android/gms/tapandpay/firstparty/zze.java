package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zab(25);
    public final long zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;

    public zze(String str, String str2, String str3, String str4, long j) {
        this.zza = j;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (zzae.equal(Long.valueOf(this.zza), Long.valueOf(zzeVar.zza)) && zzae.equal(this.zzb, zzeVar.zzb) && zzae.equal(this.zzc, zzeVar.zzc) && zzae.equal(this.zzd, zzeVar.zzd) && zzae.equal(this.zze, zzeVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(Long.valueOf(this.zza), "expirationTimestamp");
        workLauncherImpl.add(this.zzb, "websiteUrl");
        workLauncherImpl.add(this.zzc, "websiteRedirectText");
        workLauncherImpl.add(this.zzd, "legalDisclaimer");
        workLauncherImpl.add(this.zze, "summary");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 8);
        parcel.writeLong(this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
