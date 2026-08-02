package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class bu1 {
    public static final Logger c = Logger.getLogger(bu1.class.getName());
    public final String a;
    public final AtomicLong b;

    public bu1(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.b = atomicLong;
        o2g.J("value must be positive", j > 0);
        this.a = "keepalive time nanos";
        atomicLong.set(j);
    }
}
