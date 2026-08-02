package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcs;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzk implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ Object zze;

    public zzk(zzlj zzljVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z;
        Objects.requireNonNull(zzljVar);
        this.zze = zzljVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157 A[Catch: RuntimeException -> 0x00e8, TryCatch #0 {RuntimeException -> 0x00e8, blocks: (B:34:0x010c, B:36:0x0117, B:39:0x0124, B:41:0x012a, B:42:0x0144, B:43:0x0151, B:45:0x0157, B:48:0x016e, B:49:0x017d, B:51:0x0175, B:52:0x0193, B:54:0x0199, B:56:0x019f, B:58:0x01a5, B:60:0x01ad, B:62:0x01b6, B:64:0x01bf, B:66:0x01c5, B:69:0x01d7, B:79:0x009c, B:81:0x00a4, B:83:0x00aa, B:85:0x00b0, B:87:0x00b6, B:89:0x00bf, B:91:0x00c7, B:93:0x00d0, B:95:0x00d9, B:96:0x00ef, B:98:0x00fd), top: B:78:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzky zzkyVar;
        zzpp zzppVar;
        zzgu zzguVar;
        Bundle zzi;
        String str;
        CharSequence charSequence;
        int i = this.$r8$classId;
        boolean z = this.zzd;
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        Object obj4 = this.zze;
        switch (i) {
            case 0:
                zznl zzt = ((AppMeasurementDynamiteService) obj4).zza.zzt();
                zzt.zzg();
                zzt.zzb$1();
                zzt.zzaf(new zzmc(zzt, (String) obj2, (String) obj, zzt.zzah(false), this.zzd, (zzcs) obj3));
                break;
            case 1:
                zznl zzt2 = ((zzic) ((zzlj) obj4).$$delegate_0).zzt();
                zzt2.zzg();
                zzt2.zzb$1();
                zzt2.zzaf(new zzmc(zzt2, (AtomicReference) obj3, (String) obj2, (String) obj, zzt2.zzah(false), this.zzd));
                break;
            case 2:
                zzky zzkyVar2 = (zzky) obj4;
                zzlj zzljVar = (zzlj) zzkyVar2.zza;
                zzljVar.zzg();
                zzic zzicVar = (zzic) zzljVar.$$delegate_0;
                zzx zzxVar = zzljVar.zzb;
                String str2 = (String) obj;
                Uri uri = (Uri) obj3;
                try {
                    zzppVar = zzicVar.zzl;
                    zzguVar = zzicVar.zzi;
                    zzic.zzN(zzppVar);
                } catch (RuntimeException e) {
                    e = e;
                    zzkyVar = zzkyVar2;
                }
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        if (!str2.contains("gclid")) {
                            zzkyVar = zzkyVar2;
                            try {
                                if (!str2.contains("gbraid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && !str2.contains("sfmc_id")) {
                                    zzgu zzguVar2 = ((zzic) zzppVar.$$delegate_0).zzi;
                                    zzic.zzP(zzguVar2);
                                    zzguVar2.zzk.zza("Activity created with data 'referrer' without required params");
                                }
                            } catch (RuntimeException e2) {
                                e = e2;
                                zzkyVar2 = zzkyVar;
                                zzgu zzguVar3 = ((zzic) ((zzlj) zzkyVar2.zza).$$delegate_0).zzi;
                                zzic.zzP(zzguVar3);
                                zzguVar3.zzd.zzb(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        zzi = zzppVar.zzi(Uri.parse("https://google.com/search?".concat(str2)));
                        if (zzi != null) {
                            zzi.putString("_cis", "referrer");
                        }
                        String str3 = (String) obj2;
                        if (!z) {
                            str = "Activity created with data 'referrer' without required params";
                            zzpp zzppVar2 = zzicVar.zzl;
                            zzic.zzN(zzppVar2);
                            Bundle zzi2 = zzppVar2.zzi(uri);
                            if (zzi2 != null) {
                                zzi2.putString("_cis", "intent");
                                if (zzi2.containsKey("gclid") || zzi == null || !zzi.containsKey("gclid")) {
                                    charSequence = "utm_medium";
                                } else {
                                    charSequence = "utm_medium";
                                    zzi2.putString("_cer", "gclid=" + zzi.getString("gclid"));
                                }
                                zzljVar.zzE(str3, "_cmp", zzi2);
                                zzxVar.zzb(zzi2, str3);
                                if (!TextUtils.isEmpty(str2)) {
                                    zzic.zzP(zzguVar);
                                    zzgs zzgsVar = zzguVar.zzk;
                                    zzgsVar.zzb(str2, "Activity created with referrer");
                                    if (!zzicVar.zzg.zzp(null, zzfy.zzaG)) {
                                        if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains(charSequence) && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                                            zzic.zzP(zzguVar);
                                            zzgsVar.zza(str);
                                            break;
                                        } else if (!TextUtils.isEmpty(str2)) {
                                            zzicVar.zzn.getClass();
                                            zzljVar.zzK("auto", "_ldl", str2, true, System.currentTimeMillis());
                                            break;
                                        }
                                    } else {
                                        if (zzi != null) {
                                            zzljVar.zzE(str3, "_cmp", zzi);
                                            zzxVar.zzb(zzi, str3);
                                        } else {
                                            zzic.zzP(zzguVar);
                                            zzgsVar.zzb(str2, "Referrer does not contain valid parameters");
                                        }
                                        zzicVar.zzn.getClass();
                                        zzljVar.zzK("auto", "_ldl", null, true, System.currentTimeMillis());
                                        break;
                                    }
                                }
                            }
                        } else {
                            str = "Activity created with data 'referrer' without required params";
                        }
                        charSequence = "utm_medium";
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    }
                    zzi = null;
                    String str32 = (String) obj2;
                    if (!z) {
                    }
                    charSequence = "utm_medium";
                    if (!TextUtils.isEmpty(str2)) {
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    zzgu zzguVar32 = ((zzic) ((zzlj) zzkyVar2.zza).$$delegate_0).zzi;
                    zzic.zzP(zzguVar32);
                    zzguVar32.zzd.zzb(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                zznl zznlVar = (zznl) obj4;
                zzgb zzgbVar = zznlVar.zzb;
                zzic zzicVar2 = (zzic) zznlVar.$$delegate_0;
                if (zzgbVar == null) {
                    zzgu zzguVar4 = zzicVar2.zzi;
                    zzic.zzP(zzguVar4);
                    zzguVar4.zzd.zza("Failed to send default event parameters to service");
                    break;
                } else {
                    zzr zzrVar = (zzr) obj3;
                    if (zzicVar2.zzg.zzp(null, zzfy.zzaW)) {
                        zznlVar.zzm(zzgbVar, z ? null : (zzbf) obj2, zzrVar);
                        break;
                    } else {
                        try {
                            zzgbVar.zzu((Bundle) obj, zzrVar);
                            zznlVar.zzae();
                            break;
                        } catch (RemoteException e4) {
                            zzgu zzguVar5 = zzicVar2.zzi;
                            zzic.zzP(zzguVar5);
                            zzguVar5.zzd.zzb(e4, "Failed to send default event parameters to service");
                        }
                    }
                }
        }
    }

    public zzk(zzky zzkyVar, boolean z, Uri uri, String str, String str2) {
        this.zzd = z;
        this.zza = uri;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzkyVar;
    }

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcs zzcsVar, String str, String str2, boolean z) {
        this.zza = zzcsVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z;
        this.zze = appMeasurementDynamiteService;
    }

    public zzk(zznl zznlVar, zzr zzrVar, boolean z, zzbf zzbfVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzd = z;
        this.zzb = zzbfVar;
        this.zzc = bundle;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }
}
