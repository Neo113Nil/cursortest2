package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class rp31 {
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static <T> T d(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void e(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void f(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void g(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
