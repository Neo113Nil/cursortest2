package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzbgi {
    private final String zza = (String) zzbhu.zzb.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbgi(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        linkedHashMap.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, com.google.android.gms.ads.internal.util.zzt.zzr());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(context);
        String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        linkedHashMap.put("is_lite_sdk", true != zzD ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        Future zzb = com.google.android.gms.ads.internal.zzt.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbzj) zzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbzj) zzb.get()).zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkL)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzp();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzt.zzA(context) ? AppEventsConstants.EVENT_PARAM_VALUE_YES : str2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjn)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcc)).booleanValue() || zzfxt.zzd(com.google.android.gms.ads.internal.zzt.zzo().zzn())) {
                return;
            }
            this.zzb.put("plugin", com.google.android.gms.ads.internal.zzt.zzo().zzn());
        }
    }

    final Context zza() {
        return this.zzc;
    }

    final String zzb() {
        return this.zzd;
    }

    final String zzc() {
        return this.zza;
    }

    final Map zzd() {
        return this.zzb;
    }
}
