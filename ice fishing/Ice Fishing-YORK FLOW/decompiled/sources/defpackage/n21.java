package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class n21 implements android.view.Choreographer.FrameCallback {
    public final /* synthetic */ int WDYagTQQm9ns = 0;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                (android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper())).postDelayed(new defpackage.o21((android.content.Context) obj, 0), new java.util.Random().nextInt(java.lang.Math.max(1000, 1)) + 5000);
                break;
            default:
                ((java.lang.Runnable) obj).run();
                break;
        }
    }
}
