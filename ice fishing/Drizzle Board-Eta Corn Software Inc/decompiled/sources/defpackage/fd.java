package defpackage;

import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class fd {
    public static int MdtA4re8(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int NCTxEWno(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int P7K7Inc8(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params Qr9iLBAD(w wVar) {
        return wVar.getTextMetricsParams();
    }

    public static int VgvYg0wo(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int b2ZJblxo(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static boolean eVhOlqcC(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void jb9XjC4I(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static String[] qoPGr6Ce(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static int wxUZMvaN(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }
}
