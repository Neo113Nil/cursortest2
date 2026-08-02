package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mqi {
    public final AtomicReference a = new AtomicReference(null);
    public final qqi b = rqi.a();

    public static final void a(mqi mqiVar, kqi kqiVar) {
        AtomicReference atomicReference = mqiVar.a;
        while (true) {
            kqi kqiVar2 = (kqi) atomicReference.get();
            if (kqiVar2 != null && kqiVar.a.compareTo(kqiVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(kqiVar2, kqiVar)) {
                if (atomicReference.get() != kqiVar2) {
                    break;
                }
            }
            if (kqiVar2 != null) {
                kqiVar2.b.g(new oic("Mutation interrupted", 2));
                return;
            }
            return;
        }
    }

    public final Object b(hqi hqiVar, Function1 function1, Continuation continuation) {
        return gld.Q(new y7b(hqiVar, this, function1, (Continuation) null), continuation);
    }

    public final void c() {
        this.b.b(null);
    }
}
