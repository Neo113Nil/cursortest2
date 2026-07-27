package f4;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final long f37767d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f37768a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37769b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37770c;

    public q(String str, String str2, long j9) {
        this.f37768a = str;
        this.f37769b = str2;
        this.f37770c = j9;
    }

    public static String a(String str, String str2, long j9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(com.anythink.expressad.foundation.d.d.f18754u, j9);
            return jSONObject.toString();
        } catch (JSONException e6) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e6);
            return null;
        }
    }

    public static q b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new q(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new q(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(com.anythink.expressad.foundation.d.d.f18754u));
        } catch (JSONException e6) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e6);
            return null;
        }
    }
}
