package defpackage;

import kotlin.time.DurationUnit;
import kotlinx.coroutines.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.k;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class t821 {
    public final n0 a;
    public final k b;

    public t821() {
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.a = c;
        o430 o430Var = e3n.b;
        this.b = e.N(c, a.t(kp50.U(1, DurationUnit.SECONDS)));
    }
}
