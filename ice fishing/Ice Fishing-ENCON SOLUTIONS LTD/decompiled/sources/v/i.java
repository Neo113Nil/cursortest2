package v;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class i implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public String f8503a;

    /* renamed from: b, reason: collision with root package name */
    public int f8504b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new h(runnable, this.f8503a, this.f8504b);
    }
}
