package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gtt {
    public static SharedPreferences h;
    public static final gtt i = new gtt();
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final ett c = new ett(true, "com.facebook.sdk.AutoInitEnabled");
    public static final ett d = new ett(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    public static final ett e = new ett(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final ett f = new ett(false, "auto_event_setup_enabled");
    public static final ett g = new ett(true, "com.facebook.sdk.MonitorEnabled");

    public static final ett a() {
        if (bp6.a.contains(gtt.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            bp6.a(gtt.class, th);
            return null;
        }
    }

    public static final boolean b() {
        if (bp6.a.contains(gtt.class)) {
            return false;
        }
        try {
            i.e();
            return e.a();
        } catch (Throwable th) {
            bp6.a(gtt.class, th);
            return false;
        }
    }

    public static final boolean c() {
        if (bp6.a.contains(gtt.class)) {
            return false;
        }
        try {
            i.e();
            return d.a();
        } catch (Throwable th) {
            bp6.a(gtt.class, th);
            return false;
        }
    }

    public final void d() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            ett ettVar = f;
            i(ettVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (ettVar.a == null || currentTimeMillis - ettVar.b >= 604800000) {
                ettVar.a = null;
                ettVar.b = 0L;
                if (b.compareAndSet(false, true)) {
                    j3c.d().execute(new ftt(currentTimeMillis));
                }
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final void e() {
        Set set = bp6.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (j3c.n.get()) {
                if (a.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = j3c.b().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    sharedPreferences.getClass();
                    h = sharedPreferences;
                    ett[] ettVarArr = {d, e, c};
                    if (!set.contains(this)) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            try {
                                ett ettVar = ettVarArr[i2];
                                if (ettVar == f) {
                                    d();
                                } else if (ettVar.a == null) {
                                    i(ettVar);
                                    if (ettVar.a == null) {
                                        f(ettVar);
                                    }
                                } else {
                                    k(ettVar);
                                }
                            } catch (Throwable th) {
                                bp6.a(this, th);
                            }
                        }
                    }
                    d();
                    h();
                    g();
                }
            }
        } catch (Throwable th2) {
            bp6.a(this, th2);
        }
    }

    public final void f(ett ettVar) {
        String str = ettVar.d;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            j();
            try {
                Context b2 = j3c.b();
                ApplicationInfo applicationInfo = b2.getPackageManager().getApplicationInfo(b2.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) == null || !applicationInfo.metaData.containsKey(str)) {
                    return;
                }
                ettVar.a = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, ettVar.c));
            } catch (PackageManager.NameNotFoundException unused) {
                HashSet hashSet = j3c.a;
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        int i2;
        int i3;
        Bundle bundle;
        ApplicationInfo applicationInfo;
        Bundle bundle2;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            if (a.get() && j3c.n.get()) {
                Context b2 = j3c.b();
                int i4 = (c.a() ? 1 : 0) | ((d.a() ? 1 : 0) << 1) | ((e.a() ? 1 : 0) << 2) | ((g.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = h;
                if (sharedPreferences == null) {
                    Intrinsics.j("userSettingPref");
                    throw null;
                }
                int i5 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i5 != i4) {
                    SharedPreferences sharedPreferences2 = h;
                    if (sharedPreferences2 == null) {
                        Intrinsics.j("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).apply();
                    try {
                        applicationInfo = b2.getPackageManager().getApplicationInfo(b2.getPackageName(), 128);
                        if (applicationInfo != null) {
                            try {
                                bundle2 = applicationInfo.metaData;
                            } catch (PackageManager.NameNotFoundException unused) {
                                i2 = 0;
                                i3 = 0;
                            }
                        } else {
                            bundle2 = null;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    if (bundle2 != null) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        i2 = 0;
                        i3 = 0;
                        for (int i6 = 0; i6 < 4; i6++) {
                            try {
                                i3 |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                                i2 |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        pt0 pt0Var = new pt0(b2, (String) null);
                        bundle = new Bundle();
                        bundle.putInt("usage", i3);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i5);
                        bundle.putInt("current", i4);
                        if (!((bundle.getInt("previous") & 2) == 0) || c()) {
                            pt0Var.z(bundle, "fb_sdk_settings_changed");
                        }
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                    pt0 pt0Var2 = new pt0(b2, (String) null);
                    bundle = new Bundle();
                    bundle.putInt("usage", i3);
                    bundle.putInt("initial", i2);
                    bundle.putInt("previous", i5);
                    bundle.putInt("current", i4);
                    if ((bundle.getInt("previous") & 2) == 0) {
                    }
                    pt0Var2.z(bundle, "fb_sdk_settings_changed");
                }
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final void h() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            Context b2 = j3c.b();
            ApplicationInfo applicationInfo = b2.getPackageManager().getApplicationInfo(b2.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w("gtt", "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w("gtt", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (b()) {
                    return;
                }
                Log.w("gtt", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final void i(ett ettVar) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            j();
            try {
                SharedPreferences sharedPreferences = h;
                if (sharedPreferences == null) {
                    Intrinsics.j("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(ettVar.d, "");
                String str = string != null ? string : "";
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    ettVar.a = Boolean.valueOf(jSONObject.getBoolean(Constants.KEY_VALUE));
                    ettVar.b = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                HashSet hashSet = j3c.a;
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final void j() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            if (a.get()) {
            } else {
                throw new k3c("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final void k(ett ettVar) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            j();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.KEY_VALUE, ettVar.a);
                jSONObject.put("last_timestamp", ettVar.b);
                SharedPreferences sharedPreferences = h;
                if (sharedPreferences == null) {
                    Intrinsics.j("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(ettVar.d, jSONObject.toString()).apply();
                g();
            } catch (Exception unused) {
                HashSet hashSet = j3c.a;
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
