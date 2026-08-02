package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import com.fillr.analytics.metrics.AnalyticsMessages;
import com.fillr.analytics.metrics.FillrAPI;
import com.google.android.gms.tasks.zzb;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zziv implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;
    public final Object zzb;
    public final Object zzc;

    public zziv(Context context, String str, zzb zzbVar) {
        this.$r8$classId = 2;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$r8$classId;
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        switch (i) {
            case 0:
                zzjd zzjdVar = (zzjd) obj;
                zzjdVar.zza.zzaa$1();
                return zzjdVar.zza.zzar((Bundle) obj2, (zzr) obj3);
            case 1:
                zzjd zzjdVar2 = (zzjd) obj;
                zzjdVar2.zza.zzaa$1();
                return zzjdVar2.zza.zzar((Bundle) obj2, (zzr) obj3);
            default:
                SharedPreferences sharedPreferences = ((Context) obj3).getSharedPreferences((String) obj2, 0);
                zzb zzbVar = (zzb) obj;
                if (zzbVar != null) {
                    JSONArray jSONArray = null;
                    String string2 = sharedPreferences.getString("people_distinct_id", null);
                    String string3 = sharedPreferences.getString("waiting_array", null);
                    if (string3 != null && string2 != null) {
                        try {
                            JSONArray jSONArray2 = new JSONArray(string3);
                            jSONArray = new JSONArray();
                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                try {
                                    JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                                    jSONObject.put("$distinct_id", string2);
                                    jSONArray.put(jSONObject);
                                } catch (JSONException unused) {
                                }
                            }
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.remove("waiting_array");
                            edit.apply();
                        } catch (JSONException unused2) {
                        }
                    }
                    if (jSONArray != null) {
                        FillrAPI fillrAPI = (FillrAPI) zzbVar.zza;
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            try {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                AnalyticsMessages analyticsMessages = fillrAPI.mMessages;
                                analyticsMessages.getClass();
                                Message obtain = Message.obtain();
                                obtain.what = 0;
                                obtain.obj = jSONObject2;
                                analyticsMessages.mWorker.runMessage(obtain);
                            } catch (JSONException unused3) {
                            }
                        }
                    }
                }
                return sharedPreferences;
        }
    }

    public /* synthetic */ zziv(zzjd zzjdVar, zzr zzrVar, Bundle bundle, int i) {
        this.$r8$classId = i;
        this.zza = zzrVar;
        this.zzb = bundle;
        this.zzc = zzjdVar;
    }
}
