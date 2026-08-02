package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class bec {
    public final kp6 a;

    public bec(kp6 kp6Var) {
        this.a = kp6Var;
    }

    public static bec a() {
        bec becVar = (bec) aec.d().b(bec.class);
        if (becVar != null) {
            return becVar;
        }
        jj4.j("FirebaseCrashlytics component is not present.");
        return null;
    }

    public final void b(boolean z) {
        kp6 kp6Var = this.a;
        Boolean valueOf = Boolean.valueOf(z);
        v97 v97Var = kp6Var.b;
        synchronized (v97Var) {
            v97Var.c = false;
            v97Var.i = valueOf;
            SharedPreferences.Editor edit = ((SharedPreferences) v97Var.d).edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", z);
            edit.apply();
            synchronized (v97Var.f) {
                try {
                    boolean h = v97Var.h();
                    boolean z2 = v97Var.b;
                    if (h) {
                        if (!z2) {
                            ((i8s) v97Var.g).d(null);
                            v97Var.b = true;
                        }
                    } else if (z2) {
                        v97Var.g = new i8s();
                        v97Var.b = false;
                    }
                } finally {
                }
            }
        }
    }
}
