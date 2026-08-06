package androidx.preference;

import M.a;
import R1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.watchfacestudio.spraktum.R;
import m0.j;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int o2 = d.o(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1073c, o2, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (j.f8180c == null) {
                j.f8180c = new j(6, false);
            }
            this.f2513g = j.f8180c;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }
}
