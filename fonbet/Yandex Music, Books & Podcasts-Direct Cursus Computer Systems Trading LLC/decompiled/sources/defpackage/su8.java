package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class su8 {
    public static final AtomicBoolean d = new AtomicBoolean(true);
    public static final AtomicBoolean e = new AtomicBoolean(true);
    public long a = -1;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c;

    public su8(long j) {
        d.compareAndSet(true, false);
        this.c = new AtomicBoolean(true);
    }
}
