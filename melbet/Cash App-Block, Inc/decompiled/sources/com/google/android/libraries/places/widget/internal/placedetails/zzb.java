package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.android.libraries.places.internal.zzaqz;
import com.google.android.libraries.places.internal.zzarc;
import com.google.android.libraries.places.internal.zzarh;
import com.google.android.libraries.places.internal.zzaso;
import com.google.android.libraries.places.internal.zzasp;
import com.google.android.libraries.places.internal.zzasq;
import com.google.android.libraries.places.internal.zzaum;
import com.google.android.libraries.places.internal.zzaun;
import com.google.android.libraries.places.internal.zzjn;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzb implements Parcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new com.google.android.play.core.review.zzb(10);
    public final int zza;
    public final int zzb;
    public final ArrayList zzc;
    public final int zzd;
    public final Boolean zze;
    public final zzaso zzf;
    public final zzaso zzg;

    public zzb(int i, int i2, ArrayList arrayList, int i3, Boolean bool, zzaso zzasoVar, zzaso zzasoVar2) {
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        this.zza = i;
        this.zzb = i2;
        this.zzc = arrayList;
        this.zzd = i3;
        this.zze = bool;
        this.zzf = zzasoVar;
        this.zzg = zzasoVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.getClass();
        int i2 = this.zza;
        if (i2 == 1) {
            str = "VARIANT_UNDEFINED";
        } else if (i2 == 2) {
            str = "VARIANT_COMPACT";
        } else if (i2 == 3) {
            str = "VARIANT_FULL";
        } else if (i2 == 4) {
            str = "VARIANT_COMPACT_ADVANCED";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "VARIANT_FULL_ADVANCED";
        }
        parcel.writeString(str);
        int i3 = this.zzb;
        if (i3 == 1) {
            str2 = "PLACE_WIDGET_ORIENTATION_UNSPECIFIED";
        } else if (i3 == 2) {
            str2 = "VERTICAL";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "HORIZONTAL";
        }
        parcel.writeString(str2);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.zzc, parcel);
        while (m.hasNext()) {
            parcel.writeString(((zzarc) m.next()).name());
        }
        parcel.writeInt(this.zzd);
        Boolean bool = this.zze;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        parcel.writeValue(this.zzf);
        parcel.writeValue(this.zzg);
    }

    public final void zzp(Context context, int i, Integer num) {
        zzaqz zza$1 = zzarh.zza$1();
        zza$1.zzy();
        zzarh zzarhVar = (zzarh) zza$1.zza;
        int i2 = this.zza;
        zzarhVar.zzc$2(i2);
        zza$1.zzy();
        ((zzarh) zza$1.zza).zzh$2(this.zzb);
        zza$1.zzy();
        ((zzarh) zza$1.zza).zzd(this.zzc);
        zzaum zzg = zzaun.zzg();
        int[] iArr = zzjn.f74zzc;
        int i3 = this.zzd;
        boolean zzg2 = zzjn.zzg(context, i3, iArr);
        zzg.zzy();
        ((zzaun) zzg.zza).zzh(zzg2);
        boolean zzg3 = zzjn.zzg(context, i3, zzjn.f75zzd);
        zzg.zzy();
        ((zzaun) zzg.zza).zzi(zzg3);
        boolean z = true;
        if (!zzjn.zzg(context, i3, zzjn.zzf) && !zzjn.zzg(context, i3, zzjn.f76zze)) {
            z = false;
        }
        zzg.zzy();
        ((zzaun) zzg.zza).zzj(z);
        boolean zzg4 = zzjn.zzg(context, i3, zzjn.zzg);
        zzg.zzy();
        ((zzaun) zzg.zza).zzk(zzg4);
        boolean zzg5 = zzjn.zzg(context, i3, zzjn.zzh);
        zzg.zzy();
        ((zzaun) zzg.zza).zzl(zzg5);
        zzaun zzaunVar = (zzaun) zzg.zzD();
        zza$1.zzy();
        ((zzarh) zza$1.zza).zzg(zzaunVar);
        Boolean bool = this.zze;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            zza$1.zzy();
            ((zzarh) zza$1.zza).zzf(booleanValue);
        }
        if (i2 == 4 || i2 == 5) {
            zzasp zza$12 = zzasq.zza$1();
            zza$12.getClass();
            zzaso zzasoVar = this.zzf;
            if (zzasoVar != null) {
                zza$12.zzy();
                ((zzasq) zza$12.zza).zzd(zzasoVar);
            }
            zzaso zzasoVar2 = this.zzg;
            if (zzasoVar2 != null) {
                zza$12.zzy();
                ((zzasq) zza$12.zza).zzc(zzasoVar2);
            }
            zzasq zzasqVar = (zzasq) zza$12.zzD();
            zza$1.zzy();
            ((zzarh) zza$1.zza).zzi(zzasqVar);
        }
        zza$1.zzy();
        ((zzarh) zza$1.zza).zzk(i);
        if (num != null) {
            int intValue = num.intValue();
            zza$1.zzy();
            ((zzarh) zza$1.zza).zze(intValue);
        }
    }
}
