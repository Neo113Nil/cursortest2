package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pee {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static Boolean b;
    public static Boolean c;
    public static oee d;
    public static jnp e;
    public static Intent f;
    public static Object g;

    public static final void a(Context context, ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                String string = new JSONObject(str).getString("productId");
                string.getClass();
                str.getClass();
                hashMap.put(string, str);
                arrayList2.add(string);
            } catch (JSONException e2) {
                Log.e("pee", "Error parsing in-app purchase data.", e2);
            }
        }
        Object obj = g;
        tee teeVar = tee.f;
        LinkedHashMap linkedHashMap = null;
        if (!bp6.a.contains(tee.class)) {
            try {
                context.getClass();
                LinkedHashMap j = teeVar.j(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!j.containsKey(str2)) {
                        arrayList3.add(str2);
                    }
                }
                j.putAll(teeVar.g(context, arrayList3, obj, z));
                linkedHashMap = j;
            } catch (Throwable th) {
                bp6.a(tee.class, th);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            String str5 = (String) hashMap.get(str3);
            if (str5 != null) {
                ne2.c(str5, str4, z);
            }
        }
    }

    public static final void b() {
        if (b == null) {
            Boolean valueOf = Boolean.valueOf(xee.C("com.android.vending.billing.IInAppBillingService$Stub") != null);
            b = valueOf;
            if (!valueOf.equals(Boolean.FALSE)) {
                c = Boolean.valueOf(xee.C("com.android.billingclient.api.ProxyBillingActivity") != null);
                HashMap hashMap = tee.a;
                if (!bp6.a.contains(tee.class)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = tee.d;
                        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        bp6.a(tee.class, th);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                intent.getClass();
                f = intent;
                d = new oee();
                e = new jnp(2);
            }
        }
        if (Intrinsics.d(b, Boolean.FALSE)) {
            return;
        }
        mka mkaVar = ne2.a;
        n8c b2 = q8c.b(j3c.c());
        if (b2 != null && gtt.c() && b2.f && a.compareAndSet(false, true)) {
            Context b3 = j3c.b();
            if (b3 instanceof Application) {
                Application application = (Application) b3;
                jnp jnpVar = e;
                if (jnpVar == null) {
                    Intrinsics.j("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(jnpVar);
                Intent intent2 = f;
                if (intent2 == null) {
                    Intrinsics.j("intent");
                    throw null;
                }
                oee oeeVar = d;
                if (oeeVar != null) {
                    b3.bindService(intent2, oeeVar, 1);
                } else {
                    Intrinsics.j("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
