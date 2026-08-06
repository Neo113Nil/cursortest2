package defpackage;

/* loaded from: classes.dex */
public class so1 extends defpackage.l80 {
    public final android.view.Window xiZrDbcSW0;

    public so1(android.view.Window window) {
        this.xiZrDbcSW0 = window;
    }

    @Override // defpackage.l80
    public final void QQUzIjv3iOC5(boolean z) {
        android.view.Window window = this.xiZrDbcSW0;
        if (!z) {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
