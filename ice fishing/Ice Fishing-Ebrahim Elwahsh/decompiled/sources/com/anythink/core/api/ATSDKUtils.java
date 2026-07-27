package com.anythink.core.api;

import android.content.Context;
import com.anythink.core.common.v.q;
import com.anythink.core.common.v.t;

/* loaded from: classes.dex */
public class ATSDKUtils {
    public static int dip2px(Context context, float f6) {
        return q.a(context, f6);
    }

    public static double getRmbChangeToUsdRate() {
        return t.b();
    }

    public static double getUsdChangeToRmbRate() {
        return t.a();
    }

    public static int px2dip(Context context, float f6) {
        return q.b(context, f6);
    }
}
