package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.icedrifter.arcticquest.R;
import o.g;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, g.r(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }
}
