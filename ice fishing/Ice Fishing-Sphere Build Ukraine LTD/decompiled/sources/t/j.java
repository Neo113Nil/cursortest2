package t;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class j implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public String f2982a;

    /* renamed from: b, reason: collision with root package name */
    public int f2983b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new i(runnable, this.f2982a, this.f2983b);
    }
}
