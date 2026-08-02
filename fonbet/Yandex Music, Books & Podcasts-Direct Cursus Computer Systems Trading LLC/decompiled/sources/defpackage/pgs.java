package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class pgs {
    public static final long d;
    public final long a;
    public final long b;
    public final ciq c = new ciq(0);

    static {
        uyr uyrVar = uyr.a;
        d = tyr.a;
    }

    public pgs(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void a(String str, long j, long j2, long j3) {
        long j4 = (((j * 1000) * j3) / this.a) / j2;
        ciq ciqVar = this.c;
        lyd lydVar = (lyd) ciqVar.get(str);
        if (lydVar == null) {
            lydVar = y2x.t(10L, this.b, 100, str);
            ciqVar.put(str, lydVar);
        }
        lydVar.c(j4, TimeUnit.MILLISECONDS);
    }
}
