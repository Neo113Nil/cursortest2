package defpackage;

import android.os.Bundle;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ht0 implements Serializable {
    public static final HashSet f = new HashSet();
    private static final long serialVersionUID = 1;
    public final JSONObject a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;

    public ht0(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        str.getClass();
        str2.getClass();
        this.b = z;
        this.c = z2;
        this.d = str2;
        ehv.l(str2);
        JSONObject jSONObject = new JSONObject();
        boolean z3 = q7o.a;
        Set set = bp6.a;
        String str3 = null;
        if (!set.contains(q7o.class)) {
            try {
                if (q7o.a) {
                    q7o q7oVar = q7o.d;
                    boolean z4 = false;
                    if (!set.contains(q7oVar)) {
                        try {
                            z4 = q7o.c.contains(str2);
                        } catch (Throwable th) {
                            bp6.a(q7oVar, th);
                        }
                    }
                    if (z4) {
                        str2 = "_removed_";
                    }
                }
                str3 = str2;
            } catch (Throwable th2) {
                bp6.a(q7o.class, th2);
            }
        }
        jSONObject.put("_eventName", str3);
        jSONObject.put("_eventName_md5", ehv.b(str3));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            String str4 = this.d;
            HashMap hashMap = new HashMap();
            for (String str5 : bundle.keySet()) {
                str5.getClass();
                ehv.l(str5);
                Object obj = bundle.get(str5);
                if (!(obj instanceof String) && !(obj instanceof Number)) {
                    throw new c3c(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str5}, 2)));
                }
                hashMap.put(str5, obj.toString());
            }
            if (!bp6.a.contains(rre.class)) {
                try {
                    if (rre.b && !hashMap.isEmpty()) {
                        try {
                            List<String> w0 = CollectionsKt.w0(hashMap.keySet());
                            JSONObject jSONObject2 = new JSONObject();
                            for (String str6 : w0) {
                                Object obj2 = hashMap.get(str6);
                                if (obj2 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                String str7 = (String) obj2;
                                rre rreVar = rre.d;
                                if (!rreVar.W(str6) && !rreVar.W(str7)) {
                                }
                                hashMap.remove(str6);
                                if (!rre.c) {
                                    str7 = "";
                                }
                                jSONObject2.put(str6, str7);
                            }
                            if (jSONObject2.length() != 0) {
                                String jSONObject3 = jSONObject2.toString();
                                jSONObject3.getClass();
                                hashMap.put("_onDeviceParams", jSONObject3);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th3) {
                    bp6.a(rre.class, th3);
                }
            }
            Map n = wct.n(hashMap);
            boolean z5 = q7o.a;
            if (!bp6.a.contains(q7o.class)) {
                try {
                    n.getClass();
                    str4.getClass();
                    if (q7o.a) {
                        HashMap hashMap2 = new HashMap();
                        Iterator it = new ArrayList(n.keySet()).iterator();
                        while (it.hasNext()) {
                            String str8 = (String) it.next();
                            String a = q7o.d.a(str4, str8);
                            if (a != null) {
                                hashMap2.put(str8, a);
                                n.remove(str8);
                            }
                        }
                        if (!hashMap2.isEmpty()) {
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                for (Map.Entry entry : hashMap2.entrySet()) {
                                    jSONObject4.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                n.put("_restrictedParams", jSONObject4.toString());
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                } catch (Throwable th4) {
                    bp6.a(q7o.class, th4);
                }
            }
            Map n2 = wct.n(hashMap);
            boolean z6 = aib.a;
            if (!bp6.a.contains(aib.class)) {
                try {
                    n2.getClass();
                    str4.getClass();
                    if (aib.a) {
                        ArrayList arrayList = new ArrayList(n2.keySet());
                        Iterator it2 = new ArrayList(aib.b).iterator();
                        while (it2.hasNext()) {
                            zhb zhbVar = (zhb) it2.next();
                            if (Intrinsics.d(zhbVar.a, str4)) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    String str9 = (String) it3.next();
                                    if (zhbVar.b.contains(str9)) {
                                        n2.remove(str9);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    bp6.a(aib.class, th5);
                }
            }
            for (String str10 : hashMap.keySet()) {
                jSONObject.put(str10, hashMap.get(str10));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.c) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.b) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            HashMap hashMap3 = lsg.d;
            jSONObject.toString().getClass();
            synchronized (j3c.a) {
            }
        }
        this.a = jSONObject;
        String jSONObject5 = jSONObject.toString();
        jSONObject5.getClass();
        this.e = ehv.b(jSONObject5);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.a.toString();
        jSONObject.getClass();
        return new gt0(jSONObject, this.b, this.c, this.e);
    }

    public final String toString() {
        JSONObject jSONObject = this.a;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.b), jSONObject.toString()}, 3));
    }

    public ht0(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        this.b = z;
        String optString = jSONObject.optString("_eventName");
        optString.getClass();
        this.d = optString;
        this.e = str2;
        this.c = z2;
    }
}
