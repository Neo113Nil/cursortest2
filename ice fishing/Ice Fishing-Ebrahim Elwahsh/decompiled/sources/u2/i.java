package u2;

import android.util.Log;
import com.bumptech.glide.manager.o;
import com.google.android.gms.internal.ads.AbstractC3298hB;
import com.google.android.gms.internal.ads.Dr;
import com.google.android.gms.internal.ads.InterfaceC3352iB;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o f41243a = new o(new Dr(0, 18));

    public static void a(String str) {
        if (!j(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        o oVar = f41243a;
        Iterator g9 = ((InterfaceC3352iB) oVar.f23625w).g(oVar, str);
        boolean z8 = true;
        while (true) {
            AbstractC3298hB abstractC3298hB = (AbstractC3298hB) g9;
            if (!abstractC3298hB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3298hB.next();
            if (z8) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z8 = false;
        }
    }

    public static void b(String str, Throwable th) {
        if (j(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void c(String str) {
        if (!j(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        o oVar = f41243a;
        Iterator g9 = ((InterfaceC3352iB) oVar.f23625w).g(oVar, str);
        boolean z8 = true;
        while (true) {
            AbstractC3298hB abstractC3298hB = (AbstractC3298hB) g9;
            if (!abstractC3298hB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3298hB.next();
            if (z8) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z8 = false;
        }
    }

    public static void d(String str, Throwable th) {
        if (j(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void e(String str) {
        if (!j(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        o oVar = f41243a;
        Iterator g9 = ((InterfaceC3352iB) oVar.f23625w).g(oVar, str);
        boolean z8 = true;
        while (true) {
            AbstractC3298hB abstractC3298hB = (AbstractC3298hB) g9;
            if (!abstractC3298hB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3298hB.next();
            if (z8) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z8 = false;
        }
    }

    public static void f(String str) {
        if (!j(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        o oVar = f41243a;
        Iterator g9 = ((InterfaceC3352iB) oVar.f23625w).g(oVar, str);
        boolean z8 = true;
        while (true) {
            AbstractC3298hB abstractC3298hB = (AbstractC3298hB) g9;
            if (!abstractC3298hB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3298hB.next();
            if (z8) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z8 = false;
        }
    }

    public static void g(String str, Throwable th) {
        if (j(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void i(String str, Exception exc) {
        if (j(5)) {
            if (exc != null) {
                g(h(str), exc);
            } else {
                f(h(str));
            }
        }
    }

    public static boolean j(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
