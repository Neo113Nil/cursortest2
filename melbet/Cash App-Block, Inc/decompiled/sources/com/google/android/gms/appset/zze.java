package com.google.android.gms.appset;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.appset.zzr;

/* loaded from: classes4.dex */
public abstract class zze {
    public static final Feature zza;
    public static final Feature[] zzb;

    static {
        Feature feature = new Feature("app_set_id", 1L);
        zza = feature;
        zzb = new Feature[]{feature};
    }

    public static zzr getClient(Context context) {
        return new zzr(context);
    }
}
