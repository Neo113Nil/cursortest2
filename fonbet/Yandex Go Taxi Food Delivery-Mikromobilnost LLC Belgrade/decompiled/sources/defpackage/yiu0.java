package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes11.dex */
public final class yiu0 {
    public static final ReentrantLock c = new ReentrantLock();
    public static yiu0 d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public yiu0(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static yiu0 a(Context context) {
        cvw.l(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new yiu0(context.getApplicationContext());
            }
            yiu0 yiu0Var = d;
            reentrantLock.unlock();
            return yiu0Var;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f(String str, String str2) {
        return g8e.p(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String c2;
        String c3 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c3) && (c2 = c(f("googleSignInAccount", c3))) != null) {
            try {
                return GoogleSignInAccount.zab(c2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String c(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(String str, String str2) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
