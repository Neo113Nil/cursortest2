package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class uv6 {
    public final yde a;
    public final long b;
    public final long c;
    public final long d;

    public uv6(long j, long j2, List list) {
        this.a = yde.v(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
