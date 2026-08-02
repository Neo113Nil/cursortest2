package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import defpackage.t75;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0345id {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? AbstractC0373jd.a(configuration) : t75.c(AbstractC0205dh.a(configuration.locale));
    }
}
