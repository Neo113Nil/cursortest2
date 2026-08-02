package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzfz extends zaa implements zzgb {
    public zzfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 5);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzA(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 27);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzB(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzbn.zzc(zza, zzooVar);
        zzbn.zzd(zza, zzghVar);
        zzc(zza, 29);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzC(zzr zzrVar, zzaf zzafVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzbn.zzc(zza, zzafVar);
        zzc(zza, 30);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzD(zzr zzrVar, Bundle bundle, zzge zzgeVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzbn.zzc(zza, bundle);
        zzbn.zzd(zza, zzgeVar);
        zzc(zza, 31);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zze(zzbh zzbhVar, zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzbhVar);
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzf(zzpl zzplVar, zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzplVar);
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 2);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzg(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 4);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzi(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 6);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] zzk(zzbh zzbhVar, String str) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzbhVar);
        zza.writeString(str);
        Parcel zzP = zzP(zza, 9);
        byte[] createByteArray = zzP.createByteArray();
        zzP.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzl(String str, long j, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(zza, 10);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String zzm(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        Parcel zzP = zzP(zza, 11);
        String readString = zzP.readString();
        zzP.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzn(zzah zzahVar, zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzahVar);
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 12);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzp(String str, String str2, boolean z, zzr zzrVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        ClassLoader classLoader = zzbn.zzb;
        zza.writeInt(z ? 1 : 0);
        zzbn.zzc(zza, zzrVar);
        Parcel zzP = zzP(zza, 14);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(zzpl.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzq(String str, String str2, String str3, boolean z) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        ClassLoader classLoader = zzbn.zzb;
        zza.writeInt(z ? 1 : 0);
        Parcel zzP = zzP(zza, 15);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(zzpl.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzr(String str, String str2, zzr zzrVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzc(zza, zzrVar);
        Parcel zzP = zzP(zza, 16);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(zzah.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzs(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzP = zzP(zza, 17);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(zzah.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzt(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 18);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzu(Bundle bundle, zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 19);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzv(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 20);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao zzw(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        Parcel zzP = zzP(zza, 21);
        zzao zzaoVar = (zzao) zzbn.zzb(zzP, zzao.CREATOR);
        zzP.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzy(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 25);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzz(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(zza, 26);
    }
}
