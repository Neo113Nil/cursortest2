package defpackage;

import android.util.Log;
import defpackage.g8e;
import defpackage.k84;
import defpackage.m3f;
import defpackage.q1r;
import defpackage.zbr;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zbr implements y2f {
    public final m3f a;
    public final boolean b;
    public String c;

    public zbr(m3f m3fVar, boolean z) {
        this.a = m3fVar;
        this.b = z;
    }

    @Override // defpackage.y2f
    public final j450 a(String str) {
        return new ozq0(this.a.b(str));
    }

    @Override // defpackage.y2f
    public final boolean b() {
        String str = this.c;
        return str != null && d(str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.firebase.crashlytics.ndk.b] */
    @Override // defpackage.y2f
    public final synchronized void c(final String str, final long j, final k84 k84Var) {
        try {
            try {
                this.c = str;
                ?? r0 = new Object() { // from class: com.google.firebase.crashlytics.ndk.b
                    public final void a() {
                        long j2 = j;
                        k84 k84Var2 = k84Var;
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        m3f m3fVar = zbr.this.a;
                        q1r q1rVar = m3fVar.c;
                        String str2 = str;
                        try {
                            String canonicalPath = q1rVar.b(str2).getCanonicalPath();
                            if (((JniNativeApi) m3fVar.b).b(m3fVar.a.getAssets(), canonicalPath)) {
                                HashMap u = g8e.u("session_id", str2, "generator", "Crashlytics Android SDK/20.0.3");
                                u.put("started_at_seconds", Long.valueOf(j2));
                                m3f.f(m3fVar.c, str2, new JSONObject(u).toString(), "session.json");
                                m3fVar.d(str2, k84Var2.a);
                                m3fVar.g(str2, k84Var2.b);
                                m3fVar.e(str2, k84Var2.c);
                            }
                        } catch (IOException e) {
                            Log.e("FirebaseCrashlytics", "Error initializing Crashlytics NDK", e);
                        }
                    }
                };
                if (this.b) {
                    r0.a();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.y2f
    public final boolean d(String str) {
        nzq0 nzq0Var = this.a.b(str).a;
        if (nzq0Var == null) {
            return false;
        }
        File file = nzq0Var.a;
        return (file != null && file.exists()) || nzq0Var.b != null;
    }
}
