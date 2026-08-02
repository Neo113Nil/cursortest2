package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q7o {
    public static boolean a;
    public static final q7o d = new q7o();
    public static final ArrayList b = new ArrayList();
    public static final CopyOnWriteArraySet c = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        try {
            if (!bp6.a.contains(this)) {
                try {
                    Iterator it = new ArrayList(b).iterator();
                    while (it.hasNext()) {
                        p7o p7oVar = (p7o) it.next();
                        if (p7oVar != null && Intrinsics.d(str, p7oVar.a)) {
                            for (String str3 : p7oVar.b.keySet()) {
                                if (Intrinsics.d(str2, str3)) {
                                    return (String) p7oVar.b.get(str3);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.w("q7o", "getMatchedRuleType failed", e);
                }
            }
            return null;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final void b() {
        String str;
        CopyOnWriteArraySet copyOnWriteArraySet = c;
        ArrayList arrayList = b;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            n8c f = q8c.f(j3c.c(), false);
            if (f != null && (str = f.l) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                arrayList.clear();
                copyOnWriteArraySet.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        next.getClass();
                        HashMap hashMap = new HashMap();
                        p7o p7oVar = new p7o();
                        p7oVar.a = next;
                        p7oVar.b = hashMap;
                        if (optJSONObject != null) {
                            p7oVar.b = gvt.h(optJSONObject);
                            arrayList.add(p7oVar);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(next);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
