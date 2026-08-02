package androidx.work;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class WorkerFactory {
    public abstract ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker createWorkerWithDefaultFallback(Context context, String str, WorkerParameters workerParameters) {
        String str2;
        String str3;
        context.getClass();
        str.getClass();
        ListenableWorker createWorker = createWorker(context, str, workerParameters);
        if (createWorker == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
                asSubclass.getClass();
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    newInstance.getClass();
                    createWorker = (ListenableWorker) newInstance;
                } catch (Throwable th) {
                    Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
                    str3 = WorkerFactoryKt.TAG;
                    logger$LogcatLogger.error(str3, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                Logger$LogcatLogger logger$LogcatLogger2 = Logger$LogcatLogger.get();
                str2 = WorkerFactoryKt.TAG;
                logger$LogcatLogger2.error(str2, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!createWorker.isUsed()) {
            return createWorker;
        }
        a$$ExternalSyntheticBUOutline0.m$1(getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", "WorkerFactory (");
        return null;
    }
}
