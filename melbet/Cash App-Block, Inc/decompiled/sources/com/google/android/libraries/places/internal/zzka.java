package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.provider.Settings;
import android.util.Log;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AppsFlyerProperties;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.core.utilities.ConnectionUtil;
import com.fillr.service.BaseMappingService;
import com.google.android.libraries.places.api.Places;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.mlkit.common.sdkinternal.zzb;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import net.oneformapp.ProfileStore_;
import net.oneformapp.schema.Schema;
import net.oneformapp.schema.Schema_;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzka {
    public String zza;
    public Object zzb;
    public int zzc;
    public final Context zzd;
    public Object zze;
    public Object zzf;
    public Object zzg;
    public boolean zzh;
    public Object zzi;

    public zzka(Context context, zzbsd zzbsdVar, zzje zzjeVar, zzjt zzjtVar) {
        this.zzh = false;
        this.zzd = context;
        this.zzf = new zzbgl(zzbsdVar, zzbov.zza.zzh(zzcko.zza, zzckm.zzb), 1);
        this.zzg = zzjeVar;
        this.zzi = Places.zza;
        this.zze = zzjtVar;
    }

    public JSONObject buildJson() {
        String str;
        String str2;
        String str3;
        String str4 = "";
        BaseMappingService baseMappingService = (BaseMappingService) this.zzd;
        JSONObject jSONObject = new JSONObject(this.zza);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("internal", false);
        JSONObject jSONObject3 = new JSONObject();
        try {
            str = baseMappingService.getPackageManager().getPackageInfo(baseMappingService.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            str = "";
        }
        jSONObject3.put("app", str);
        String str5 = (String) this.zze;
        if (str5 != null) {
            jSONObject3.put("schema", str5);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("platform", "android");
        jSONObject4.put("connection", ((ConnectivityManager) baseMappingService.getSystemService("connectivity")).getActiveNetworkInfo());
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("fillr_core_version", "11.2.0");
        jSONObject5.put("version", "11.2.0");
        jSONObject5.put("dev_key", (String) this.zzf);
        jSONObject5.put("extension", false);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("version", 1);
        try {
            str4 = ConnectionUtil.calculateSignature(ConnectionUtil.getMappingRequestMessage(jSONObject), (String) this.zzg);
        } catch (Exception e2) {
            Log.w("PayloadSigningUtil", e2.getMessage() + "");
        }
        jSONObject6.put("hmac", str4);
        jSONObject.put("device", jSONObject4);
        jSONObject.put("sdk", jSONObject5);
        jSONObject.put("user", jSONObject2);
        jSONObject.put("version", jSONObject3);
        try {
            str2 = Settings.Secure.getString(baseMappingService.getContentResolver(), "android_id");
        } catch (Exception unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
            str2 = null;
        }
        jSONObject.put("user_id", str2);
        jSONObject.put("signature", jSONObject6);
        jSONObject.put("whitelist_disabled", this.zzh);
        FillrWidget.WidgetSource widgetSource = (FillrWidget.WidgetSource) this.zzb;
        FillrWidget.WidgetSource widgetSource2 = FillrWidget.WidgetSource.REMOTE;
        jSONObject.put("remote_autofill", widgetSource == widgetSource2);
        jSONObject.put("remote_cartscraper", ((FillrWidget.WidgetSource) this.zzi) == widgetSource2);
        jSONObject.put("remote_abandonment", false);
        Schema_.getInstance_(baseMappingService);
        ProfileStore_.getInstance_(baseMappingService);
        int i = this.zzc;
        if (i != 0) {
            if (i == 1) {
                str3 = "fill";
            } else if (i == 2) {
                str3 = "capture";
            } else {
                if (i != 3) {
                    throw null;
                }
                str3 = "headless";
            }
            jSONObject.put("flow", str3);
        }
        return jSONObject;
    }

    public zzckj zzd(int i, String str) {
        if (this.zzh) {
            a$$ExternalSyntheticBUOutline0.m$1("Too many concurrent requests");
            return null;
        }
        this.zzh = true;
        zzbmu zzc$1 = zzbmw.zzc$1();
        zzc$1.zzy();
        ((zzbmw) zzc$1.zza).zzf$2(i);
        zzc$1.zzy();
        ((zzbmw) zzc$1.zza).zzg(str);
        String packageName = this.zzd.getPackageName();
        zzc$1.zzy();
        ((zzbmw) zzc$1.zza).zzh$1(packageName);
        zzc$1.zzy();
        ((zzbmw) zzc$1.zza).zzj(4);
        zzbmw zzbmwVar = (zzbmw) zzc$1.zzD();
        zzbgl zzbglVar = (zzbgl) this.zzf;
        zzje zzjeVar = (zzje) this.zzg;
        String zze = ((zznj) this.zzi).zze();
        zzjeVar.getClass();
        zzbsn zzbsnVar = new zzbsn();
        zzbsg zzbsgVar = zzbsn.zza;
        BitSet bitSet = zzbsj.zzb;
        zzbsnVar.zzc(new zzbsh("X-Goog-Api-Key", zzbsgVar), zze);
        zzjeVar.zzc(zzbsnVar);
        zzayi[] zzayiVarArr = {new zzayi(zzbsnVar, 1)};
        zzbow zzbowVar = (zzbow) zzbglVar.zza;
        List asList = Arrays.asList(zzayiVarArr);
        Trace.checkNotNull(zzbowVar, AppsFlyerProperties.CHANNEL);
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            zzbowVar = new zzbpc(zzbowVar, (zzayi) it.next());
        }
        zzbgl zzbglVar2 = (zzbgl) zzbglVar.zza(zzbowVar, (zzbov) zzbglVar.zzd);
        zzbow zzbowVar2 = (zzbow) zzbglVar2.zza;
        Schema schema = zzkf.f79zzb;
        if (schema == null) {
            synchronized (zzkf.class) {
                try {
                    schema = zzkf.f79zzb;
                    if (schema == null) {
                        zzbso zzi = Schema.zzi();
                        zzi.zzc = zzbsq.zza;
                        zzi.zzd = Schema.zzh("google.internal.maps.gmpsdksbackend.v1.GmpSdksBackendService", "GetPlaceWidgetMetadata");
                        zzi.zze = true;
                        zzbmw zze2 = zzbmw.zze();
                        zzbjc zzbjcVar = zzckb.zza;
                        zzi.zza = new zzcka(zze2);
                        zzi.zzb = new zzcka(zzbnf.zze());
                        Schema zzf = zzi.zzf();
                        zzkf.f79zzb = zzf;
                        schema = zzf;
                    }
                } finally {
                }
            }
        }
        zzckj zzb = zzcko.zzb(zzbowVar2.zza(schema, (zzbov) zzbglVar2.zzd), zzbmwVar);
        Sniffer sniffer = new Sniffer(this, i, 18);
        zzb.addListener(new zzb(zzb, sniffer, false, 15), DirectExecutor.INSTANCE);
        return zzb;
    }

    public zzka(BaseMappingService baseMappingService, String str) {
        this.zzd = baseMappingService;
        this.zza = str;
    }
}
