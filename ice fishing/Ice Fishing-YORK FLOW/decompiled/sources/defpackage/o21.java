package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class o21 implements java.lang.Runnable {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ android.content.Context oh71FJcDz6S2;

    public /* synthetic */ o21(android.content.Context context, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WDYagTQQm9ns;
        int i2 = 1;
        android.content.Context context = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                new java.util.concurrent.ThreadPoolExecutor(0, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue()).execute(new defpackage.o21(context, i2));
                break;
            default:
                defpackage.vx1.OVwOqzUGHcCU(context, new defpackage.f7(1), defpackage.vx1.T1fB7bDYiVJQ, false);
                break;
        }
    }
}
