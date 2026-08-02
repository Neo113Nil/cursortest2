package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class ito implements ka8 {
    public abstract ka8 b(Runnable runnable, long j, TimeUnit timeUnit);

    public void d(qij qijVar) {
        b(qijVar, 0L, TimeUnit.NANOSECONDS);
    }
}
