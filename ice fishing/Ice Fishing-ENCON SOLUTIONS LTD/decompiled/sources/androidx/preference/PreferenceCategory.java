package androidx.preference;

import R1.d;
import android.content.Context;
import android.util.AttributeSet;
import com.watchfacestudio.spraktum.R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, d.o(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }
}
