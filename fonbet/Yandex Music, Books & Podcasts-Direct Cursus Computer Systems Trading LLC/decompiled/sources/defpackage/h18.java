package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class h18 {
    public static final HashMap a = new HashMap();

    public static void a(String str) {
        Set set = bp6.a;
        if (set.contains(h18.class)) {
            return;
        }
        try {
            HashMap hashMap = a;
            if (set.contains(h18.class)) {
                return;
            }
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) hashMap.get(str);
                if (registrationListener != null) {
                    try {
                        ((NsdManager) j3c.b().getSystemService("servicediscovery")).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        HashSet hashSet = j3c.a;
                    }
                    hashMap.remove(str);
                }
            } catch (Throwable th) {
                bp6.a(h18.class, th);
            }
        } catch (Throwable th2) {
            bp6.a(h18.class, th2);
        }
    }

    public static String b() {
        if (bp6.a.contains(h18.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("device", Build.DEVICE);
            hashMap.put(CommonUrlParts.MODEL, Build.MODEL);
            return new JSONObject(hashMap).toString();
        } catch (Throwable th) {
            bp6.a(h18.class, th);
            return null;
        }
    }

    public static boolean c() {
        if (!bp6.a.contains(h18.class)) {
            try {
                n8c b = q8c.b(j3c.c());
                if (b != null) {
                    if (b.c.contains(yzq.Enabled)) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                bp6.a(h18.class, th);
                return false;
            }
        }
        return false;
    }

    public static boolean d(String str) {
        if (bp6.a.contains(h18.class)) {
            return false;
        }
        try {
            HashMap hashMap = a;
            if (hashMap.containsKey(str)) {
                return true;
            }
            HashSet hashSet = j3c.a;
            String str2 = "fbsdk_" + ("android-" + "12.2.0".replace('.', '|')) + "_" + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            NsdManager nsdManager = (NsdManager) j3c.b().getSystemService("servicediscovery");
            g18 g18Var = new g18(str2, str);
            hashMap.put(str, g18Var);
            nsdManager.registerService(nsdServiceInfo, 1, g18Var);
            return true;
        } catch (Throwable th) {
            bp6.a(h18.class, th);
            return false;
        }
    }
}
