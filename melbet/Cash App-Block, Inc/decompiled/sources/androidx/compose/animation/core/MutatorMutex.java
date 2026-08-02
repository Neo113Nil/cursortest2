package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes.dex */
public final class MutatorMutex {
    public final AtomicReference currentMutator = new AtomicReference(null);
    public final MutexImpl mutex = new MutexImpl();

    public final class Mutator {
        public final Job job;

        public Mutator(Job job) {
            MutatePriority mutatePriority = MutatePriority.Default;
            this.job = job;
        }
    }

    public static Object mutate$default(MutatorMutex mutatorMutex, Function1 function1, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.Default;
        mutatorMutex.getClass();
        return JobKt.coroutineScope(new MutatorMutex$mutate$2(mutatorMutex, function1, (Continuation) null), continuation);
    }
}
