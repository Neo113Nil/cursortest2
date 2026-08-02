package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzcrt implements zzcqv {
    private final zzdzd zza;

    zzcrt(zzdzd zzdzdVar) {
        this.zza = zzdzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzn(str.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE));
    }
}
