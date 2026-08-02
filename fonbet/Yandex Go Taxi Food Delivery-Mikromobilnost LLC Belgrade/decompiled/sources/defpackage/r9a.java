package defpackage;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class r9a {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public final Object a(SuspendLambda suspendLambda) {
        return this.a.emit(zy11.a, suspendLambda);
    }
}
