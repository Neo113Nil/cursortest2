package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public class sgo {
    public final n0 a;
    public final eci0 b;

    public sgo() {
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = e.c(b);
    }

    public final void a(Object obj) {
        this.a.g(obj);
    }
}
