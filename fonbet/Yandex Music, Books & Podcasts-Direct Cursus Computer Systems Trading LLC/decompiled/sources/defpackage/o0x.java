package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o0x {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final int e;

    public o0x(jsg jsgVar) {
        this.e = jsgVar.b;
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.b = currentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
