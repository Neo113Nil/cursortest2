package com.yandex.passport.common.web;

import android.os.Build;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class b {
    public static final String a;
    public static final String b;

    static {
        Locale locale = Locale.US;
        a = com.yandex.plus.core.network.api.utils.a.A(String.format(locale, "com.yandex.mobile.auth.sdk/%s (%s %s; Android %s)", Arrays.copyOf(new Object[]{"7.54.1.754014992", Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE}, 4)));
        b = com.yandex.plus.core.network.api.utils.a.A(String.format(locale, "PassportSDK/%s", Arrays.copyOf(new Object[]{"7.54.1.754014992"}, 1)));
    }
}
