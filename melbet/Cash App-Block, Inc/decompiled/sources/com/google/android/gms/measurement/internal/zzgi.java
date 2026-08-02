package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import coil3.request.OneShotDisposable;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzaja;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzgi extends zzg {
    public String zza;
    public String zzb;
    public int zzc;
    public String zzd;
    public String zze;
    public long zzf;
    public final long zzg;
    public final long zzh;
    public List zzi;
    public String zzj;
    public final String zzk;
    public int zzl;
    public String zzm;
    public String zzn;
    public long zzo;
    public String zzp;

    public zzgi(zzic zzicVar, long j, long j2, String str) {
        super(zzicVar);
        this.zzo = 0L;
        this.zzp = null;
        this.zzg = j;
        this.zzh = j2;
        this.zzk = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzr zzh(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean z2;
        String str3;
        Class<?> loadClass;
        long zza;
        boolean z3;
        String str4;
        zzic zzicVar;
        boolean z4;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfo;
        zzfx zzfxVar;
        int i3;
        long j4;
        zzg();
        String zzj = zzj();
        String zzk = zzk();
        zzb$1();
        String str5 = this.zzb;
        zzb$1();
        long j5 = this.zzc;
        zzb$1();
        zzae.checkNotNull(this.zzd);
        String str6 = this.zzd;
        zzic zzicVar2 = (zzic) this.$$delegate_0;
        zzal zzalVar = zzicVar2.zzg;
        zzgu zzguVar = zzicVar2.zzi;
        zzal zzalVar2 = zzicVar2.zzg;
        Context context = zzicVar2.zzd;
        zzpp zzppVar = zzicVar2.zzl;
        zzhh zzhhVar = zzicVar2.zzh;
        zzalVar.zzi();
        zzb$1();
        zzg();
        long j6 = this.zzf;
        if (j6 == 0) {
            zzic.zzN(zzppVar);
            zzic zzicVar3 = (zzic) zzppVar.$$delegate_0;
            String packageName = context.getPackageName();
            zzppVar.zzg();
            zzae.checkNotEmpty(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest zzQ = zzpp.zzQ();
            long j7 = -1;
            if (zzQ == null) {
                zzgu zzguVar2 = zzicVar3.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zza("Could not get MD5 instance");
                str2 = str5;
                j = j5;
            } else {
                if (packageManager != null) {
                    try {
                        if (zzppVar.zzag(context, packageName)) {
                            str2 = str5;
                            j = j5;
                            j7 = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j5;
                                try {
                                    Signature[] signatureArr = Wrappers.packageManager(context).getPackageInfo(64, zzicVar3.zzd.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        zzgu zzguVar3 = zzicVar3.zzi;
                                        zzic.zzP(zzguVar3);
                                        zzguVar3.zzg.zza("Could not get signatures");
                                    } else {
                                        j7 = zzpp.zzR(zzQ.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    zzgu zzguVar4 = zzicVar3.zzi;
                                    zzic.zzP(zzguVar4);
                                    zzguVar4.zzd.zzb(e, "Package name not found");
                                    j2 = 0;
                                    this.zzf = j2;
                                    boolean zzB = zzicVar2.zzB();
                                    zzic.zzN(zzhhVar);
                                    boolean z5 = !zzhhVar.zzm;
                                    zzg();
                                    if (zzicVar2.zzB()) {
                                    }
                                    z2 = zzB;
                                    str3 = null;
                                    zzic.zzN(zzhhVar);
                                    zza = zzhhVar.zzc.zza();
                                    long j8 = j2;
                                    long j9 = zzicVar2.zza;
                                    if (zza != 0) {
                                    }
                                    zzb$1();
                                    int i4 = this.zzl;
                                    Boolean zzr = zzalVar2.zzr("google_analytics_adid_collection_enabled");
                                    if (zzr != null) {
                                    }
                                    zzic.zzN(zzhhVar);
                                    zzhhVar.zzg();
                                    long j10 = j9;
                                    boolean z6 = zzhhVar.zzd().getBoolean("deferred_analytics_collection", z);
                                    Boolean valueOf = Boolean.valueOf(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                                    List list = this.zzi;
                                    String zzl = zzhhVar.zzl().zzl();
                                    if (this.zzj == null) {
                                    }
                                    String str7 = this.zzj;
                                    if (zzhhVar.zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                                    }
                                    Boolean zzr2 = zzalVar2.zzr("google_analytics_sgtm_upload_enabled");
                                    if (zzr2 == null) {
                                    }
                                    zzic.zzN(zzppVar);
                                    zzicVar = (zzic) zzppVar.$$delegate_0;
                                    String str8 = str4;
                                    String zzj2 = zzj();
                                    boolean z7 = r3;
                                    if (zzicVar.zzd.getPackageManager() == null) {
                                    }
                                    zzic.zzN(zzhhVar);
                                    int i5 = zzhhVar.zzl().zzc;
                                    zzic.zzN(zzhhVar);
                                    zzhhVar.zzg();
                                    String str9 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzc;
                                    zzaif.zza();
                                    zzfxVar = zzfy.zzaP;
                                    if (zzalVar2.zzp(null, zzfxVar)) {
                                    }
                                    zzaif.zza();
                                    if (zzalVar2.zzp(null, zzfxVar)) {
                                    }
                                    String str10 = zzalVar2.zzb;
                                    long j11 = j3;
                                    String zzb = new OneShotDisposable(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true), 24).zzb();
                                    long j12 = zzicVar2.zza;
                                    zzic.zzM(zzicVar2.zzx);
                                    return new zzr(zzj, zzk, str2, j, str6, 161000L, j8, str, z2, z3, str3, j10, i4, z4, z6, valueOf, this.zzg, list, zzl, str7, str8, z7, j11, i5, str9, i3, j4, str10, zzb, j12, FillrEnv$EnumUnboxingLocalUtility.getZzm(zzicVar2.zzx.zzj()), zzalVar2.zzp(null, zzfy.zzbe) ? zzicVar2.zzb : 0L);
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j5;
                                zzgu zzguVar42 = zzicVar3.zzi;
                                zzic.zzP(zzguVar42);
                                zzguVar42.zzd.zzb(e, "Package name not found");
                                j2 = 0;
                                this.zzf = j2;
                                boolean zzB2 = zzicVar2.zzB();
                                zzic.zzN(zzhhVar);
                                boolean z52 = !zzhhVar.zzm;
                                zzg();
                                if (zzicVar2.zzB()) {
                                }
                                z2 = zzB2;
                                str3 = null;
                                zzic.zzN(zzhhVar);
                                zza = zzhhVar.zzc.zza();
                                long j82 = j2;
                                long j92 = zzicVar2.zza;
                                if (zza != 0) {
                                }
                                zzb$1();
                                int i42 = this.zzl;
                                Boolean zzr3 = zzalVar2.zzr("google_analytics_adid_collection_enabled");
                                if (zzr3 != null) {
                                }
                                zzic.zzN(zzhhVar);
                                zzhhVar.zzg();
                                long j102 = j92;
                                boolean z62 = zzhhVar.zzd().getBoolean("deferred_analytics_collection", z);
                                Boolean valueOf2 = Boolean.valueOf(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                                List list2 = this.zzi;
                                String zzl2 = zzhhVar.zzl().zzl();
                                if (this.zzj == null) {
                                }
                                String str72 = this.zzj;
                                if (zzhhVar.zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                                }
                                Boolean zzr22 = zzalVar2.zzr("google_analytics_sgtm_upload_enabled");
                                if (zzr22 == null) {
                                }
                                zzic.zzN(zzppVar);
                                zzicVar = (zzic) zzppVar.$$delegate_0;
                                String str82 = str4;
                                String zzj22 = zzj();
                                boolean z72 = r3;
                                if (zzicVar.zzd.getPackageManager() == null) {
                                }
                                zzic.zzN(zzhhVar);
                                int i52 = zzhhVar.zzl().zzc;
                                zzic.zzN(zzhhVar);
                                zzhhVar.zzg();
                                String str92 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzc;
                                zzaif.zza();
                                zzfxVar = zzfy.zzaP;
                                if (zzalVar2.zzp(null, zzfxVar)) {
                                }
                                zzaif.zza();
                                if (zzalVar2.zzp(null, zzfxVar)) {
                                }
                                String str102 = zzalVar2.zzb;
                                long j112 = j3;
                                String zzb2 = new OneShotDisposable(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true), 24).zzb();
                                long j122 = zzicVar2.zza;
                                zzic.zzM(zzicVar2.zzx);
                                return new zzr(zzj, zzk, str2, j, str6, 161000L, j82, str, z2, z3, str3, j102, i42, z4, z62, valueOf2, this.zzg, list2, zzl2, str72, str82, z72, j112, i52, str92, i3, j4, str102, zzb2, j122, FillrEnv$EnumUnboxingLocalUtility.getZzm(zzicVar2.zzx.zzj()), zzalVar2.zzp(null, zzfy.zzbe) ? zzicVar2.zzb : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j5;
                }
                j2 = 0;
                this.zzf = j2;
            }
            j2 = j7;
            this.zzf = j2;
        } else {
            str2 = str5;
            j = j5;
            z = false;
            j2 = j6;
        }
        boolean zzB22 = zzicVar2.zzB();
        zzic.zzN(zzhhVar);
        boolean z522 = !zzhhVar.zzm;
        zzg();
        if (zzicVar2.zzB()) {
            zzaja.zza();
            if (!zzalVar2.zzp(null, zzfy.zzaH)) {
                try {
                    loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    z2 = zzB22;
                    try {
                        Object[] objArr = {context};
                        str3 = null;
                        Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                        if (invoke != null) {
                            try {
                                str3 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                            } catch (Exception unused2) {
                                zzic.zzP(zzguVar);
                                zzguVar.zzi.zza("Failed to retrieve Firebase Instance Id");
                            }
                        }
                    } catch (Exception unused3) {
                        zzic.zzP(zzguVar);
                        zzguVar.zzh.zza("Failed to obtain Firebase Analytics instance");
                    }
                    zzic.zzN(zzhhVar);
                    zza = zzhhVar.zzc.zza();
                    long j822 = j2;
                    long j922 = zzicVar2.zza;
                    if (zza != 0) {
                        j922 = Math.min(j922, zza);
                    }
                    zzb$1();
                    int i422 = this.zzl;
                    Boolean zzr32 = zzalVar2.zzr("google_analytics_adid_collection_enabled");
                    boolean z8 = (zzr32 != null || zzr32.booleanValue()) ? true : z;
                    zzic.zzN(zzhhVar);
                    zzhhVar.zzg();
                    long j1022 = j922;
                    boolean z622 = zzhhVar.zzd().getBoolean("deferred_analytics_collection", z);
                    Boolean valueOf22 = Boolean.valueOf(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                    List list22 = this.zzi;
                    String zzl22 = zzhhVar.zzl().zzl();
                    if (this.zzj == null) {
                        zzic.zzN(zzppVar);
                        this.zzj = zzppVar.zzaz();
                    }
                    String str722 = this.zzj;
                    if (zzhhVar.zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                        zzg();
                        if (this.zzo == 0) {
                            z3 = z522;
                        } else {
                            zzicVar2.zzn.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.zzo;
                            z3 = z522;
                            if (this.zzn != null && currentTimeMillis > 86400000 && this.zzp == null) {
                                zzi$1();
                            }
                        }
                        if (this.zzn == null) {
                            zzi$1();
                        }
                        str4 = this.zzn;
                    } else {
                        z3 = z522;
                        str4 = null;
                    }
                    Boolean zzr222 = zzalVar2.zzr("google_analytics_sgtm_upload_enabled");
                    boolean booleanValue = zzr222 == null ? false : zzr222.booleanValue();
                    zzic.zzN(zzppVar);
                    zzicVar = (zzic) zzppVar.$$delegate_0;
                    String str822 = str4;
                    String zzj222 = zzj();
                    boolean z722 = booleanValue;
                    if (zzicVar.zzd.getPackageManager() == null) {
                        z4 = z8;
                        j3 = 0;
                    } else {
                        try {
                            z4 = z8;
                            i = 0;
                            try {
                                applicationInfo = Wrappers.packageManager(zzicVar.zzd).getApplicationInfo(0, zzj222);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                zzgu zzguVar5 = zzicVar.zzi;
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzj.zzb(zzj222, "PackageManager failed to find running app: app_id");
                                i2 = i;
                                j3 = i2;
                                zzic.zzN(zzhhVar);
                                int i522 = zzhhVar.zzl().zzc;
                                zzic.zzN(zzhhVar);
                                zzhhVar.zzg();
                                String str922 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzc;
                                zzaif.zza();
                                zzfxVar = zzfy.zzaP;
                                if (zzalVar2.zzp(null, zzfxVar)) {
                                }
                                zzaif.zza();
                                if (zzalVar2.zzp(null, zzfxVar)) {
                                }
                                String str1022 = zzalVar2.zzb;
                                long j1122 = j3;
                                String zzb22 = new OneShotDisposable(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true), 24).zzb();
                                long j1222 = zzicVar2.zza;
                                zzic.zzM(zzicVar2.zzx);
                                return new zzr(zzj, zzk, str2, j, str6, 161000L, j822, str, z2, z3, str3, j1022, i422, z4, z622, valueOf22, this.zzg, list22, zzl22, str722, str822, z722, j1122, i522, str922, i3, j4, str1022, zzb22, j1222, FillrEnv$EnumUnboxingLocalUtility.getZzm(zzicVar2.zzx.zzj()), zzalVar2.zzp(null, zzfy.zzbe) ? zzicVar2.zzb : 0L);
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                            z4 = z8;
                            i = 0;
                        }
                        if (applicationInfo != null) {
                            i2 = applicationInfo.targetSdkVersion;
                            j3 = i2;
                        }
                        i2 = i;
                        j3 = i2;
                    }
                    zzic.zzN(zzhhVar);
                    int i5222 = zzhhVar.zzl().zzc;
                    zzic.zzN(zzhhVar);
                    zzhhVar.zzg();
                    String str9222 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzc;
                    zzaif.zza();
                    zzfxVar = zzfy.zzaP;
                    if (zzalVar2.zzp(null, zzfxVar)) {
                        i3 = 0;
                    } else {
                        zzic.zzN(zzppVar);
                        i3 = zzpp.zzW();
                    }
                    zzaif.zza();
                    if (zzalVar2.zzp(null, zzfxVar)) {
                        j4 = 0;
                    } else {
                        zzic.zzN(zzppVar);
                        j4 = zzppVar.zzX();
                    }
                    String str10222 = zzalVar2.zzb;
                    long j11222 = j3;
                    String zzb222 = new OneShotDisposable(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true), 24).zzb();
                    long j12222 = zzicVar2.zza;
                    zzic.zzM(zzicVar2.zzx);
                    return new zzr(zzj, zzk, str2, j, str6, 161000L, j822, str, z2, z3, str3, j1022, i422, z4, z622, valueOf22, this.zzg, list22, zzl22, str722, str822, z722, j11222, i5222, str9222, i3, j4, str10222, zzb222, j12222, FillrEnv$EnumUnboxingLocalUtility.getZzm(zzicVar2.zzx.zzj()), zzalVar2.zzp(null, zzfy.zzbe) ? zzicVar2.zzb : 0L);
                }
                z2 = zzB22;
                str3 = null;
                zzic.zzN(zzhhVar);
                zza = zzhhVar.zzc.zza();
                long j8222 = j2;
                long j9222 = zzicVar2.zza;
                if (zza != 0) {
                }
                zzb$1();
                int i4222 = this.zzl;
                Boolean zzr322 = zzalVar2.zzr("google_analytics_adid_collection_enabled");
                if (zzr322 != null) {
                }
                zzic.zzN(zzhhVar);
                zzhhVar.zzg();
                long j10222 = j9222;
                boolean z6222 = zzhhVar.zzd().getBoolean("deferred_analytics_collection", z);
                Boolean valueOf222 = Boolean.valueOf(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
                List list222 = this.zzi;
                String zzl222 = zzhhVar.zzl().zzl();
                if (this.zzj == null) {
                }
                String str7222 = this.zzj;
                if (zzhhVar.zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                }
                Boolean zzr2222 = zzalVar2.zzr("google_analytics_sgtm_upload_enabled");
                if (zzr2222 == null) {
                }
                zzic.zzN(zzppVar);
                zzicVar = (zzic) zzppVar.$$delegate_0;
                String str8222 = str4;
                String zzj2222 = zzj();
                boolean z7222 = booleanValue;
                if (zzicVar.zzd.getPackageManager() == null) {
                }
                zzic.zzN(zzhhVar);
                int i52222 = zzhhVar.zzl().zzc;
                zzic.zzN(zzhhVar);
                zzhhVar.zzg();
                String str92222 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzc;
                zzaif.zza();
                zzfxVar = zzfy.zzaP;
                if (zzalVar2.zzp(null, zzfxVar)) {
                }
                zzaif.zza();
                if (zzalVar2.zzp(null, zzfxVar)) {
                }
                String str102222 = zzalVar2.zzb;
                long j112222 = j3;
                String zzb2222 = new OneShotDisposable(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true), 24).zzb();
                long j122222 = zzicVar2.zza;
                zzic.zzM(zzicVar2.zzx);
                return new zzr(zzj, zzk, str2, j, str6, 161000L, j8222, str, z2, z3, str3, j10222, i4222, z4, z6222, valueOf222, this.zzg, list222, zzl222, str7222, str8222, z7222, j112222, i52222, str92222, i3, j4, str102222, zzb2222, j122222, FillrEnv$EnumUnboxingLocalUtility.getZzm(zzicVar2.zzx.zzj()), zzalVar2.zzp(null, zzfy.zzbe) ? zzicVar2.zzb : 0L);
            }
            zzic.zzP(zzguVar);
            zzguVar.zzl.zza("Disabled IID for tests.");
        }
        z2 = zzB22;
        str3 = null;
        zzic.zzN(zzhhVar);
        zza = zzhhVar.zzc.zza();
        long j82222 = j2;
        long j92222 = zzicVar2.zza;
        if (zza != 0) {
        }
        zzb$1();
        int i42222 = this.zzl;
        Boolean zzr3222 = zzalVar2.zzr("google_analytics_adid_collection_enabled");
        if (zzr3222 != null) {
        }
        zzic.zzN(zzhhVar);
        zzhhVar.zzg();
        long j102222 = j92222;
        boolean z62222 = zzhhVar.zzd().getBoolean("deferred_analytics_collection", z);
        Boolean valueOf2222 = Boolean.valueOf(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED);
        List list2222 = this.zzi;
        String zzl2222 = zzhhVar.zzl().zzl();
        if (this.zzj == null) {
        }
        String str72222 = this.zzj;
        if (zzhhVar.zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
        }
        Boolean zzr22222 = zzalVar2.zzr("google_analytics_sgtm_upload_enabled");
        if (zzr22222 == null) {
        }
        zzic.zzN(zzppVar);
        zzicVar = (zzic) zzppVar.$$delegate_0;
        String str82222 = str4;
        String zzj22222 = zzj();
        boolean z72222 = booleanValue;
        if (zzicVar.zzd.getPackageManager() == null) {
        }
        zzic.zzN(zzhhVar);
        int i522222 = zzhhVar.zzl().zzc;
        zzic.zzN(zzhhVar);
        zzhhVar.zzg();
        String str922222 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzc;
        zzaif.zza();
        zzfxVar = zzfy.zzaP;
        if (zzalVar2.zzp(null, zzfxVar)) {
        }
        zzaif.zza();
        if (zzalVar2.zzp(null, zzfxVar)) {
        }
        String str1022222 = zzalVar2.zzb;
        long j1122222 = j3;
        String zzb22222 = new OneShotDisposable(zzalVar2.zzw("google_analytics_default_allow_ad_personalization_signals", true), 24).zzb();
        long j1222222 = zzicVar2.zza;
        zzic.zzM(zzicVar2.zzx);
        return new zzr(zzj, zzk, str2, j, str6, 161000L, j82222, str, z2, z3, str3, j102222, i42222, z4, z62222, valueOf2222, this.zzg, list2222, zzl2222, str72222, str82222, z72222, j1122222, i522222, str922222, i3, j4, str1022222, zzb22222, j1222222, FillrEnv$EnumUnboxingLocalUtility.getZzm(zzicVar2.zzx.zzj()), zzalVar2.zzp(null, zzfy.zzbe) ? zzicVar2.zzb : 0L);
    }

    public final void zzi$1() {
        String format2;
        zzg();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzhh zzhhVar = zzicVar.zzh;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzN(zzhhVar);
        if (zzhhVar.zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzpp zzppVar = zzicVar.zzl;
            zzic.zzN(zzppVar);
            zzppVar.zzf().nextBytes(bArr);
            format2 = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzic.zzP(zzguVar);
            zzguVar.zzk.zza("Analytics Storage consent is not granted");
            format2 = null;
        }
        zzic.zzP(zzguVar);
        zzguVar.zzk.zza("Resetting session stitching token to ".concat(format2 == null ? "null" : "not null"));
        this.zzn = format2;
        zzicVar.zzn.getClass();
        this.zzo = System.currentTimeMillis();
    }

    public final String zzj() {
        zzb$1();
        zzae.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzk() {
        zzg();
        zzb$1();
        zzae.checkNotNull(this.zzm);
        return this.zzm;
    }
}
