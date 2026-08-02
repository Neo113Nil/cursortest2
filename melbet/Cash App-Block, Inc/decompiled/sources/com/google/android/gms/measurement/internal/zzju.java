package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.tasks.zzb;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes4.dex */
public final class zzju extends zzaz {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzjg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzju(zzlj zzljVar, zzjg zzjgVar, int i) {
        super(zzjgVar);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(zzljVar);
                this.zza = zzljVar;
                super(zzjgVar);
                break;
            default:
                Objects.requireNonNull(zzljVar);
                this.zza = zzljVar;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x016b, code lost:
    
        if (r0.zzak() >= 234200) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    @Override // com.google.android.gms.measurement.internal.zzaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        zzao zzw;
        Bundle bundle;
        URL url;
        int i = this.$r8$classId;
        zzjg zzjgVar = this.zza;
        switch (i) {
            case 0:
                zzlj zzljVar = ((zzic) ((zzlj) zzjgVar).$$delegate_0).zzp;
                zzic.zzO(zzljVar);
                new Thread(new zzv(zzljVar, r1)).start();
                break;
            case 1:
                ((zzlj) zzjgVar).zzy$1();
                break;
            case 2:
                zzlj zzljVar2 = (zzlj) zzjgVar;
                zzic zzicVar = (zzic) zzljVar2.$$delegate_0;
                zzhh zzhhVar = zzicVar.zzh;
                zzgu zzguVar = zzicVar.zzi;
                zzhz zzhzVar = zzicVar.zzj;
                zzic.zzP(zzhzVar);
                zzhzVar.zzg();
                zzlo zzloVar = zzicVar.zzr;
                zzic.zzP(zzloVar);
                zzic zzicVar2 = (zzic) zzloVar.$$delegate_0;
                zzic.zzP(zzloVar);
                String zzj = zzicVar.zzv().zzj();
                Boolean zzr = zzicVar.zzg.zzr("google_analytics_adid_collection_enabled");
                int i2 = 0;
                if (zzr == null || zzr.booleanValue()) {
                    zzic.zzN(zzhhVar);
                    zzic zzicVar3 = (zzic) zzhhVar.$$delegate_0;
                    zzhhVar.zzg();
                    if (zzhhVar.zzl().zzo(zzjk.AD_STORAGE)) {
                        zzicVar3.zzn.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str = zzhhVar.zzx;
                        if (str == null || elapsedRealtime >= zzhhVar.zzz) {
                            zzhhVar.zzz = zzicVar3.zzg.zzl(zzj, zzfy.zza) + elapsedRealtime;
                            try {
                                MarkdownElementType advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzicVar3.zzd);
                                zzhhVar.zzx = "";
                                String str2 = advertisingIdInfo.name;
                                if (str2 != null) {
                                    zzhhVar.zzx = str2;
                                }
                                zzhhVar.zzy = advertisingIdInfo.isToken;
                            } catch (Exception e) {
                                zzgu zzguVar2 = zzicVar3.zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzk.zzb(e, "Unable to get advertising id");
                                zzhhVar.zzx = "";
                            }
                            pair = new Pair(zzhhVar.zzx, Boolean.valueOf(zzhhVar.zzy));
                        } else {
                            pair = new Pair(str, Boolean.valueOf(zzhhVar.zzy));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                        zzic.zzP(zzguVar);
                        zzguVar.zzl.zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    } else {
                        zzic.zzP(zzloVar);
                        zzloVar.zzw();
                        ConnectivityManager connectivityManager = (ConnectivityManager) zzicVar2.zzd.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                StringBuilder sb = new StringBuilder();
                                zznl zzt = zzicVar.zzt();
                                zzt.zzg();
                                zzt.zzb$1();
                                if (zzt.zzK()) {
                                    zzpp zzppVar = ((zzic) zzt.$$delegate_0).zzl;
                                    zzic.zzN(zzppVar);
                                    break;
                                }
                                zzlj zzljVar3 = zzicVar.zzp;
                                zzic.zzO(zzljVar3);
                                zzic zzicVar4 = (zzic) zzljVar3.$$delegate_0;
                                zzljVar3.zzg();
                                zznl zzt2 = zzicVar4.zzt();
                                zzic zzicVar5 = (zzic) zzt2.$$delegate_0;
                                zzt2.zzg();
                                zzt2.zzb$1();
                                zzgb zzgbVar = zzt2.zzb;
                                if (zzgbVar == null) {
                                    zzt2.zzI();
                                    zzgu zzguVar3 = zzicVar5.zzi;
                                    zzic.zzP(zzguVar3);
                                    zzguVar3.zzk.zza("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        zzw = zzgbVar.zzw(zzt2.zzah(false));
                                        zzt2.zzae();
                                    } catch (RemoteException e2) {
                                        zzgu zzguVar4 = zzicVar5.zzi;
                                        zzic.zzP(zzguVar4);
                                        zzguVar4.zzd.zzb(e2, "Failed to get consents; remote exception");
                                    }
                                    bundle = zzw == null ? zzw.zza : null;
                                    if (bundle != null) {
                                        int i3 = zzicVar.zzE;
                                        zzicVar.zzE = i3 + 1;
                                        r1 = i3 >= 10 ? 0 : 1;
                                        zzic.zzP(zzguVar);
                                        zzgs zzgsVar = zzguVar.zzk;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        zzgsVar.zzb(Integer.valueOf(zzicVar.zzE), JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, i3 < 10 ? "Retrying." : "Skipping.", " retryCount"));
                                        i2 = r1;
                                    } else {
                                        zzjl zze = zzjl.zze(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(zze.zzk());
                                        zzba zzh = zzba.zzh(100, bundle);
                                        String str3 = zzh.zze;
                                        sb.append("&dma=");
                                        Boolean bool = zzh.zzd;
                                        Boolean bool2 = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool, bool2) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str3)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str3);
                                        }
                                        int ordinal = zzjl.zzg(bundle.getString("ad_personalization")).ordinal();
                                        if (ordinal != 2) {
                                            bool2 = ordinal != 3 ? null : Boolean.TRUE;
                                        }
                                        int i4 = !Objects.equals(bool2, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i4);
                                        zzic.zzP(zzguVar);
                                        zzguVar.zzl.zzb(sb, "Consent query parameters to Bow");
                                        zzpp zzppVar2 = zzicVar.zzl;
                                        zzic.zzN(zzppVar2);
                                        ((zzic) zzicVar.zzv().$$delegate_0).zzg.zzi();
                                        String str4 = (String) pair.first;
                                        long zza = zzhhVar.zzp.zza() - 1;
                                        String sb3 = sb.toString();
                                        zzic zzicVar6 = (zzic) zzppVar2.$$delegate_0;
                                        try {
                                            zzae.checkNotEmpty(str4);
                                            zzae.checkNotEmpty(zzj);
                                            String str5 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + zzppVar2.zzak()) + "&rdid=" + str4 + "&bundleid=" + zzj + "&retry=" + zza;
                                            if (zzj.equals(zzicVar6.zzg.zzK("debug.deferred.deeplink"))) {
                                                str5 = str5.concat("&ddl_test=1");
                                            }
                                            if (!sb3.isEmpty()) {
                                                if (sb3.charAt(0) != '&') {
                                                    str5 = str5.concat("&");
                                                }
                                                str5 = str5.concat(sb3);
                                            }
                                            url = new URL(str5);
                                        } catch (IllegalArgumentException | MalformedURLException e3) {
                                            zzgu zzguVar5 = zzicVar6.zzi;
                                            zzic.zzP(zzguVar5);
                                            zzguVar5.zzd.zzb(e3.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            zzic.zzP(zzloVar);
                                            zzb zzbVar = new zzb(zzicVar, 24);
                                            zzloVar.zzw();
                                            zzhz zzhzVar2 = zzicVar2.zzj;
                                            zzic.zzP(zzhzVar2);
                                            zzhzVar2.zzm(new zzgy(zzloVar, zzj, url, (byte[]) null, (HashMap) null, zzbVar));
                                        }
                                    }
                                }
                                zzw = null;
                                if (zzw == null) {
                                }
                                if (bundle != null) {
                                }
                            } else {
                                zzic.zzP(zzguVar);
                                zzguVar.zzg.zza("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        zzic.zzP(zzguVar);
                        zzguVar.zzg.zza("Network is not available for Deferred Deep Link request. Skipping");
                    }
                } else {
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zza("ADID collection is disabled from Manifest. Skipping");
                }
                if (i2 != 0) {
                    zzljVar2.zzq.zzb(2000L);
                    break;
                }
                break;
            default:
                zzpg zzpgVar = (zzpg) zzjgVar;
                zzpgVar.zzaX().zzg();
                String str6 = (String) zzpgVar.zzr.pollFirst();
                if (str6 != null) {
                    zzpgVar.zzba().getClass();
                    zzpgVar.zzJ = SystemClock.elapsedRealtime();
                    zzpgVar.zzaW().zzl.zzb(str6, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str6);
                    zzpg.zzaR(zzpgVar.zzn.zzd, intent);
                }
                zzpgVar.zzaG();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzju(zzjg zzjgVar, zzjg zzjgVar2, int i) {
        super(zzjgVar2);
        this.$r8$classId = i;
        this.zza = zzjgVar;
    }
}
