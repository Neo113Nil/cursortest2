package androidx.media3.common.text;

import android.os.Bundle;
import android.text.Spanned;
import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public abstract class CustomSpanBundler {
    public static final String FIELD_END_INDEX;
    public static final String FIELD_FLAGS;
    public static final String FIELD_PARAMS;
    public static final String FIELD_START_INDEX;
    public static final String FIELD_TYPE;

    static {
        String str = Util.DEVICE_DEBUG_INFO;
        FIELD_START_INDEX = Integer.toString(0, 36);
        FIELD_END_INDEX = Integer.toString(1, 36);
        FIELD_FLAGS = Integer.toString(2, 36);
        FIELD_TYPE = Integer.toString(3, 36);
        FIELD_PARAMS = Integer.toString(4, 36);
    }

    public static Bundle spanToBundle(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(FIELD_START_INDEX, spanned.getSpanStart(obj));
        bundle2.putInt(FIELD_END_INDEX, spanned.getSpanEnd(obj));
        bundle2.putInt(FIELD_FLAGS, spanned.getSpanFlags(obj));
        bundle2.putInt(FIELD_TYPE, i);
        if (bundle != null) {
            bundle2.putBundle(FIELD_PARAMS, bundle);
        }
        return bundle2;
    }
}
