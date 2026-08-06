package defpackage;

/* loaded from: classes.dex */
public final class o5 {
    public static final defpackage.o5 IHQe1A4L2xu = new defpackage.o5();

    public final int IHQe1A4L2xu(android.view.Window window) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        android.graphics.Rect rect = new android.graphics.Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        int i3 = rect.bottom;
        return i - (i2 + (i3 > i ? i3 - i : 0));
    }
}
