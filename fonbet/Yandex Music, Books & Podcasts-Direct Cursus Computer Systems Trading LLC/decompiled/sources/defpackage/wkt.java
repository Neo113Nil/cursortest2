package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class wkt extends a {
    public static final wkt d = new wkt();

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        dq7.e.d.b(runnable, true, false);
    }

    @Override // kotlinx.coroutines.a
    public final void G0(CoroutineContext coroutineContext, Runnable runnable) {
        dq7.e.d.b(runnable, true, true);
    }

    @Override // kotlinx.coroutines.a
    public final a I0(int i) {
        q5g.B(i);
        return i >= n8s.d ? this : super.I0(i);
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return "Dispatchers.IO";
    }
}
