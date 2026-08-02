package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class wkk {
    public static final AtomicBoolean e = new AtomicBoolean(true);
    public static final AtomicBoolean f = new AtomicBoolean(true);
    public long a = -1;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final String c;
    public final AtomicBoolean d;

    public wkk(long j) {
        this.c = e.compareAndSet(true, false) ? "Cold" : "Cool";
        this.d = new AtomicBoolean(true);
    }
}
