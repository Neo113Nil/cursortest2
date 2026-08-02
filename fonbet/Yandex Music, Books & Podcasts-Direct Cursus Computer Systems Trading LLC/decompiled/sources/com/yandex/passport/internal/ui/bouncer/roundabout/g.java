package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class g implements rzm {
    public final /* synthetic */ int a;
    public final com.yandex.passport.internal.ui.bouncer.u b;

    public /* synthetic */ g(com.yandex.passport.internal.ui.bouncer.u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                Activity activity = this.b.getActivity();
                a4g.s(activity);
                return activity;
            case 1:
                com.yandex.passport.internal.report.reporters.k badgesReporter = this.b.getBadgesReporter();
                a4g.s(badgesReporter);
                return badgesReporter;
            case 2:
                BouncerActivity bouncerActivity = this.b.getBouncerActivity();
                a4g.s(bouncerActivity);
                return bouncerActivity;
            case 3:
                com.yandex.passport.common.coroutine.a coroutineDispatchers = this.b.getCoroutineDispatchers();
                a4g.s(coroutineDispatchers);
                return coroutineDispatchers;
            case 4:
                com.yandex.passport.internal.report.reporters.q createProfileReporter = this.b.getCreateProfileReporter();
                a4g.s(createProfileReporter);
                return createProfileReporter;
            case 5:
                com.yandex.passport.internal.flags.i flagRepository = this.b.getFlagRepository();
                a4g.s(flagRepository);
                return flagRepository;
            case 6:
                com.yandex.passport.internal.properties.x passportProperties = this.b.getPassportProperties();
                a4g.s(passportProperties);
                return passportProperties;
            case 7:
                com.yandex.passport.internal.report.reporters.m reporter = this.b.getReporter();
                a4g.s(reporter);
                return reporter;
            case 8:
                com.yandex.passport.common.ui.lang.b uiLanguageProvider = this.b.getUiLanguageProvider();
                a4g.s(uiLanguageProvider);
                return uiLanguageProvider;
            default:
                com.yandex.passport.internal.ui.bouncer.s wishSource = this.b.getWishSource();
                a4g.s(wishSource);
                return wishSource;
        }
    }
}
