package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.loader.content.ModernAsyncTask$1;
import coil3.request.ViewTargetDisposable;
import com.bugsnag.android.Client;
import com.fillr.browsersdk.Fillr;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.mlkit.common.sdkinternal.zzn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzjd extends zzbm implements zzgb {
    public final zzpg zza;
    public Boolean zzb;
    public String zzc;

    public zzjd(zzpg zzpgVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        zzae.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
        this.zzc = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzA(zzr zzrVar) {
        zzN(zzrVar);
        zzd(new zzie(this, zzrVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzB(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) {
        zzN(zzrVar);
        String str = zzrVar.zza;
        zzae.checkNotNull(str);
        this.zza.zzaX().zzj(new ProfileAdapter.AnonymousClass8(this, str, zzooVar, zzghVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzC(zzr zzrVar, zzaf zzafVar) {
        zzN(zzrVar);
        zzd(new Fillr.AnonymousClass2(14, this, zzrVar, zzafVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzD(zzr zzrVar, Bundle bundle, zzge zzgeVar) {
        zzN(zzrVar);
        String str = zzrVar.zza;
        zzae.checkNotNull(str);
        this.zza.zzaX().zzj(new zzn(this, zzrVar, bundle, zzgeVar, str, 3));
    }

    public final void zzE(Runnable runnable) {
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaX().zze()) {
            runnable.run();
        } else {
            zzpgVar.zzaX().zzl(runnable);
        }
    }

    public final void zzN(zzr zzrVar) {
        zzae.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        zzae.checkNotEmpty(str);
        zzO(str, false);
        this.zza.zzt().zzC(zzrVar.zzb);
    }

    public final void zzO(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        zzpg zzpgVar = this.zza;
        if (isEmpty) {
            zzpgVar.zzaW().zzd.zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.zzb == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.zzc) && !Hex.isGooglePlayServicesUid(zzpgVar.zzn.zzd, Binder.getCallingUid()) && !ViewTargetDisposable.getInstance(zzpgVar.zzn.zzd).isUidGoogleSigned(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.zzb = Boolean.valueOf(z2);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                zzpgVar.zzaW().zzd.zzb(zzgu.zzl(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.zzc == null) {
            Context context = zzpgVar.zzn.zzd;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.sCanceledAvailabilityNotification;
            if (Hex.uidHasPackageName(context, callingUid, str)) {
                this.zzc = str;
            }
        }
        if (str.equals(this.zzc)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        List list;
        zzpg zzpgVar = this.zza;
        ArrayList arrayList = null;
        zzge zzgeVar = null;
        zzgh zzghVar = null;
        int i2 = 0;
        Object[] objArr = 0;
        int i3 = 1;
        switch (i) {
            case 1:
                zzbh zzbhVar = (zzbh) zzbn.zzb(parcel, zzbh.CREATOR);
                zzr zzrVar = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zze(zzbhVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) zzbn.zzb(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzf(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzg(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbh zzbhVar2 = (zzbh) zzbn.zzb(parcel, zzbh.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                zzbn.zzf(parcel);
                zzae.checkNotNull(zzbhVar2);
                zzae.checkNotEmpty(readString);
                zzO(readString, true);
                zzd(new Fillr.AnonymousClass2(this, zzbhVar2, readString, 12));
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzi(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                boolean zza = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                zzN(zzrVar5);
                String str = zzrVar5.zza;
                zzae.checkNotNull(str);
                try {
                    List<zzpn> list2 = (List) zzpgVar.zzaX().zzh(new com.google.mlkit.vision.common.internal.zza(this, str, i3)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (zzpn zzpnVar : list2) {
                        if (!zza && zzpp.zzac(zzpnVar.zzc)) {
                        }
                        arrayList2.add(new zzpl(zzpnVar));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e) {
                    zzpgVar.zzaW().zzd.zzc("Failed to get user properties. appId", zzgu.zzl(str), e);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbh zzbhVar3 = (zzbh) zzbn.zzb(parcel, zzbh.CREATOR);
                String readString2 = parcel.readString();
                zzbn.zzf(parcel);
                byte[] zzk = zzk(zzbhVar3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(zzk);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                zzbn.zzf(parcel);
                zzl(readString3, readLong, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                String zzm = zzm(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 12:
                zzah zzahVar = (zzah) zzbn.zzb(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzn(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) zzbn.zzb(parcel, zzah.CREATOR);
                zzbn.zzf(parcel);
                zzae.checkNotNull(zzahVar2);
                zzae.checkNotNull(zzahVar2.zzc);
                zzae.checkNotEmpty(zzahVar2.zza);
                zzO(zzahVar2.zza, true);
                zzd(new Client.AnonymousClass4(this, new zzah(zzahVar2), objArr == true ? 1 : 0, 24));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                boolean zza2 = zzbn.zza(parcel);
                zzr zzrVar8 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                List zzp = zzp(readString6, readString7, zza2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzp);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                boolean zza3 = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                List zzq = zzq(readString8, readString9, readString10, zza3);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzq);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                zzr zzrVar9 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                List zzr = zzr(readString11, readString12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzr);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                zzbn.zzf(parcel);
                List zzs = zzs(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzs);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzt(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzu(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzv(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzao zzw = zzw(zzrVar13);
                parcel2.writeNoException();
                if (zzw == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzw.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzr zzrVar14 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                zzbn.zzf(parcel);
                zzN(zzrVar14);
                String str2 = zzrVar14.zza;
                zzae.checkNotNull(str2);
                if (zzpgVar.zzd().zzp(null, zzfy.zzaT)) {
                    try {
                        list = (List) zzpgVar.zzaX().zzi(new zziv(this, zzrVar14, bundle2, i2)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                        zzpgVar.zzaW().zzd.zzc("Failed to get trigger URIs. appId", zzgu.zzl(str2), e2);
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) zzpgVar.zzaX().zzh(new zziv(this, zzrVar14, bundle2, i3)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        zzpgVar.zzaW().zzd.zzc("Failed to get trigger URIs. appId", zzgu.zzl(str2), e3);
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzy(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzz(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzbn.zzf(parcel);
                zzA(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) zzbn.zzb(parcel, zzoo.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    zzghVar = queryLocalInterface instanceof zzgh ? (zzgh) queryLocalInterface : new zzgf(readStrongBinder);
                }
                zzbn.zzf(parcel);
                zzB(zzrVar18, zzooVar, zzghVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) zzbn.zzb(parcel, zzaf.CREATOR);
                zzbn.zzf(parcel);
                zzC(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) zzbn.zzb(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    zzgeVar = queryLocalInterface2 instanceof zzge ? (zzge) queryLocalInterface2 : new zzgc(readStrongBinder2);
                }
                zzbn.zzf(parcel);
                zzD(zzrVar20, bundle3, zzgeVar);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void zzd(Runnable runnable) {
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaX().zze()) {
            runnable.run();
        } else {
            zzpgVar.zzaX().zzj(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zze(zzbh zzbhVar, zzr zzrVar) {
        zzae.checkNotNull(zzbhVar);
        zzN(zzrVar);
        zzd(new Fillr.AnonymousClass2(this, zzbhVar, zzrVar, false, 11));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzf(zzpl zzplVar, zzr zzrVar) {
        zzae.checkNotNull(zzplVar);
        zzN(zzrVar);
        zzd(new Fillr.AnonymousClass2(this, zzplVar, zzrVar, false, 13));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzg(zzr zzrVar) {
        zzN(zzrVar);
        zzd(new zzie(this, zzrVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzi(zzr zzrVar) {
        zzN(zzrVar);
        zzd(new zzie(this, zzrVar, 2));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] zzk(zzbh zzbhVar, String str) {
        zzae.checkNotEmpty(str);
        zzae.checkNotNull(zzbhVar);
        zzO(str, true);
        zzpg zzpgVar = this.zza;
        zzgs zzgsVar = zzpgVar.zzaW().zzk;
        zzic zzicVar = zzpgVar.zzn;
        zzgn zzgnVar = zzicVar.zzm;
        String str2 = zzbhVar.zza;
        zzgsVar.zzb(zzgnVar.zza(str2), "Log and bundle. event");
        zzpgVar.zzba().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) zzpgVar.zzaX().zzi(new ModernAsyncTask$1(this, zzbhVar, str)).get();
            if (bArr == null) {
                zzpgVar.zzaW().zzd.zzb(zzgu.zzl(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            zzpgVar.zzba().getClass();
            zzpgVar.zzaW().zzk.zzd("Log and bundle processed. event, size, time_ms", zzicVar.zzm.zza(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.zzaW().zzd.zzd("Failed to log and bundle. appId, event, error", zzgu.zzl(str), zzicVar.zzm.zza(str2), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzl(String str, long j, String str2, String str3) {
        zzd(new zzig(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String zzm(zzr zzrVar) {
        zzN(zzrVar);
        zzpg zzpgVar = this.zza;
        try {
            return (String) zzpgVar.zzaX().zzh(new com.google.mlkit.vision.common.internal.zza(zzpgVar, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzpgVar.zzaW().zzd.zzc("Failed to get app instance id. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzn(zzah zzahVar, zzr zzrVar) {
        zzae.checkNotNull(zzahVar);
        zzae.checkNotNull(zzahVar.zzc);
        zzN(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.zza = zzrVar.zza;
        zzd(new Fillr.AnonymousClass2(this, zzahVar2, zzrVar, false, 10));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzp(String str, String str2, boolean z, zzr zzrVar) {
        zzN(zzrVar);
        String str3 = zzrVar.zza;
        zzae.checkNotNull(str3);
        zzpg zzpgVar = this.zza;
        try {
            List<zzpn> list = (List) zzpgVar.zzaX().zzh(new zzij(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (!z && zzpp.zzac(zzpnVar.zzc)) {
                }
                arrayList.add(new zzpl(zzpnVar));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.zzaW().zzd.zzc("Failed to query user properties. appId", zzgu.zzl(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzq(String str, String str2, String str3, boolean z) {
        zzO(str, true);
        zzpg zzpgVar = this.zza;
        try {
            List<zzpn> list = (List) zzpgVar.zzaX().zzh(new zzij(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (!z && zzpp.zzac(zzpnVar.zzc)) {
                }
                arrayList.add(new zzpl(zzpnVar));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.zzaW().zzd.zzc("Failed to get user properties as. appId", zzgu.zzl(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzr(String str, String str2, zzr zzrVar) {
        zzN(zzrVar);
        String str3 = zzrVar.zza;
        zzae.checkNotNull(str3);
        zzpg zzpgVar = this.zza;
        try {
            return (List) zzpgVar.zzaX().zzh(new zzij(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.zzaW().zzd.zzb(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzs(String str, String str2, String str3) {
        zzO(str, true);
        zzpg zzpgVar = this.zza;
        try {
            return (List) zzpgVar.zzaX().zzh(new zzij(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.zzaW().zzd.zzb(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzt(zzr zzrVar) {
        String str = zzrVar.zza;
        zzae.checkNotEmpty(str);
        zzO(str, false);
        zzd(new zzie(this, zzrVar, 3));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzu(Bundle bundle, zzr zzrVar) {
        zzN(zzrVar);
        String str = zzrVar.zza;
        zzae.checkNotNull(str);
        zzd(new ProfileAdapter.AnonymousClass8(this, bundle, str, false, zzrVar, 11));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzv(zzr zzrVar) {
        zzae.checkNotEmpty(zzrVar.zza);
        zzae.checkNotNull(zzrVar.zzs);
        zzE(new zzie(this, zzrVar, 4));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao zzw(zzr zzrVar) {
        zzN(zzrVar);
        String str = zzrVar.zza;
        zzae.checkNotEmpty(str);
        zzpg zzpgVar = this.zza;
        try {
            return (zzao) zzpgVar.zzaX().zzi(new com.google.mlkit.vision.common.internal.zza(this, zzrVar, 2)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzpgVar.zzaW().zzd.zzc("Failed to get consent. appId", zzgu.zzl(str), e);
            return new zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzy(zzr zzrVar) {
        zzae.checkNotEmpty(zzrVar.zza);
        zzae.checkNotNull(zzrVar.zzs);
        zzE(new zzie(this, zzrVar, 6));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzz(zzr zzrVar) {
        zzae.checkNotEmpty(zzrVar.zza);
        zzae.checkNotNull(zzrVar.zzs);
        zzE(new zzie(this, zzrVar, 5));
    }
}
