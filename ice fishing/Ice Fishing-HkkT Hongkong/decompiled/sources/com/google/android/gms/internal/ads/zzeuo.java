package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.appevents.AppEventsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzeuo implements zzexp {
    public final String zza;
    public final boolean zzb;

    public zzeuo(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
    }
}
