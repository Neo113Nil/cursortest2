package J0;

import android.util.Log;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1431b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile r f1432c;

    /* renamed from: a, reason: collision with root package name */
    public final int f1433a;

    public r(int i) {
        this.f1433a = i;
    }

    public static r d() {
        r rVar;
        synchronized (f1431b) {
            try {
                if (f1432c == null) {
                    f1432c = new r(3);
                }
                rVar = f1432c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void a(String str, String str2) {
        if (this.f1433a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f1433a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f1433a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f1433a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f1433a <= 5) {
            Log.w(str, str2);
        }
    }
}
