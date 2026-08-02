package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public class zzhgy {
    final LinkedHashMap zza;

    zzhgy(int i) {
        this.zza = zzhha.zzb(i);
    }

    final zzhgy zza(Object obj, zzhhm zzhhmVar) {
        zzhhl.zza(obj, SDKConstants.PARAM_KEY);
        zzhhl.zza(zzhhmVar, "provider");
        this.zza.put(obj, zzhhmVar);
        return this;
    }
}
