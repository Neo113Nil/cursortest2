package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class ast {
    public static SharedPreferences a;
    public static final ast e = new ast();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    public final HashMap a() {
        ConcurrentHashMap concurrentHashMap = d;
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = h3i.d;
            HashSet hashSet = new HashSet();
            Iterator it = h3i.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((h3i) it.next()).c());
            }
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, concurrentHashMap.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final synchronized void b() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = b;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(j3c.b());
            defaultSharedPreferences.getClass();
            a = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = a;
            if (sharedPreferences == null) {
                Intrinsics.j("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            c.putAll(gvt.G(string));
            d.putAll(gvt.G(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final String c(String str, String str2) {
        String str3;
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.e(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String obj = str2.subSequence(i, length + 1).toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj.toLowerCase();
            lowerCase.getClass();
            if ("em".equals(str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e("ast", "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if ("ph".equals(str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if ("ge".equals(str)) {
                    if (lowerCase.length() <= 0) {
                        str3 = "";
                    } else {
                        if (lowerCase == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        str3 = lowerCase.substring(0, 1);
                    }
                    if (!"f".equals(str3) && !"m".equals(str3)) {
                        Log.e("ast", "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return str3;
                }
            }
            return lowerCase;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }
}
