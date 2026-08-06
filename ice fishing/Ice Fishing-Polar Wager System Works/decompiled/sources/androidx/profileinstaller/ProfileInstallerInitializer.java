package androidx.profileinstaller;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements defpackage.t50 {
    @Override // defpackage.t50
    public final java.util.List IHQe1A4L2xu() {
        return java.util.Collections.EMPTY_LIST;
    }

    @Override // defpackage.t50
    public final java.lang.Object oh6vYeIP(android.content.Context context) {
        final android.content.Context applicationContext = context.getApplicationContext();
        android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback(this) { // from class: ay0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper())).postDelayed(new defpackage.by0(applicationContext, 0), new java.util.Random().nextInt(java.lang.Math.max(1000, 1)) + 5000);
            }
        });
        return new defpackage.ky(23);
    }
}
