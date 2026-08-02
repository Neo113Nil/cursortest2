package androidx.camera.camera2.pipe.core;

import java.util.concurrent.ThreadFactory;
import kotlin.text.StringsKt;
import kotlinx.atomicfu.AtomicInt;

/* loaded from: classes3.dex */
public final /* synthetic */ class AndroidThreads$$ExternalSyntheticLambda1 implements ThreadFactory {
    public final /* synthetic */ ThreadFactory f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ AtomicInt f$2;

    public /* synthetic */ AndroidThreads$$ExternalSyntheticLambda1(ThreadFactory threadFactory, String str, AtomicInt atomicInt) {
        this.f$0 = threadFactory;
        this.f$1 = str;
        this.f$2 = atomicInt;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f$0.newThread(runnable);
        newThread.getClass();
        newThread.setName(this.f$1 + StringsKt.padStart(2, String.valueOf(AtomicInt.FU.incrementAndGet(this.f$2))));
        return newThread;
    }
}
