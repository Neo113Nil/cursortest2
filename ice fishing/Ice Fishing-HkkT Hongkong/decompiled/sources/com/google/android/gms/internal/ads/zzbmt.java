package com.google.android.gms.internal.ads;

import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzbmt implements zzbng {
    zzbmt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfwk.zzc(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, str) && !zzfwk.zzc("false", str)) {
                return;
            }
            zzfuf.zzi(zzcjkVar.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
