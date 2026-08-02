package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class lu3 {
    public final AtomicReference a;

    public lu3(int i) {
        switch (i) {
            case 1:
                this.a = new AtomicReference(null);
                break;
            default:
                this.a = new AtomicReference();
                break;
        }
    }

    public Object a(Function1 function1, cg6 cg6Var) {
        return gld.Q(new v3(this, function1, (Continuation) null), cg6Var);
    }
}
