package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzn(15);
    public final zzil zza;
    public final float zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final zzar zzf;
    public final zzil zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final int zzo;
    public final zzas zzp;

    public zzx(ArrayList arrayList, float f, int i, int i2, IBinder iBinder, int i3, IBinder iBinder2, ArrayList arrayList2, int i4, int i5, String str, String str2, String str3, String str4, int i6, int i7) {
        zzas zzasVar;
        this.zza = zzil.zzj(arrayList);
        this.zzb = f;
        this.zzc = i;
        this.zzd = i2;
        zzar zzarVar = null;
        if (iBinder == null) {
            zzasVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICortanaStreamingCallback");
            zzasVar = queryLocalInterface instanceof zzas ? (zzas) queryLocalInterface : new zzas(iBinder, "com.google.android.apps.aicore.aidl.ICortanaStreamingCallback", 6);
        }
        this.zzp = zzasVar;
        this.zze = i3;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.apps.aicore.aidl.ICortanaStateCallback");
            zzarVar = queryLocalInterface2 instanceof zzar ? (zzar) queryLocalInterface2 : new zzap(iBinder2, "com.google.android.apps.aicore.aidl.ICortanaStateCallback", 6);
        }
        this.zzf = zzarVar;
        this.zzg = zzil.zzj(arrayList2);
        this.zzh = i4;
        this.zzi = i5;
        this.zzj = str;
        this.zzk = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzn = i6;
        this.zzo = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedList(parcel, 1, this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeFloat(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd);
        zzas zzasVar = this.zzp;
        MooncakeHeaderViewKt.writeIBinder(parcel, 5, zzasVar == null ? null : zzasVar.zaa);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zze);
        zzar zzarVar = this.zzf;
        MooncakeHeaderViewKt.writeIBinder(parcel, 7, zzarVar != null ? zzarVar.asBinder() : null);
        MooncakeHeaderViewKt.writeTypedList(parcel, 8, this.zzg);
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeInt(this.zzh);
        MooncakeHeaderViewKt.zza(parcel, 10, 4);
        parcel.writeInt(this.zzi);
        MooncakeHeaderViewKt.writeString(parcel, 11, this.zzj);
        MooncakeHeaderViewKt.writeString(parcel, 12, this.zzk);
        MooncakeHeaderViewKt.writeString(parcel, 13, this.zzl);
        MooncakeHeaderViewKt.writeString(parcel, 14, this.zzm);
        MooncakeHeaderViewKt.zza(parcel, 15, 4);
        parcel.writeInt(this.zzn);
        MooncakeHeaderViewKt.zza(parcel, 16, 4);
        parcel.writeInt(this.zzo);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public zzx(zzil zzilVar, int i, int i2, int i3, zzar zzarVar, zzil zzilVar2, String str, int i4) {
        this.zza = zzilVar;
        this.zzb = RecyclerView.DECELERATION_RATE;
        this.zzc = i;
        this.zzd = i2;
        this.zzp = null;
        this.zze = i3;
        this.zzf = zzarVar;
        this.zzg = zzilVar2;
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = null;
        this.zzk = str;
        this.zzl = null;
        this.zzm = null;
        this.zzn = i4;
        this.zzo = 0;
    }
}
