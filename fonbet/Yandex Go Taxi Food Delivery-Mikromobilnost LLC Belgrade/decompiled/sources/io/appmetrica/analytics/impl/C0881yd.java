package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0881yd {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? AbstractC0910zd.a(configuration) : Collections.singletonList(AbstractC0740th.a(configuration.locale));
    }
}
