package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes11.dex */
public abstract class vqs extends cza1 {
    public static void d(euy euyVar, hqs hqsVar, Executor executor) {
        euyVar.c(new tqs(0, euyVar, hqsVar), executor);
    }

    public static Object e(Future future) {
        Object obj;
        if (!future.isDone()) {
            ny61.r(shb1.c("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
