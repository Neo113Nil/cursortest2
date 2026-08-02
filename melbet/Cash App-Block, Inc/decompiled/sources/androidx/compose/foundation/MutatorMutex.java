package androidx.compose.foundation;

import coil3.intercept.EngineInterceptor$intercept$2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes.dex */
public final class MutatorMutex {
    public final AtomicReference currentMutator = new AtomicReference(null);
    public final MutexImpl mutex = new MutexImpl();

    public final class Mutator {
        public final Job job;
        public final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, Job job) {
            this.priority = mutatePriority;
            this.job = job;
        }
    }

    public static final void access$tryMutateOrCancel(MutatorMutex mutatorMutex, Mutator mutator) {
        AtomicReference atomicReference = mutatorMutex.currentMutator;
        while (true) {
            Mutator mutator2 = (Mutator) atomicReference.get();
            if (mutator2 != null && mutator.priority.compareTo(mutator2.priority) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(mutator2, mutator)) {
                if (atomicReference.get() != mutator2) {
                    break;
                }
            }
            if (mutator2 != null) {
                mutator2.job.cancel(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    public static Object mutate$default(MutatorMutex mutatorMutex, Function1 function1, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.Default;
        mutatorMutex.getClass();
        return JobKt.coroutineScope(new EngineInterceptor$intercept$2(mutatePriority, mutatorMutex, function1, null, 3), continuation);
    }

    public final Object mutateWith(Object obj, MutatePriority mutatePriority, Function2 function2, SuspendLambda suspendLambda) {
        return JobKt.coroutineScope(new MutatorMutex$mutateWith$2(mutatePriority, this, function2, obj, null), suspendLambda);
    }
}
