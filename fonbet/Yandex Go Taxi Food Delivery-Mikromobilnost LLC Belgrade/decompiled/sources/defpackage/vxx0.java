package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class vxx0 implements uw60 {
    public final n0 a;
    public final eci0 b;

    public vxx0() {
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = e.c(b);
    }

    @Override // defpackage.uw60
    public final Object a(Continuation continuation) {
        return this.a.emit(zy11.a, continuation);
    }
}
