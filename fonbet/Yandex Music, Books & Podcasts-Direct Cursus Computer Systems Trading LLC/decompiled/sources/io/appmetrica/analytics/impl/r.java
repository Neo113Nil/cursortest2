package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class r {
    public final WeakHashMap a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC0562q enumC0562q) {
        if (activity != null && this.a.get(activity) == enumC0562q) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.a.put(activity, enumC0562q);
        return true;
    }
}
