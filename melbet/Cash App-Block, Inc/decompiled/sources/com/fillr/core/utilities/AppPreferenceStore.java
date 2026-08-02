package com.fillr.core.utilities;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AppPreferenceStore {
    public final SharedPreferences mPreferences;

    public AppPreferenceStore(Application application) {
        application.getClass();
        this.mPreferences = application.getSharedPreferences("FINANCIAL_CONNECTIONS_DEBUG", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:3:0x0001, B:5:0x000d, B:7:0x0027, B:10:0x0030, B:11:0x0038, B:13:0x0040, B:20:0x0043, B:22:0x004c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:3:0x0001, B:5:0x000d, B:7:0x0027, B:10:0x0030, B:11:0x0038, B:13:0x0040, B:20:0x0043, B:22:0x004c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean getOverriddenNative$financial_connections_release() {
        Object failure;
        String string2;
        String str;
        try {
            Result.Companion companion = Result.Companion;
            string2 = this.mPreferences.getString("json", null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (string2 != null) {
            JsonElement jsonElement = (JsonElement) ((JsonObject) Json.Default.decodeFromString(string2, JsonObject.Companion.serializer())).get("financial_connections_override_native");
            if (jsonElement != null) {
                JsonPrimitive jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement);
                if (!(jsonPrimitive instanceof JsonNull)) {
                    str = jsonPrimitive.getContent();
                    if (!Intrinsics.areEqual(str, "native")) {
                        failure = Boolean.TRUE;
                    } else if (Intrinsics.areEqual(str, "web")) {
                        failure = Boolean.FALSE;
                    }
                    return (Boolean) (failure instanceof Result.Failure ? null : failure);
                }
            }
            str = null;
            if (!Intrinsics.areEqual(str, "native")) {
            }
            return (Boolean) (failure instanceof Result.Failure ? null : failure);
        }
        failure = null;
        return (Boolean) (failure instanceof Result.Failure ? null : failure);
    }

    public void removeNamespaceForProfilePath(String str, String str2) {
        SharedPreferences sharedPreferences = this.mPreferences;
        if (sharedPreferences != null) {
            Set<String> stringSet = sharedPreferences != null ? sharedPreferences.getStringSet("F_LAST_CREATED_ARRAYS", null) : null;
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, str2);
            if (stringSet.contains(jSONObject.toString())) {
                stringSet.remove(jSONObject.toString());
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putStringSet("F_LAST_CREATED_ARRAYS", stringSet);
            edit.apply();
        }
    }

    public void setSelectedArrayIndex(int i, String str, String str2) {
        int i2;
        if (str == null || str.trim().equals("")) {
            return;
        }
        StringBuilder sb = new StringBuilder("ArrayIndex_");
        String translateSchemaNamespaceToMiddlewareNamespace = SchemaTranslation.translateSchemaNamespaceToMiddlewareNamespace(str2);
        sb.append(str);
        sb.append("_");
        sb.append(translateSchemaNamespaceToMiddlewareNamespace);
        SharedPreferences sharedPreferences = this.mPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(sb.toString(), i);
        edit.commit();
        StringBuilder sb2 = new StringBuilder("ArrayIndex_Weight__");
        sb2.append(translateSchemaNamespaceToMiddlewareNamespace);
        boolean z = false;
        if (translateSchemaNamespaceToMiddlewareNamespace != null) {
            String string2 = sharedPreferences.getString("ArrayIndex_Last_Used_".concat(translateSchemaNamespaceToMiddlewareNamespace), null);
            if (string2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    if (jSONObject.has(Integer.toString(i))) {
                        i2 = jSONObject.getInt(Integer.toString(i)) + 1;
                        if (i2 >= 3) {
                            z = true;
                            i2 = 1;
                        }
                    } else {
                        jSONObject = new JSONObject();
                        i2 = 1;
                    }
                    jSONObject.put(Integer.toString(i), i2);
                    string2 = jSONObject.toString();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(Integer.toString(i), 1);
                string2 = new JSONObject(hashMap).toString();
            }
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putString("ArrayIndex_Last_Used_" + translateSchemaNamespaceToMiddlewareNamespace, string2);
            edit2.apply();
        }
        String string3 = z ? null : sharedPreferences.getString(sb2.toString(), null);
        if (string3 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(string3);
                jSONObject2.put(Integer.toString(i), jSONObject2.has(Integer.toString(i)) ? 1 + jSONObject2.getInt(Integer.toString(i)) : 1);
                string3 = jSONObject2.toString();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(Integer.toString(i), 1);
            string3 = new JSONObject(hashMap2).toString();
        }
        SharedPreferences.Editor edit3 = sharedPreferences.edit();
        edit3.putString(sb2.toString(), string3);
        edit3.apply();
    }

    public AppPreferenceStore(Context context) {
        this.mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }
}
