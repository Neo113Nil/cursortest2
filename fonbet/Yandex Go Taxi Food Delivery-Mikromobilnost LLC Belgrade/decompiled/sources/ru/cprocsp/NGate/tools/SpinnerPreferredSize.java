package ru.cprocsp.NGate.tools;

import android.R;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Spinner;

/* loaded from: classes15.dex */
public class SpinnerPreferredSize {
    public static void setPreferred(Activity activity, Spinner spinner) {
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        spinner.setMinimumHeight((int) (typedValue.getDimension(displayMetrics) - (displayMetrics.density * 1.0f)));
    }
}
