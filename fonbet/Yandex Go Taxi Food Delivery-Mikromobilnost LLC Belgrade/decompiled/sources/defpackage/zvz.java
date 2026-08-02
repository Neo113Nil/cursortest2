package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class zvz {
    public final n0 a;
    public final n0 b;

    public zvz() {
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = b;
    }
}
