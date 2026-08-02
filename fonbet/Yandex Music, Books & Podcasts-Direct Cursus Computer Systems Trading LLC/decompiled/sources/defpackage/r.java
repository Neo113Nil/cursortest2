package defpackage;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class r {
    public static final int a = Process.myUid();
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public static String c = "";
    public static final q d = q.b;

    public static final void a(ActivityManager activityManager) {
        if (bp6.a.contains(r.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == a) {
                        Looper mainLooper = Looper.getMainLooper();
                        mainLooper.getClass();
                        Thread thread = mainLooper.getThread();
                        thread.getClass();
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String jSONArray2 = jSONArray.toString();
                        if (!Intrinsics.d(jSONArray2, c) && zsd.q0(thread)) {
                            c = jSONArray2;
                            ox6.y(processErrorStateInfo.shortMsg, jSONArray2).b();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            bp6.a(r.class, th);
        }
    }
}
