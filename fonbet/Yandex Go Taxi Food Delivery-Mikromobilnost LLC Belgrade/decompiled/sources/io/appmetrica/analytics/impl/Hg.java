package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class Hg {
    public static final Hg a = new Hg();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final String c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "8.2.0", BuildConfig.BUILD_NUMBER);
}
