package defpackage;

/* loaded from: classes.dex */
public final class to1 extends defpackage.so1 {
    @Override // defpackage.l80
    public final void NHJTzaLwkd(boolean z) {
        android.view.Window window = this.xiZrDbcSW0;
        if (!z) {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
