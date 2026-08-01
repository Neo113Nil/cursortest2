package v2;

import android.util.Log;
import com.bumptech.glide.manager.p;
import com.google.android.gms.internal.ads.AbstractC3070dB;
import com.google.android.gms.internal.ads.C3586mr;
import com.google.android.gms.internal.ads.InterfaceC3123eB;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final p f41417a = new p(new C3586mr(0, 19));

    public static void a(String str) {
        if (!j(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        p pVar = f41417a;
        Iterator j6 = ((InterfaceC3123eB) pVar.f23471w).j(pVar, str);
        boolean z3 = true;
        while (true) {
            AbstractC3070dB abstractC3070dB = (AbstractC3070dB) j6;
            if (!abstractC3070dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3070dB.next();
            if (z3) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z3 = false;
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
        p pVar = f41417a;
        Iterator j6 = ((InterfaceC3123eB) pVar.f23471w).j(pVar, str);
        boolean z3 = true;
        while (true) {
            AbstractC3070dB abstractC3070dB = (AbstractC3070dB) j6;
            if (!abstractC3070dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3070dB.next();
            if (z3) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z3 = false;
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
        p pVar = f41417a;
        Iterator j6 = ((InterfaceC3123eB) pVar.f23471w).j(pVar, str);
        boolean z3 = true;
        while (true) {
            AbstractC3070dB abstractC3070dB = (AbstractC3070dB) j6;
            if (!abstractC3070dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3070dB.next();
            if (z3) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z3 = false;
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
        p pVar = f41417a;
        Iterator j6 = ((InterfaceC3123eB) pVar.f23471w).j(pVar, str);
        boolean z3 = true;
        while (true) {
            AbstractC3070dB abstractC3070dB = (AbstractC3070dB) j6;
            if (!abstractC3070dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3070dB.next();
            if (z3) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z3 = false;
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
