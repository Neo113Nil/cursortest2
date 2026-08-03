package ka;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.common.g;
import ja.b;
import na.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.f;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements b {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    public static final C0074a Companion = new C0074a(null);
    public static final String DEFAULT_ACTION = "__DEFAULT__";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";
    private final e9.a _time;
    private final qa.b _workManager;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: ka.a$a, reason: collision with other inner class name */
    public static final class C0074a {
        public /* synthetic */ C0074a(f fVar) {
            this();
        }

        private C0074a() {
        }
    }

    public a(qa.b bVar, e9.a aVar) {
        j.e(bVar, "_workManager");
        j.e(aVar, "_time");
        this._workManager = bVar;
        this._time = aVar;
    }

    private final void maximizeButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString(c.PAYLOAD_OS_ROOT_CUSTOM));
                if (jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject = jSONObject2.getJSONObject(PUSH_ADDITIONAL_DATA_KEY);
                    j.d(jSONObject, "{\n                    cu…      )\n                }");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String string = jSONObject3.getString(PUSH_MINIFIED_BUTTON_TEXT);
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_TEXT);
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put("id", str);
                    jSONObject3.put("text", string);
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
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // ja.b
    public ja.a processBundleFromReceiver(Context context, Bundle bundle) {
        j.e(context, "context");
        j.e(bundle, "bundle");
        ja.a aVar = new ja.a();
        c cVar = c.INSTANCE;
        if (!cVar.isOneSignalBundle(bundle)) {
            return aVar;
        }
        aVar.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        JSONObject bundleAsJSONObject = g.INSTANCE.bundleAsJSONObject(bundle);
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        boolean z10 = bundle.getBoolean("is_restoring", false);
        String string = bundle.getString("pri", "0");
        j.d(string, "bundle.getString(\"pri\", \"0\")");
        boolean z11 = Integer.parseInt(string) > 9;
        String oSNotificationIdFromJson = cVar.getOSNotificationIdFromJson(bundleAsJSONObject);
        int i10 = bundle.containsKey(ANDROID_NOTIFICATION_ID) ? bundle.getInt(ANDROID_NOTIFICATION_ID) : 0;
        qa.b bVar = this._workManager;
        j.b(oSNotificationIdFromJson);
        aVar.setWorkManagerProcessing(bVar.beginEnqueueingWork(context, oSNotificationIdFromJson, i10, bundleAsJSONObject, currentTimeMillis, z10, z11));
        return aVar;
    }
}
