package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzfue;
import com.google.android.gms.internal.ads.zzfuf;
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfxr;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes.dex */
public final class zzad {
    public static Bundle zza(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle zzb(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                zzcec.zzf("JSON parsing error", e);
            }
            if (jSONArray != null) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("bk");
                String optString2 = optJSONObject.optString("sk");
                int optInt = optJSONObject.optInt("type", -1);
                int i2 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i2 != 0) {
                    List zzf = zzfxr.zzc(zzfwp.zzc('/')).zzf(optString2);
                    if (zzf.size() > 2 || zzf.isEmpty()) {
                        obj = null;
                    } else {
                        if (zzf.size() == 1) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                            str2 = (String) zzf.get(0);
                        } else {
                            sharedPreferences = context.getSharedPreferences((String) zzf.get(0), 0);
                            str2 = (String) zzf.get(1);
                        }
                        obj = sharedPreferences.getAll().get(str2);
                    }
                    if (obj != null) {
                        int i3 = i2 - 1;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (obj instanceof Boolean) {
                                    bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                                }
                            } else if (obj instanceof Integer) {
                                bundle.putInt(optString, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(optString, ((Long) obj).longValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(optString, ((Float) obj).floatValue());
                            }
                        } else if (obj instanceof String) {
                            bundle.putString(optString, (String) obj);
                        }
                    }
                }
            }
            return bundle;
        }
        jSONArray = null;
        if (jSONArray != null) {
        }
    }

    public static void zzc(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgj)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfue zzj = zzfue.zzj(context);
            zzfuf zzi = zzfuf.zzi(context);
            zzj.zzk();
            zzj.zzl();
            zzi.zzj();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcP)).booleanValue()) {
                zzi.zzk();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcQ)).booleanValue()) {
                zzi.zzl();
            }
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "clearStorageOnIdlessMode");
        }
    }
}
