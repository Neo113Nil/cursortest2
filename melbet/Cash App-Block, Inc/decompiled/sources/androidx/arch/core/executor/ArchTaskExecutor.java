package androidx.arch.core.executor;

import coil3.size.SizeKt;

/* loaded from: classes.dex */
public final class ArchTaskExecutor extends SizeKt {
    public static final ArchTaskExecutor$$ExternalSyntheticLambda0 sIOThreadExecutor = new ArchTaskExecutor$$ExternalSyntheticLambda0(0);
    public static volatile ArchTaskExecutor sInstance;
    public final DefaultTaskExecutor mDelegate;

    public ArchTaskExecutor() {
        super(2);
        this.mDelegate = new DefaultTaskExecutor();
    }

    public static ArchTaskExecutor getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (sInstance == null) {
                    sInstance = new ArchTaskExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sInstance;
    }
}
