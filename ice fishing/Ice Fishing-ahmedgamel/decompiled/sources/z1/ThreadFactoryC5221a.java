package z1;

import java.util.concurrent.ThreadFactory;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC5221a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Z2.c(runnable);
    }
}
