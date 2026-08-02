package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class sfi {
    public final n0 a;
    public final eci0 b;

    public sfi(st2 st2Var) {
        ike a = bvf0.a(st2Var.b);
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = e.O(b, a, wsr0.a(xsr0.a, 3), 0);
    }
}
