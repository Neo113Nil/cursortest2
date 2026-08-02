package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class Util$$ExternalSyntheticLambda0 implements ThreadFactory {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return new Thread(runnable, str);
            default:
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(true);
                return thread;
        }
    }
}
