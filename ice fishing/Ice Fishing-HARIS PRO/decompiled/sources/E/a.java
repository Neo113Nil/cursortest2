package E;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.concurrent.Executor;
import m.C0245b0;

/* loaded from: classes.dex */
public abstract class a {
    public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor b(Context context) {
        return context.getMainExecutor();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params h(C0245b0 c0245b0) {
        return c0245b0.getTextMetricsParams();
    }

    public static void i(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static boolean j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
