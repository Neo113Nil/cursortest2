package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aib {
    public static boolean a;
    public static final aib d = new aib();
    public static final ArrayList b = new ArrayList();
    public static final HashSet c = new HashSet();

    public static final void b(ArrayList arrayList) {
        if (bp6.a.contains(aib.class)) {
            return;
        }
        try {
            arrayList.getClass();
            if (a) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (c.contains(((ht0) it.next()).d)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            bp6.a(aib.class, th);
        }
    }

    public final synchronized void a() {
        n8c f;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            f = q8c.f(j3c.c(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            bp6.a(this, th);
            return;
        }
        if (f != null) {
            String str = f.l;
            if (str != null && str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                b.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            HashSet hashSet = c;
                            next.getClass();
                            hashSet.add(next);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            next.getClass();
                            ArrayList arrayList = new ArrayList();
                            zhb zhbVar = new zhb();
                            zhbVar.a = next;
                            zhbVar.b = arrayList;
                            if (optJSONArray != null) {
                                zhbVar.b = gvt.f(optJSONArray);
                            }
                            b.add(zhbVar);
                        }
                    }
                }
            }
        }
    }
}
