package T0;

import J0.y;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3042a;

    static {
        String f3 = J0.s.f("ProcessUtils");
        kotlin.jvm.internal.h.d(f3, "tagWithPrefix(\"ProcessUtils\")");
        f3042a = f3;
    }

    public static final boolean a(Context context, J0.b configuration) {
        String str;
        Object obj;
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            str = a.f3024a.a();
        } else {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, y.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                kotlin.jvm.internal.h.b(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                if (J0.s.d().f1405a <= 3) {
                    Log.d(f3042a, "Unable to check ActivityThread for processName", th);
                }
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        return kotlin.jvm.internal.h.a(str, context.getApplicationInfo().processName);
    }
}
