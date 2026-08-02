package defpackage;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ib5 implements Serializable {

    @NotNull
    public static final hb5 b = new hb5(null);
    private static final long serialVersionUID = 0;
    public final CoroutineContext[] a;

    public ib5(CoroutineContext[] coroutineContextArr) {
        this.a = coroutineContextArr;
    }

    private final Object readResolve() {
        CoroutineContext coroutineContext = g.a;
        for (CoroutineContext coroutineContext2 : this.a) {
            coroutineContext = coroutineContext.plus(coroutineContext2);
        }
        return coroutineContext;
    }
}
