package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class q30 {
    public static final int[] qoPGr6Ce = {R.attr.state_pressed};
    public static final int[] NCTxEWno = {R.attr.state_focused};
    public static final int[] MdtA4re8 = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] wxUZMvaN = {R.attr.state_selected};
    public static final int[] VgvYg0wo = {R.attr.state_enabled, R.attr.state_pressed};
    public static final String P7K7Inc8 = q30.class.getSimpleName();

    public static ColorStateList NCTxEWno(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(VgvYg0wo, 0)) != 0) {
            Log.w(P7K7Inc8, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static int qoPGr6Ce(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return g6.wxUZMvaN(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
}
