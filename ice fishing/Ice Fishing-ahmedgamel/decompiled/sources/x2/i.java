package x2;

import android.util.Log;
import com.bumptech.glide.manager.o;
import com.google.android.gms.internal.ads.AbstractC3093dB;
import com.google.android.gms.internal.ads.C3609mr;
import com.google.android.gms.internal.ads.InterfaceC3146eB;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o f41871a = new o(new C3609mr(0, 19));

    public static void a(String str) {
        if (!j(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        o oVar = f41871a;
        Iterator j6 = ((InterfaceC3146eB) oVar.f24256w).j(oVar, str);
        boolean z6 = true;
        while (true) {
            AbstractC3093dB abstractC3093dB = (AbstractC3093dB) j6;
            if (!abstractC3093dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3093dB.next();
            if (z6) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z6 = false;
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
        o oVar = f41871a;
        Iterator j6 = ((InterfaceC3146eB) oVar.f24256w).j(oVar, str);
        boolean z6 = true;
        while (true) {
            AbstractC3093dB abstractC3093dB = (AbstractC3093dB) j6;
            if (!abstractC3093dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3093dB.next();
            if (z6) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z6 = false;
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
        o oVar = f41871a;
        Iterator j6 = ((InterfaceC3146eB) oVar.f24256w).j(oVar, str);
        boolean z6 = true;
        while (true) {
            AbstractC3093dB abstractC3093dB = (AbstractC3093dB) j6;
            if (!abstractC3093dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3093dB.next();
            if (z6) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z6 = false;
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
        o oVar = f41871a;
        Iterator j6 = ((InterfaceC3146eB) oVar.f24256w).j(oVar, str);
        boolean z6 = true;
        while (true) {
            AbstractC3093dB abstractC3093dB = (AbstractC3093dB) j6;
            if (!abstractC3093dB.hasNext()) {
                return;
            }
            String str2 = (String) abstractC3093dB.next();
            if (z6) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z6 = false;
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
