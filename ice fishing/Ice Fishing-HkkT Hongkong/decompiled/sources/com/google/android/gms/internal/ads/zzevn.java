package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzevn implements zzexq {
    private final zzgey zza;
    private final zzfhh zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzevn(zzgey zzgeyVar, zzfhh zzfhhVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgeyVar;
        this.zzb = zzfhhVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzevo zzc(final zzevn zzevnVar) {
        final ArrayList arrayList = zzevnVar.zzb.zzg;
        return arrayList == null ? new zzevo() { // from class: com.google.android.gms.internal.ads.zzevk
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
            }
        } : arrayList.isEmpty() ? new zzevo() { // from class: com.google.android.gms.internal.ads.zzevl
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzevo() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                zzevn.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevn.zzc(zzevn.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r9 == 3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzd(ArrayList arrayList, Bundle bundle) {
        JSONArray optJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzb.zzh);
        String str = "landscape";
        if (this.zzb.zzi.zza > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.zzb.zzi.zzh;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i2 = this.zzb.zzi.zzc;
        if (i2 == 0) {
            str = "any";
        } else if (i2 == 1) {
            str = "portrait";
        } else if (i2 != 2) {
            str = "unknown";
        }
        if (!"unknown".equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.zzb.zzi.zzd);
        bundle.putBoolean("use_custom_mute", this.zzb.zzi.zzg);
        zzbjb zzbjbVar = this.zzb.zzi;
        if (zzbjbVar.zzi != 0) {
            bundle.putBoolean("sccg_tap", zzbjbVar.zzj);
            bundle.putInt("sccg_dir", this.zzb.zzi.zzi);
        }
        PackageInfo packageInfo = this.zzc;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzd.zza()) {
            this.zzd.zzs();
            this.zzd.zzv(i3);
        }
        JSONObject zzp = this.zzd.zzp();
        String str3 = null;
        if (zzp != null && (optJSONArray = zzp.optJSONArray(this.zzb.zzf)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i4 = this.zzb.zzk;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzbpp zzbppVar = this.zzb.zzb;
        if (zzbppVar != null) {
            if (TextUtils.isEmpty(zzbppVar.zzc)) {
                String str4 = "p";
                if (zzbppVar.zza >= 2) {
                    int i5 = zzbppVar.zzd;
                    if (i5 != 2) {
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                } else {
                    int i6 = zzbppVar.zzb;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            zzcec.zzg("Instream ad video aspect ratio " + i6 + " is wrong.");
                        }
                        bundle.putString("ia_var", str4);
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                }
            } else {
                bundle.putString("ad_tag", zzbppVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzb.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzlj)).booleanValue()) {
            if (this.zzb.zzi.zzf != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("startMuted", this.zzb.zzi.zzf.zza);
                bundle2.putBoolean("clickToExpandRequested", this.zzb.zzi.zzf.zzc);
                bundle2.putBoolean("customControlsRequested", this.zzb.zzi.zzf.zzb);
                bundle.putBundle(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO, bundle2);
            }
            bundle.putBoolean("disable_image_loading", this.zzb.zzi.zzb);
            bundle.putInt("preferred_ad_choices_position", this.zzb.zzi.zze);
        }
    }
}
