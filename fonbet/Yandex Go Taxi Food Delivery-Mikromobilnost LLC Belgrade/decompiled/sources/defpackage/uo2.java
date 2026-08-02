package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.a;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class uo2 implements xbi0 {
    public boolean a;
    public final Object b;
    public Object c;
    public final Object w;
    public Object x;
    public Object y;
    public Object z;

    public uo2(a aVar) {
        Object obj = new Object();
        this.w = obj;
        this.x = new atx0();
        this.a = false;
        this.z = new atx0();
        aVar.a();
        Context context = aVar.a;
        this.c = aVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.b = sharedPreferences;
        Boolean valueOf = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        this.y = valueOf == null ? b(context) : valueOf;
        synchronized (obj) {
            try {
                if (c()) {
                    ((atx0) this.x).c(null);
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public vo2 a() {
        fc70 fc70Var = (fc70) this.b;
        UUID uuid = (UUID) this.c;
        za70 za70Var = (za70) this.w;
        tko tkoVar = (tko) this.x;
        Map map = (Map) this.z;
        if (map == null) {
            map = b.f();
        }
        return new vo2(uuid, fc70Var, za70Var, (List) this.y, map, tkoVar, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean b(Context context) {
        Boolean bool;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
            bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (bool != null) {
                return null;
            }
            return Boolean.valueOf(Boolean.TRUE.equals(bool));
        }
        bool = null;
        if (bool != null) {
        }
    }

    public synchronized boolean c() {
        boolean z;
        Boolean bool = (Boolean) this.y;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                z = ((a) this.c).j();
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return z;
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        Object obj2 = this.z;
        if (obj2 != null) {
            return obj2;
        }
        String string = ((SharedPreferences) this.b).getString((String) this.w, null);
        Object invoke = string != null ? ((tls) this.x).invoke(string) : null;
        this.z = invoke;
        return invoke == null ? this.c : invoke;
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        this.z = obj2;
        String str = (String) this.w;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        boolean z = this.a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj2 != null) {
            edit.putString(str, (String) ((tls) this.y).invoke(obj2));
        } else {
            edit.remove(str);
        }
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public uo2(fc70 fc70Var, UUID uuid, za70 za70Var) {
        this.b = fc70Var;
        this.c = uuid;
        this.w = za70Var;
        this.x = ovn.a;
    }

    public uo2(SharedPreferences sharedPreferences, EmptyList emptyList, String str, boolean z, tls tlsVar, tls tlsVar2) {
        this.b = sharedPreferences;
        this.c = emptyList;
        this.w = str;
        this.a = z;
        this.x = tlsVar;
        this.y = tlsVar2;
    }
}
