package androidx.preference;

import M.a;
import R1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.watchfacestudio.spraktum.R;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int o2 = d.o(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1071a, o2, 0);
        d.r(obtainStyledAttributes, 5, 0);
        if (obtainStyledAttributes.getString(4) == null) {
            obtainStyledAttributes.getString(1);
        }
        obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
