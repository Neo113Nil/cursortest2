package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzgq extends com.google.android.gms.internal.wearable.zza implements IInterface {
    zzgq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    public final void zzA(zzgm zzgmVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zzT(117, zza);
    }

    public final void zzB(zzgm zzgmVar, String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        com.google.android.gms.internal.wearable.zzc.zzb(zza, parcelFileDescriptor);
        zzT(38, zza);
    }

    public final void zzC(zzgm zzgmVar, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        com.google.android.gms.internal.wearable.zzc.zzb(zza, parcelFileDescriptor);
        zza.writeLong(j);
        zza.writeLong(j2);
        zzT(39, zza);
    }

    public final void zzd(zzgm zzgmVar, PutDataRequest putDataRequest) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        com.google.android.gms.internal.wearable.zzc.zzb(zza, putDataRequest);
        zzT(6, zza);
    }

    public final void zze(zzgm zzgmVar, Uri uri) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        com.google.android.gms.internal.wearable.zzc.zzb(zza, uri);
        zzT(7, zza);
    }

    public final void zzf(zzgm zzgmVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zzT(8, zza);
    }

    public final void zzg(zzgm zzgmVar, Uri uri, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        com.google.android.gms.internal.wearable.zzc.zzb(zza, uri);
        zza.writeInt(i);
        zzT(40, zza);
    }

    public final void zzh(zzgm zzgmVar, Uri uri, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        com.google.android.gms.internal.wearable.zzc.zzb(zza, uri);
        zza.writeInt(i);
        zzT(41, zza);
    }

    public final void zzi(zzgm zzgmVar, String str, String str2, byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeByteArray(bArr);
        zzT(12, zza);
    }

    public final void zzj(zzgm zzgmVar, String str, String str2, byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeByteArray(bArr);
        zzT(58, zza);
    }

    public final void zzk(zzgm zzgmVar, Asset asset) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        com.google.android.gms.internal.wearable.zzc.zzb(zza, asset);
        zzT(13, zza);
    }

    public final void zzl(zzgm zzgmVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zzT(14, zza);
    }

    public final void zzm(zzgm zzgmVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zzT(15, zza);
    }

    public final void zzn(zzgm zzgmVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zzT(63, zza);
    }

    public final void zzo(zzgm zzgmVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zzT(67, zza);
    }

    public final void zzp(zzgm zzgmVar, String str, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zza.writeInt(i);
        zzT(42, zza);
    }

    public final void zzq(zzgm zzgmVar, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeInt(i);
        zzT(43, zza);
    }

    public final void zzr(zzgm zzgmVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zzT(46, zza);
    }

    public final void zzs(zzgm zzgmVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zzT(47, zza);
    }

    public final void zzt(zzgm zzgmVar, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        com.google.android.gms.internal.wearable.zzc.zzb(zza, zzfVar);
        zzT(16, zza);
    }

    public final void zzu(zzgm zzgmVar, zzin zzinVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        com.google.android.gms.internal.wearable.zzc.zzb(zza, zzinVar);
        zzT(17, zza);
    }

    public final void zzv(zzgm zzgmVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzT(31, zza);
    }

    public final void zzw(zzgm zzgmVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zzT(32, zza);
    }

    public final void zzx(zzgm zzgmVar, String str, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        zza.writeString(str);
        zza.writeInt(i);
        zzT(33, zza);
    }

    public final void zzy(zzgm zzgmVar, zzgi zzgiVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgiVar);
        zza.writeString(str);
        zzT(34, zza);
    }

    public final void zzz(zzgm zzgmVar, zzgi zzgiVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgmVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgiVar);
        zza.writeString(str);
        zzT(35, zza);
    }
}
