package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.connectsdk.service.NetcastTVService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class rt0 {
    public static final HashMap a = uah.d(new Pair(qt0.a, "MOBILE_APP_INSTALL"), new Pair(qt0.b, "CUSTOM_APP_EVENTS"));

    public static final JSONObject a(qt0 qt0Var, av1 av1Var, String str, boolean z, Context context) {
        context.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NetcastTVService.UDAP_API_EVENT, a.get(qt0Var));
        if (!u80.c) {
            Log.w("u80", "initStore should have been called before calling setUserID");
            u80.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = u80.a;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = u80.b;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            v6c v6cVar = v6c.ServiceUpdateCompliance;
            if (!x6c.b(v6cVar)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z);
            HashSet hashSet = j3c.a;
            jSONObject.put("advertiser_id_collection_enabled", gtt.b());
            if (av1Var != null) {
                if (x6c.b(v6cVar)) {
                    if (Build.VERSION.SDK_INT < 31 || !gvt.C(context)) {
                        jSONObject.put("anon_id", str);
                    } else if (!av1Var.e) {
                        jSONObject.put("anon_id", str);
                    }
                }
                if (av1Var.c != null) {
                    if (!x6c.b(v6cVar)) {
                        jSONObject.put("attribution", av1Var.c);
                    } else if (Build.VERSION.SDK_INT < 31 || !gvt.C(context)) {
                        jSONObject.put("attribution", av1Var.c);
                    } else if (!av1Var.e) {
                        jSONObject.put("attribution", av1Var.c);
                    }
                }
                if (av1Var.a() != null) {
                    jSONObject.put("advertiser_id", av1Var.a());
                    jSONObject.put("advertiser_tracking_enabled", !av1Var.e);
                }
                if (!av1Var.e) {
                    ast astVar = ast.e;
                    String str3 = null;
                    if (!bp6.a.contains(ast.class)) {
                        try {
                            if (!ast.b.get()) {
                                astVar.b();
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.putAll(ast.c);
                            hashMap.putAll(astVar.a());
                            str3 = gvt.H(hashMap);
                        } catch (Throwable th) {
                            bp6.a(ast.class, th);
                        }
                    }
                    if (str3.length() != 0) {
                        jSONObject.put("ud", str3);
                    }
                }
                String str4 = av1Var.d;
                if (str4 != null) {
                    jSONObject.put("installer_package", str4);
                }
            }
            try {
                gvt.Q(context, jSONObject);
            } catch (Exception e) {
                HashMap hashMap2 = lsg.d;
                e.toString();
                synchronized (j3c.a) {
                }
            }
            JSONObject q = gvt.q();
            if (q != null) {
                Iterator<String> keys = q.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, q.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th2) {
            u80.a.readLock().unlock();
            throw th2;
        }
    }
}
