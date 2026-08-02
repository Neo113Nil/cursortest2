package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.core.app.f;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.text.c;

/* loaded from: classes.dex */
public final /* synthetic */ class oq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ oq0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        dqg dqgVar;
        List<ActivityManager.RunningAppProcessInfo> list;
        Object obj;
        switch (this.a) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context = this.b;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            dqgVar = rq0.c;
                            break;
                        } else {
                            Object c = rq0.c();
                            if (c != null) {
                                dqgVar = dqg.d(qq0.a(c));
                                if (dqgVar.c()) {
                                    String e = f.e(context);
                                    Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                                    if (systemService != null) {
                                        qq0.b(systemService, pq0.a(e));
                                    }
                                }
                                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            dqgVar = dqg.b;
                            if (dqgVar.c()) {
                            }
                            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                rq0.f = true;
                return;
            case 1:
                rq0.q(this.b);
                return;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new oq0(this.b, 3));
                return;
            case 3:
                lxe.L(this.b, new gx0(1), lxe.f, false);
                return;
            default:
                Context context2 = this.b;
                ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
                    list = c5b.a;
                }
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (c.o(((ActivityManager.RunningAppProcessInfo) obj).processName, context2.getPackageName() + ":passport", true)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                int i2 = runningAppProcessInfo != null ? runningAppProcessInfo.pid : 0;
                if (i2 > 0) {
                    Process.killProcess(i2);
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }
}
