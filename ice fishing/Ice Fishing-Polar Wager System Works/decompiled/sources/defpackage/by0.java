package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class by0 implements java.lang.Runnable {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ android.content.Context xiZrDbcSW0;

    public /* synthetic */ by0(android.content.Context context, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.adDC3e2L;
        int i2 = 1;
        android.content.Context context = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                new java.util.concurrent.ThreadPoolExecutor(0, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue()).execute(new defpackage.by0(context, i2));
                break;
            default:
                defpackage.ci0.RmCzwkUxICV(context, new defpackage.c6(1), defpackage.ci0.riuEU0zW4, false);
                break;
        }
    }
}
