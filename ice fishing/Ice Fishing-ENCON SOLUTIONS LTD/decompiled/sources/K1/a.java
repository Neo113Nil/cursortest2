package K1;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1050b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f1049a = str;
        this.f1050b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f1049a;
        i.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f1050b);
        return thread;
    }
}
