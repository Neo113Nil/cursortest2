package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class z extends SuspendLambda implements Function1 {
    public z(Continuation continuation) {
        super(1, continuation);
    }

    public static final String b(x xVar) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new z(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new z((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        ReentrantLock reentrantLock = d0.m;
        reentrantLock.lock();
        try {
            d0.l = null;
            Iterator it = d0.n.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0.j, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new z$$ExternalSyntheticLambda0(0), 4, (Object) null);
                    it.remove();
                }
            }
            ArrayList arrayList = d0.n;
            if ((arrayList == null || !arrayList.isEmpty()) && arrayList.size() > 0) {
                if (arrayList.get(0) == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return unit;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
