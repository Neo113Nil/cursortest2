package io.appmetrica.analytics.accessibilitysystemwrapper.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes9.dex */
public abstract class d {
    public static b a(Context context) {
        return AndroidUtils.isApiAchieved(23) ? new e(context) : new c();
    }
}
