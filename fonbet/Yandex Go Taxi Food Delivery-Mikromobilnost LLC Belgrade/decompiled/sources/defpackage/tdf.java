package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public final class tdf {
    public final ImmutableList a;
    public final long b;
    public final long c;
    public final long d;

    public tdf(List list, long j, long j2) {
        this.a = ImmutableList.l(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
