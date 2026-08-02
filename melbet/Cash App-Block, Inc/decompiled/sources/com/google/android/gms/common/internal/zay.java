package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new com.google.android.gms.appset.zzd(21);
    public final int zaa;
    public final IBinder zab;
    public final ConnectionResult zac;
    public final boolean zad;
    public final boolean zae;

    public zay(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.zaa = i;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zay)) {
            return false;
        }
        zay zayVar = (zay) obj;
        return this.zac.equals(zayVar.zac) && zzae.equal(zaa(), zayVar.zaa());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zaa);
        MooncakeHeaderViewKt.writeIBinder(parcel, 2, this.zab);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zac, i);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zad ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zae ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final IAccountAccessor zaa() {
        IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        int i = AccountAccessor.$r8$clinit;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
    }
}
