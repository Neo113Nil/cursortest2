package androidx.preference;

import R1.d;
import android.content.Context;
import android.util.AttributeSet;
import com.watchfacestudio.spraktum.R;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, d.o(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
    }
}
