package l4;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final long f38949d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f38950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38951b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38952c;

    public r(String str, String str2, long j6) {
        this.f38950a = str;
        this.f38951b = str2;
        this.f38952c = j6;
    }

    public static String a(String str, String str2, long j6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(com.anythink.expressad.foundation.d.d.f19383u, j6);
            return jSONObject.toString();
        } catch (JSONException e9) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e9);
            return null;
        }
    }

    public static r b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new r(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new r(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(com.anythink.expressad.foundation.d.d.f19383u));
        } catch (JSONException e9) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e9);
            return null;
        }
    }
}
