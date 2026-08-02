package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzbhh {
    private final ScheduledExecutorService zza;
    private Runnable zzb;
    private zzbhe zzc;
    private CustomTabsSession zzd;
    private String zze;
    private long zzf = 0;
    private long zzg;
    private JSONArray zzh;
    private Context zzi;

    public zzbhh(ScheduledExecutorService scheduledExecutorService) {
        this.zza = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzjB)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj() {
        zzbhe zzbheVar = this.zzc;
        if (zzbheVar == null) {
            zzcec.zzg("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (zzbheVar.zza().booleanValue()) {
            return;
        }
        if (this.zze != null && this.zzd != null && this.zza != null) {
            if (this.zzf == 0 || com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() > this.zzf) {
            }
            this.zzd.requestPostMessageChannel(Uri.parse(this.zze));
            this.zza.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjC)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzh == null) {
                this.zzh = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjE));
            }
            jSONObject.put("eids", this.zzh);
        } catch (JSONException e) {
            zzcec.zzh("Error fetching the PACT active eids JSON: ", e);
        }
    }

    @Nullable
    public final CustomTabsSession zzb() {
        return this.zzd;
    }

    final JSONObject zzc(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        zzk(jSONObject);
        return jSONObject;
    }

    final JSONObject zzd(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        zzk(jSONObject);
        return jSONObject;
    }

    final void zzf() {
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjA)).intValue();
        if (this.zzb == null) {
            this.zzb = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhf
                @Override // java.lang.Runnable
                public final void run() {
                    zzbhh.this.zzj();
                }
            };
        }
        zzj();
    }

    final void zzh(String str) {
        try {
            CustomTabsSession customTabsSession = this.zzd;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzg).toString());
            zzk(jSONObject);
            customTabsSession.postMessage(jSONObject.toString(), null);
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzi, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), new zzbhg(this, str));
        } catch (JSONException e) {
            zzcec.zzh("Error creating JSON: ", e);
        }
    }

    public final void zzi(long j) {
        this.zzg = j;
    }

    public final void zzg(@Nonnull Context context, @Nonnull CustomTabsClient customTabsClient, @Nonnull String str, @Nullable CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzi = context;
        this.zze = str;
        zzbhe zzbheVar = new zzbhe(this, customTabsCallback);
        this.zzc = zzbheVar;
        CustomTabsSession newSession = customTabsClient.newSession(zzbheVar);
        this.zzd = newSession;
        if (newSession == null) {
            zzcec.zzg("CustomTabsClient failed to create new session.");
        }
    }
}
