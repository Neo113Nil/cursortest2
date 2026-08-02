package defpackage;

import android.app.Activity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oqr {
    public static final oqr d = new oqr();
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final LinkedHashSet b = new LinkedHashSet();
    public static final LinkedHashSet c = new LinkedHashSet();

    public static final synchronized void a() {
        synchronized (oqr.class) {
            if (bp6.a.contains(oqr.class)) {
                return;
            }
            try {
                j3c.d().execute(q.q);
            } catch (Throwable th) {
                bp6.a(oqr.class, th);
            }
        }
    }

    public static final void d(Activity activity) {
        Set set = bp6.a;
        if (set.contains(oqr.class)) {
            return;
        }
        try {
            if (a.get()) {
                boolean z = false;
                if (!set.contains(o6c.class)) {
                    try {
                        z = o6c.f;
                    } catch (Throwable th) {
                        bp6.a(o6c.class, th);
                    }
                }
                if (z) {
                    if (b.isEmpty()) {
                        if (!c.isEmpty()) {
                        }
                    }
                    HashMap hashMap = lfu.d;
                    qgg.f0(activity);
                    return;
                }
            }
            HashMap hashMap2 = lfu.d;
            qgg.g0(activity);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            bp6.a(oqr.class, th2);
        }
    }

    public final void b() {
        String str;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            n8c f = q8c.f(j3c.c(), false);
            if (f == null || (str = f.k) == null) {
                return;
            }
            c(str);
            if (b.isEmpty() && c.isEmpty()) {
                return;
            }
            File d2 = oci.d();
            if (d2 != null) {
                o6c.z(d2);
                WeakReference weakReference = oh.k;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if (activity != null) {
                    d(activity);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final void c(String str) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    LinkedHashSet linkedHashSet = b;
                    String string = jSONArray.getString(i);
                    string.getClass();
                    linkedHashSet.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    LinkedHashSet linkedHashSet2 = c;
                    String string2 = jSONArray2.getString(i2);
                    string2.getClass();
                    linkedHashSet2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
