package S2;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f2975a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f2976b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f2977c;

    static {
        Method method;
        Method method2;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod(com.anythink.expressad.f.a.b.ay, cls);
        } catch (Exception unused) {
            method = null;
        }
        f2975a = method;
        try {
            method2 = WorkSource.class.getMethod(com.anythink.expressad.f.a.b.ay, cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f2976b = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e6) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e6);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e9) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e9);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
        f2977c = null;
    }
}
