package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o6 {
    public static final defpackage.o6 ZpBGe2uQfcn8 = new defpackage.o6();

    public final int ZpBGe2uQfcn8(android.view.Window window) {
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
