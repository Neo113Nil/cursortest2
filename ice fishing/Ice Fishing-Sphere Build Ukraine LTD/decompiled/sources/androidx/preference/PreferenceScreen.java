package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.icecatchbiger.hookfrostmaster.R;
import o.g;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, g.o(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
    }
}
