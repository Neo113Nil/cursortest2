package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.connectsdk.service.airplay.PListParser;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class seu {
    public static final String e;
    public final WeakReference b;
    public Timer c;
    public String d = null;
    public final Handler a = new Handler(Looper.getMainLooper());

    static {
        String canonicalName = seu.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        e = canonicalName;
    }

    public seu(Activity activity) {
        this.b = new WeakReference(activity);
    }

    public static final String a() {
        if (bp6.a.contains(seu.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            bp6.a(seu.class, th);
            return null;
        }
    }

    public final void b(ood oodVar, String str) {
        String str2 = e;
        Set set = bp6.a;
        if (set.contains(this) || oodVar == null) {
            return;
        }
        try {
            rod c = oodVar.c();
            try {
                JSONObject jSONObject = c.c;
                if (jSONObject == null) {
                    Log.e(str2, "Error sending UI component tree to Facebook: " + c.d);
                    return;
                }
                if (PListParser.TAG_TRUE.equals(jSONObject.optString("success"))) {
                    HashMap hashMap = lsg.d;
                    b3i.Q(tsg.b, str2, "Successfully send UI component tree to server");
                    this.d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                    if (set.contains(ds4.class)) {
                        return;
                    }
                    try {
                        ds4.f.set(z);
                    } catch (Throwable th) {
                        bp6.a(ds4.class, th);
                    }
                }
            } catch (JSONException e2) {
                Log.e(str2, "Error decoding server response.", e2);
            }
        } catch (Throwable th2) {
            bp6.a(this, th2);
        }
    }

    public final void c() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            try {
                j3c.d().execute(new e8h(this, new fbr(1, this), false, 25));
            } catch (RejectedExecutionException e2) {
                Log.e(e, "Error scheduling indexing job", e2);
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
