package com.yandex.passport.internal.ui.sloth.webauthn;

import com.yandex.passport.internal.report.reporters.p1;

/* loaded from: classes4.dex */
public interface b {
    com.yandex.passport.common.ui.progress.g getProgressProperties();

    com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder();

    r getViewModelFactory();

    com.yandex.passport.internal.sloth.webauthn.e getWebAuthN();

    p1 getWebAuthNReporter();

    boolean isWhiteLabel();
}
