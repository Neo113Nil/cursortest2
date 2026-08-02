package n1;

import android.util.Log;
import com.google.android.gms.internal.ads.Wv;
import java.util.Locale;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f39639a = Log.isLoggable("Volley", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final String f39640b = j.class.getName();

    public static String a(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(f39640b)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder c9 = AbstractC5050e.c(substring.substring(substring.lastIndexOf(36) + 1), com.anythink.core.common.d.j.f13164z);
                c9.append(stackTrace[i].getMethodName());
                str2 = c9.toString();
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append("] ");
        sb.append(str2);
        return Wv.i(sb, ": ", format);
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
        if (f39639a) {
            Log.v("Volley", a(str, objArr));
        }
    }
}
