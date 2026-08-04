package com.gamericefishpro.space.jf;

import android.content.Context;
import android.os.Bundle;
import com.gamericefishpro.space.hf.b;
import com.gamericefishpro.space.mf.c;
import com.gamericefishpro.space.yb.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    public static final C0028a Companion = new C0028a(null);
    public static final String DEFAULT_ACTION = "__DEFAULT__";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";
    private final com.gamericefishpro.space.kd.a _time;
    private final com.gamericefishpro.space.rf.b _workManager;

    /* JADX INFO: renamed from: com.gamericefishpro.space.jf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0028a {
        public /* synthetic */ C0028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0028a() {
        }
    }

    public a(com.gamericefishpro.space.rf.b _workManager, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_workManager, "_workManager");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._workManager = _workManager;
        this._time = _time;
    }

    private final void maximizeButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        String string;
        if (bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString(c.PAYLOAD_OS_ROOT_CUSTOM));
                if (jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject = jSONObject2.getJSONObject(PUSH_ADDITIONAL_DATA_KEY);
                    Intrinsics.b(jSONObject);
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string2 = jSONObject3.getString(PUSH_MINIFIED_BUTTON_TEXT);
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_TEXT);
                    if (jSONObject3.has("i")) {
                        string = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        string = string2;
                    }
                    jSONObject3.put("id", string);
                    jSONObject3.put("text", string2);
                    if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ICON)) {
                        jSONObject3.put("icon", jSONObject3.getString(PUSH_MINIFIED_BUTTON_ICON));
                        jSONObject3.remove(PUSH_MINIFIED_BUTTON_ICON);
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", DEFAULT_ACTION);
                if (!jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject2.put(PUSH_ADDITIONAL_DATA_KEY, jSONObject);
                }
                bundle.putString(c.PAYLOAD_OS_ROOT_CUSTOM, jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.gamericefishpro.space.hf.b
    public com.gamericefishpro.space.hf.a processBundleFromReceiver(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        com.gamericefishpro.space.hf.a aVar = new com.gamericefishpro.space.hf.a();
        c cVar = c.INSTANCE;
        if (!cVar.isOneSignalBundle(bundle)) {
            return aVar;
        }
        aVar.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        JSONObject jSONObjectBundleAsJSONObject = e.INSTANCE.bundleAsJSONObject(bundle);
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        boolean z = bundle.getBoolean("is_restoring", false);
        String string = bundle.getString("pri", "0");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        boolean z2 = Integer.parseInt(string) > 9;
        String oSNotificationIdFromJson = cVar.getOSNotificationIdFromJson(jSONObjectBundleAsJSONObject);
        int i = bundle.containsKey(ANDROID_NOTIFICATION_ID) ? bundle.getInt(ANDROID_NOTIFICATION_ID) : 0;
        com.gamericefishpro.space.rf.b bVar = this._workManager;
        Intrinsics.b(oSNotificationIdFromJson);
        aVar.setWorkManagerProcessing(bVar.beginEnqueueingWork(context, oSNotificationIdFromJson, i, jSONObjectBundleAsJSONObject, currentTimeMillis, z, z2));
        return aVar;
    }
}
