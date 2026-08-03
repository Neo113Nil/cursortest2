package u6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import m7.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f6709a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f6710b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f6709a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6710b.newThread(new j(runnable, 1));
        newThread.setName(this.f6709a);
        return newThread;
    }
}
