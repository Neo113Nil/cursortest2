package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final /* synthetic */ class ywd implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ywd(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                break;
            case 1:
                Thread thread2 = new Thread(runnable, str);
                thread2.setDaemon(true);
                break;
        }
        return new Thread(runnable, str);
    }
}
