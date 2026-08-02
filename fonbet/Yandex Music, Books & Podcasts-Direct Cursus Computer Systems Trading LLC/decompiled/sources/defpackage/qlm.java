package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qlm {
    public static SharedPreferences b;
    public static final qlm d = new qlm();
    public static final LinkedHashMap a = new LinkedHashMap();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    public static final void a(String str, String str2) {
        if (bp6.a.contains(qlm.class)) {
            return;
        }
        try {
            str2.getClass();
            if (!c.get()) {
                d.c();
            }
            LinkedHashMap linkedHashMap = a;
            linkedHashMap.put(str, str2);
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", gvt.H(uah.o(linkedHashMap))).apply();
            } else {
                Intrinsics.j("shardPreferences");
                throw null;
            }
        } catch (Throwable th) {
            bp6.a(qlm.class, th);
        }
    }

    public static final String b(View view, String str) {
        if (bp6.a.contains(qlm.class)) {
            return null;
        }
        try {
            str.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = qeu.i(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return gvt.Y(jSONObject.toString());
        } catch (Throwable th) {
            bp6.a(qlm.class, th);
            return null;
        }
    }

    public final void c() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = j3c.b().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            sharedPreferences.getClass();
            b = sharedPreferences;
            LinkedHashMap linkedHashMap = a;
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            linkedHashMap.putAll(gvt.G(string != null ? string : ""));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
