package J0;

import android.util.Log;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1403b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile s f1404c;

    /* renamed from: a, reason: collision with root package name */
    public final int f1405a;

    public s(int i) {
        this.f1405a = i;
    }

    public static s d() {
        s sVar;
        synchronized (f1403b) {
            try {
                if (f1404c == null) {
                    f1404c = new s(3);
                }
                sVar = f1404c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
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
        if (this.f1405a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f1405a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f1405a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f1405a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f1405a <= 5) {
            Log.w(str, str2);
        }
    }
}
