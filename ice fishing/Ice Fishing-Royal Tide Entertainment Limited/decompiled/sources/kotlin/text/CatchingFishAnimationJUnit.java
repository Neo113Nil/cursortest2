package kotlin.text;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class CatchingFishAnimationJUnit implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new CatchingFishMVIMoshiToast(runnable);
    }
}
