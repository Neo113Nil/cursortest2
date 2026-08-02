package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public abstract class z5p0 {
    public final tse a;
    public pzt0 c;
    public String d;
    public final n0 b = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
    public long e = Long.MIN_VALUE;

    public z5p0(tse tseVar) {
        this.a = tseVar;
    }

    public abstract tpr a(long j);
}
