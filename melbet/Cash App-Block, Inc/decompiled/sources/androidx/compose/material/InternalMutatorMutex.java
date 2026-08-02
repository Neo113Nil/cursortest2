package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes3.dex */
public final class InternalMutatorMutex {
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
}
