package J0;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1440a = r.f("WorkerFactory");

    public final q a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f1440a;
        q qVar = null;
        try {
            cls = Class.forName(str).asSubclass(q.class);
        } catch (Throwable th) {
            r.d().c(str2, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                qVar = (q) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                r.d().c(str2, "Could not instantiate " + str, th2);
            }
        }
        if (qVar == null || !qVar.isUsed()) {
            return qVar;
        }
        throw new IllegalStateException(D.x.m("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
