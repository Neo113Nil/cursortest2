package androidx.preference;

import M.a;
import R1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.watchfacestudio.spraktum.R;
import java.util.HashSet;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int o2 = d.o(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1075e, o2, 0);
        if (obtainStyledAttributes.getTextArray(2) == null) {
            obtainStyledAttributes.getTextArray(0);
        }
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
