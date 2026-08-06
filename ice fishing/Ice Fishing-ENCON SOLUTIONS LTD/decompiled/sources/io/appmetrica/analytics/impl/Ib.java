package io.appmetrica.analytics.impl;

import a.AbstractC0083a;
import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Ib {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Jb.a(configuration) : AbstractC0083a.m(Ge.a(configuration.locale));
    }
}
