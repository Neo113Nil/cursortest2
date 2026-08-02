package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR;
    public final String zzcx;
    public final String zzfd;
    public final int zzfe;
    public final String zzhg;
    public final String zzhh;
    public final int zzhi;

    static {
        Locale.getDefault().toString();
        int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        CREATOR = new zzac(5);
    }

    public zzat(String str, String str2, String str3, String str4, int i, int i2) {
        this.zzhg = str;
        this.zzhh = str2;
        this.zzcx = str3;
        this.zzfd = str4;
        this.zzhi = i;
        this.zzfe = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzat)) {
            zzat zzatVar = (zzat) obj;
            if (this.zzhi == zzatVar.zzhi && this.zzfe == zzatVar.zzfe && this.zzhh.equals(zzatVar.zzhh) && this.zzhg.equals(zzatVar.zzhg) && zzae.equal(this.zzcx, zzatVar.zzcx) && zzae.equal(this.zzfd, zzatVar.zzfd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzhg, this.zzhh, this.zzcx, this.zzfd, Integer.valueOf(this.zzhi), Integer.valueOf(this.zzfe)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zzhg, "clientPackageName");
        workLauncherImpl.add(this.zzhh, "locale");
        workLauncherImpl.add(this.zzcx, "accountName");
        workLauncherImpl.add(this.zzfd, "gCoreClientName");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zzhg);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzhh);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzcx);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzfd);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zzhi);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeInt(this.zzfe);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
