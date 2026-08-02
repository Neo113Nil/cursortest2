package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.gcm.GcmListenerService;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes11.dex */
public final class wg91 {
    public static wg91 d;
    public final Context a;
    public String b;
    public final AtomicInteger c = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public wg91(GcmListenerService gcmListenerService) {
        this.a = gcmListenerService.getApplicationContext();
    }

    public static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    public final String b(Bundle bundle, String str) {
        String a = a(bundle, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String a2 = a(bundle, str.concat("_loc_key"));
        if (!TextUtils.isEmpty(a2)) {
            Context context = this.a;
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier(a2, "string", context.getPackageName());
            if (identifier == 0) {
                new StringBuilder(String.valueOf(a2).length() + str.concat("_loc_key").substring(6).length() + 49);
                return null;
            }
            String a3 = a(bundle, str.concat("_loc_args"));
            if (TextUtils.isEmpty(a3)) {
                return resources.getString(identifier);
            }
            try {
                JSONArray jSONArray = new JSONArray(a3);
                int length = jSONArray.length();
                Object[] objArr = new String[length];
                for (int i = 0; i < length; i++) {
                    objArr[i] = jSONArray.opt(i);
                }
                return resources.getString(identifier, objArr);
            } catch (MissingFormatArgumentException unused) {
                new StringBuilder(String.valueOf(a3).length() + String.valueOf(a2).length() + 58);
            } catch (JSONException unused2) {
                new StringBuilder(String.valueOf(a3).length() + str.concat("_loc_args").substring(6).length() + 41);
            }
        }
        return null;
    }
}
