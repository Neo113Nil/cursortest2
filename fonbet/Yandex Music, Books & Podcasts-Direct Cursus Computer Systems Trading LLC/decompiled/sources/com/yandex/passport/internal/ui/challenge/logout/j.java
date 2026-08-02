package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.internal.analytics.o0;

/* loaded from: classes4.dex */
public interface j {
    o0 getEventReporter();

    com.yandex.passport.common.ui.progress.g getProgressProperties();

    m getViewModelFactory();

    com.yandex.passport.internal.ui.common.web.d getWebUrlChecker();

    boolean isWhiteLabel();
}
