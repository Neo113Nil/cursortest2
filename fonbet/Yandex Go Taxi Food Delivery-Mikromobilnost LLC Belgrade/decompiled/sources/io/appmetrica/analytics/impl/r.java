package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* loaded from: classes9.dex */
public final class r {
    public final WeakHashMap a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC0636q enumC0636q) {
        if (activity != null && this.a.get(activity) == enumC0636q) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.a.put(activity, enumC0636q);
        return true;
    }
}
