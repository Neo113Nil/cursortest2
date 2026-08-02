package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn(0);
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    public zzm(String str, String str2, int i, int i2, int i3, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.zzc == zzmVar.zzc && this.zzd == zzmVar.zzd && Objects.equals(this.zza, zzmVar.zza) && this.zze == zzmVar.zze && this.zzf == zzmVar.zzf;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(this.zzf));
    }

    public final String toString() {
        zzlq zzlqVar = new zzlq("zzm");
        int i = 6;
        zzlq zzlqVar2 = new zzlq(i);
        ((zzlq) zzlqVar.zze).zze = zzlqVar2;
        zzlqVar2.zzd = this.zza;
        zzlqVar2.zzc = "name";
        zzlq zzlqVar3 = new zzlq(i);
        zzlqVar2.zze = zzlqVar3;
        zzlqVar.zze = zzlqVar3;
        zzlqVar3.zzd = this.zzb;
        zzlqVar3.zzc = "modelName";
        zzlqVar.zza(this.zzc, "type");
        zzlqVar.zza(this.zzd, "variant");
        zzlqVar.zza(this.zze, "id");
        zzlqVar.zza(this.zzf, "version");
        return zzlqVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zzf);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
