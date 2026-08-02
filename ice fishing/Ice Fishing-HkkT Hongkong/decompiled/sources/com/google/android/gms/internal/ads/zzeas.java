package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzeas implements zzhhd {
    private final zzhhu zza;

    public zzeas(zzhhu zzhhuVar) {
        this.zza = zzhhuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.zzhhu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb() {
        String valueOf;
        zzfhh zza = ((zzdao) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzhm)).booleanValue()) {
            String str = zza.zzd.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    valueOf = new JSONObject(str).getString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
                } catch (JSONException unused) {
                }
            }
            if (zza.zzd.zzs != null) {
                try {
                    valueOf = new JSONObject(zza.zzd.zzs.zza).getString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
                } catch (JSONException unused2) {
                }
            }
        }
        valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zze().nextInt() & Integer.MAX_VALUE);
        zzhhl.zzb(valueOf);
        return valueOf;
    }
}
