package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdwa {
    private final ConcurrentHashMap zza;
    private final zzcdp zzb;
    private final zzfhh zzc;
    private final String zzd;
    private final String zze;

    public zzdwa(zzdwk zzdwkVar, zzcdp zzcdpVar, zzfhh zzfhhVar, String str, String str2) {
        ConcurrentHashMap zzc = zzdwkVar.zzc();
        this.zza = zzc;
        this.zzb = zzcdpVar;
        this.zzc = zzfhhVar;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzha)).booleanValue()) {
            int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfhhVar);
            int i = zze - 1;
            if (i == 0) {
                zzc.put("scar", "false");
                return;
            }
            if (i == 1) {
                zzc.put("se", "query_g");
            } else if (i == 2) {
                zzc.put("se", "r_adinfo");
            } else if (i != 3) {
                zzc.put("se", "r_both");
            } else {
                zzc.put("se", "r_adstring");
            }
            zzc.put("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzhz)).booleanValue()) {
                zzc.put("ad_format", str2);
            }
            if (zze == 2) {
                zzc.put("rid", str);
            }
            zzd("ragent", zzfhhVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfhhVar.zzd)));
        }
    }

    private final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfgy zzfgyVar) {
        if (!zzfgyVar.zzb.zza.isEmpty()) {
            switch (((zzfgm) zzfgyVar.zzb.zza.get(0)).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    this.zza.put("as", true != this.zzb.zzm() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                    break;
                default:
                    this.zza.put("ad_format", "unknown");
                    break;
            }
        }
        zzd("gqi", zzfgyVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
