package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class a0 {
    public static void b() {
        ReentrantLock reentrantLock = d0.m;
        reentrantLock.lock();
        try {
            ArrayList arrayList = d0.n;
            if (arrayList.size() > 0) {
                if (arrayList.get(0) != null) {
                    throw new ClassCastException();
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0.j, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda3(19), 6, (Object) null);
                throw null;
            }
            reentrantLock.unlock();
            if (d0.l != null) {
                return;
            }
            d0.l = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new z(null), 2, null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String c(x xVar) {
        throw null;
    }
}
