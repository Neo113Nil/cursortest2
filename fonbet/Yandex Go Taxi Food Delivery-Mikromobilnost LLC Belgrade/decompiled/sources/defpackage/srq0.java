package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes9.dex */
public abstract class srq0 {
    public abstract CoroutineSingletons a(Object obj, Continuation continuation);

    public final Object c(Iterable iterable, BaseContinuationImpl baseContinuationImpl) {
        return ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) ? zy11.a : d(iterable.iterator(), baseContinuationImpl);
    }

    public abstract Object d(Iterator it, BaseContinuationImpl baseContinuationImpl);
}
