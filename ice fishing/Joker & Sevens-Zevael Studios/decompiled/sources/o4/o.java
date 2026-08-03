package o4;

import android.util.Log;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5216b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile o f5217c;

    /* renamed from: a, reason: collision with root package name */
    public final int f5218a;

    public o(int i10) {
        this.f5218a = i10;
    }

    public static o d() {
        o oVar;
        synchronized (f5216b) {
            try {
                if (f5217c == null) {
                    f5217c = new o(3);
                }
                oVar = f5217c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
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
        if (this.f5218a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f5218a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f5218a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f5218a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f5218a <= 5) {
            Log.w(str, str2);
        }
    }
}
