package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l8c implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public l8c(Context context, String str, String str2) {
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        int i = this.a;
        Context context = this.b;
        String str = this.d;
        String str2 = this.c;
        switch (i) {
            case 0:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    JSONObject a = m8c.a(str2);
                    if (a.length() != 0) {
                        m8c.d(str2, a);
                        context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, a.toString()).apply();
                        m8c.d = Long.valueOf(System.currentTimeMillis());
                    }
                    m8c.e();
                    m8c.a.set(false);
                    return;
                } catch (Throwable th) {
                    bp6.a(this, th);
                    return;
                }
            default:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    n8c n8cVar = null;
                    String string = sharedPreferences.getString(str2, null);
                    if (!gvt.D(string)) {
                        if (string == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            HashSet hashSet = j3c.a;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            List list = q8c.a;
                            n8cVar = q8c.d(str, jSONObject);
                        }
                    }
                    q8c q8cVar = q8c.f;
                    JSONObject a2 = q8c.a(str);
                    q8c.d(str, a2);
                    sharedPreferences.edit().putString(str2, a2.toString()).apply();
                    if (n8cVar != null) {
                        String str3 = n8cVar.i;
                        if (!q8c.e && str3 != null && str3.length() > 0) {
                            q8c.e = true;
                            Log.w("q8c", str3);
                        }
                    }
                    JSONObject a3 = m8c.a(str);
                    j3c.b().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1)), a3.toString()).apply();
                    m8c.d(str, a3);
                    ne2.a();
                    q8c.c.set(q8c.b.containsKey(str) ? o8c.c : o8c.d);
                    q8cVar.e();
                    return;
                } catch (Throwable th2) {
                    bp6.a(this, th2);
                    return;
                }
        }
    }

    public l8c(String str, Context context, String str2) {
        this.c = str;
        this.b = context;
        this.d = str2;
    }
}
