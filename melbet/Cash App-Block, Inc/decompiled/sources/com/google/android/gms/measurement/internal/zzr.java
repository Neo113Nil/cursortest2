package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zab(3);
    public final long zzA;
    public final String zzB;
    public final String zzC;
    public final long zzD;
    public final int zzE;
    public final long zzF;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final long zze;
    public final long zzf;
    public final String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final String zzk;
    public final long zzl;
    public final int zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final Boolean zzp;
    public final long zzq;
    public final List zzr;
    public final String zzs;
    public final String zzt;
    public final String zzu;
    public final boolean zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    public zzr(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        zzae.checkNotEmpty(str);
        this.zza = str;
        this.zzb = true == TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
        this.zzF = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 6, 8);
        parcel.writeLong(this.zze);
        MooncakeHeaderViewKt.zza(parcel, 7, 8);
        parcel.writeLong(this.zzf);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzg);
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeInt(this.zzh ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 10, 4);
        parcel.writeInt(this.zzi ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 11, 8);
        parcel.writeLong(this.zzj);
        MooncakeHeaderViewKt.writeString(parcel, 12, this.zzk);
        MooncakeHeaderViewKt.zza(parcel, 14, 8);
        parcel.writeLong(this.zzl);
        MooncakeHeaderViewKt.zza(parcel, 15, 4);
        parcel.writeInt(this.zzm);
        MooncakeHeaderViewKt.zza(parcel, 16, 4);
        parcel.writeInt(this.zzn ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 18, 4);
        parcel.writeInt(this.zzo ? 1 : 0);
        Boolean bool = this.zzp;
        if (bool != null) {
            MooncakeHeaderViewKt.zza(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        MooncakeHeaderViewKt.zza(parcel, 22, 8);
        parcel.writeLong(this.zzq);
        MooncakeHeaderViewKt.writeStringList(parcel, 23, this.zzr);
        MooncakeHeaderViewKt.writeString(parcel, 25, this.zzs);
        MooncakeHeaderViewKt.writeString(parcel, 26, this.zzt);
        MooncakeHeaderViewKt.writeString(parcel, 27, this.zzu);
        MooncakeHeaderViewKt.zza(parcel, 28, 4);
        parcel.writeInt(this.zzv ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 29, 8);
        parcel.writeLong(this.zzw);
        MooncakeHeaderViewKt.zza(parcel, 30, 4);
        parcel.writeInt(this.zzx);
        MooncakeHeaderViewKt.writeString(parcel, 31, this.zzy);
        MooncakeHeaderViewKt.zza(parcel, 32, 4);
        parcel.writeInt(this.zzz);
        MooncakeHeaderViewKt.zza(parcel, 34, 8);
        parcel.writeLong(this.zzA);
        MooncakeHeaderViewKt.writeString(parcel, 35, this.zzB);
        MooncakeHeaderViewKt.writeString(parcel, 36, this.zzC);
        MooncakeHeaderViewKt.zza(parcel, 37, 8);
        parcel.writeLong(this.zzD);
        MooncakeHeaderViewKt.zza(parcel, 38, 4);
        parcel.writeInt(this.zzE);
        MooncakeHeaderViewKt.zza(parcel, 39, 8);
        parcel.writeLong(this.zzF);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public zzr(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = arrayList;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
        this.zzF = j9;
    }
}
