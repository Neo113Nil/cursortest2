package o4;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5225a = o.f("WorkerFactory");

    public final n a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f5225a;
        n nVar = null;
        try {
            cls = Class.forName(str).asSubclass(n.class);
        } catch (Throwable th) {
            o.d().c(str2, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                nVar = (n) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                o.d().c(str2, "Could not instantiate " + str, th2);
            }
        }
        if (nVar == null || !nVar.isUsed()) {
            return nVar;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
