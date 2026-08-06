package androidx.preference;

import M.a;
import R1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.watchfacestudio.spraktum.R;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1072b, i2, 0);
        d.r(obtainStyledAttributes, 9, 0);
        d.r(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        d.r(obtainStyledAttributes, 11, 3);
        d.r(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.o(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
