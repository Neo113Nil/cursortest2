package defpackage;

import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class cg0 {
    public static boolean MdtA4re8(View view) {
        return view.isScreenReaderFocusable();
    }

    public static boolean NCTxEWno(View view) {
        return view.isAccessibilityHeading();
    }

    public static void P7K7Inc8(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static void VgvYg0wo(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static CharSequence qoPGr6Ce(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static void wxUZMvaN(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }
}
