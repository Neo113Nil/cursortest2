package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzac(20);
    public LatLng zza;
    public String zzb;
    public String zzc;
    public BitmapDescriptor zzd;
    public boolean zzg;
    public float zzn;
    public View zzp;
    public int zzq;
    public String zzr;
    public float zze = 0.5f;
    public float zzf = 1.0f;
    public boolean zzh = true;
    public boolean zzi = false;
    public float zzj = RecyclerView.DECELERATION_RATE;
    public float zzk = 0.5f;
    public float zzl = RecyclerView.DECELERATION_RATE;
    public float zzm = 1.0f;
    public int zzo = 0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zza, i);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        BitmapDescriptor bitmapDescriptor = this.zzd;
        MooncakeHeaderViewKt.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza.asBinder());
        float f = this.zze;
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.zzf;
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.zzg;
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzh;
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.zzi;
        MooncakeHeaderViewKt.zza(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.zzj;
        MooncakeHeaderViewKt.zza(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.zzk;
        MooncakeHeaderViewKt.zza(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.zzl;
        MooncakeHeaderViewKt.zza(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.zzm;
        MooncakeHeaderViewKt.zza(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.zzn;
        MooncakeHeaderViewKt.zza(parcel, 15, 4);
        parcel.writeFloat(f7);
        int i2 = this.zzo;
        MooncakeHeaderViewKt.zza(parcel, 17, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeIBinder(parcel, 18, new ObjectWrapper(this.zzp));
        int i3 = this.zzq;
        MooncakeHeaderViewKt.zza(parcel, 19, 4);
        parcel.writeInt(i3);
        MooncakeHeaderViewKt.writeString(parcel, 20, this.zzr);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
