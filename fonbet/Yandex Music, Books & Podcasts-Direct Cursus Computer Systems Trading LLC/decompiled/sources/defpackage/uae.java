package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class uae {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final jya a;
    public final Context b;
    public final String c;
    public final iec d;
    public final v97 e;
    public id2 f;

    public uae(Context context, String str, iec iecVar, v97 v97Var) {
        if (context == null) {
            xq0.x("appContext must not be null");
            throw null;
        }
        if (str == null) {
            xq0.x("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = iecVar;
        this.e = v97Var;
        this.a = new jya(2);
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(1:5))|6|(7:18|19|9|10|11|12|13)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eec b(boolean z) {
        String str;
        String str2 = null;
        if (!((Boolean) new ej6(0, osh.g, wq6.class, "isNotMainThread", "isNotMainThread()Z", 0, 10).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iec iecVar = this.d;
        if (z) {
            try {
                str = ((kd2) ywf.o(((hec) iecVar).d(), 10000L, timeUnit)).a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
            }
            str2 = (String) ywf.o(((hec) iecVar).c(), 10000L, timeUnit);
            return new eec(str2, str);
        }
        str = null;
        str2 = (String) ywf.o(((hec) iecVar).c(), 10000L, timeUnit);
        return new eec(str2, str);
    }

    public final synchronized id2 c() {
        String str;
        id2 id2Var = this.f;
        if (id2Var != null && (id2Var.b != null || !this.e.h())) {
            return this.f;
        }
        mvt mvtVar = mvt.h;
        mvtVar.F("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        mvtVar.F("Cached Firebase Installation ID: " + string);
        if (this.e.h()) {
            eec b = b(false);
            mvtVar.F("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new eec(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new id2(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new id2(a(sharedPreferences, b.a), b.a, b.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new id2(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new id2(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        mvtVar.F("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        jya jyaVar = this.a;
        Context context = this.b;
        synchronized (jyaVar) {
            try {
                if (jyaVar.b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    jyaVar.b = installerPackageName;
                }
                str = "".equals(jyaVar.b) ? null : jyaVar.b;
            } finally {
            }
        }
        return str;
    }
}
