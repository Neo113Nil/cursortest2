package com.yandex.passport.internal.ui.bouncer;

import android.app.Activity;
import com.yandex.passport.internal.properties.x;
import defpackage.szm;

/* loaded from: classes4.dex */
public interface u {
    Activity getActivity();

    com.yandex.passport.internal.report.reporters.k getBadgesReporter();

    BouncerActivity getBouncerActivity();

    szm getBouncerMasterChooserComponentBuilderProvider();

    szm getBouncerSlothComposeComponentBuilderProvider();

    com.yandex.passport.common.coroutine.a getCoroutineDispatchers();

    com.yandex.passport.internal.report.reporters.q getCreateProfileReporter();

    com.yandex.passport.internal.flags.i getFlagRepository();

    com.yandex.passport.sloth.ui.l getNetworkObserver();

    x getPassportProperties();

    com.yandex.passport.common.ui.progress.g getProgressProperties();

    com.yandex.passport.internal.report.reporters.m getReporter();

    com.yandex.passport.common.ui.lang.b getUiLanguageProvider();

    s getWishSource();

    boolean isWhiteLabel();
}
