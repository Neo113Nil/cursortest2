package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bumptech.glide.load.Key;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzebl {
    private final zzclg zza;
    private final Context zzb;
    private final zzcei zzc;
    private final zzfhh zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfmz zzg;
    private final zzfhw zzh;
    private final zzdwa zzi;

    public zzebl(zzclg zzclgVar, Context context, zzcei zzceiVar, zzfhh zzfhhVar, Executor executor, String str, zzfmz zzfmzVar, zzdwa zzdwaVar) {
        this.zza = zzclgVar;
        this.zzb = context;
        this.zzc = zzceiVar;
        this.zzd = zzfhhVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfmzVar;
        this.zzh = zzclgVar.zzw();
        this.zzi = zzdwaVar;
    }

    private final ListenableFuture zzc(final String str, final String str2) {
        zzfmo zza = zzfmn.zza(this.zzb, 11);
        zza.zzh();
        final zzbrn zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzz()).zza("google.afma.response.normalize", zzbru.zza, zzbru.zza);
        ListenableFuture zzn = zzgen.zzn(zzgen.zzn(zzgen.zzn(zzgen.zzh(""), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final ListenableFuture zza(Object obj) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put(SDKConstants.PARAM_A2U_BODY, str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgen.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzebj
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final ListenableFuture zza(Object obj) {
                return zzbrn.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzebk
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final ListenableFuture zza(Object obj) {
                return zzebl.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfmy.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzcec.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zza() {
        Boolean bool;
        String str = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgX)).booleanValue()) {
                String zze = zze(str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzhi)).booleanValue() && zze.isEmpty()) {
                    int lastIndexOf = str.lastIndexOf("&request_id=");
                    zze = lastIndexOf != -1 ? str.substring(lastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(zze)) {
                    return zzgen.zzg(new zzeml(15, "Invalid ad string."));
                }
                String zzb = this.zza.zzn().zzb(zze, this.zzi);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzhi)).booleanValue()) {
                    zzdwa zzdwaVar = this.zzi;
                    if (!TextUtils.isEmpty(zzb)) {
                        if (new JSONObject(zzb).optString("is_gbid").equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                            bool = true;
                            if (bool.booleanValue()) {
                                int lastIndexOf2 = str.lastIndexOf("&");
                                String str2 = null;
                                String substring = lastIndexOf2 != -1 ? str.substring(0, lastIndexOf2) : null;
                                if (!TextUtils.isEmpty(substring)) {
                                    try {
                                        byte[] decode = Base64.decode(substring, 11);
                                        byte[] bytes = zze.getBytes(Key.STRING_CHARSET_NAME);
                                        try {
                                            str2 = new JSONObject(zzb).getString("arek");
                                        } catch (JSONException e) {
                                            com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                        }
                                        str = zzfhw.zzb(decode, bytes, str2, zzdwaVar);
                                    } catch (UnsupportedEncodingException e2) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzo().zzw(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            }
                        }
                        bool = false;
                        if (bool.booleanValue()) {
                        }
                    }
                }
                if (!TextUtils.isEmpty(zzb)) {
                    return zzc(str, zzd(zzb));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zzd.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgV)).booleanValue()) {
                String str3 = zzcVar.zza;
                String str4 = zzcVar.zzb;
                String zze2 = zze(str3);
                String zze3 = zze(str4);
                if (TextUtils.isEmpty(zze3) || !zze2.equals(zze3)) {
                    this.zzi.zza().put("ridmm", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                } else {
                    this.zza.zzn().zzf(zze2);
                    this.zzi.zza().put("rid", zze2);
                }
            }
            return zzc(zzcVar.zza, zzd(zzcVar.zzb));
        }
        return zzgen.zzg(new zzeml(14, "Mismatch request IDs."));
    }

    final /* synthetic */ ListenableFuture zzb(JSONObject jSONObject) throws Exception {
        return zzgen.zzh(new zzfgy(new zzfgv(this.zzd), zzfgx.zza(new StringReader(jSONObject.toString()))));
    }
}
