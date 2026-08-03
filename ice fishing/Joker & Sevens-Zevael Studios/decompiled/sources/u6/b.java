package u6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m7.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f6712b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f6713c = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final String f6711a = "GAC_Executor";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6713c.newThread(new j(runnable, 1));
        newThread.setName(this.f6711a + "[" + this.f6712b.getAndIncrement() + "]");
        return newThread;
    }
}
