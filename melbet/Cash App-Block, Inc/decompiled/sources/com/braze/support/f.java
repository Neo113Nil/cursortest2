package com.braze.support;

import bo.app.l$$ExternalSyntheticLambda2;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f {
    public static final f a = new f();

    public static final ArrayList a(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(3), 6, (Object) null);
                } catch (JSONException e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new l$$ExternalSyntheticLambda2(optJSONObject, 19), 4, (Object) null);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new l$$ExternalSyntheticLambda2(optJSONObject, 18), 4, (Object) null);
                }
            } else {
                arrayList.add(new BrazeGeofence(optJSONObject));
            }
        }
        return arrayList;
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json:" + jSONObject;
    }

    public static final String a() {
        return "Received null or blank geofence Json. Not parsing.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json due to JSONException: " + jSONObject;
    }
}
