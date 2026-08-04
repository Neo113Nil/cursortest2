package com.gamericefishpro.space.l6;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final String a = q.d("WorkerFactory");

    public final p a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = a;
        p pVar = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(p.class);
        } catch (Throwable th) {
            q.c().b(str2, "Invalid class: " + str, th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                pVar = (p) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                q.c().b(str2, "Could not instantiate " + str, th2);
            }
        }
        if (pVar == null || !pVar.isUsed()) {
            return pVar;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
