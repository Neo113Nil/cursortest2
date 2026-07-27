package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.icedrifter.arcticquest.R;
import o.g;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, g.r(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
    }
}
