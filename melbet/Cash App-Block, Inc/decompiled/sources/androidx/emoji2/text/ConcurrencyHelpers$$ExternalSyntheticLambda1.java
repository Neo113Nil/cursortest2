package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class ConcurrencyHelpers$$ExternalSyntheticLambda1 implements ThreadFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ ConcurrencyHelpers$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, str);
        }
    }
}
