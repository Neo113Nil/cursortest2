package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new com.google.android.gms.common.zza(9);
    public final int zza;
    public final String zzb;
    public final Intent zzc;

    public zzdd(int i, String str, Intent intent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = intent;
    }

    public static zzdd zza(Activity activity) {
        return new zzdd(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdd)) {
            return false;
        }
        zzdd zzddVar = (zzdd) obj;
        return this.zza == zzddVar.zza && Objects.equals(this.zzb, zzddVar.zzb) && Objects.equals(this.zzc, zzddVar.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = MooncakeHeaderViewKt.beginObjectHeader(parcel);
        MooncakeHeaderViewKt.writeInt(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.finishObjectHeader(parcel, beginObjectHeader);
    }
}
