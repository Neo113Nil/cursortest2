package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.a;

/* loaded from: classes15.dex */
public abstract class sc5 extends yr31 {
    public final a b;
    public final di9 c;

    public sc5() {
        a a = sb2.a(0, null, null, 7);
        this.b = a;
        this.c = new di9(a);
    }

    public final Object W(Object obj, Continuation continuation) {
        Object o = this.b.o(obj, continuation);
        return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : zy11.a;
    }

    public final void X(Object obj) {
        this.b.d(obj);
    }
}
